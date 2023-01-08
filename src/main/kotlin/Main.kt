fun main() {
    val itemTransfer =5000//перевод в рублях
    val minCommission =35//миним. комисия
    val percentageCommission=0.75// процент комисии
    val totalPercent =percentageCommission/100 // итоговый размер комисии

    var amount =if(itemTransfer * totalPercent > minCommission)itemTransfer*totalPercent+itemTransfer else itemTransfer +minCommission
    println(amount)

}