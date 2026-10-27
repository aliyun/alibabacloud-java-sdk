// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSasContainerWebDefenseRuleRequest extends TeaModel {
    /**
     * <p>The rule ID.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListSasContainerWebDefenseRule~~">ListSasContainerWebDefenseRule</a> operation to obtain this parameter.
     * This parameter is required. If you do not specify this parameter, the API returns an HTTP 400 error with the error code -101.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1600009</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static GetSasContainerWebDefenseRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSasContainerWebDefenseRuleRequest self = new GetSasContainerWebDefenseRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetSasContainerWebDefenseRuleRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
