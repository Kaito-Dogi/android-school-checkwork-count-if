package app.doggy.checkworkcount_if

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import app.doggy.checkworkcount_if.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    // バインディングクラスの変数
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater).apply { setContentView(this.root) }

        // 整数を管理する変数
        var count: Int = 0

        // plus_buttonをクリックした時の処理
        binding.plusButton.setOnClickListener {
            // countの値を1増やす
            count += 1

            // countの値によって、count_textに表示する内容を変える
            if (count % 15 == 0) {
                binding.countText.text = "FizzBuzz"
            } else if (count % 3 == 0) {
                binding.countText.text = "Fizz"
            } else if (count % 5 == 0) {
                binding.countText.text = "Buzz"
            } else {
                binding.countText.text = count.toString()
            }
        }
    }
}