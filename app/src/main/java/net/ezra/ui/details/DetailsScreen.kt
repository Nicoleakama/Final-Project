package net.ezra.ui.details

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.List
import androidx.compose.material.icons.filled.Person
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_DETAILS
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_JOBS
import net.ezra.navigation.ROUTE_PORTFOLIO
import net.ezra.navigation.ROUTE_VIEWJOBS
import net.ezra.ui.Jobs.BottomBar


@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun DetailsScreen(navController: NavHostController) {
    Scaffold(
        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                LazyColumn(
                    modifier = Modifier
                        .fillMaxWidth()
                        .fillMaxHeight()
                        .fillMaxSize()
                        .background(color = Color.White)
                ) {
                    item {
                        Column(
                            modifier = Modifier
                                .fillMaxWidth()
                                .fillMaxHeight()
                                .fillMaxSize()
                        ) {
                            Card(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()
                                    .height(250.dp),
                                colors = CardDefaults.cardColors(Color.Black),
                                shape = RoundedCornerShape(
                                    bottomEndPercent = 16,
                                    bottomStartPercent = 16
                                )
                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.backarrow),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .padding(start = 8.dp)
                                            .size(45.dp)
                                            .clickable {}


                                    )


                                    Spacer(
                                        modifier = Modifier
                                            .width(30.dp)
                                    )

                                    Text(
                                        text = "Details",
                                        color = Color.White,
                                        fontWeight = FontWeight.SemiBold,
                                        textAlign = TextAlign.Center,
                                        modifier = Modifier
                                            .padding(top = 15.dp, start = 70.dp)
                                    )


                                    Image(
                                        painter = painterResource(id = R.drawable.save),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .padding(start = 120.dp)
                                            .size(45.dp)
                                            .clickable { }
                                    )
                                }



                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .padding(start = 1.dp),
                                    horizontalArrangement = Arrangement.SpaceEvenly

                                ) {
                                    Image(
                                        painter = painterResource(id = R.drawable.netflix),
                                        contentDescription = "",
                                        modifier = Modifier
                                            .size(48.dp)
                                            .padding(start = 2.dp),
                                    )


                                }



                                Spacer(modifier = Modifier.height(5.dp))


                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ) {
                                    Text(
                                        text = "Product Designer",
                                        color = Color.White,
                                        fontWeight = FontWeight.ExtraBold,
                                        textAlign = TextAlign.Center,
                                        fontSize = 25.sp,
                                        modifier = Modifier
                                            .padding(start = 120.dp)


                                    )

                                }

                                Spacer(modifier = Modifier.height(5.dp))

                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ) {
                                    Text(
                                        text = "$50.00/hr",
                                        color = Color.White,
                                        fontWeight = FontWeight.SemiBold,
                                        textAlign = TextAlign.Center,
                                        fontSize = 25.sp,

                                        modifier = Modifier
                                            .padding(start = 120.dp)
                                    )

                                }


                                Spacer(modifier = Modifier.height(15.dp))

                                Row(
                                    modifier = Modifier
                                        .padding(start = 120.dp)

                                ) {
                                    Card(
                                        modifier = Modifier
                                            .width(70.dp)
                                            .height(25.dp)
                                            .padding(start = 5.dp),
                                        colors = CardDefaults.cardColors(Color(0XFF2A2C2D))
                                    ) {
                                        Text(
                                            text = "UI Design",
                                            color = Color.White,
                                            fontSize = 12.sp,
                                            textAlign = TextAlign.Center,
                                            modifier = Modifier.padding(top = 5.dp, start = 5.dp)


                                        )

                                    }

                                    Spacer(modifier = Modifier.width(8.dp))


                                    Card(
                                        modifier = Modifier
                                            .width(75.dp)
                                            .height(25.dp)
                                            .padding(end = 5.dp),
                                        colors = CardDefaults.cardColors(Color(0XFF2A2C2D))

                                    ) {
                                        Text(
                                            text = "UX Design",
                                            color = Color.White,
                                            fontSize = 12.sp,
                                            textAlign = TextAlign.Center,
                                            modifier = Modifier.padding(top = 5.dp, start = 5.dp)

                                        )
                                    }

                                }


                            }


                            Spacer(modifier = Modifier.height(15.dp))


                            Row(
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    text = "Job Overview",
                                    fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                )

                            }

                            Spacer(modifier = Modifier.height(10.dp))


                            Column(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .fillMaxHeight()

                            ) {
                                Text(
                                    text = "We're a team of youthful,intelligent and dedicated creatives who have an unrivaled energy and passion for crafting beautiful and meaningful products."
                                            +
                                            "We strive to follow all UX processes of ideation,research and MVP for our product design to enable output that is both aesthetic and strategic.",
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                )

                            }


                            Spacer(modifier = Modifier.height(10.dp))


                            Row(
                                modifier = Modifier.fillMaxWidth()
                            ) {
                                Text(
                                    text = "Qualifications",
                                    fontWeight = FontWeight.SemiBold,
                                    modifier = Modifier
                                        .padding(start = 10.dp)
                                )

                            }

                            Spacer(modifier = Modifier.height(10.dp))


                            Column(
                                modifier = Modifier
                                    .padding(start = 10.dp)

                            ) {
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ) {

                                    Text(text = "Exceptional communication skills and team-working skills.")
                                }

                                Spacer(modifier = Modifier.height(6.dp))
                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ) {

                                    Text(text = "Know the principles of animation and you can create high fidelity prototypes.")
                                }
                                Spacer(modifier = Modifier.height(6.dp))

                                Row(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                ) {


                                    Text(text = "Direct experience using Adobe Premiere,Adobe After Effect & other tools used to create videos ,animations etc.")

                                }

                                Spacer(modifier = Modifier.height(20.dp))


                            }

                        }

                        Row(
                            modifier = Modifier
                                .padding(start = 100.dp)
                        ) {
                            Button(
                                onClick =
                                {
                                    navController.navigate(ROUTE_DETAILS) {
                                        popUpTo(ROUTE_DETAILS) { inclusive = true }
                                    }
                                },

                                colors = ButtonDefaults.buttonColors(Color(0XFF6200EE)),
                                shape = RoundedCornerShape(15.dp)
                            )


                            {

                                Text(
                                    text = "Apply Now",

                                    color = Color.White,
                                    textAlign = TextAlign.Center,
                                    modifier = Modifier
                                        .width(130.dp)
                                )
                            }


                        }


                    }
                }
            }

        },

        bottomBar = { BottomBar(navController)  }

    )




}



