package edu.bupt.ticketextraction.activity;

import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.ActionBar;
import edu.bupt.ticketextraction.R;

/**
 * <pre>
 *     author : 武连增
 *     e-mail : wulianzeng@bupt.edu.cn
 *     time   : 2021/09/07
 *     desc   : 使用说明activity
 *     version: 0.0.1
 * </pre>
 */
public class InstructionActivity extends AutoPushPopActivity {
    @Override
    protected void onCreate(@Nullable @org.jetbrains.annotations.Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instruction);

        ActionBar actionBar = getSupportActionBar();
        if (actionBar != null) {
            actionBar.setTitle("使用说明");
            actionBar.setDisplayHomeAsUpEnabled(true);
        }
    }
}
