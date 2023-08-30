// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class DescribeMonitorDataRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request. You can use the client to generate the token, but you must make sure that the token is unique among different requests. The **token** can contain only ASCII characters and cannot exceed 64 characters in length. For more information, see [How to ensure idempotence](~~25693~~).</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The end of the time range to query. The following formats are supported:</p>
     * <br>
     * <p>*   UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 January 1, 1970.</p>
     * <p>*   Time format: YYYY-MM-DDThh:mm:ssZ.</p>
     * <br>
     * <p>> The interval between the start time and the end time is less than or equal to 31 days.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the simple application server.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The number of entries per page. Valid values: 1 to 1440.</p>
     */
    @NameInMap("Length")
    public String length;

    /**
     * <p>The metric name. Valid values:</p>
     * <br>
     * <p>*   MEMORY_ACTUALUSEDSPACE: the memory usage. Unit: bytes.</p>
     * <p>*   DISKUSAGE_USED: the disk usage. Unit: bytes.</p>
     * <p>*   CPU_UTILIZATION: the CPU utilization in percentage.</p>
     * <p>*   VPC_PUBLICIP_INTERNETOUT_RATE: the outbound bandwidth rate of the network. Unit: bits/s.</p>
     * <p>*   VPC_PUBLICIP_INTERNETIN_RATE: the inbound bandwidth rate of the network. Unit: bits/s.</p>
     * <p>*   DISK_READ_IOPS: the read IOPS of the disk. Unit: count/s.</p>
     * <p>*   DISK_WRITE_IOPS: the write IOPS of the disk. Unit: count/s.</p>
     * <p>*   FLOW_USED: the traffic usage. Unit: bytes.</p>
     */
    @NameInMap("MetricName")
    public String metricName;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. You must specify the token that is obtained from the previous query as the value of NextToken.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The interval at which the monitoring data is queried. Valid values: 60, 300, and 900. Unit: seconds.</p>
     * <br>
     * <p>> </p>
     * <br>
     * <p>If MetricName is set to FLOW_USED, Period is set to 3600 (one hour). In other cases, set Period based on your business requirements.</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>****</p>
     */
    @NameInMap("Period")
    public String period;

    /**
     * <p>The region ID of the simple application server. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The beginning of the time range to query. The following formats are supported:</p>
     * <br>
     * <p>*   UNIX timestamp: the number of milliseconds that have elapsed since 00:00:00 January 1, 1970.</p>
     * <p>*   Time format: YYYY-MM-DDThh:mm:ssZ.</p>
     * <br>
     * <p>> The specified time range includes the end time and excludes the start time. The start time must be earlier than the end time.</p>
     * <br>
     * <p>The interval between the start time and the end time is less than or equal to 31 days.</p>
     * <br>
     * <p>**</p>
     * <br>
     * <p>****</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeMonitorDataRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeMonitorDataRequest self = new DescribeMonitorDataRequest();
        return TeaModel.build(map, self);
    }

    public DescribeMonitorDataRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DescribeMonitorDataRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeMonitorDataRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeMonitorDataRequest setLength(String length) {
        this.length = length;
        return this;
    }
    public String getLength() {
        return this.length;
    }

    public DescribeMonitorDataRequest setMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }
    public String getMetricName() {
        return this.metricName;
    }

    public DescribeMonitorDataRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeMonitorDataRequest setPeriod(String period) {
        this.period = period;
        return this;
    }
    public String getPeriod() {
        return this.period;
    }

    public DescribeMonitorDataRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeMonitorDataRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
