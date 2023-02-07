fun main() {

   if (totalPriceFunc()== 0) println("превышен лимит по операции")
    else println("сумма перевода с учетом комиссии составила ${totalPriceFunc()} руб.")
}

fun totalPriceFunc(
    cardType: String = "Visa",//(Master card,Maestro) (Visa,Мир) (vk pay)
    transferSummMonth: Int = 0,
    itemTransfer: Int = 80000,//перевод в рублях
    minCommission: Int = 35,//миним. комисия
    percentageCommission: Double = 0.75,// процент комисии
    totalPercent: Double = percentageCommission / 100, // итоговый размер комисии
    limTransferDay: Int = 150000,
    limTransferMonth: Int = 600000,
    limVkOnce: Int = 15000,
    limVkMonth: Int = 40000,
    limMasterMaestro: Int = 75000

): Int {

    var totalPrice = when (cardType) {

        "vk pay" -> if (itemTransfer <= limVkOnce && transferSummMonth <= limVkMonth && itemTransfer <= limVkMonth) {
           itemTransfer
        } else return 0

        "Master card", "Maestro" -> if (transferSummMonth < limMasterMaestro && itemTransfer <= limMasterMaestro) {
            itemTransfer
        } else if (itemTransfer <= limTransferDay && transferSummMonth < limTransferMonth && itemTransfer <= limTransferDay) {
            itemTransfer * 0.6 / 100 + 20 + itemTransfer
        } else return 0

        "Visa", "Мир" -> if (itemTransfer * totalPercent > minCommission && transferSummMonth < limTransferMonth && itemTransfer <= limTransferDay) {
            itemTransfer * totalPercent + itemTransfer
        } else if (itemTransfer * totalPercent < minCommission) {
            itemTransfer + minCommission
        } else return 0
        else -> return 0

    }

    return (totalPrice).toInt()

}


