package com.ti2a.utspm1

data class Club(
    val name: String,
    val epl: Int,
    val fa: Int,
    val efl: Int,
    val ucl: Int,
    val uel: Int,
) {
    val totalTrophies: Int
        get() = epl + fa + efl + ucl + uel
}

fun Club.recap(): String {
    return "$name berhasil meraih $totalTrophies Trofi dengan rincian, $epl Trofi EPL, $fa Trofi FA Cup, $efl Trofi EFL Cup, $ucl Trofi Champions League, dan $uel Trofi UEFA."
}
