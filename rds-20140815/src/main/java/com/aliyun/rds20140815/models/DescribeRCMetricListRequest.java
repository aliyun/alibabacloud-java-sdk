// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeRCMetricListRequest extends TeaModel {
    /**
     * <p>Queries the monitoring data of specified resources in batches for Custom for SQL Server.
     * Format: a collection of <code>key:value</code> pairs.</p>
     * 
     * <strong>example:</strong>
     * <p>[{&quot;instanceId&quot;:&quot;rc-l9hv3rv74ql7oa******&quot;},{&quot;instanceId&quot;:&quot;rc-b532l1uj8n6sex******&quot;}]</p>
     */
    @NameInMap("Dimensions")
    public String dimensions;

    /**
     * <p>The end of the time range to query. Specify the time in the <code>2024-08-06 10:15:00</code> format. The end time must be later than the start time.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-06 10:15:00</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>A reserved parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>None</p>
     */
    @NameInMap("Express")
    public String express;

    /**
     * <p>The instance ID. This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rc-dh2jf9n6j4s14926****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of records per page for paging query.</p>
     * <p>Default value: 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("Length")
    public String length;

    /**
     * <p>The <a href="https://cms.console.aliyun.com/metric-meta/acs_ecs_dashboard/ecs">monitoring metric</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CPUUtilization</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The pagination token.</p>
     * 
     * <strong>example:</strong>
     * <p>6178f1825f9fb76ce0b5e8707e******</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The statistical period of the monitoring data. Unit: seconds. Valid values:</p>
     * <ul>
     * <li>60 (default)</li>
     * <li>An integer multiple of 60</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the <code>2024-08-06 10:05:00</code> format.</p>
     * 
     * <strong>example:</strong>
     * <p>2024-08-06 10:05:00</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeRCMetricListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeRCMetricListRequest self = new DescribeRCMetricListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeRCMetricListRequest setDimensions(String dimensions) {
        this.dimensions = dimensions;
        return this;
    }
    public String getDimensions() {
        return this.dimensions;
    }

    public DescribeRCMetricListRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeRCMetricListRequest setExpress(String express) {
        this.express = express;
        return this;
    }
    public String getExpress() {
        return this.express;
    }

    public DescribeRCMetricListRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeRCMetricListRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public DescribeRCMetricListRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeRCMetricListRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeRCMetricListRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeRCMetricListRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeRCMetricListRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
