// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageStatisticsResponseBody extends TeaModel {
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RiskInstanceCount")
    public Integer riskInstanceCount;

    public static DescribeImageStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageStatisticsResponseBody self = new DescribeImageStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeImageStatisticsResponseBody setInstanceCount(Integer instanceCount) {
        this.instanceCount = instanceCount;
        return this;
    }
    public Integer getInstanceCount() {
        return this.instanceCount;
    }

    public DescribeImageStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeImageStatisticsResponseBody setRiskInstanceCount(Integer riskInstanceCount) {
        this.riskInstanceCount = riskInstanceCount;
        return this;
    }
    public Integer getRiskInstanceCount() {
        return this.riskInstanceCount;
    }

}
