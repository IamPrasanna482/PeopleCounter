class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
            //get reference to button

        var counter=0

        val btnClickMe= findViewById(R.id.button) as Button
        //onclicklistner waits for button to be triggered
        btnClickMe.setOnClickListener{
            Toast.makeText(this@MainActivity, "Hi Prasanna", Toast.LENGTH_SHORT)         //Toast means a quick message on the dispplay
        var mytextview=findViewById(R.id.textView) as TextView
            counter = counter+1
            mytextview.text=counter.toString()


        }
    }
}
