// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProjectStepMetricRequest extends TeaModel {
    @NameInMap("Aggregator")
    public String aggregator;

    @NameInMap("BeginTimestamp")
    public Long beginTimestamp;

    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    @NameInMap("MaxPointNum")
    public Integer maxPointNum;

    @NameInMap("MetricType")
    public String metricType;

    @NameInMap("ProjectId")
    public String projectId;

    @NameInMap("StepName")
    public String stepName;

    public static DescribeProjectStepMetricRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeProjectStepMetricRequest self = new DescribeProjectStepMetricRequest();
        return TeaModel.build(map, self);
    }

    public DescribeProjectStepMetricRequest setAggregator(String aggregator) {
        this.aggregator = aggregator;
        return this;
    }
    public String getAggregator() {
        return this.aggregator;
    }

    public DescribeProjectStepMetricRequest setBeginTimestamp(Long beginTimestamp) {
        this.beginTimestamp = beginTimestamp;
        return this;
    }
    public Long getBeginTimestamp() {
        return this.beginTimestamp;
    }

    public DescribeProjectStepMetricRequest setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeProjectStepMetricRequest setMaxPointNum(Integer maxPointNum) {
        this.maxPointNum = maxPointNum;
        return this;
    }
    public Integer getMaxPointNum() {
        return this.maxPointNum;
    }

    public DescribeProjectStepMetricRequest setMetricType(String metricType) {
        this.metricType = metricType;
        return this;
    }
    public String getMetricType() {
        return this.metricType;
    }

    public DescribeProjectStepMetricRequest setProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }
    public String getProjectId() {
        return this.projectId;
    }

    public DescribeProjectStepMetricRequest setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

}
