package com.example.compose1

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun InputScreen(
    onKirim: (String) -> Unit,          // event naik ke pemanggil (state hoisting)
    modifier: Modifier = Modifier
) {
    var teks by rememberSaveable { mutableStateOf("") }

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {
        IdentitasHeader()
        HorizontalDivider()
        Spacer(Modifier.height(24.dp))

        Text(
            text = "Halaman 1 (Input)",
            style = MaterialTheme.typography.titleLarge
        )
        Spacer(Modifier.height(16.dp))

        OutlinedTextField(
            value = teks,
            onValueChange = { teks = it },
            label = { Text("Masukkan teks") },
            singleLine = true,
            modifier = Modifier.fillMaxWidth()
        )
        Spacer(Modifier.height(16.dp))

        Button(
            onClick = { onKirim(teks) },
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Kirim")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun InputScreenPreview() {
    InputScreen(onKirim = {})
}