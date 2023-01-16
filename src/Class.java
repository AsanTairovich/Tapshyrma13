public class Class {
    private int room;
    private String word;
    private int[] num;

    public Class(int room, String word, int[] num) {
        this.room = room;
        this.word = word;
        this.num = num;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getWord() {
        return word;
    }

    public void setWord(String word) {
        this.word = word;
    }

    public int[] getNum() {
        return num;
    }

    public void setNum(int[] num) {
        this.num = num;
    }
}
