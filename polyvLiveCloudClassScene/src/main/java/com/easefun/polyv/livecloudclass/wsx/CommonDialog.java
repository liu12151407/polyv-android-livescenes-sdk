package com.easefun.polyv.livecloudclass.wsx;

import android.app.Dialog;
import android.content.Context;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;

import com.easefun.polyv.livecloudclass.R;

import org.jetbrains.annotations.NotNull;

/**
 * ***********************************************
 * 包路径：com.easefun.polyv.livecloudclass.wsx
 * 类描述：自定义弹框信息
 * 创建人：Liu Yinglong[PHONE：132****0095]
 * 创建时间：2021/07/03
 * 修改人：
 * 修改时间：2021/07/03
 * 修改备注：
 * ***********************************************
 */
public class CommonDialog extends Dialog {
    ///弹框内部控件
    private TextView tvTitle, tvContent, tvBtn1, tvBtn2;
    /**
     * 都是内容数据
     */
    private String title, content, btnName1, btnName2;

    public CommonDialog(@NonNull @NotNull Context context) {
        super(context, R.style.CustomDialog);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.wsx_layout_dialog_view);
        //按空白处不能取消动画
        setCanceledOnTouchOutside(false);
        //初始化界面控件
        initView();
        //初始化界面控件的事件
        initEvent();
    }

    //初始化界面
    private void initView() {
        tvTitle = findViewById(R.id.tvTitle);
        tvContent = findViewById(R.id.tvContent);
        tvBtn1 = findViewById(R.id.tvBtn1);
        tvBtn2 = findViewById(R.id.tvBtn2);
    }

    /**
     * 初始化界面的确定和取消监听器
     */
    private void initEvent() {
        //设置确定按钮被点击后，向外界提供监听
        tvBtn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onClickBottomListener != null) {
                    onClickBottomListener.onPositiveClick();
                }
            }
        });
        //设置取消按钮被点击后，向外界提供监听
        tvBtn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (onClickBottomListener != null) {
                    onClickBottomListener.onNegtiveClick();
                }
            }
        });
    }

    /**
     * 设置确定取消按钮的回调
     */
    public OnClickBottomListener onClickBottomListener;

    public CommonDialog setOnClickBottomListener(OnClickBottomListener onClickBottomListener) {
        this.onClickBottomListener = onClickBottomListener;
        return this;
    }

    public interface OnClickBottomListener {
        /**
         * 点击确定按钮事件
         */
        public void onPositiveClick();

        /**
         * 点击取消按钮事件
         */
        public void onNegtiveClick();
    }


    @Override
    public void show() {
        super.show();
        if (!TextUtils.isEmpty(title)) {
            tvTitle.setText(title);
        }
        if (!TextUtils.isEmpty(content)) {
            tvContent.setText(content);
        }
        if (!TextUtils.isEmpty(btnName1)) {
            tvBtn1.setText(btnName1);
        }
        if (!TextUtils.isEmpty(btnName2)) {
            tvBtn2.setText(btnName2);
        }
    }

    public CommonDialog setTitle(String title) {
        this.title = title;
        return this;
    }

    public CommonDialog setContent(String content) {
        this.content = content;
        return this;
    }

    public CommonDialog setBtnName1(String btnName1) {
        this.btnName1 = btnName1;
        return this;
    }

    public CommonDialog setBtnName2(String btnName2) {
        this.btnName2 = btnName2;
        return this;
    }
}
//
//
//    private void initDialog() {
//        final CommonDialog dialog = new CommonDialog(MainActivity.this);
//        dialog.setMessage("这是一个自定义Dialog。")
//                .setImageResId(R.mipmap.ic_launcher)
////                .setTitle("系统提示")
//                .setSingle(true).setOnClickBottomListener(new CommonDialog.OnClickBottomListener() {
//            @Override
//            public void onPositiveClick() {
//                dialog.dismiss();
//                Toast.makeText(MainActivity.this,"xxxx",Toast.LENGTH_SHORT).show();
//            }
//
//            @Override
//            public void onNegtiveClick() {
//                dialog.dismiss();
//                Toast.makeText(MainActivity.this,"ssss",Toast.LENGTH_SHORT).show();
//            }
//        }).show();
//    }