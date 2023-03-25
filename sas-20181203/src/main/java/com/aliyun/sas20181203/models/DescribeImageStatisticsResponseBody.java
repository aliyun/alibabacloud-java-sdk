// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageStatisticsResponseBody extends TeaModel {
    /**
     * <p>The number of container images in your assets. Only Container Registry Enterprise Edition instances are counted.</p>
     */
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of container images that have security risks. Only Container Registry Enterprise Edition instances are counted.</p>
     */
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
