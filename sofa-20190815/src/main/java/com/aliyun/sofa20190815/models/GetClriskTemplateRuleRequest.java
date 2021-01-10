// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetClriskTemplateRuleRequest extends TeaModel {
    @NameInMap("RuleCode")
    public String ruleCode;

    @NameInMap("TemplateCode")
    public String templateCode;

    public static GetClriskTemplateRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetClriskTemplateRuleRequest self = new GetClriskTemplateRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetClriskTemplateRuleRequest setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
        return this;
    }
    public String getRuleCode() {
        return this.ruleCode;
    }

    public GetClriskTemplateRuleRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
