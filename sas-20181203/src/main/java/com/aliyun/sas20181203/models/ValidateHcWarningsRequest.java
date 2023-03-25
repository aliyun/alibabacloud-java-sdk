// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ValidateHcWarningsRequest extends TeaModel {
    /**
     * <p>The IDs of risk items that you want to verify. Separate multiple IDs with commas (,).</p>
     */
    @NameInMap("RiskIds")
    public String riskIds;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>The UUIDs of servers on which you want to verify risk items.</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static ValidateHcWarningsRequest build(java.util.Map<String, ?> map) throws Exception {
        ValidateHcWarningsRequest self = new ValidateHcWarningsRequest();
        return TeaModel.build(map, self);
    }

    public ValidateHcWarningsRequest setRiskIds(String riskIds) {
        this.riskIds = riskIds;
        return this;
    }
    public String getRiskIds() {
        return this.riskIds;
    }

    public ValidateHcWarningsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public ValidateHcWarningsRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
