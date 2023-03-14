package lk.nibm.holidayapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class DetailsView : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details_view)

        val nameTextView = findViewById<TextView>(R.id.titleHoliday)
        val dateTextView = findViewById<TextView>(R.id.dateHoliday)
        val descriptionTextView = findViewById<TextView>(R.id.descriptionHoliday)



        val txtname = intent.getStringExtra("txtname")
        nameTextView.setText(txtname)

        val txtdate = intent.getStringExtra("txtdate")
        dateTextView.setText(txtdate)


    }

}