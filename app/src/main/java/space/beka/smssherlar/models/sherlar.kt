package space.beka.smssherlar.models

data class sherlar(val name:String, val matni:String)

object SherlarItem{
    lateinit var sevgiList:ArrayList<sherlar>
    lateinit var soginchList:ArrayList<sherlar>
    lateinit var tabrikList:ArrayList<sherlar>
    lateinit var otaOnaList:ArrayList<sherlar>
    lateinit var dostlikList:ArrayList<sherlar>
    lateinit var hazilList:ArrayList<sherlar>
    lateinit var yangilarList:ArrayList<sherlar>
    lateinit var saqlanganList:ArrayList<sherlar>
}

fun loadData(){
    SherlarItem.sevgiList = ArrayList()
    for (i in 0..3) {
        SherlarItem.sevgiList.add(
            sherlar(
                "Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                        "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                        "Mayli xijron azobi qiynasin meni,\n" +
                        "O’lsam ham baribir sevaman seni!"
            )
        )
    }

    SherlarItem.soginchList = ArrayList()
    for (i in 0..3)
        SherlarItem.soginchList.add(sherlar("Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))


    SherlarItem.tabrikList = ArrayList()
    for (i in 0..3)
        SherlarItem.tabrikList.add(sherlar("Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))

    SherlarItem.otaOnaList = ArrayList()
    for (i in 0..3)
        SherlarItem.otaOnaList.add(sherlar("Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))

    SherlarItem.dostlikList = ArrayList()
    for (i in 0..3)
        SherlarItem.dostlikList.add(sherlar("Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))

    SherlarItem.hazilList = ArrayList()
    for (i in 0..3)
        SherlarItem.hazilList.add(sherlar("Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))

    SherlarItem.yangilarList = ArrayList()
    for (i in 0..3)
        SherlarItem.yangilarList.add(sherlar("Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))

    SherlarItem.saqlanganList = ArrayList()
    for (i in 0..3)
        SherlarItem.saqlanganList.add(sherlar("Oshiq derlar meni", "Ko’zlarim ko’r bo’lsa, ko’rmasdim seni,\n" +
                "Yuragim tosh bo’lsa, sevmasdim seni,\n" +
                "Mayli xijron azobi qiynasin meni,\n" +
                "O’lsam ham baribir sevaman seni!"))
}
