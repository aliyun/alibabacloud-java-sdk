// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeOmsSyncMonitorRequest extends TeaModel {
    @NameInMap("BeginTime")
    public Integer beginTime;

    @NameInMap("EndTime")
    public Integer endTime;

    @NameInMap("MaxPointNum")
    public Integer maxPointNum;

    @NameInMap("Metric")
    public String metric;

    @NameInMap("ProjectId")
    public String projectId;

    public static DescribeOmsSyncMonitorRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeOmsSyncMonitorRequest self = new DescribeOmsSyncMonitorRequest();
        return TeaModel.build(map, self);
    }

    public DescribeOmsSyncMonitorRequest setBeginTime(Integer beginTime) {
        this.beginTime = beginTime;
        return this;
    }
    public Integer getBeginTime() {
        return this.beginTime;
    }

    public DescribeOmsSyncMonitorRequest setEndTime(Integer endTime) {
        this.endTime = endTime;
        return this;
    }
    public Integer getEndTime() {
        return this.endTime;
    }

    public DescribeOmsSyncMonitorRequest setMaxPointNum(Integer maxPointNum) {
        this.maxPointNum = maxPointNum;
        return this;
    }
    public Integer getMaxPointNum() {
        return this.maxPointNum;
    }

    public DescribeOmsSyncMonitorRequest setMetric(String metric) {
        this.metric = metric;
        return this;
    }
    public String getMetric() {
        return this.metric;
    }

    public DescribeOmsSyncMonitorRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

}
