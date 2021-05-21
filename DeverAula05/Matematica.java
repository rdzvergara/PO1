public classe Matematica {
    public Integer somar(Integer num1,Integer num2){
        return num1 + num2;
    }
    public Double dividir(Integer num1,Integer num2){
        return Double.value0f(num1) / Double.value0f(num2);
        if (num1 == 0 || num2 ==0 ) return 0;
    }
    public Integer subt(Integer num1,Integer num2){
        if(num1>=num2) return num1 - num2;
        if(num2> num1) return num2 - num1;
    }
    public Integer mult(Integer num1,Integer num2){
        return num1 * num2;
    }
}
}