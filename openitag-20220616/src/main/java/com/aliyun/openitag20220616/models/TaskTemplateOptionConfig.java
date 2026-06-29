// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class TaskTemplateOptionConfig extends TeaModel {
    /**
     * <p>The default value must be adapted according to the question type. For a Radio or text box question, directly enter the tag value. For a Multiple Choice question, configure it as [&quot;{tag 1}&quot;, &quot;{tag 2}&quot;].</p>
     * 
     * <strong>example:</strong>
     * <p>猫咪</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("DefaultResult")
    public String defaultResult;

    /**
     * <p>Select the list of question options.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Options")
    public java.util.List<QuestionOption> options;

    /**
     * <p>List of preset options for text-type questions.</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("PreOptions")
    public java.util.List<String> preOptions;

    /**
     * <p>Validation rule item; valid only for fill-in-the-blank text-type questions.</p>
     * 
     * <strong>example:</strong>
     * <p>\w+</p>
     * 
     * <strong>if can be null:</strong>
     * <p>false</p>
     */
    @NameInMap("Rule")
    public String rule;

    public static TaskTemplateOptionConfig build(java.util.Map<String, ?> map) throws Exception {
        TaskTemplateOptionConfig self = new TaskTemplateOptionConfig();
        return TeaModel.build(map, self);
    }

    public TaskTemplateOptionConfig setDefaultResult(String defaultResult) {
        this.defaultResult = defaultResult;
        return this;
    }
    public String getDefaultResult() {
        return this.defaultResult;
    }

    public TaskTemplateOptionConfig setOptions(java.util.List<QuestionOption> options) {
        this.options = options;
        return this;
    }
    public java.util.List<QuestionOption> getOptions() {
        return this.options;
    }

    public TaskTemplateOptionConfig setPreOptions(java.util.List<String> preOptions) {
        this.preOptions = preOptions;
        return this;
    }
    public java.util.List<String> getPreOptions() {
        return this.preOptions;
    }

    public TaskTemplateOptionConfig setRule(String rule) {
        this.rule = rule;
        return this;
    }
    public String getRule() {
        return this.rule;
    }

}
