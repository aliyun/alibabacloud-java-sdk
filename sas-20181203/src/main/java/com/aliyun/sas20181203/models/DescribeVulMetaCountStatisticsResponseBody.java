// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeVulMetaCountStatisticsResponseBody extends TeaModel {
    /**
     * <p>The number of application vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("AppCount")
    public Integer appCount;

    /**
     * <p>The number of Linux software vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("CveCount")
    public Integer cveCount;

    /**
     * <p>The number of vulnerabilities that can be defended by the application protection feature.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("RaspDefendCount")
    public Integer raspDefendCount;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>571B2642-BF51-5BDD-906B-D2340DB9****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of Windows system vulnerabilities.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("SysCount")
    public Integer sysCount;

    public static DescribeVulMetaCountStatisticsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVulMetaCountStatisticsResponseBody self = new DescribeVulMetaCountStatisticsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVulMetaCountStatisticsResponseBody setAppCount(Integer appCount) {
        this.appCount = appCount;
        return this;
    }
    public Integer getAppCount() {
        return this.appCount;
    }

    public DescribeVulMetaCountStatisticsResponseBody setCveCount(Integer cveCount) {
        this.cveCount = cveCount;
        return this;
    }
    public Integer getCveCount() {
        return this.cveCount;
    }

    public DescribeVulMetaCountStatisticsResponseBody setRaspDefendCount(Integer raspDefendCount) {
        this.raspDefendCount = raspDefendCount;
        return this;
    }
    public Integer getRaspDefendCount() {
        return this.raspDefendCount;
    }

    public DescribeVulMetaCountStatisticsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVulMetaCountStatisticsResponseBody setSysCount(Integer sysCount) {
        this.sysCount = sysCount;
        return this;
    }
    public Integer getSysCount() {
        return this.sysCount;
    }

}
