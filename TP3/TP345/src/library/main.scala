package library;


object main extends App{
  
  print("test")
  
  
  val couples:List[(String, String)] = List(("google", "https://www.google.com/"));

 
  
  val pageHtml = ProducteurHtml.resultatVersHtml(couples);
  
  print(pageHtml)
  
}
