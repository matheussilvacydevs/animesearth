package com.cyberdevs.animeseart

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import com.google.android.material.checkbox.MaterialCheckBox

class EulaActivity : AppCompatActivity() {

    private lateinit var checkbox: MaterialCheckBox
    private lateinit var initButton: MaterialButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_eula)

        checkbox = findViewById(R.id.checkbox)
        initButton = findViewById(R.id.init)

        initButton.setOnClickListener {
            if (checkbox.isChecked) {
                // CheckBox está marcado, inicie a LoginActivity
                val intent = Intent(this, LoginActivity::class.java)
                startActivity(intent)
                finish() // Opcional: encerrar esta atividade se você não quiser que o usuário volte para ela
            } else {
                // CheckBox não está marcado, você pode exibir uma mensagem ou realizar outra ação
            }
        }
    }
}

