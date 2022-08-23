package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    Button btn_1, btn_2, btn_3, btn_4, btn_5, btn_6, btn_7, btn_8, btn_9, btn_0, btn_add, btn_sub, btn_mult, btn_div, btn_resultado;
    TextView txt;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);
        btn_4 = findViewById(R.id.btn_4);
        btn_5 = findViewById(R.id.btn_5);
        btn_6 = findViewById(R.id.btn_6);
        btn_7 = findViewById(R.id.btn_7);
        btn_8 = findViewById(R.id.btn_8);
        btn_9 = findViewById(R.id.btn_9);
        btn_0 = findViewById(R.id.btn_0);
        btn_add = findViewById(R.id.btn_add);
        btn_sub = findViewById(R.id.btn_sub);
        btn_mult = findViewById(R.id.btn_mult);
        btn_div = findViewById(R.id.btn_div);
        btn_resultado = findViewById(R.id.btn_resultado);
        txt = findViewById(R.id.textView_tela);

        txt.setText(null);
    }

    int operador = 0, novaOperacao = 0, tipo = 0;
    String numero1 = null, numero2 = null;


    public void click_1(View view){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        if(operador==0){
            numero1 += "1";
            txt.setText(txt.getText()+"1");
        } else {
            numero2 += "1";
            txt.setText(txt.getText()+"1");
        }
    }
    public void click_2(View view){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        if(operador==0){
            numero1 += "2";
            txt.setText(txt.getText()+"2");
        } else {
            numero2 += "2";
            txt.setText(txt.getText()+"2");
        }
    }
    public void click_3(View view){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        if(operador==0){
            numero1 += "3";
            txt.setText(txt.getText()+"3");
        } else {
            numero2 += "3";
            txt.setText(txt.getText()+"3");
        }
    }
    public void click_4(View view){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        if(operador==0){
            numero1 += "4";
            txt.setText(txt.getText()+"4");
        } else {
            numero2 += "4";
            txt.setText(txt.getText()+"4");
        }
    }
    public void click_5(View view){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        if(operador==0){
            numero1 += "5";
            txt.setText(txt.getText()+"5");
        } else {
            numero2 += "5";
            txt.setText(txt.getText()+"5");
        }
    }
    public void click_6(View view){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        if(operador==0){
            numero1 += "6";
            txt.setText(txt.getText()+"6");
        } else {
            numero2 += "6";
            txt.setText(txt.getText()+"6");
        }
    }
    public void click_7(View view){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        if(operador==0){
            numero1 += "7";
            txt.setText(txt.getText()+"7");
        } else {
            numero2 += "7";
            txt.setText(txt.getText()+"7");
        }
    }
    public void click_8(View view){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        if(operador==0){
            numero1 += "8";
            txt.setText(txt.getText()+"8");
        } else {
            numero2 += "8";
            txt.setText(txt.getText()+"8");
        }
    }
    public void click_9(View view){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        if(operador==0){
            numero1 += "9";
            txt.setText(txt.getText()+"9");
        } else {
            numero2 += "9";
            txt.setText(txt.getText()+"9");
        }
    }
    public void click_0(View view){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        if(operador==0){
            numero1 += "0";
            txt.setText(txt.getText()+"0");
        } else {
            numero2 += "0";
            txt.setText(txt.getText()+"0");
        }
    }
    public void click_add(View view){
        if(operador == 0){
            txt.setText(txt.getText()+"+");
            operador = 1;
            tipo = 1;
        }
    }
    public void click_sub(View view){
        if(operador == 0){
            txt.setText(txt.getText()+"-");
            operador = 1;
            tipo = 2;
        }
    }
    public void click_mult(View view){
        if(operador == 0){
            txt.setText(txt.getText()+"X");
            operador = 1;
            tipo = 3;
        }
    }
    public void click_div(View view){
        if(operador == 0) {
            txt.setText(txt.getText() + "/");
            operador = 1;
            tipo = 4;
        }
    }
    public void click_resultado(View view) {
        int resultado = 0;
        int n1, n2;
        n1 = Integer.parseInt(numero1);
        n2 = Integer.parseInt(numero2);

        switch (tipo) {
            case 1:
                resultado = n1 + n2;
                break;
            case 2:
                resultado = n1 - n2;
                break;
            case 3:
                resultado = n1 * n2;
                break;
            case 4:
                resultado = n1 / n2;
                break;
            default:
                System.out.println("Erro, operador não encontrado!");
        }
        txt.setText(resultado);
        novaOperacao = 1;
        operador = 0;
    }

    /*
    public void click_1(){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        txt.setText(txt.getText()+"1");
    }
    public void click_2(){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        txt.setText(txt.getText()+"2");
    }
    public void click_3(){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        txt.setText(txt.getText()+"3");
    }
    public void click_4(){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        txt.setText(txt.getText()+"4");
    }
    public void click_5(){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        txt.setText(txt.getText()+"5");
    }
    public void click_6(){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        txt.setText(txt.getText()+"6");
    }
    public void click_7(){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        txt.setText(txt.getText()+"7");
    }
    public void click_8(){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        txt.setText(txt.getText()+"8");
    }
    public void click_9(){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        txt.setText(txt.getText()+"9");
    }
    public void click_0(){
        if(novaOperacao == 1) {
            txt.setText(null);
            novaOperacao = 0;
        }
        txt.setText(txt.getText()+"0");
    }
    public void click_add(){
        if(operador == 0)
            txt.setText(txt.getText()+"+");
    }
    public void click_sub(){
        if(operador == 0)
            txt.setText(txt.getText()+"-");
    }
    public void click_mult(){
        if(operador == 0)
            txt.setText(txt.getText()+"X");
    }
    public void click_div(){
        if(operador == 0)
            txt.setText(txt.getText()+"/");
    }
    public void click_resultado(){
        int tipo = 0; //variável de tipo de operação
        String operacao = (String) txt.getText(); //string para armazenar a operação retirada do campo de texto

        for(int i=0; i<operacao.length(); i++){ //define qual o tipo de operação, verificando qual o operador existente dentro da string
            if(operacao.contains("+"))
                tipo = 1;
            if(operacao.contains("-"))
                tipo = 2;
            if(operacao.contains("X"))
                tipo = 3;
            if(operacao.contains("/"))
                tipo = 4;
        }

        switch (tipo){
            String numero1 = null, numero2 = null;
            int i, j, n1, n2;
            case 1:
                for(i=0; operacao[i] != "+"; i++){
                    numero1[i] = operacao[i];
                }
                i++;
                for(j=0; i<operacao.length(); i++, j++){
                    numero2[j] = operacao[i];
                }
                n1 = Integer.parseInt(numero1);
                n2 = Integer.parseInt(numero2);
                txt.setText(n1 + n2);
                novaOperacao = 1;
                break;
            case 2:
                for(i=0; operacao[i] != "-"; i++){
                    numero1[i] = operacao[i];
                }
                i++;
                for(j=0; i<operacao.length(); i++, j++){
                    numero2[j] = operacao[i];
                }
                n1 = Integer.parseInt(numero1);
                n2 = Integer.parseInt(numero2);
                txt.setText(n1 - n2);
                novaOperacao = 1;
                break;
            case 3:
                for(i=0; operacao[i] != "X"; i++){
                    numero1[i] = operacao[i];
                }
                i++;
                for(j=0; i<operacao.length(); i++, j++){
                    numero2[j] = operacao[i];
                }
                n1 = Integer.parseInt(numero1);
                n2 = Integer.parseInt(numero2);
                txt.setText(n1 * n2);
                novaOperacao = 1;
                break;
            case 4:
                for(i=0; operacao[i] != "/"; i++){
                    numero1[i] = operacao[i];
                }
                i++;
                for(j=0; i<operacao.length(); i++, j++){
                    numero2[j] = operacao[i];
                }
                n1 = Integer.parseInt(numero1);
                n2 = Integer.parseInt(numero2);
                txt.setText(n1 / n2);
                novaOperacao = 1;
                break;
            default:
                System.out.println("Erro, operador não encontrado!");
        }
        operador = 0;*/
}
