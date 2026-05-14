// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationPerformanceRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <strong>example:</strong>
     * <p>c-xxxxxxx</p>
     */
    @NameInMap("Consumer")
    public String consumer;

    /**
     * <strong>example:</strong>
     * <p>cg-xxxxxx</p>
     */
    @NameInMap("ConsumerGroup")
    public String consumerGroup;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-23T01:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PolarDBSupabaseMemUsage</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <strong>example:</strong>
     * <p>ms-xxxxxx</p>
     */
    @NameInMap("ModelService")
    public String modelService;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-23T01:01Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeApplicationPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationPerformanceRequest self = new DescribeApplicationPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationPerformanceRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeApplicationPerformanceRequest setConsumer(String consumer) {
        this.consumer = consumer;
        return this;
    }
    public String getConsumer() {
        return this.consumer;
    }

    public DescribeApplicationPerformanceRequest setConsumerGroup(String consumerGroup) {
        this.consumerGroup = consumerGroup;
        return this;
    }
    public String getConsumerGroup() {
        return this.consumerGroup;
    }

    public DescribeApplicationPerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeApplicationPerformanceRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeApplicationPerformanceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeApplicationPerformanceRequest setModelService(String modelService) {
        this.modelService = modelService;
        return this;
    }
    public String getModelService() {
        return this.modelService;
    }

    public DescribeApplicationPerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
