// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulDefendCountStatisticsResponseBody extends TeaModel {
    @NameInMap("RaspDefendedCount")
    public Integer raspDefendedCount;

    @NameInMap("RaspDefensibleCount")
    public Integer raspDefensibleCount;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeVulDefendCountStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulDefendCountStatisticsResponseBody self = new DescribeVulDefendCountStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulDefendCountStatisticsResponseBody setRaspDefendedCount(Integer raspDefendedCount) {
        this.raspDefendedCount = raspDefendedCount;
        return this;
    }
    public Integer getRaspDefendedCount() {
        return this.raspDefendedCount;
    }

    public DescribeVulDefendCountStatisticsResponseBody setRaspDefensibleCount(Integer raspDefensibleCount) {
        this.raspDefensibleCount = raspDefensibleCount;
        return this;
    }
    public Integer getRaspDefensibleCount() {
        return this.raspDefensibleCount;
    }

    public DescribeVulDefendCountStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
