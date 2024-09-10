// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddCheckResultWhiteListRequest extends TeaModel {
    /**
     * <p>The IDs of the check items.</p>
     */
    @NameInMap("CheckIds")
    public java.util.List<Long> checkIds;

    @NameInMap("Remark")
    public String remark;

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
