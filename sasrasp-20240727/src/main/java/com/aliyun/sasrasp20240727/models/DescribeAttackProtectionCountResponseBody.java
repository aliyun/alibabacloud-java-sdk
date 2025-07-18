// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sasrasp20240727.models;

import com.aliyun.tea.*;

public class DescribeAttackProtectionCountResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BlockHighCount")
    public Long blockHighCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BlockLowCount")
    public Long blockLowCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("BlockMediumCount")
    public Long blockMediumCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MonitorHighCount")
    public Long monitorHighCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MonitorLowCount")
    public Long monitorLowCount;

    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("MonitorMediumCount")
    public Long monitorMediumCount;

    /**
     * <strong>example:</strong>
     * <p>400E8C8C-ADD3-5F25-9038-BDC057841D20</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>61134279</p>
     */
    @NameInMap("TotalRequestCount")
    public Long totalRequestCount;

    public static DescribeAttackProtectionCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAttackProtectionCountResponseBody self = new DescribeAttackProtectionCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAttackProtectionCountResponseBody setBlockHighCount(Long blockHighCount) {
        this.blockHighCount = blockHighCount;
        return this;
    }
    public Long getBlockHighCount() {
        return this.blockHighCount;
    }

    public DescribeAttackProtectionCountResponseBody setBlockLowCount(Long blockLowCount) {
        this.blockLowCount = blockLowCount;
        return this;
    }
    public Long getBlockLowCount() {
        return this.blockLowCount;
    }

    public DescribeAttackProtectionCountResponseBody setBlockMediumCount(Long blockMediumCount) {
        this.blockMediumCount = blockMediumCount;
        return this;
    }
    public Long getBlockMediumCount() {
        return this.blockMediumCount;
    }

    public DescribeAttackProtectionCountResponseBody setMonitorHighCount(Long monitorHighCount) {
        this.monitorHighCount = monitorHighCount;
        return this;
    }
    public Long getMonitorHighCount() {
        return this.monitorHighCount;
    }

    public DescribeAttackProtectionCountResponseBody setMonitorLowCount(Long monitorLowCount) {
        this.monitorLowCount = monitorLowCount;
        return this;
    }
    public Long getMonitorLowCount() {
        return this.monitorLowCount;
    }

    public DescribeAttackProtectionCountResponseBody setMonitorMediumCount(Long monitorMediumCount) {
        this.monitorMediumCount = monitorMediumCount;
        return this;
    }
    public Long getMonitorMediumCount() {
        return this.monitorMediumCount;
    }

    public DescribeAttackProtectionCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAttackProtectionCountResponseBody setTotalRequestCount(Long totalRequestCount) {
        this.totalRequestCount = totalRequestCount;
        return this;
    }
    public Long getTotalRequestCount() {
        return this.totalRequestCount;
    }

}
