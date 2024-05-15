// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class QuestionPlugin extends TeaModel {
    @NameInMap("CanSelect")
    public Boolean canSelect;

    @NameInMap("Children")
    public java.util.List<QuestionPlugin> children;

    @NameInMap("DefaultResult")
    public String defaultResult;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Display")
    public Boolean display;

    @NameInMap("Exif")
    public java.util.Map<String, ?> exif;

    @NameInMap("HotKeyMap")
    public String hotKeyMap;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MarkTitle")
    public String markTitle;

    @NameInMap("MarkTitleAlias")
    public String markTitleAlias;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("MustFill")
    public Boolean mustFill;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Options")
    public java.util.List<QuestionOption> options;

    @NameInMap("PreOptions")
    public java.util.List<String> preOptions;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("QuestionId")
    public String questionId;

    @NameInMap("Rule")
    public String rule;

    @NameInMap("SelectGroup")
    public String selectGroup;

    @NameInMap("Selected")
    public Boolean selected;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Type")
    public String type;

    public static QuestionPlugin build(java.util.Map<String, ?> map) throws Exception {
        QuestionPlugin self = new QuestionPlugin();
        return TeaModel.build(map, self);
    }

    public QuestionPlugin setCanSelect(Boolean canSelect) {
        this.canSelect = canSelect;
        return this;
    }
    public Boolean getCanSelect() {
        return this.canSelect;
    }

    public QuestionPlugin setChildren(java.util.List<QuestionPlugin> children) {
        this.children = children;
        return this;
    }
    public java.util.List<QuestionPlugin> getChildren() {
        return this.children;
    }

    public QuestionPlugin setDefaultResult(String defaultResult) {
        this.defaultResult = defaultResult;
        return this;
    }
    public String getDefaultResult() {
        return this.defaultResult;
    }

    public QuestionPlugin setDisplay(Boolean display) {
        this.display = display;
        return this;
    }
    public Boolean getDisplay() {
        return this.display;
    }

    public QuestionPlugin setExif(java.util.Map<String, ?> exif) {
        this.exif = exif;
        return this;
    }
    public java.util.Map<String, ?> getExif() {
        return this.exif;
    }

    public QuestionPlugin setHotKeyMap(String hotKeyMap) {
        this.hotKeyMap = hotKeyMap;
        return this;
    }
    public String getHotKeyMap() {
        return this.hotKeyMap;
    }

    public QuestionPlugin setMarkTitle(String markTitle) {
        this.markTitle = markTitle;
        return this;
    }
    public String getMarkTitle() {
        return this.markTitle;
    }

    public QuestionPlugin setMarkTitleAlias(String markTitleAlias) {
        this.markTitleAlias = markTitleAlias;
        return this;
    }
    public String getMarkTitleAlias() {
        return this.markTitleAlias;
    }

    public QuestionPlugin setMustFill(Boolean mustFill) {
        this.mustFill = mustFill;
        return this;
    }
    public Boolean getMustFill() {
        return this.mustFill;
    }

    public QuestionPlugin setOptions(java.util.List<QuestionOption> options) {
        this.options = options;
        return this;
    }
    public java.util.List<QuestionOption> getOptions() {
        return this.options;
    }

    public QuestionPlugin setPreOptions(java.util.List<String> preOptions) {
        this.preOptions = preOptions;
        return this;
    }
    public java.util.List<String> getPreOptions() {
        return this.preOptions;
    }

    public QuestionPlugin setQuestionId(String questionId) {
        this.questionId = questionId;
        return this;
    }
    public String getQuestionId() {
        return this.questionId;
    }

    public QuestionPlugin setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

    public QuestionPlugin setSelectGroup(String selectGroup) {
        this.selectGroup = selectGroup;
        return this;
    }
    public String getSelectGroup() {
        return this.selectGroup;
    }

    public QuestionPlugin setSelected(Boolean selected) {
        this.selected = selected;
        return this;
    }
    public Boolean getSelected() {
        return this.selected;
    }

    public QuestionPlugin setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
