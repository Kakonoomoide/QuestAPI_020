package com.example.pam_pert10.model

import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class Mahasiswa(
    val nim: String? = null,
    val nama: String? = null,
    val alamat: String? = null,

    @SerialName("jenis_kelamin")
    val jenisKelamin: String? = null,

    val kelas: String? = null,
    val angkatan: String? = null
)