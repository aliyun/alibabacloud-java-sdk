// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBInstancePerformanceRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call the DescribeDBInstances operation to query the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-uf6wjk5xxxxxxx</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The time span between the beginning time and the end time must be longer than the monitoring frequency. Otherwise, this operation may return an empty array.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2012-06-18T15:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The performance metrics that you want to query. Separate multiple values with commas (,). You can specify up to 30 values. For more information, see <a href="https://help.aliyun.com/document_detail/26316.html">Performance parameters</a>.</p>
     * <blockquote>
     * <p> If you set <strong>Key</strong> to <strong>MySQL_SpaceUsage</strong> or <strong>SQLServer_SpaceUsage</strong>, you can query the monitoring data within only one day.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MySQL_Sessions</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The ID of the instance.</p>
     * 
     * <strong>example:</strong>
     * <p>339****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p> The time span between the beginning time and the end time must be longer than the monitoring frequency. Otherwise, this operation may return an empty array.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2012-06-08T15:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBInstancePerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBInstancePerformanceRequest self = new DescribeDBInstancePerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBInstancePerformanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBInstancePerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBInstancePerformanceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeDBInstancePerformanceRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeDBInstancePerformanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBInstancePerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
