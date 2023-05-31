// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckFixDetailsRequest extends TeaModel {
    /**
     * <p>The ID of the risk item.</p>
     * <br>
     * <p>>  You can call the [DescribeRiskType](~~DescribeRiskType~~) operation to query the IDs of risk items.</p>
     */
    @NameInMap("CheckIds")
    public String checkIds;

    /**
     * <p>The language of the content within the request and response. Default value: **zh**. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The ID of the baseline.</p>
     * <br>
     * <p>>  You can call the [DescribeCheckWarningSummary](~~116179~~) operation to query the IDs of baselines.</p>
     */
    @NameInMap("RiskId")
    public Long riskId;

    public static DescribeCheckFixDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCheckFixDetailsRequest self = new DescribeCheckFixDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCheckFixDetailsRequest setCheckIds(String checkIds) {
        this.checkIds = checkIds;
        return this;
    }
    public String getCheckIds() {
        return this.checkIds;
    }

    public DescribeCheckFixDetailsRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeCheckFixDetailsRequest setRiskId(Long riskId) {
        this.riskId = riskId;
        return this;
    }
    public Long getRiskId() {
        return this.riskId;
    }

}
