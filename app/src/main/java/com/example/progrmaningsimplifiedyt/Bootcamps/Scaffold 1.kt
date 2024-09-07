package com.example.progrmaningsimplifiedyt.Bootcamps

import android.annotation.SuppressLint
import android.graphics.Paint.Align
import android.view.View.OnClickListener
import android.widget.Space
import android.widget.Toast
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Info
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material.icons.filled.Notifications
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.scale
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.SemanticsActions.OnClick
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.min
import androidx.compose.ui.unit.sp
import com.google.ai.client.generativeai.type.content

@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun MyScaffold(modifier: Modifier = Modifier) {
    val context = LocalContext.current
    Scaffold(
        modifier = Modifier.fillMaxSize(),
        topBar = {
            TopAppBar(
                title = {
                    Text(
                        text = "Anoworld",
                        modifier = Modifier.fillMaxWidth(),
                        textAlign = TextAlign.Center
                    )
                },
                navigationIcon = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Menu, contentDescription = null)
                    }
                },
                actions = {
                    IconButton(onClick = { /*TODO*/ }) {
                        Icon(Icons.Default.Search, contentDescription = null)
                    }
                },
                colors = TopAppBarDefaults.topAppBarColors(Color.Yellow)
            )
        },
        floatingActionButton = {
            FloatingActionButton(onClick = { /*TODO*/ }) {
                Icon(Icons.Default.Add, contentDescription = null)
            }
        },
        bottomBar = {
            BottomAppBar(

                modifier = Modifier,


                containerColor = Color.Yellow
            ) {
                Row (modifier=Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically, horizontalArrangement = Arrangement.Center){



                    IconButton(onClick = { Toast.makeText(context, "Home", Toast.LENGTH_SHORT).show()}, modifier = Modifier) {
                        Icon(
                            Icons.Default.Home,
                            contentDescription = null,
                            modifier = Modifier.scale(1.8f)
                        )

                    }
                    Spacer(modifier = Modifier.padding(30.dp))

                    IconButton(onClick = { Toast.makeText(context, "Add", Toast.LENGTH_SHORT).show() }) {
                        Icon(Icons.Default.Add, contentDescription = null,
                            modifier = Modifier.scale(1.8f))
                    }
                    Spacer(modifier = Modifier.padding(30.dp))
                    IconButton(onClick = {
                        Toast.makeText(context, "Favorite", Toast.LENGTH_SHORT).show()
                    }) {
                        Icon(Icons.Default.Favorite, contentDescription = null,
                            modifier = Modifier.scale(1.8f))
                    }
                    Spacer(modifier = Modifier.padding(30.dp))
                    IconButton(onClick = {
                        Toast.makeText(context, "Account", Toast.LENGTH_SHORT).show()
                    })
                    {
                        Icon(Icons.Default.AccountCircle, contentDescription = null,
                            modifier = Modifier.scale(1.8f))
                    }


                }
            }
        }
    ) { innerPadding ->
        // Pass the inner padding to the content to handle the insets
        LazyColumn(
            modifier = Modifier.padding(innerPadding),
            contentPadding = PaddingValues(vertical = 8.dp, horizontal = 16.dp)
        ) {
            items(10) { // Here, '10' is the number of items. Adjust as necessary.
                Content()
            }
        }
    }
}

@Composable
fun Content(modifier: Modifier = Modifier) {
    Card(modifier = modifier.padding(16.dp)) {
        Column {
            Text(
                text = "Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s.",
                Modifier.padding(8.dp)
            )

        }
    }
}


@Preview(showBackground = true)
@Composable
private fun ScaffoldPreview() {
    MyScaffold()
}
