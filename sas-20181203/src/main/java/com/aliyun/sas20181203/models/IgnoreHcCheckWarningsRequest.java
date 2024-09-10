// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class IgnoreHcCheckWarningsRequest extends TeaModel {
    /**
     * <p>The ID of the check item.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/116182.html">DescribeCheckWarnings</a> operation to query the IDs of check items.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>21313</p>
     */
    @NameInMap("CheckIds")
    public String checkIds;

    /**
     * <p>The ID of the alert that is triggered by the check item. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/116182.html">DescribeCheckWarnings</a> operation to query the IDs of alerts that are triggered by check items.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>98146905,98146907</p>
     */
    @NameInMap("CheckWarningIds")
    public String checkWarningIds;

    /**
     * <p>The reason for the current operation.</p>
     * 
     * <strong>example:</strong>
     * <p>ignore</p>
     */
    @NameInMap("Reason")
    public String reason;

    /**
     * <p>The ID of the risk item that you want to ignore or cancel ignoring.</p>
     * <blockquote>
     * <p> You can call the <a href="https://help.aliyun.com/document_detail/116179.html">DescribeCheckWarningSummary</a> operation to query the IDs of risk items.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>51</p>
     */
    @NameInMap("RiskId")
    public String riskId;

    /**
     * <p>The data source. If this parameter is left empty, the server baseline results are queried by default. Valid values:</p>
     * <ul>
     * <li><strong>default</strong>: server</li>
     * <li><strong>agentless</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>agentless</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The source IP address of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.XX.XX</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The type of the operation that you want to perform. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: ignores a risk item</li>
     * <li><strong>2</strong>: cancels ignoring a risk item</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
