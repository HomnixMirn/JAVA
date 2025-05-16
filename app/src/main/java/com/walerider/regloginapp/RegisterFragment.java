package com.walerider.regloginapp;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class RegisterFragment extends Fragment {

    public RegisterFragment() {
    }
    /*TODO 3 поля в базе данных: Логин, почта, пароль. так что сделать 3 поля EditText в xml
        сделать валидацию(if else можно)
        сделать кнопку "Регистрация"
        при регистрации перенос на ProfileFragment с помощью NavController(backStack чистим)
    * */
    public static RegisterFragment newInstance() {
        RegisterFragment fragment = new RegisterFragment();

        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register, container, false);
        return view;
    }
}