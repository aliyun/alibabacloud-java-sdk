// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateSwitchStatusRequest extends TeaModel {
    /**
     * <p>The ID of the rule.</p>
     * <blockquote>
     * <p> You can call the ListContainerWebDefenseRule operation to query the IDs of rules.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>900001</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The status of the rule. Valid values: on and off.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>on</p>
     */
    @NameInMap("Status")
    public String status;

    public static OperateSwitchStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        OperateSwitchStatusRequest self = new OperateSwitchStatusRequest();
        return TeaModel.build(map, self);
    }

    public OperateSwitchStatusRequest setRuleId(Long ruleId) {
        this.ruleId = ruleId;
        return this;
    }
    public Long getRuleId() {
        return this.ruleId;
    }

    public OperateSwitchStatusRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
