// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ValidateHcWarningsRequest extends TeaModel {
    /**
     * <p>The IDs of the check items. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>> You can call the [DescribeCheckWarningSummary](~~116179~~) operation to query the IDs of check items.</p>
     */
    @NameInMap("CheckIds")
    public String checkIds;

    /**
     * <p>The list of IDs of the risk items that you want to verify. Separate multiple IDs with commas (,).</p>
     * <br>
     * <p>> You can call the [DescribeCheckWarnings](~~DescribeCheckWarnings~~) operation to query the IDs of risk items.</p>
     */
    @NameInMap("RiskIds")
    public String riskIds;

    /**
     * <p>The UUIDs of the servers on which you want to verify the risk items. Separate multiple UUIDs with commas (,).</p>
     * <br>
     * <p>> You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.</p>
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

    public ValidateHcWarningsRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
