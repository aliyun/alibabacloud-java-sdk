// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeExposedRiskNumResponseBody extends TeaModel {
    @NameInMap("ExposedInstanceCount")
    public Integer exposedInstanceCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RiskExposedInstanceCount")
    public Integer riskExposedInstanceCount;

    public static DescribeExposedRiskNumResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeExposedRiskNumResponseBody self = new DescribeExposedRiskNumResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeExposedRiskNumResponseBody setExposedInstanceCount(Integer exposedInstanceCount) {
        this.exposedInstanceCount = exposedInstanceCount;
        return this;
    }
    public Integer getExposedInstanceCount() {
        return this.exposedInstanceCount;
    }

    public DescribeExposedRiskNumResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeExposedRiskNumResponseBody setRiskExposedInstanceCount(Integer riskExposedInstanceCount) {
        this.riskExposedInstanceCount = riskExposedInstanceCount;
        return this;
    }
    public Integer getRiskExposedInstanceCount() {
        return this.riskExposedInstanceCount;
    }

}
