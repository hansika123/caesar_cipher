object caesar_cipher extends App{
      val alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
      val word = "HiSriLanka"
      val encryption = (c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)+key)%a.size)
      val decryption =(c:Char,key:Int,a:String)=>a((a.indexOf(c.toUpper)-key+26)%a.size)
      val cipher = (algo:(Char,Int,String)=>Char,s:String,key:Int,a:String)=>s.map(algo(_,key,a))
      val string1 = cipher(encryption,word,3,alphabet)
      val string2 = cipher(decryption,string1,3,alphabet)
      printf("Encryption : %s ",string1)
      printf("\nDecryption : %s ",string2)
}
