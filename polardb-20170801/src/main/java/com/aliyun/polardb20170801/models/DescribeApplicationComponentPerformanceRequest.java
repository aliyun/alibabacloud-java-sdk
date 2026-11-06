// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeApplicationComponentPerformanceRequest extends TeaModel {
    /**
     * <p>The ID of the application.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pa-**************</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The ID of the application component. You can obtain the ID from the Components parameter returned by the DescribeApplicationAttribute operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pac-*******************</p>
     */
    @NameInMap("ComponentId")
    public String componentId;

    /**
     * <p>The end time of the query. The end time must be later than or equal to the start time. Specify the time in the ISO 8601 standard in the YYYY-MM-DDTHH:mmZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-23T02:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The sampling granularity of the performance data. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public String interval;

    /**
     * <p>The performance metrics to query. Separate multiple metrics with commas (,). You can specify up to 5 metrics.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PolarDBCPU</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The start time of the query. Specify the time in the ISO 8601 standard in the YYYY-MM-DDTHH:mmZ format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2020-09-23T01:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The type of the performance data.</p>
     * 
     * <strong>example:</strong>
     * <p>supabase</p>
     */
    @NameInMap("Type")
    public String type;

    public static DescribeApplicationComponentPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApplicationComponentPerformanceRequest self = new DescribeApplicationComponentPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApplicationComponentPerformanceRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public DescribeApplicationComponentPerformanceRequest setComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }
    public String getComponentId() {
        return this.componentId;
    }

    public DescribeApplicationComponentPerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeApplicationComponentPerformanceRequest setInterval(String interval) {
        this.interval = interval;
        return this;
    }
    public String getInterval() {
        return this.interval;
    }

    public DescribeApplicationComponentPerformanceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeApplicationComponentPerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeApplicationComponentPerformanceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
