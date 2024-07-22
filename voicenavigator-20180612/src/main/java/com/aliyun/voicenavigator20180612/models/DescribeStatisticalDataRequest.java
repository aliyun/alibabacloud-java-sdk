// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeStatisticalDataRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1582283640000</p>
     */
    @NameInMap("BeginTimeLeftRange")
    public Long beginTimeLeftRange;

    /**
     * <strong>example:</strong>
     * <p>1582298040000</p>
     */
    @NameInMap("BeginTimeRightRange")
    public Long beginTimeRightRange;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>c28fc549-d88f-4f6e-85ad-a0806e5e39c0</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Day/Hour</p>
     */
    @NameInMap("TimeUnit")
    public String timeUnit;

    public static DescribeStatisticalDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStatisticalDataRequest self = new DescribeStatisticalDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeStatisticalDataRequest setBeginTimeLeftRange(Long beginTimeLeftRange) {
        this.beginTimeLeftRange = beginTimeLeftRange;
        return this;
    }
    public Long getBeginTimeLeftRange() {
        return this.beginTimeLeftRange;
    }

    public DescribeStatisticalDataRequest setBeginTimeRightRange(Long beginTimeRightRange) {
        this.beginTimeRightRange = beginTimeRightRange;
        return this;
    }
    public Long getBeginTimeRightRange() {
        return this.beginTimeRightRange;
    }

    public DescribeStatisticalDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeStatisticalDataRequest setTimeUnit(String timeUnit) {
        this.timeUnit = timeUnit;
        return this;
    }
    public String getTimeUnit() {
        return this.timeUnit;
    }

}
