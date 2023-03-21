// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class IgnoreHcCheckWarningsRequest extends TeaModel {
    @NameInMap("CheckIds")
    public String checkIds;

    @NameInMap("CheckWarningIds")
    public String checkWarningIds;

    @NameInMap("Reason")
    public String reason;

    @NameInMap("RiskId")
    public String riskId;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("Type")
    public Long type;

    public static IgnoreHcCheckWarningsRequest build(java.util.Map<String, ?> map) throws Exception {
        IgnoreHcCheckWarningsRequest self = new IgnoreHcCheckWarningsRequest();
        return TeaModel.build(map, self);
    }

    public IgnoreHcCheckWarningsRequest setCheckIds(String checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public String getCheckIds() {
        return this.checkIds;
    }

    public IgnoreHcCheckWarningsRequest setCheckWarningIds(String checkWarningIds) {
        this.checkWarningIds = checkWarningIds;
        return this;
    }
    public String getCheckWarningIds() {
        return this.checkWarningIds;
    }

    public IgnoreHcCheckWarningsRequest setReason(String reason) {
        this.reason = reason;
        return this;
    }
    public String getReason() {
        return this.reason;
    }

    public IgnoreHcCheckWarningsRequest setRiskId(String riskId) {
        this.riskId = riskId;
        return this;
    }
    public String getRiskId() {
        return this.riskId;
    }

    public IgnoreHcCheckWarningsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public IgnoreHcCheckWarningsRequest setType(Long type) {
        this.type = type;
        return this;
    }
    public Long getType() {
        return this.type;
    }

}
