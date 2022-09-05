// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class TemplateQuestion extends TeaModel {
    @NameInMap("Children")
    public java.util.List<TemplateQuestion> children;

    @NameInMap("Exif")
    public java.util.Map<String, ?> exif;

    @NameInMap("MarkTitle")
    public String markTitle;

    @NameInMap("Options")
    public java.util.List<QuestionOption> options;

    @NameInMap("PreOptions")
    public java.util.List<String> preOptions;

    @NameInMap("QuestionId")
    public Long questionId;

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
