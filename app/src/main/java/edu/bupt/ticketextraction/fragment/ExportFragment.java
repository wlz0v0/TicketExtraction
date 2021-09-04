package edu.bupt.ticketextraction.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.fragment.app.Fragment;
import edu.bupt.ticketextraction.R;
import edu.bupt.ticketextraction.activity.MainActivity;

/**
 * <pre>
 *     author : 武连增
 *     e-mail : wulianzeng@bupt.edu.cn
 *     time   : 2021/08/24
 *     desc   : 导出fragment
 *     version: 0.0.1
 * </pre>
 */
public class ExportFragment extends Fragment {
    private final MainActivity fatherActivity;

    public ExportFragment(MainActivity fatherActivity) {
        this.fatherActivity = fatherActivity;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_export, container, false);
        Button sendToEmailBtn = view.findViewById(R.id.send_to_email_btn);
        sendToEmailBtn.setOnClickListener(view1 -> fatherActivity.jumpFromMainToEmail());
        return view;
    }
}
