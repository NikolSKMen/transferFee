fun main() {
    var cardType="vk pay"//(Master card,Maestro) (Visa,Мир) (vk pay)
    var transferSummMonth=0
    val itemTransfer =14000//перевод в рублях
    val minCommission =35//миним. комисия
    val percentageCommission=0.75// процент комисии
    val totalPercent =percentageCommission/100 // итоговый размер комисии
    val limTransferDay=150000
    val limTransferMonth=600000
    val limVkOnce=15000
    val limVkMonth=40000
    val limMasterMaestro=75000

    var totalPrice=when(cardType){
        "vk pay"->if(itemTransfer<=limVkOnce && transferSummMonth<=limVkMonth && itemTransfer<=limVkMonth){
            itemTransfer
        }else println("Превышен лимит")
        "Master card","Maestro"->if(transferSummMonth<limMasterMaestro && itemTransfer<=limMasterMaestro ){
            itemTransfer
        }else if(itemTransfer<=limTransferDay && transferSummMonth<limTransferMonth && itemTransfer<=limTransferDay) {
            itemTransfer*0.6/100+20+itemTransfer
        }else println("Превышен лимит")

        "Visa","Мир" ->if(itemTransfer * totalPercent > minCommission && transferSummMonth<limTransferMonth && itemTransfer<=limTransferDay){
            itemTransfer*totalPercent+itemTransfer
        }
        else if (itemTransfer * totalPercent < minCommission){
            itemTransfer +minCommission
        }else println("Превышен лимит")
        else->0
    }


if (totalPrice==0) println("нет данного способа оплаты")else
    println("сумма перевода с карты $cardType c учетом комиссии составила $totalPrice руб.")

}