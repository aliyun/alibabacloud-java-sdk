// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class IgnoreHcCheckWarningsRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * <br>
     * <p>>  You can call the [DescribeCheckWarnings](~~116182~~) operation to query the IDs of check items.</p>
     */
    @NameInMap("CheckIds")
    public String checkIds;

    /**
     * <p>The ID of the alert that is triggered by the check item. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>>  You can call the [DescribeCheckWarnings](~~116182~~) operation to query the IDs of alerts that are triggered by check items.</p>
     */
    @NameInMap("CheckWarningIds")
    public String checkWarningIds;

    /**
     * <p>The reason for the current operation.</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The ID of the risk item that you want to ignore or cancel ignoring.</p>
     * <br>
     * <p>>  You can call the [DescribeCheckWarningSummary](~~116179~~) operation to query the IDs of risk items.</p>
     */
    @NameInMap("RiskId")
    public String riskId;

    /**
     * <p>The data source. If this parameter is left empty, the server baseline results are queried by default. Valid values:</p>
     * <p>* **default**: server</p>
     * <p>* **agentless**</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the operation that you want to perform. Valid values:</p>
     * <br>
     * <p>*   **1**: ignores a risk item</p>
     * <p>*   **2**: cancels ignoring a risk item</p>
     */
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

    public IgnoreHcCheckWarningsRequest setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
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
