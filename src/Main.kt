

fun main(args: Array<String>){
 println()
 println("---Poker Combinations---")
 val kombo = combinations()
 kombo.cards()
 println()
 println("---DECK OF CARDS----")
 println()
 var res = cardsSuits()
 res.deckС()


val pawel = MainProvajder()
 pawel.printInfo(combinations())
 println(pawel.getConnection())

}

fun checkData(obj:MainProvajder){
 if(obj is UserInfo){
  obj.printInfo(combinations())
 }

}











