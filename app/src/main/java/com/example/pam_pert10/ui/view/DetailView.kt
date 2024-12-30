package com.example.pam_pert10.ui.view

import com.example.pam_pert10.ui.navigation.DestinasiNavigasi

object DestinasiDetail: DestinasiNavigasi {
    override val route = "detail"
    override val titleRes = "Detail Mahasiswa"
    const val NIM = "nim"
    val routesWithArg = "$route/{$NIM}"
}

