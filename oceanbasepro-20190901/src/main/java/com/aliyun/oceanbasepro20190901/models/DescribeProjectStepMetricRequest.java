// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeProjectStepMetricRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>AVG</p>
     */
    @NameInMap("Aggregator")
    public String aggregator;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1689244696</p>
     */
    @NameInMap("BeginTimestamp")
    public Long beginTimestamp;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1689254646</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("MaxPointNum")
    public Integer maxPointNum;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RPS</p>
     */
    @NameInMap("MetricType")
    public String metricType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>np_dr****</p>
     */
    @NameInMap("ProjectId")
    public String projectId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>FULL_TRANSFER</p>
     */
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
