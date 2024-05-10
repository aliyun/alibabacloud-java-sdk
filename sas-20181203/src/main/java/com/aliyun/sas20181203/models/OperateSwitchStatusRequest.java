// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class OperateSwitchStatusRequest extends TeaModel {
    /**
     * <p>The rule ID.</p>
     * <br>
     * <p>>  You can call the [ListContainerDefenseRule](https://help.aliyun.com/document_detail/2590599.html) operation to query the rule ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("RuleId")
    public Long ruleId;

    /**
     * <p>The rule status for container tamper-proofing. Valid values:</p>
     * <p>- **on**</p>
     * <p>- **off**</p>
     * <br>
     * <p>This parameter is required.</p>
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
