// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class TemplateQuestion extends TeaModel {
    /**
     * <p>List of child nodes</p>
     */
    @NameInMap("Children")
    public java.util.List<TemplateQuestion> children;

    /**
     * <p>Additional properties</p>
     * 
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("Exif")
    public java.util.Map<String, ?> exif;

    /**
     * <p>Title</p>
     * 
     * <strong>example:</strong>
     * <p>题目1</p>
     */
    @NameInMap("MarkTitle")
    public String markTitle;

    /**
     * <p>List of options</p>
     */
    @NameInMap("Options")
    public java.util.List<QuestionOption> options;

    /**
     * <p>List of pre-filled values</p>
     */
    @NameInMap("PreOptions")
    public java.util.List<String> preOptions;

    /**
     * <p>Question ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("QuestionId")
    public Long questionId;

    /**
     * <p>Type, including the following:  </p>
     * <ul>
     * <li>TEXT_EDIT  </li>
     * <li>CHECKBOX  </li>
     * <li>INPUT  </li>
     * <li>PICTURE  </li>
     * <li>VIDEO  </li>
     * <li>OPEN_ENDED  </li>
     * <li>SLOT  </li>
     * <li>RADIO</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>RADIO</p>
     */
    @NameInMap("Type")
    public String type;

    public static TemplateQuestion build(java.util.Map<String, ?> map) throws Exception {
        TemplateQuestion self = new TemplateQuestion();
        return TeaModel.build(map, self);
    }

    public TemplateQuestion setChildren(java.util.List<TemplateQuestion> children) {
        this.children = children;
        return this;
    }
    public java.util.List<TemplateQuestion> getChildren() {
        return this.children;
    }

    public TemplateQuestion setExif(java.util.Map<String, ?> exif) {
        this.exif = exif;
        return this;
    }
    public java.util.Map<String, ?> getExif() {
        return this.exif;
    }

    public TemplateQuestion setMarkTitle(String markTitle) {
        this.markTitle = markTitle;
        return this;
    }
    public String getMarkTitle() {
        return this.markTitle;
    }

    public TemplateQuestion setOptions(java.util.List<QuestionOption> options) {
        this.options = options;
        return this;
    }
    public java.util.List<QuestionOption> getOptions() {
        return this.options;
    }

    public TemplateQuestion setPreOptions(java.util.List<String> preOptions) {
        this.preOptions = preOptions;
        return this;
    }
    public java.util.List<String> getPreOptions() {
        return this.preOptions;
    }

    public TemplateQuestion setQuestionId(Long questionId) {
        this.questionId = questionId;
        return this;
    }
    public Long getQuestionId() {
        return this.questionId;
    }

    public TemplateQuestion setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
