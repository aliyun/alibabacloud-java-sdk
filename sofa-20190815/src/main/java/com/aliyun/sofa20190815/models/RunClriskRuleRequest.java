// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class RunClriskRuleRequest extends TeaModel {
    @NameInMap("Content")
    public String content;

    @NameInMap("Cycle")
    public String cycle;

    @NameInMap("ModelCode")
    public String modelCode;

    @NameInMap("RuleCode")
    public String ruleCode;

    public static RunClriskRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        RunClriskRuleRequest self = new RunClriskRuleRequest();
        return TeaModel.build(map, self);
    }

    public RunClriskRuleRequest setContent(String content) {
        this.content = content;
        return this;
    }
    public String getContent() {
        return this.content;
    }

    public RunClriskRuleRequest setCycle(String cycle) {
        this.cycle = cycle;
        return this;
    }
    public String getCycle() {
        return this.cycle;
    }

    public RunClriskRuleRequest setModelCode(String modelCode) {
        this.modelCode = modelCode;
        return this;
    }
    public String getModelCode() {
        return this.modelCode;
    }

    public RunClriskRuleRequest setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
        return this;
    }
    public String getRuleCode() {
        return this.ruleCode;
    }

}
