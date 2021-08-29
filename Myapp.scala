object Myapp extends App {
  val p1 = Point(2,3)
  val p2 = Point(5,10)
  val p3 = p1.move(4,8)
  println(p1)
  println(p2)
  println(p3)
  println(p1.add(p2))
  println(p1.distance(p2))
  println(p2.invert)
}

case class Point(a:Int, b:Int) {
  def x:Int = a
  def y:Int = b

//1. method to add two given points
  def add(p:Point) = Point(this.x+p.x,this.y+p.y)

//2. method to move a point by a given distance
  def move(dx:Int, dy:Int)= Point(this.x+dx, this.y+dy)

//3. method to return distance between two given points
  def distance(p:Point) = math.sqrt(math.pow(p.x - this.x,2) + math.pow(p.y - this.y,2))

//4. method to switch the x and y coordinates of a given point
  def invert()= Point(this.y,this.x)

}
