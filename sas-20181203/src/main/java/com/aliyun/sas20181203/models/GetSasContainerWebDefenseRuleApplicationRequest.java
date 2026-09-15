// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetSasContainerWebDefenseRuleApplicationRequest extends TeaModel {
    /**
     * <p>The rule ID.</p>
     * <blockquote>
     * <p>Call the ListSasContainerWebDefenseRule operation to obtain this parameter.
     * Note: This parameter is required. If this parameter is not specified, the API returns a 400 error. Call the ListSasContainerWebDefenseRule operation to obtain valid RuleId values.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>400599</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    public static GetSasContainerWebDefenseRuleApplicationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSasContainerWebDefenseRuleApplicationRequest self = new GetSasContainerWebDefenseRuleApplicationRequest();
        return TeaModel.build(map, self);
    }

    public GetSasContainerWebDefenseRuleApplicationRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

}