@Preview(showBackground = true, uiMode = Configuration.UI_MODE_NIGHT_NO)
@Composable
fun HomeScreenPreviewLight() {
    DetailsScreen(rememberNavController())

}

@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }

    BottomNavigation(elevation = 10.dp) {
        BottomNavigationItem(icon = {

            Icon(imageVector = Icons.Default.Home, "")
        },
            label = { androidx.compose.material.Text(text = "Home") },
            selected = navController.currentDestination?.route ==  ROUTE_HOME,
            onClick = {
                navController.navigate(ROUTE_HOME)


            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite, "")
        },
            label = { androidx.compose.material.Text(text = "View ") },
            selected = navController.currentDestination?.route ==  ROUTE_VIEWJOBS,
            onClick = {
                navController.navigate(ROUTE_VIEWJOBS)
            })


        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "")
        },
            label = { androidx.compose.material.Text(text = "Profile") },
            selected = navController.currentDestination?.route ==  ROUTE_PORTFOLIO,
            onClick = {
                navController.navigate(ROUTE_PORTFOLIO)
            })



        BottomNavigationItem(icon = {

            Icon(imageVector = Icons.Default.List ,"")
        },
            label = { androidx.compose.material.Text(text = "Jobs") },
            selected = navController.currentDestination?.route ==  ROUTE_JOBS,
            onClick = {
                navController.navigate(ROUTE_JOBS)

            })


        BottomNavigationItem(icon = {

            Icon(imageVector = Icons.Default.Edit ,"")
        },
            label = { androidx.compose.material.Text(text = "Details") },
            selected = navController.currentDestination?.route ==  ROUTE_DETAILS,
            onClick = {
                navController.navigate(ROUTE_DETAILS)

            })
    }
}


