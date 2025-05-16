package com.walerider.regloginapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class LoginFragment extends Fragment {

    public LoginFragment() {
    }
    /*TODO 2 поля при вводе: Логин, пароль.Сделать 2 поля EditText в xml
            сделать валидацию(if else можно)
            при логине перенос на ProfileFragment с помощью NavController(backStack чистим)
        * */
    public static LoginFragment newInstance() {
        LoginFragment fragment = new LoginFragment();
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);
        return view;
    }
}