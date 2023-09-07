// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeRisksRequest extends TeaModel {
    /**
     * <p>The language of the content within the request and response. Valid values:</p>
     * <br>
     * <p>*   **zh**: Chinese</p>
     * <p>*   **en**: English</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The maximum number of entries to return. Default value: 20.</p>
     */
    @NameInMap("Limit")
    public Integer limit;

    /**
     * <p>The baseline ID.</p>
     * <br>
     * <p>>  You can call the [DescribeCheckWarningSummary](~~DescribeCheckWarningSummary~~) operation to query the baseline IDs.</p>
     */
    @NameInMap("RiskId")
    public Long riskId;

    /**
     * <p>The name of the baseline.</p>
     */
    @NameInMap("RiskName")
    public String riskName;

    public static DescribeRisksRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRisksRequest self = new DescribeRisksRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRisksRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public DescribeRisksRequest setLimit(Integer limit) {
        this.limit = limit;
        return this;
    }
    public Integer getLimit() {
        return this.limit;
    }

    public DescribeRisksRequest setRiskId(Long riskId) {
        this.riskId = riskId;
        return this;
    }
    public Long getRiskId() {
        return this.riskId;
    }

    public DescribeRisksRequest setRiskName(String riskName) {
        this.riskName = riskName;
        return this;
    }
    public String getRiskName() {
        return this.riskName;
    }

}
