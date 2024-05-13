@file:OptIn(ExperimentalMaterial3Api::class)

package net.ezra.ui.Jobs

import android.annotation.SuppressLint
import android.content.res.Configuration
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Icon
import androidx.compose.material.Scaffold
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardActions
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.List
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import net.ezra.R
import net.ezra.navigation.ROUTE_DETAILS
import net.ezra.navigation.ROUTE_HOME
import net.ezra.navigation.ROUTE_JOBS
import net.ezra.navigation.ROUTE_PORTFOLIO
import net.ezra.navigation.ROUTE_VIEWJOBS


@SuppressLint("UnusedMaterialScaffoldPaddingParameter")

@Composable
fun JobScreen(navController: NavHostController){

    Scaffold(

        content = {
            Column(
                modifier = Modifier
                    .fillMaxSize(),
                verticalArrangement = Arrangement.Center,
                horizontalAlignment = Alignment.CenterHorizontally
            ) {

                //all contents of your screen must be placed within this column
                LazyColumn(
                    modifier = Modifier
                        .background(color = Color.White)
                        .fillMaxWidth()
                        .fillMaxHeight()
                ) {
                    item {
                        Column {

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                                    .padding(start = 16.dp, end = 20.dp)
                            ) {
                                Image(
                                    painter =
                                    painterResource(id = R.drawable.button),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(48.dp)
                                )

                                Spacer(modifier = Modifier.weight(1f))


                                Image(
                                    painter =
                                    painterResource(id = R.drawable.kindpng),
                                    contentDescription = "",
                                    modifier = Modifier
                                        .size(48.dp)
                                        .padding(start = 10.dp),
                                )

                            }

                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                            )
                            {
                                Text(
                                    text = "Explore!",
                                    fontWeight = FontWeight.ExtraBold,
                                    color = Color.Black,
                                    fontSize = 25.sp,
                                    modifier = Modifier
                                        .padding(start = 20.dp)
                                )

                            }
                            Row {
                                Text(
                                    text = "Find the best job for you",
                                    fontSize = 12.sp,
                                    color = Color.Gray,
                                    modifier = Modifier
                                        .padding(start = 20.dp)
                                )
                            }

                            Row(
                                modifier = Modifier
                                    .padding(start = 10.dp, end = 16.dp)
                                    .fillMaxWidth()

                            ) {
                                var searchText by remember { mutableStateOf("") }

                                TextField(
                                    value = searchText,
                                    onValueChange = { searchText = it },
                                    modifier = Modifier
                                        .clickable {}
                                        .fillMaxWidth()
                                        .background(Color.Transparent)
                                        .padding(start = 10.dp, end = 10.dp),

                                    placeholder = { androidx.compose.material3.Text(text = "Search Categories.....") },

                                    leadingIcon = {
                                        Icon(
                                            imageVector = Icons.Default.Search,
                                            contentDescription = "search icon",
                                            tint = Color.Black
                                        )
                                    },

                                    shape = RoundedCornerShape(20.dp),

                                    colors = TextFieldDefaults.textFieldColors(

                                        backgroundColor = Color.LightGray,
                                        textColor = Color.Black,
                                        cursorColor = Color.Black,
                                        focusedIndicatorColor = Color.Transparent,
                                        unfocusedIndicatorColor = Color.Transparent,

                                        ),
                                    keyboardOptions = KeyboardOptions.Default.copy(
                                        imeAction = ImeAction.Done,
                                        keyboardType = KeyboardType.Text
                                    ),
                                    keyboardActions = KeyboardActions(
                                        onDone = {}
                                    ),
                                    singleLine = true,
                                    textStyle = MaterialTheme.typography.bodyMedium
                                )


                            }





                            Row(
                                modifier = Modifier
                                    .fillMaxWidth()
                            )

                            {
                                Text(
                                    text = "Recommended",
                                    color = Color.Black,
                                    fontWeight = FontWeight.ExtraBold,
                                    modifier = Modifier
                                        .padding(start = 20.dp)
                                )

                                Spacer(modifier = Modifier.weight(1f))


                                Text(
                                    text = "See all",
                                    color = Color.Gray,
                                    fontSize = 20.sp,
                                    modifier = Modifier.padding(end = 16.dp)
                                )


                            }

                            LazyRow {
                                item {
                                    Row {
                                        Card(
                                            modifier = Modifier
                                                .padding(start = 20.dp)
                                                .width(100.dp)
                                                .height(115.dp),
                                            colors = CardDefaults.cardColors(Color(0XFF000000)),
                                            shape = RoundedCornerShape(10.dp)
                                        ) {
                                            Row(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                            ) {
                                                Text(
                                                    text = "Full Time",
                                                    color = Color.White,
                                                    fontSize = 10.sp,
                                                    modifier = Modifier
                                                        .padding(start = 50.dp, top = 8.dp)
                                                )
                                            }
                                            Column(
                                                modifier = Modifier
                                                    .fillMaxHeight()
                                                    .fillMaxWidth()
                                            ) {
                                                Image(
                                                    painter =
                                                    painterResource(id = R.drawable.netflix),
                                                    contentDescription = "",
                                                    modifier = Modifier
                                                        .width(30.dp)
                                                        .height(25.dp)
                                                        .padding(start = 10.dp),
                                                    Alignment.Center
                                                )

                                                Spacer(modifier = Modifier.height(10.dp))


                                                Text(
                                                    text = "Netflix",
                                                    color = Color.White,
                                                    fontWeight = FontWeight.Bold,
                                                    modifier = Modifier
                                                        .padding(start = 10.dp)
                                                )

                                                Spacer(modifier = Modifier.height(8.dp))

                                                Text(
                                                    text = "$70.00/hr",
                                                    color = Color.White,
                                                    modifier = Modifier
                                                        .padding(start = 10.dp)
                                                )


                                                Spacer(modifier = Modifier.height(8.dp))



                                                Text(
                                                    text = "Product Designer",
                                                    color = Color.Gray,
                                                    fontSize = 10.sp,
                                                    modifier = Modifier
                                                        .padding(start = 10.dp)
                                                )

                                            }
                                        }
                                        Card(
                                            modifier = Modifier
                                                .padding(start = 20.dp)
                                                .width(100.dp)
                                                .height(115.dp),
                                            colors = CardDefaults.cardColors(Color(0XFF40E0D0)),
                                            shape = RoundedCornerShape(10.dp)
                                        ) {
                                            Row(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                            ) {
                                                Text(
                                                    text = "Full Time",
                                                    color = Color.White,
                                                    fontSize = 10.sp,
                                                    modifier = Modifier
                                                        .padding(start = 50.dp, top = 8.dp)
                                                )
                                            }
                                            Column(
                                                modifier = Modifier
                                                    .fillMaxHeight()
                                                    .fillMaxWidth()
                                            ) {
                                                Image(
                                                    painter =
                                                    painterResource(id = R.drawable.slack),
                                                    contentDescription = "",
                                                    modifier = Modifier
                                                        .width(30.dp)
                                                        .height(25.dp)
                                                        .padding(start = 10.dp),
                                                    Alignment.Center
                                                )

                                                Spacer(modifier = Modifier.height(10.dp))


                                                Text(
                                                    text = "Slack",
                                                    color = Color.White,
                                                    fontWeight = FontWeight.Bold,
                                                    modifier = Modifier
                                                        .padding(start = 10.dp)
                                                )

                                                Spacer(modifier = Modifier.height(8.dp))

                                                Text(
                                                    text = "$30.00/hr",
                                                    color = Color.White,
                                                    modifier = Modifier
                                                        .padding(start = 10.dp)
                                                )


                                                Spacer(modifier = Modifier.height(8.dp))



                                                Text(
                                                    text = "UX Designer",
                                                    color = Color.Gray,
                                                    fontSize = 10.sp,
                                                    modifier = Modifier
                                                        .padding(start = 10.dp)
                                                )

                                            }
                                        }
                                        Card(
                                            modifier = Modifier
                                                .padding(start = 20.dp)
                                                .width(100.dp)
                                                .height(115.dp),
                                            colors = CardDefaults.cardColors(Color(0XFFB6D0E2)),
                                            shape = RoundedCornerShape(10.dp)
                                        ) {
                                            Row(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                            ) {
                                                Text(
                                                    text = "Full Time",
                                                    color = Color.White,
                                                    fontSize = 10.sp,
                                                    modifier = Modifier
                                                        .padding(start = 50.dp, top = 8.dp)
                                                )
                                            }

                                            Column(
                                                modifier = Modifier
                                                    .fillMaxHeight()
                                                    .fillMaxWidth()
                                            ) {
                                                Image(
                                                    painter =
                                                    painterResource(id = R.drawable.microsoft),
                                                    contentDescription = "",
                                                    modifier = Modifier
                                                        .width(30.dp)
                                                        .height(25.dp)
                                                        .padding(start = 10.dp),
                                                    Alignment.Center
                                                )

                                                Spacer(modifier = Modifier.height(10.dp))


                                                Text(
                                                    text = "Microsoft",
                                                    color = Color.White,
                                                    fontWeight = FontWeight.Bold,
                                                    modifier = Modifier
                                                        .padding(start = 10.dp)
                                                )

                                                Spacer(modifier = Modifier.height(8.dp))

                                                Text(
                                                    text = "$60.00/hr",
                                                    color = Color.White,
                                                    modifier = Modifier
                                                        .padding(start = 10.dp)
                                                )


                                                Spacer(modifier = Modifier.height(8.dp))



                                                Text(
                                                    text = "Microsoft Designer",
                                                    color = Color.Gray,
                                                    fontSize = 10.sp,
                                                    modifier = Modifier
                                                        .padding(start = 10.dp)
                                                )

                                            }
                                        }

                                        Card(
                                            modifier = Modifier
                                                .padding(start = 20.dp)
                                                .width(100.dp)
                                                .height(115.dp),
                                            colors = CardDefaults.cardColors(Color(0XFFFFB6C1)),
                                            shape = RoundedCornerShape(10.dp)
                                        ) {
                                            Row(
                                                modifier = Modifier
                                                    .fillMaxWidth()
                                            ) {
                                                Text(
                                                    text = "Full Time",
                                                    color = Color.White,
                                                    fontSize = 10.sp,
                                                    modifier = Modifier
                                                        .padding(start = 50.dp, top = 8.dp)
                                                )
                                            }
                                            Column(
                                                modifier = Modifier
                                                    .fillMaxHeight()
                                                    .fillMaxWidth()
                                            ) {
                                                Image(
                                                    painter =
                                                    painterResource(id = R.drawable.google),
                                                    contentDescription = "",
                                                    modifier = Modifier
                                                        .width(30.dp)
                                                        .height(25.dp)
                                                        .padding(start = 10.dp),
                                                    Alignment.Center
                                                )

                                                Spacer(modifier = Modifier.height(10.dp))


                                                Text(
                                                    text = "Google",
                                                    color = Color.White,
                                                    fontWeight = FontWeight.Bold,
                                                    modifier = Modifier
                                                        .padding(start = 10.dp)
                                                )

                                                Spacer(modifier = Modifier.height(8.dp))

                                                Text(
                                                    text = "$70.00/hr",
                                                    color = Color.White,
                                                    modifier = Modifier
                                                        .padding(start = 10.dp)
                                                )


                                                Spacer(modifier = Modifier.height(8.dp))



                                                Text(
                                                    text = "Visual Designer",
                                                    color = Color.Gray,
                                                    fontSize = 10.sp,
                                                    modifier = Modifier
                                                        .padding(start = 10.dp)
                                                )

                                            }
                                        }
                                    }

                                }
                            }
                        }



                        Row(
                            modifier = Modifier
                                .fillMaxWidth()
                        )

                        {
                            Text(
                                text = "Popular Agency",
                                color = Color.Black,
                                fontWeight = FontWeight.ExtraBold,
                                modifier = Modifier
                                    .padding(start = 20.dp)
                            )

                            Spacer(modifier = Modifier.weight(1f))


                            Text(
                                text = "See all",
                                color = Color.Gray,
                                fontSize = 20.sp,
                                modifier = Modifier.padding(end = 16.dp)

                            )


                        }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()

                        ) {
                            Card(
                                modifier = Modifier
                                    .width(900.dp)
                                    .height(80.dp)
                                    .padding(10.dp),
                                colors = CardDefaults.cardColors(Color(0xFF87CEEB))

                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .fillMaxHeight()

                                ) {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    ) {
                                        Image(
                                            painter =
                                            painterResource(id = R.drawable.google),
                                            contentDescription = "",
                                            modifier = Modifier
                                                .width(40.dp)
                                                .height(40.dp)
                                                .padding(start = 10.dp, top = 15.dp)
                                        )

                                        Spacer(modifier = Modifier.width(30.dp))


                                        Column(
                                            modifier = Modifier
                                                .fillMaxHeight()
                                        ) {
                                            Text(
                                                text = "Visual Designer",
                                                fontWeight = FontWeight.Bold,
                                                modifier = Modifier
                                                    .padding(top = 15.dp)
                                            )

                                            Spacer(modifier = Modifier.height(8.dp))

                                            Text(
                                                text = "Google",
                                                color = Color.Gray,


                                                )
                                        }

                                        Spacer(modifier = Modifier.width(20.dp))


                                        Text(
                                            text = "$70/hr",
                                            modifier = Modifier
                                                .padding(start = 100.dp, top = 15.dp)
                                        )
                                    }

                                }

                            }


                        }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()

                        ) {
                            Card(
                                modifier = Modifier
                                    .width(900.dp)
                                    .height(80.dp)
                                    .padding(10.dp),
                                colors = CardDefaults.cardColors(Color(0XFFFFB6C1))

                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .fillMaxHeight()

                                ) {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    ) {
                                        Image(
                                            painter =
                                            painterResource(id = R.drawable.slack),
                                            contentDescription = "",
                                            modifier = Modifier
                                                .width(40.dp)
                                                .height(40.dp)
                                                .padding(start = 10.dp, top = 15.dp)
                                        )

                                        Spacer(modifier = Modifier.width(30.dp))


                                        Column(
                                            modifier = Modifier
                                                .fillMaxHeight()
                                        ) {
                                            Text(
                                                text = "Android Designer",
                                                fontWeight = FontWeight.Bold,
                                                modifier = Modifier
                                                    .padding(top = 15.dp)
                                            )

                                            Spacer(modifier = Modifier.height(8.dp))

                                            Text(
                                                text = "Slack",
                                                color = Color.Gray,


                                                )
                                        }

                                        Spacer(modifier = Modifier.width(20.dp))


                                        Text(
                                            text = "$30/hr",
                                            modifier = Modifier
                                                .padding(start = 100.dp, top = 15.dp)
                                        )
                                    }

                                }

                            }


                        }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()

                        ) {
                            Card(
                                modifier = Modifier
                                    .width(900.dp)
                                    .height(80.dp)
                                    .padding(10.dp),
                                colors = CardDefaults.cardColors(Color(0xFFFFD580))

                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .fillMaxHeight()

                                ) {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    ) {
                                        Image(
                                            painter =
                                            painterResource(id = R.drawable.netflix),
                                            contentDescription = "",
                                            modifier = Modifier
                                                .width(40.dp)
                                                .height(40.dp)
                                                .padding(start = 10.dp, top = 15.dp)
                                        )

                                        Spacer(modifier = Modifier.width(30.dp))


                                        Column(
                                            modifier = Modifier
                                                .fillMaxHeight()
                                        ) {
                                            Text(
                                                text = "App Designer",
                                                fontWeight = FontWeight.Bold,
                                                modifier = Modifier
                                                    .padding(top = 15.dp)
                                            )

                                            Spacer(modifier = Modifier.height(8.dp))

                                            Text(
                                                text = "RonasIT",
                                                color = Color.Gray,


                                                )
                                        }

                                        Spacer(modifier = Modifier.width(20.dp))


                                        Text(
                                            text = "$70/hr",
                                            modifier = Modifier
                                                .padding(start = 100.dp, top = 15.dp)
                                        )
                                    }

                                }

                            }


                        }

                        Row(
                            modifier = Modifier
                                .fillMaxWidth()

                        ) {
                            Card(
                                modifier = Modifier
                                    .width(900.dp)
                                    .height(80.dp)
                                    .padding(10.dp),
                                colors = CardDefaults.cardColors(Color(0xFF90EE90))

                            ) {
                                Column(
                                    modifier = Modifier
                                        .fillMaxWidth()
                                        .fillMaxHeight()

                                ) {
                                    Row(
                                        modifier = Modifier
                                            .fillMaxWidth()
                                    ) {
                                        Image(
                                            painter =
                                            painterResource(id = R.drawable.instagram),
                                            contentDescription = "",
                                            modifier = Modifier
                                                .width(40.dp)
                                                .height(40.dp)
                                                .padding(start = 10.dp, top = 15.dp)
                                        )

                                        Spacer(modifier = Modifier.width(30.dp))


                                        Column(
                                            modifier = Modifier
                                                .fillMaxHeight()
                                        ) {
                                            Text(
                                                text = "iOS Developer",
                                                fontWeight = FontWeight.Bold,
                                                modifier = Modifier
                                                    .padding(top = 15.dp)
                                            )

                                            Spacer(modifier = Modifier.height(8.dp))

                                            Text(
                                                text = "RonasIT",
                                                color = Color.Gray,


                                                )
                                        }

                                        Spacer(modifier = Modifier.width(20.dp))


                                        Text(
                                            text = "$60/hr",
                                            modifier = Modifier
                                                .padding(start = 100.dp, top = 15.dp)
                                        )
                                    }

                                }

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
fun HomeScreenPreviewLight(){
    JobScreen(rememberNavController())
    ClickableSearchBar{}
}




@Composable
fun ClickableSearchBar(onSearchClicked: ((String) -> Unit)){

}



@Composable
fun BottomBar(navController: NavHostController) {
    val selectedIndex = remember { mutableStateOf(0) }

    BottomNavigation(elevation = 10.dp) {
        BottomNavigationItem(icon = {

            Icon(imageVector = Icons.Default.Home, "")
        },
            label = { Text(text = "Home") },
            selected = navController.currentDestination?.route ==  ROUTE_HOME,
            onClick = {
                navController.navigate(ROUTE_HOME)


            })
        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Favorite, "")
        },
            label = { androidx.compose.material.Text(text = "View") },
            selected = navController.currentDestination?.route ==  ROUTE_VIEWJOBS,
            onClick = {
                navController.navigate(ROUTE_VIEWJOBS)
            })


        BottomNavigationItem(icon = {
            Icon(imageVector = Icons.Default.Person, "")
        },
            label = { Text(text = "Profile") },
            selected = navController.currentDestination?.route ==  ROUTE_PORTFOLIO,
            onClick = {
                navController.navigate(ROUTE_PORTFOLIO)
            })



        BottomNavigationItem(icon = {

            Icon(imageVector = Icons.Default.List ,"")
        },
            label = { Text(text = "Jobs") },
            selected = navController.currentDestination?.route ==  ROUTE_JOBS,
            onClick = {
                navController.navigate(ROUTE_JOBS)

            })


        BottomNavigationItem(icon = {

            Icon(imageVector = Icons.Default.Edit ,"")
        },
            label = { Text(text = "Details") },
            selected = navController.currentDestination?.route ==  ROUTE_DETAILS,
            onClick = {
                navController.navigate(ROUTE_DETAILS)

            })
    }
}
