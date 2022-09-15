// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class TaskTemplateOptionConfig extends TeaModel {
    @NameInMap("DefaultResult")
    public String defaultResult;

    @NameInMap("Options")
    public java.util.List<QuestionOption> options;

    @NameInMap("PreOptions")
    public java.util.List<String> preOptions;

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
