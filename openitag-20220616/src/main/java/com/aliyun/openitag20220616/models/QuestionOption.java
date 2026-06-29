// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class QuestionOption extends TeaModel {
    /**
     * <p>List of child options.</p>
     */
    @NameInMap("Children")
    public java.util.List<QuestionOption> children;

    /**
     * <p>Color.</p>
     * 
     * <strong>example:</strong>
     * <p>#239125</p>
     */
    @NameInMap("Color")
    public String color;

    /**
     * <p>Tag Name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>12</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>Label display name.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dog</p>
     */
    @NameInMap("Label")
    public String label;

    /**
     * <p>Remark.</p>
     * 
     * <strong>example:</strong>
     * <p>第一道题目</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>Keyboard shortcut.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Shortcut")
    public String shortcut;

    public static QuestionOption build(java.util.Map<String, ?> map) throws Exception {
        QuestionOption self = new QuestionOption();
        return TeaModel.build(map, self);
    }

    public QuestionOption setChildren(java.util.List<QuestionOption> children) {
        this.children = children;
        return this;
    }
    public java.util.List<QuestionOption> getChildren() {
        return this.children;
    }

    public QuestionOption setColor(String color) {
        this.color = color;
        return this;
    }
    public String getColor() {
        return this.color;
    }

    public QuestionOption setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public QuestionOption setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public QuestionOption setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public QuestionOption setShortcut(String shortcut) {
        this.shortcut = shortcut;
        return this;
    }
    public String getShortcut() {
        return this.shortcut;
    }

}
