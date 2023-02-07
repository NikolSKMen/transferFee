import org.junit.Test

import org.junit.Assert.*

class MainKtTest {

    @Test
    fun totalPriceFuncMasterCard() {
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

        assertEquals(1000,result)
    }
  @Test
  fun totalPriceFuncMasterCard1() {
    val  cardType = "Master card"//(Master card,Maestro) (Visa,Мир) (vk pay)
    val transferSummMonth = 0
    val itemTransfer = 800000//перевод в рублях
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

    assertEquals(0,result)
  }
  @Test
  fun totalPriceFuncMasterCard2() {
    val  cardType = "Master card"//(Master card,Maestro) (Visa,Мир) (vk pay)
    val transferSummMonth = 0
    val itemTransfer = 80000//перевод в рублях
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

    assertEquals(80500,result)
  }
  @Test
  fun totalPriceFuncMasterCard3() {
    val  cardType = "Master card"//(Master card,Maestro) (Visa,Мир) (vk pay)
    val transferSummMonth = 800000
    val itemTransfer = 80000//перевод в рублях
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

    assertEquals(0,result)
  }
  @Test
  fun totalPriceFuncMaestro() {
    val  cardType = "Maestro"//(Master card,Maestro) (Visa,Мир) (vk pay)
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

    assertEquals(1000,result)
  }
  @Test
  fun totalPriceFuncMaestro1() {
    val  cardType = "Maestro"//(Master card,Maestro) (Visa,Мир) (vk pay)
    val transferSummMonth = 0
    val itemTransfer = 800000//перевод в рублях
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

    assertEquals(0,result)
  }
  @Test
  fun totalPriceFuncMaestro2() {
    val  cardType = "Maestro"//(Master card,Maestro) (Visa,Мир) (vk pay)
    val transferSummMonth = 0
    val itemTransfer = 80000//перевод в рублях
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

    assertEquals(80500,result)
  }
  @Test
  fun totalPriceFuncMaestro3() {
    val  cardType = "Maestro"//(Master card,Maestro) (Visa,Мир) (vk pay)
    val transferSummMonth = 800000
    val itemTransfer = 80000//перевод в рублях
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

    assertEquals(0,result)
  }
  @Test
  fun totalPriceFuncVisa() {
    val  cardType = "Visa"//(Master card,Maestro) (Visa,Мир) (vk pay)
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

    assertEquals(1035,result)
  }
  @Test
  fun totalPriceFuncVisa1() {
    val  cardType = "Master card"//(Master card,Maestro) (Visa,Мир) (vk pay)
    val transferSummMonth = 0
    val itemTransfer = 800000//перевод в рублях
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

    assertEquals(0,result)
  }
  @Test
  fun totalPriceVisa2() {
    val  cardType = "Visa"//(Master card,Maestro) (Visa,Мир) (vk pay)
    val transferSummMonth = 0
    val itemTransfer = 80000//перевод в рублях
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

    assertEquals(80600,result)
  }
  @Test
  fun totalPriceVisa3() {
    val  cardType = "Visa"//(Master card,Maestro) (Visa,Мир) (vk pay)
    val transferSummMonth = 800000
    val itemTransfer = 80000//перевод в рублях
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

    assertEquals(0,result)
  }
  @Test
  fun totalPriceFuncVk() {
    val  cardType = "vk pay"//(Master card,Maestro) (Visa,Мир) (vk pay)
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

    assertEquals(1000,result)
  }
  @Test
  fun totalPriceFuncVk1() {
    val  cardType = "vk pay"//(Master card,Maestro) (Visa,Мир) (vk pay)
    val transferSummMonth = 0
    val itemTransfer = 800000//перевод в рублях
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

    assertEquals(0,result)
  }
  @Test
  fun totalPriceVk2() {
    val  cardType = "vk pay"//(Master card,Maestro) (Visa,Мир) (vk pay)
    val transferSummMonth = 0
    val itemTransfer = 15000//перевод в рублях
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

    assertEquals(15000,result)
  }
  @Test
  fun totalPriceFuncVk3() {
    val cardType = "vk pay"//(Master card,Maestro) (Visa,Мир) (vk pay)
    val transferSummMonth = 800000
    val itemTransfer = 1000//перевод в рублях
    val minCommission = 35//Мним. комисия
    val percentageCommission = 0.75// процент комисии
    val totalPercent = percentageCommission / 100 // итоговый размер комисии
    val limTransferDay = 150000
    val limTransferMonth = 600000
    val limVkOnce = 15000
    val limVkMonth = 40000
    val limMasterMaestro = 75000

    val result = totalPriceFunc(
      cardType, transferSummMonth, itemTransfer, minCommission,
      percentageCommission, totalPercent, limTransferDay, limTransferMonth, limVkOnce,
      limVkMonth, limMasterMaestro
    )

    assertEquals(0, result)
  }
  @Test
  fun totalPriceFuncMup() {
    val  cardType = "Мир"//(Master card,Maestro) (Visa,Мир) (vk pay)
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

    assertEquals(1035,result)
  }
  @Test
  fun totalPriceFuncMup1() {
    val  cardType = "Мир"//(Master card,Maestro) (Visa,Мир) (vk pay)
    val transferSummMonth = 0
    val itemTransfer = 800000//перевод в рублях
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

    assertEquals(0,result)
  }
  @Test
  fun totalPriceMup2() {
    val  cardType = "Мир"//(Master card,Maestro) (Visa,Мир) (vk pay)
    val transferSummMonth = 0
    val itemTransfer = 80000//перевод в рублях
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

    assertEquals(80600,result)
  }
  @Test
  fun totalPriceMup3() {
    val  cardType = "Мир"//(Master card,Maestro) (Visa,Мир) (vk pay)
    val transferSummMonth = 800000
    val itemTransfer = 80000//перевод в рублях
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

    assertEquals(0,result)
  }
  @Test
  fun totalPriceBreak() {
    val  cardType = "dfdf"//(Master card,Maestro) (Visa,Мир) (vk pay)
    val transferSummMonth = 0
    val itemTransfer = 80000//перевод в рублях
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

    assertEquals(0,result)
  }

}