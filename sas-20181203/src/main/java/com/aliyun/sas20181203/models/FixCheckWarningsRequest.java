// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class FixCheckWarningsRequest extends TeaModel {
    /**
     * <p>165.225.XX.XX</p>
     */
    @NameInMap("CheckParams")
    public String checkParams;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The source IP address of the request.</p>
     */
    @NameInMap("RiskId")
    public Long riskId;

    /**
     * <p>The UUID of the asset for which you want to fix the baseline risk item. You can call the [DescribeWarningMachines](~~DescribeWarningMachines~~) operation to query the UUIDs of assets.</p>
     */
    @NameInMap("SourceIp")
    public String sourceIp;

    /**
     * <p>Fixes a baseline risk item.</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static FixCheckWarningsRequest build(java.util.Map<String, ?> map) throws Exception {
        FixCheckWarningsRequest self = new FixCheckWarningsRequest();
        return TeaModel.build(map, self);
    }

    public FixCheckWarningsRequest setCheckParams(String checkParams) {
        this.checkParams = checkParams;
        return this;
    }
    public String getCheckParams() {
        return this.checkParams;
    }

    public FixCheckWarningsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public FixCheckWarningsRequest setRiskId(Long riskId) {
        this.riskId = riskId;
        return this;
    }
    public Long getRiskId() {
        return this.riskId;
    }

    public FixCheckWarningsRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public FixCheckWarningsRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
