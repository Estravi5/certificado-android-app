package com.example.certificado2026_1

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.certificado2026_1.ui.theme.Certificado20261Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Certificado20261Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    CertificatingCourse(
                        name = "Jesús Saúl Estrada Vivas",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun CertificatingCourse(name: String, modifier: Modifier = Modifier) {
    // Variables del certificado
    val companyName = "TechNova Solutions"
    val departmentName = "Software Development"
    val number = 40 // Número de horas del curso
    val course = "Desarrollo de Aplicaciones Android con Kotlin"
    val representative1 = "Ing. Laura Méndez Ortega"
    val representative2 = "Mtro. Carlos Hernández Ruiz"

    Column(
        modifier = modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

        // Primer renglón: Escudos y nombre de la compañía
        Row(
            modifier = modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            // Escudo izquierdo
            Image(
                painter = painterResource(id = R.drawable.logo_technova),
                contentDescription = "Escudo de TechNova Solutions",
                modifier = Modifier.size(50.dp, 50.dp)
            )

            // Nombre de la compañía
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier.weight(1f)
            ){
                Text(
                    text = companyName,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = departmentName,
                    fontSize = 16.sp,
                    fontWeight = FontWeight.Normal,
                    textAlign = TextAlign.Center
                )
            }

            // Escudo derecho
            Image(
                painter = painterResource(id = R.drawable.logo_departamento),
                contentDescription = "Escudo de departamento",
                modifier = Modifier.size(50.dp, 50.dp)
            )
        }

        Spacer(modifier = modifier.height(30.dp))

        // Segundo renglón: "This certificate is presented to:"
        Text(
            text = "This certificate is presented to:",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = modifier.height(20.dp))

        // Tercer renglón: Nombre con imagen de fondo

        Box(
            contentAlignment = Alignment.Center,
            modifier = Modifier.fillMaxWidth()
        ) {
            Image(
                painter = painterResource(id = R.drawable.android_certificate),
                contentDescription = "Fondo para el nombre",
                modifier = modifier.fillMaxWidth(),
                alpha = 0.3F
            )
            Text(
                text = name,
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                color = Color.Black,
                modifier = modifier.fillMaxWidth()
            )
        }

        Spacer(modifier = modifier.height(20.dp))

        // Cuarto renglón: "has completed a #number hours course on"
        Text(
            text = "has successfully completed a ${number} hours course on",
            fontSize = 16.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = modifier.height(15.dp))

        // Quinto renglón: Nombre del curso
        Text(
            text = course,
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            modifier = Modifier.fillMaxWidth()
        )

        Spacer(modifier = modifier.height(40.dp))

        // Sexto renglón: Nombres y firmas de representantes
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.SpaceAround
        ) {
            // Representante 1
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Text(
                        text = "____________________",
                        fontSize = 14.sp
                    )
                    // Firma como imagen superpuesta sobre la línea
                    Image(
                        painter = painterResource(id = R.drawable.firma_laura), // Cambia por imagen de firma
                        contentDescription = "Firma 1",
                        modifier = Modifier
                            .size(80.dp, 30.dp)
                            .padding(bottom = 8.dp),
                        alpha = 0.9f
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = representative1,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Directora de Capacitación",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }

            Spacer(modifier = Modifier.width(20.dp))

            // Representante 2
            Column(
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                Box(
                    contentAlignment = Alignment.BottomCenter
                ) {
                    Text(
                        text = "____________________",
                        fontSize = 14.sp
                    )
                    // Firma como imagen superpuesta sobre la línea
                    Image(
                        painter = painterResource(id = R.drawable.carlos_firma), // Cambia por imagen de firma
                        contentDescription = "Firma 2",
                        modifier = Modifier
                            .size(80.dp, 30.dp)
                            .padding(bottom = 8.dp),
                        alpha = 0.9f
                    )
                }
                Spacer(modifier = Modifier.height(5.dp))
                Text(
                    text = representative2,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Bold,
                    textAlign = TextAlign.Center
                )
                Text(
                    text = "Coordinador del Programa",
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    Certificado20261Theme {
        CertificatingCourse("Jesús Saúl Estrada Vivas")
    }
}