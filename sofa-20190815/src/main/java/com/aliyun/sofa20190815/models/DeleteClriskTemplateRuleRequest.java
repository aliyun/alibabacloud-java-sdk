// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteClriskTemplateRuleRequest extends TeaModel {
    @NameInMap("RuleCode")
    public String ruleCode;

    @NameInMap("TemplateCode")
    public String templateCode;

    public static DeleteClriskTemplateRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteClriskTemplateRuleRequest self = new DeleteClriskTemplateRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteClriskTemplateRuleRequest setRuleCode(String ruleCode) {
        this.ruleCode = ruleCode;
        return this;
    }
    public String getRuleCode() {
        return this.ruleCode;
    }

    public DeleteClriskTemplateRuleRequest setTemplateCode(String templateCode) {
        this.templateCode = templateCode;
        return this;
    }
    public String getTemplateCode() {
        return this.templateCode;
    }

}
