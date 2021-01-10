// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.voicenavigator20180612.models;

import com.aliyun.tea.*;

public class DescribeStatisticalDataRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("TimeUnit")
    public String timeUnit;

    @NameInMap("BeginTimeLeftRange")
    public Long beginTimeLeftRange;

    @NameInMap("BeginTimeRightRange")
    public Long beginTimeRightRange;

    public static DescribeStatisticalDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeStatisticalDataRequest self = new DescribeStatisticalDataRequest();
        return TeaModel.build(map, self);
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

}
