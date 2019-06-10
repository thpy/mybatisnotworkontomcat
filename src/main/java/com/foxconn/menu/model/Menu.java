package com.foxconn.menu.model;

public class Menu {
    public String getM_NO() {
        return M_NO;
    }

    public void setM_NO(String m_NO) {
        M_NO = m_NO;
    }

    public String getM_NAME() {
        return M_NAME;
    }

    public void setM_NAME(String m_NAME) {
        M_NAME = m_NAME;
    }

    public String getM_TYPE() {
        return M_TYPE;
    }

    public void setM_TYPE(String m_TYPE) {
        M_TYPE = m_TYPE;
    }

    public String getABSOLUTE_URL() {
        return ABSOLUTE_URL;
    }

    public void setABSOLUTE_URL(String ABSOLUTE_URL) {
        this.ABSOLUTE_URL = ABSOLUTE_URL;
    }

    String M_NO;
    String M_NAME;
    String M_TYPE;
    String ABSOLUTE_URL;
}
