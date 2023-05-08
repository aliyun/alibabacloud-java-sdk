// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeCheckFixDetailsRequest extends TeaModel {
    /**
     * <p>Indicates whether the rule is optional. Valid values:</p>
     * <br>
     * <p>*   **1**: yes</p>
     * <p>*   **0**: no</p>
     */
    @NameInMap("CheckIds")
    public String checkIds;

    /**
     * <p>The description of the rule.</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The default value of the rule.</p>
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
