package su.keke.trening1;

public class TrueFalse {
    private int mQuestian;//хранит идентификатор ресурса
    private boolean mTrueQuestion;//указывает,истинно или ложно утверждение

    public TrueFalse (int question,boolean trueQuestion){
        mQuestian = question;
        mTrueQuestion = trueQuestion;
    }

    public int getQuestian() {
        return mQuestian;
    }

    public void setQuestian(int questian) {
        mQuestian = questian;
    }

    public boolean isTrueQuestion() {
        return mTrueQuestion;
    }

    public void setTrueQuestion(boolean trueQuestion) {
        mTrueQuestion = trueQuestion;
    }
}
