// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ValidateHcWarningsRequest extends TeaModel {
    /**
     * <p>The IDs of the check items. Separate multiple check item IDs with commas (,).</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/116179.html">DescribeCheckWarningSummary</a> operation to obtain check item IDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>695,234</p>
     */
    @NameInMap("CheckIds")
    public String checkIds;

    /**
     * <p>The IDs of the risk items to verify. Separate multiple IDs with commas (,).</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCheckWarnings~~">DescribeCheckWarnings</a> operation to obtain this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>43</p>
     */
    @NameInMap("RiskIds")
    public String riskIds;

    /**
     * <p>The status of the check item to verify. Valid values:</p>
     * <ul>
     * <li>1: not passed</li>
     * <li>3: passed</li>
     * <li>5: expired.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Status")
    public Integer status;

    /**
     * <p>The UUIDs of the servers to verify. Separate multiple UUIDs with commas (,).</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to obtain server UUIDs.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>78645c8e-2e89-441b-8eb***,a9622a6b-adb5-4dd3-929e,0136460a-1cb5-44e8-****</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static ValidateHcWarningsRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateHcWarningsRequest self = new ValidateHcWarningsRequest();
        return TeaModel.build(map, self);
    }

    public ValidateHcWarningsRequest setCheckIds(String checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public String getCheckIds() {
        return this.checkIds;
    }

    public ValidateHcWarningsRequest setRiskIds(String riskIds) {
        this.riskIds = riskIds;
        return this;
    }
    public String getRiskIds() {
        return this.riskIds;
    }

    public ValidateHcWarningsRequest setStatus(Integer status) {
        this.status = status;
        return this;
    }
    public Integer getStatus() {
        return this.status;
    }

    public ValidateHcWarningsRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
