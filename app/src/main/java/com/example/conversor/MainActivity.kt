package com.example.conversor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bt_resultado.setOnClickListener {
            val p_valor = sp_primer_valor.getSelectedItem() as String
            val s_valor = sp_segundo_valor.getSelectedItem() as String
            val monto = et_valor.text.toString()
            val op_monto: Double = monto.toDouble()
            var resultado: Double

            if (monto.isEmpty()){
                tv_mostrar.text="Ingrese un monto para continuar con la conversión"
            }
            else{
                if (p_valor.isEmpty()){
                    tv_mostrar.text="Seleccione la moneda de origen para continuar con la conversión"
                }
                else{
                    if (s_valor.isEmpty()){
                        tv_mostrar.text="Seleccione la moneda a la cual desea migrar para continuar con la conversión"
                    }
                    else{
                        if (p_valor=="Peso colombiano"){
                            if (s_valor=="Peso colombiano"){
                                tv_mostrar.text="$monto pesos colombianos equivalen a $monto pesos colombianos."
                            }
                            else{
                                if (s_valor=="Euro"){
                                    resultado = op_monto * 0.00024
                                    resultado = Math.round(resultado * 100.0) / 100.0
                                    tv_mostrar.text="$monto pesos colombianos equivalen a $resultado euros."
                                }
                                else{
                                    resultado = op_monto * 0.00027
                                    resultado = Math.round(resultado * 100.0) / 100.0
                                    tv_mostrar.text="$monto pesos colombianos equivalen a $resultado dólares estadounidenses."
                                }
                            }
                        }
                        else{
                            if (p_valor=="Euro"){
                                if (s_valor=="Peso colombiano"){
                                    resultado = op_monto * 4202.53
                                    resultado = Math.round(resultado * 100.0) / 100.0
                                    tv_mostrar.text="$monto euros equivalen a $resultado pesos colombianos."
                                }
                                else{
                                    if (s_valor=="Euro"){
                                        tv_mostrar.text="$monto euros equivalen a $monto euros."
                                    }
                                    else{
                                        resultado = op_monto * 1.13
                                        resultado = Math.round(resultado * 100.0) / 100.0
                                        tv_mostrar.text="$monto euros equivalen a $resultado dólares estadounidenses."
                                    }
                                }
                            }
                            else{
                                if (s_valor=="Peso colombiano"){
                                    resultado = op_monto * 3732.6
                                    resultado = Math.round(resultado * 100.0) / 100.0
                                    tv_mostrar.text="$monto dólares estadounidenses equivalen a $resultado pesos colombianos."
                                }
                                else{
                                    if (s_valor=="Euro"){
                                        resultado = op_monto * 0.89
                                        resultado = Math.round(resultado * 100.0) / 100.0
                                        tv_mostrar.text="$monto dólares estadounidenses equivalen a $resultado euros."
                                    }
                                    else{
                                        tv_mostrar.text="$monto dólares estadounidenses equivalen a $monto dólares estadounidenses."
                                    }
                                }
                            }
                        }
                    }
                }
            }





        }














    }
}