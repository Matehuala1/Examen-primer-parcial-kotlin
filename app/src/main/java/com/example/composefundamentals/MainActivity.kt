package com.example.composefundamentals

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.paddingFromBaseline
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composefundamentals.ui.theme.ComposeFundamentalsTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeFundamentalsTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting(
                        name = "Android",
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )

}
@Composable
fun miComposable() {
    val interfaz = listOf(  "Hambuergueza ", "Pizza", "Tacos", "Sushi", "Chimichangas")
    Column (
        modifier = Modifier
            .fillMaxWidth()
            .background(Color.DarkGray)
            .padding(16.dp)
    ) {

    }
    Column(modifier = Modifier
        .padding(vertical = 48.dp)
        .padding(horizontal = 16.dp)){
    Column(
        modifier = Modifier

            .height(100.dp)
            .fillMaxSize()

            .background(Color.Cyan)
            .padding(vertical = 32.dp),

        horizontalAlignment = Alignment.CenterHorizontally


    ) {

        Text(
            text = "Encabezado",
            fontSize = 24.sp,
            fontWeight = FontWeight.Bold,
        )
    }
        Row(modifier = Modifier
            .height(300.dp)
            .fillMaxHeight()

        ) {
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color.Yellow),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center



            ) {
                Text(
                    text = "caja 1",
                    fontSize = 24.sp,

                )
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.padding(vertical = 10.dp)
                ) {
                    Text(
                        text = "accion",

                        )
                }

            }
            Column(
                modifier = Modifier
                    .fillMaxHeight()
                    .weight(1f)
                    .background(Color.Magenta),
                    horizontalAlignment = Alignment.CenterHorizontally,
                    verticalArrangement = Arrangement.Center




            ) {

                Text(
                    text = "caja 2",
                    fontSize = 24.sp,
                )
                Button(
                    onClick = { /*TODO*/ },
                    modifier = Modifier.padding(vertical = 10.dp)
                ) {
                    Text(
                        text = "accion",

                        )
                }
            }
        }
Column (modifier = Modifier
    .height(300.dp)
    .fillMaxWidth()
    .background(Color.LightGray)

){
    Text(
        text = "Lista de Elementos",
        fontSize = 20.sp,
        fontWeight = FontWeight.Bold,
    )
    Row (){
        LazyColumn() {
            items(interfaz){f->
                Text(
                    text = f
                )
            }
        }

    }
}



     /*   Column(
            modifier = Modifier
                .fillMaxWidth()
                .background(Color.DarkGray)
                .padding(16.dp)
        ) {

        }
        Column(
            modifier = Modifier
                .padding(vertical = 48.dp)
                .padding(horizontal = 16.dp)

                .fillMaxSize()

                .background(Color.Cyan)
                .padding(vertical = 32.dp),

            horizontalAlignment = Alignment.CenterHorizontally


        ) {

            Text(
                text = "Encabezado",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
            )

        }*/
    }
}


@Preview(showBackground = true,
            showSystemUi = true
)


@Composable
fun GreetingPreview() {
    ComposeFundamentalsTheme {
        miComposable()

    }
}