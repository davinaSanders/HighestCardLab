public enum RankType {

    ACE(13),
    KING(12),
    QUEEN(11),
    TEN(10),
    NINE(9),
    EIGHT(8),
    SEVEN(7),
    SIX(6),
    FIVE(5),
    FOUR(4),
    THREE(3),
    TWO(2),
    ONE(1);

    private final int value;
    RankType(int value){
        this.value = value;
    }

    public int getValue(){
        return value;
    }

}
