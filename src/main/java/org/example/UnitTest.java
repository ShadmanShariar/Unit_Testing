package org.example;

public class UnitTest {
    public int page,pageCount,index, control;
    public void setValue(int index, int page, int pageCount) {
        this.index = index;
        this.page = page;
        this.pageCount = pageCount;
    }
    public  int getPageCount() {
        return this.page;
    }
    public int createItem(int index, int control){
            this.index = index;
            this.control = control;
            return index;
    }
    public int addPage(int index, int control) {
        return createItem(index, control);
    }

    public int addPage() {
        int index = getPageCount();
        return index;
    }

    public int getActivePage(String tabFolder) {
        if (tabFolder != null) {
            return 1;
        }
        return -1;
    }
    public String getTitleToolTip(String editorInput) {
        if (editorInput == null) {
            return null;
        }
        return editorInput;
    }
    String compatibilityTitleListener;
    protected String setPartName(String partName) {
        if (partName == null) {
            this.compatibilityTitleListener = null;
            return compatibilityTitleListener;
        }
        this.compatibilityTitleListener = partName;
        return compatibilityTitleListener;
    }
    public String setDefaultPartName() {
        if (compatibilityTitleListener == null) {
            return null;
        }
        return compatibilityTitleListener;
    }
}