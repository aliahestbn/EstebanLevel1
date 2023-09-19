package com.example.estebanlevel1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    public var letter: String = ""
    public var number: Int = 0
    public var isBool: Boolean = false;
    public var isClicked: Boolean = false;

    fun pos(view: View) {
        isBool = true;
        isClicked = true;
    }

    fun neg(view: View) {
        isBool = false;
        isClicked = true;
    }

    fun buttona(view: View) {
        if (isClicked) {
            if (isBool) {
                letter += "A"
            } else {
                if (letter=="") {
                    Toast.makeText(this, "Empty letters", Toast.LENGTH_SHORT).show()
                }
                else{
                    letter = letter.substring(0, letter.length - 1)
                }
            }
            Toast.makeText(this, letter, Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Please click an operation first.", Toast.LENGTH_SHORT).show()
        }
        isClicked=false //for user not to enter another input
    }

    fun buttonb(view: View) {
        if (isClicked) {
            if (isBool) {
                letter += "B"
            } else {
                if (letter=="") {
                    Toast.makeText(this, "Empty letters.", Toast.LENGTH_SHORT).show()
                }
                else{
                    letter = letter.substring(0, letter.length - 1)
                }
            }
            Toast.makeText(this, letter, Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Please click an operation first.", Toast.LENGTH_SHORT).show()
        }
        isClicked=false //for user not to enter another input
    }

    fun buttonc(view: View) {
        if (isClicked) {
            if (isBool) {
                letter += "C"
            } else {
                if (letter=="") {
                    Toast.makeText(this, "Empty letters.", Toast.LENGTH_SHORT).show()
                }
                else{
                    letter = letter.substring(0, letter.length - 1)
                }
            }
            Toast.makeText(this, letter, Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Please click an operation first.", Toast.LENGTH_SHORT).show()
        }
        isClicked=false //for user not to enter another input
    }

    fun button1(view: View) {
        if (isClicked) {
            if (isBool) {
                number += 1
            } else {
                if(number<=0){
                    Toast.makeText(this, "Empty numbers.", Toast.LENGTH_SHORT).show()
                }else{
                    number -= 1
                }
                if(number<0){
                    Toast.makeText(this, "Cannot go to negative", Toast.LENGTH_SHORT).show()
                    number=0
                }
            }
            Toast.makeText(this, number.toString(), Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Please click an operation first.", Toast.LENGTH_SHORT).show()
        }
        isClicked=false
    }

    fun button2(view: View) {
        if (isClicked) {
            if (isBool) {
                number += 2
            } else {
                if(number<=0){
                    Toast.makeText(this, "Empty numbers.", Toast.LENGTH_SHORT).show()
                }else{
                    number -= 2
                }
                if(number<0){
                    Toast.makeText(this, "Cannot go to negative", Toast.LENGTH_SHORT).show()
                    number=0
                }
            }
            Toast.makeText(this, number.toString(), Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Please click an operation first.", Toast.LENGTH_SHORT).show()
        }
        isClicked=false
    }

    fun button3(view: View) {
        if (isClicked) {
            if (isBool) {
                number += 3
            } else {
                if(number<=0){
                    Toast.makeText(this, "Empty numbers.", Toast.LENGTH_SHORT).show()
                }else{
                    number -= 3
                }
                if(number<0){
                    Toast.makeText(this, "Cannot go to negative", Toast.LENGTH_SHORT).show()
                    number=0
                }
            }
            Toast.makeText(this, number.toString(), Toast.LENGTH_SHORT).show()
        } else {
            Toast.makeText(this, "Please click an operation first.", Toast.LENGTH_SHORT).show()
        }
        isClicked=false
    }
}

