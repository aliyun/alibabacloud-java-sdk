// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class IgnoreHcCheckWarningsRequest extends TeaModel {
    // The ID of the check item.
    // 
    // >  You can call the [DescribeCheckWarnings](~~DescribeCheckWarnings~~) operation to query the IDs of check items.
    @NameInMap("CheckIds")
    public String checkIds;

    // The ID of the alert that is triggered by the check item. Separate multiple IDs with commas (,).
    // 
    // >  You can call the [DescribeCheckWarnings](~~DescribeCheckWarnings~~) operation to query the IDs of alerts that are triggered by check items.
    @NameInMap("CheckWarningIds")
    public String checkWarningIds;

    // The reason for the current operation.
    @NameInMap("Reason")
    public String reason;

    // The ID of the risk item that you want to ignore or cancel ignoring.
    // 
    // >  You can call the [DescribeCheckWarningSummary](~~DescribeCheckWarningSummary~~) operation to query the IDs of risk items.
    @NameInMap("RiskId")
    public String riskId;

    // The source IP address of the request.
    @NameInMap("SourceIp")
    public String sourceIp;

    // The type of the operation that you want to perform. Valid values:
    // 
    // *   **1**: ignores a risk item
    // *   **2**: cancels ignoring a risk item
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
