// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSasContainerWebDefenseRuleRequest extends TeaModel {
    /**
     * <p>Rule ID.</p>
     * <blockquote>
     * <p>You can call the <a href="~~ListSasContainerWebDefenseRule~~">ListSasContainerWebDefenseRule</a> API to get this parameter.</p>
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
