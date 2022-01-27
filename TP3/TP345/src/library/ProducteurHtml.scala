package library

object ProducteurHtml extends ProductionResultat{
  
  
  override def resultatVersHtml(l: List[(String, String)]): Html = {
  
      var liens:List[Html] = List();

    
    for(element <- l){
      val lien:Html = Tag("a", List(("href=", element._2)), List(Texte(element._1)))
      liens = liens :+ lien
     }
    
    
    val pageHtml = Tag("html", List(),
    List(
      Tag("head", List(),
        List(
          Tag("meta", List(("charset", "utf-8")), List()),
          Tag("title", List(), List(Texte("My Page"))))),
      Tag("body", List(), List(
        Tag("center", List(), liens
            )))))
            
            return pageHtml;
            
  }
}