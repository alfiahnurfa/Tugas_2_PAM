package com.example.compose1

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun HasilScreen(
    pesan: String,
    onKembali: () -> Unit,
    modifier: Modifier = Modifier
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        IdentitasHeader()
        HorizontalDivider()
        Spacer(Modifier.height(24.dp))

        Text(
            text = "Halaman 2 (Hasil)",
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(Modifier.height(16.dp))

        Text(text = "Teks dari Halaman 1:")
        Spacer(Modifier.height(8.dp))

        Card(modifier = Modifier.fillMaxWidth()) {
            // Ini "Label" yang diminta di soal
            Text(
                text = if (pesan.isBlank()) "(kosong)" else pesan,
                style = MaterialTheme.typography.headlineSmall,
                modifier = Modifier.padding(16.dp)
            )
        }

        Spacer(Modifier.height(24.dp))
        Button(onClick = onKembali) {
            Text("Kembali")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun HasilScreenPreview() {
    HasilScreen(pesan = "Halo dari halaman 1", onKembali = {})
}