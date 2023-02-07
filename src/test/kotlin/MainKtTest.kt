import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun totalPriceFunc() {
      val  cardType = "Master card"//(Master card,Maestro) (Visa,Мир) (vk pay)
      val transferSummMonth = 0
      val itemTransfer = 1000//перевод в рублях
      val minCommission = 35//Мним. комисия
      val  percentageCommission = 0.75// процент комисии
      val totalPercent = percentageCommission / 100 // итоговый размер комисии
      val limTransferDay = 150000
      val limTransferMonth = 600000
      val  limVkOnce = 15000
      val limVkMonth = 40000
      val limMasterMaestro = 75000

        val result = totalPriceFunc(cardType, transferSummMonth, itemTransfer, minCommission,
          percentageCommission, totalPercent, limTransferDay, limTransferMonth, limVkOnce,
          limVkMonth, limMasterMaestro)

        assertEquals(1001,result)
    }
}