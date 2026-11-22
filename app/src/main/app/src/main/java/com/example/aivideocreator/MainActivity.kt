
package com.example.aivideocreator

import android.app.Activity
import android.os.Bundle
import android.graphics.Color
import android.view.Gravity
import android.widget.*

class MainActivity : Activity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val layout = LinearLayout(this)
        layout.orientation = LinearLayout.VERTICAL
        layout.gravity = Gravity.CENTER
        layout.setPadding(30, 40, 30, 30)
        layout.setBackgroundColor(Color.rgb(18, 20, 35))

        val title = TextView(this)
        title.text = "🎬 AI Video Creator"
        title.textSize = 30f
        title.setTextColor(Color.WHITE)
        title.gravity = Gravity.CENTER

        val subtitle = TextView(this)
        subtitle.text = "اصنع فيديوهاتك بالذكاء الاصطناعي"
        subtitle.textSize = 18f
        subtitle.setTextColor(Color.LTGRAY)
        subtitle.gravity = Gravity.CENTER

        layout.addView(title)
        layout.addView(subtitle)

        val textButton = Button(this)
        textButton.text = "تحويل النص إلى فيديو"
        layout.addView(textButton)

        val imageButton = Button(this)
        imageButton.text = "تحويل الصورة إلى فيديو"
        layout.addView(imageButton)

        val voiceButton = Button(this)
        voiceButton.text = "إضافة صوت عربي"
        layout.addView(voiceButton)

        setContentView(layout)
    }
}
