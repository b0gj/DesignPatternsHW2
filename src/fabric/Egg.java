package fabric;

import java.util.ArrayList;
import java.util.List;

public abstract class Egg {

    private String type;
    protected List<String> decorations;

    public abstract void create();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public List<String> getDecorations() {
        return decorations;
    }

    public void addDecoration(String decoration){
        if (this.decorations == null)
            this.decorations = new ArrayList<>();
    }
}
