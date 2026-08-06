// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationPerformanceShrinkRequest extends TeaModel {
    /**
     * <p>The application cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The user.</p>
     * 
     * <strong>example:</strong>
     * <p>c-xxxxxxx</p>
     */
    @NameInMap("Consumer")
    public String consumer;

    /**
     * <p>The user group.</p>
     * 
     * <strong>example:</strong>
     * <p>cg-xxxxxx</p>
     */
    @NameInMap("ConsumerGroup")
    public String consumerGroup;

    /**
     * <p>The downsampling policy.</p>
     * 
     * <strong>example:</strong>
     * <p>raw_sample</p>
     */
    @NameInMap("Downsample")
    public String downsample;

    /**
     * <p>The end step number.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("EndStep")
    public Long endStep;

    /**
     * <p>The end of the time range to query. Specify the time in the yyyy-MM-ddTHH:mmZ format (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-23T01:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The data granularity of performance data. Valid values:</p>
     * <ul>
     * <li>5</li>
     * <li>30</li>
     * <li>60</li>
     * <li>600</li>
     * <li>1800</li>
     * <li>3600</li>
     * <li>86400</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The performance metrics to query. Separate multiple values with commas (,).</p>
     * <blockquote>
     * <p><strong>Note</strong> You can specify up to 5 performance metrics.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PolarDBSupabaseMemUsage</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The maximum number of data points to return.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("MaxPoints")
    public Integer maxPoints;

    /**
     * <p>The model service.</p>
     * 
     * <strong>example:</strong>
     * <p>ms-xxxxxx</p>
     */
    @NameInMap("ModelService")
    public String modelService;

    /**
     * <p>The start step number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("StartStep")
    public Long startStep;

    /**
     * <p>The beginning of the time range to query. Specify the time in the yyyy-MM-ddTHH:mmZ format (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-23T01:01Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("filter")
    public String filterShrink;

    public static DescribeApplicationPerformanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationPerformanceShrinkRequest self = new DescribeApplicationPerformanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationPerformanceShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeApplicationPerformanceShrinkRequest setConsumer(String consumer) {
        this.consumer = consumer;
        return this;
    }
    public String getConsumer() {
        return this.consumer;
    }

    public DescribeApplicationPerformanceShrinkRequest setConsumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
        return this;
    }
    public String getConsumerGroup() {
        return this.consumerGroup;
    }

    public DescribeApplicationPerformanceShrinkRequest setDownsample(String downsample) {
        this.downsample = downsample;
        return this;
    }
    public String getDownsample() {
        return this.downsample;
    }

    public DescribeApplicationPerformanceShrinkRequest setEndStep(Long endStep) {
        this.endStep = endStep;
        return this;
    }
    public Long getEndStep() {
        return this.endStep;
    }

    public DescribeApplicationPerformanceShrinkRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeApplicationPerformanceShrinkRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeApplicationPerformanceShrinkRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeApplicationPerformanceShrinkRequest setMaxPoints(Integer maxPoints) {
        this.maxPoints = maxPoints;
        return this;
    }
    public Integer getMaxPoints() {
        return this.maxPoints;
    }

    public DescribeApplicationPerformanceShrinkRequest setModelService(String modelService) {
        this.modelService = modelService;
        return this;
    }
    public String getModelService() {
        return this.modelService;
    }

    public DescribeApplicationPerformanceShrinkRequest setStartStep(Long startStep) {
        this.startStep = startStep;
        return this;
    }
    public Long getStartStep() {
        return this.startStep;
    }

    public DescribeApplicationPerformanceShrinkRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeApplicationPerformanceShrinkRequest setFilterShrink(String filterShrink) {
        this.filterShrink = filterShrink;
        return this;
    }
    public String getFilterShrink() {
        return this.filterShrink;
    }

}
