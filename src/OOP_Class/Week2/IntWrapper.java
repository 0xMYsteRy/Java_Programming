package OOP_Class.Week2;

class IntWrapper {
    private int value;

    IntWrapper(int value){
        this.value = value;
    }

    int getValue(){
        return this.value;
    }
    void setValue(int value){
        this.value = value;
    }
    @Override
    public String toString(){
        return String.valueOf(value);
    }

}
