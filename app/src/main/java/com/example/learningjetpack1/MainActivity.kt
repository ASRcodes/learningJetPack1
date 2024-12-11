package com.example.learningjetpack1

import android.os.Bundle
import android.os.ParcelFileDescriptor
import android.view.Window
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.asPaddingValues
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.systemBars
import androidx.compose.foundation.layout.systemBarsPadding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.windowInsetsPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Snackbar
import androidx.compose.material3.Text
import androidx.compose.material3.rememberBottomSheetScaffoldState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.core.view.WindowCompat
import com.example.learningjetpack1.ui.theme.LearningJetPack1Theme
import kotlin.random.Random
import androidx.compose.material.*

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {

            //                                      Textfields in jetpack

//            Snackbar (modifier = Modifier.padding(WindowInsets.systemBars.asPaddingValues())){
//                Text(text="Anubhav Singh")
//            }





//                                                              About modifiers
//            Column (
//                modifier = Modifier
//                    .padding(WindowInsets.systemBars.asPaddingValues())
//                    .fillMaxHeight(0.5f)
//                    .fillMaxWidth()
//                    .border(5.dp, Color.Magenta)
//                    .padding(5.dp)
//                    .border(5.dp,Color.Red)
//                    .padding(5.dp)
//                    .border(10.dp,Color.Green)
//                    .padding(10.dp)
////                    .padding(top = 20.dp)
//                    .background(Color.Cyan)
//            ){
////                Text("What's up bro", modifier = Modifier.offset(50.dp,80.dp))
//                Text("What's upp vro!", modifier = Modifier
//                    .border(5.dp, Color.Yellow)
//                    .padding(5.dp)
//                    .offset(20.dp,30.dp)
//                    .border(10.dp,Color.Black)
//                    .padding(10.dp)
//                )
//                Spacer(modifier = Modifier.height(90.dp))
//                Text("How are you", modifier = Modifier.clickable {
//
//                })
//            }


//                                                         About rows and columns
//            Column(
//                modifier = Modifier.fillMaxSize()
//            ) {
//            Column (
//                modifier = Modifier
//                    .width(200.dp)
//                    .height(300.dp)
//                    .fillMaxSize()
//                    .weight(1f)
//                    .background(Color.Red),
//                horizontalAlignment = Alignment.CenterHorizontally,
//                verticalArrangement = Arrangement.SpaceEvenly
//            ){
//                Text("Anubhav")
//                Text("Singh")
//                Text("Anubhav")
//            }
//            Row (
//                modifier = Modifier
//                    .fillMaxSize()
//                    .weight(1f)
//                    .background(Color.Red),
//                horizontalArrangement = Arrangement.SpaceEvenly,
//                verticalAlignment = Alignment.CenterVertically
//            ){
//                Text("Anubhav")
//                Text("Singh")
//                Text("Anubhav")
//            }
//        }

//                                              Creating Image card
//            val painter = painterResource(id = R.drawable.sai)
//            val description = "She's so cute!!"
//            val title = "Sai Pallavi"
//            Box(
//                modifier = Modifier.fillMaxWidth(0.5f).padding(16.dp)
//            ){
//                ImageCard(
//                    painter=painter,
//                    contentDescription = description,
//                    title=title
//                )
//            }

//                                     Text styling
//            Box(
//                modifier = Modifier
//                    .fillMaxSize()
//                    .padding(WindowInsets.systemBars.asPaddingValues())
//                    .background(Color(0xFF101010))
//            ) {
//                Text(
//                    text = buildAnnotatedString {
//                        withStyle(
//                            style = SpanStyle(
//                                color = Color.Green,
//                                fontSize = 60.sp
//                            )
//                        ){
//                            append("J")
//                        }
//                        append("etPack")
//                        withStyle(
//                            style = SpanStyle(
//                                color = Color.Green,
//                                fontSize = 60.sp
//                            )
//                        ){
//                            append("C")
//                        }
//                        append("ompose")
//                    },
//                    color = Color.White,
//                    fontSize = 30.sp,
//                    fontWeight = FontWeight.Bold,
//                    fontStyle = FontStyle.Italic,
//                    textAlign = TextAlign.Center,
//                    textDecoration = TextDecoration.Underline
//                )
//            }

//                                      Learning about state..
//            Column(modifier = Modifier.fillMaxSize()) {
//                val color = remember {
//                    mutableStateOf(Color.Yellow)
//                }
//                ColorBox(
//                    Modifier.weight(1f).fillMaxSize()
//                ){
//                    color.value = it
//                }
//                Box(modifier = Modifier
//                    .background(color.value)
//                    .weight(1f)
//                    .fillMaxSize())
//            }


        }
    }

//                                      Learning state..
//    @Composable
//    fun ColorBox(modifier: Modifier=Modifier,
//                 updatecolor:(Color)->Unit
//                 ){
//        Box(
//            modifier = modifier
//                .background(Color.Red)
//                .clickable {
//                    updatecolor( Color(
//                            Random.nextFloat(),
//                            Random.nextFloat(),
//                            Random.nextFloat(),
//                            1f
//                    )
//                    )
//                }
//        ){
//
//        }
//    }

    private fun enableEdgeToEdge(){
        WindowCompat.setDecorFitsSystemWindows(window,false)
    }
//    Creating an Image card
//    @Composable
//    fun ImageCard(
//        painter:Painter,
//        contentDescription:String,
//        title:String,
//        modifier:Modifier=Modifier
//    ){
//       Card(
//           modifier=Modifier.fillMaxWidth()
//               .padding(WindowInsets.systemBars.asPaddingValues()),
//           shape = RoundedCornerShape(15.dp),
//           elevation = CardDefaults.cardElevation(5.dp)
//       ) {
//            Box (modifier=Modifier.height(200.dp)){
//                Image(
//                    painter=painter,
//                    contentDescription=contentDescription,
//                    contentScale = ContentScale.Crop
//                )
//                Box(modifier = Modifier.fillMaxSize()
//                    .background(
//                        Brush.verticalGradient(
//                            colors = listOf(
//                                Color.Transparent,
//                                Color.Cyan
//                            ),
//                            startY = 300f
//                        )
//                    ))
//                Box(modifier=Modifier.fillMaxSize().padding(15.dp),
//                    contentAlignment = Alignment.BottomStart){
//                    Text(title, style = TextStyle(color = Color.White, fontSize = 15.sp, textAlign = TextAlign.Center))
//                }
//            }
//       }
//    }
}

