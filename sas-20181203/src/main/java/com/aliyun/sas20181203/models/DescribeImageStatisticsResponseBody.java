// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageStatisticsResponseBody extends TeaModel {
    /**
     * <p>The number of container images in your assets. Only Container Registry Enterprise Edition instances are counted.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("InstanceCount")
    public Integer instanceCount;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>4E5BFDCF-B9DD-430D-9DA4-151BCB581C9D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of container images that have security risks. Only Container Registry Enterprise Edition instances are counted.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
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
