// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RunClriskTemplateRuleRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Cycle")
    public String cycle;

    @NameInMap("RuleCode")
    public String ruleCode;

    @NameInMap("TemplateCode")
    public String templateCode;

    public static RunClriskTemplateRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        RunClriskTemplateRuleRequest self = new RunClriskTemplateRuleRequest();
        return TeaModel.build(map, self);
    }

    public RunClriskTemplateRuleRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public RunClriskTemplateRuleRequest setCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }
    public String getCycle() {
        return this.cycle;
    }

    public RunClriskTemplateRuleRequest setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
        return this;
    }
    public String getRuleCode() {
        return this.ruleCode;
    }

    public RunClriskTemplateRuleRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
