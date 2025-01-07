// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddCheckResultWhiteListRequest extends TeaModel {
    /**
     * <p>The IDs of the check items.</p>
     * <blockquote>
     * <p> You can call the <a href="~~ListCheckResult~~">ListCheckResult</a> operation to query the IDs of the check items.</p>
     * </blockquote>
     */
    @NameInMap("CheckIds")
    public java.util.List<Long> checkIds;

    /**
     * <p>The description. The value of this parameter can be up to 65,535 bytes in length.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The type of the rule. Default value: <strong>WHITE</strong>. Valid value:</p>
     * <ul>
     * <li><strong>WHITE</strong>: Add check items to the whitelist.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>WHITE</p>
     */
    @NameInMap("RuleType")
    public String ruleType;

    public static AddCheckResultWhiteListRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCheckResultWhiteListRequest self = new AddCheckResultWhiteListRequest();
        return TeaModel.build(map, self);
    }

    public AddCheckResultWhiteListRequest setCheckIds(java.util.List<Long> checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public java.util.List<Long> getCheckIds() {
        return this.checkIds;
    }

    public AddCheckResultWhiteListRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public AddCheckResultWhiteListRequest setRuleType(String ruleType) {
        this.ruleType = ruleType;
        return this;
    }
    public String getRuleType() {
        return this.ruleType;
    }

}
