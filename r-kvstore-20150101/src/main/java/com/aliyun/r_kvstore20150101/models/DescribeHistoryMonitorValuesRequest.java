// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeHistoryMonitorValuesRequest extends TeaModel {
    /**
     * <p>The end time of the query for historical monitoring data. The end time must be later than the start time. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <blockquote>
     * <p>You can query monitoring data of the last month. The maximum query range cannot exceed 7 days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11-06T00:30:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p><strong>[Deprecated]</strong> This parameter is deprecated. The value is fixed to <code>01m</code>.</p>
     * <p>The system automatically determines the <strong>query interval</strong> based on the start time and end time. For example, if the query time range is less than or equal to 10 minutes, the data aggregation frequency is 5s, and the query results are returned at a frequency of 5s.</p>
     * <blockquote>
     * <ul>
     * <li>The query results are aligned with the data aggregation frequency of the instance. If the StartTime you specify does not fall on a data aggregation point, the first time point returned by the system is the nearest data aggregation point. For example, if the StartTime you specify is 2022-01-20T12:01:48Z, the first time point returned by the system is 2022-01-20T12:01:45Z.</li>
     * <li>If the number of data shards of the instance is greater than or equal to 32, the minimum data aggregation frequency is 1 minute.</li>
     * </ul>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01m</p>
     */
    @NameInMap("IntervalForHistory")
    public String intervalForHistory;

    /**
     * <p>The monitoring metrics. To specify multiple monitoring metrics, separate them with commas (,). Take CpuUsage as an example:</p>
     * <ul>
     * <li><p>Cluster or read/write splitting architecture:</p>
     * <ul>
     * <li>To query the overall CPU usage of all data nodes (DB), specify <strong>CpuUsage$db</strong>.</li>
     * <li>To query the CPU usage of a single data node, specify <strong>CpuUsage</strong> and set the NodeId parameter to the DB node.</li>
     * </ul>
     * </li>
     * <li><p>Standard architecture (primary/secondary): Specify <strong>CpuUsage</strong>.</p>
     * </li>
     * </ul>
     * <p>For more information about monitoring metrics and their descriptions, see &lt;props=&quot;china&quot;&gt;<a href="https://www.alibabacloud.com/help/en/redis/developer-reference/api-r-kvstore-2015-01-01-describehistorymonitorvalues-redis#monitorKeys-note">MonitorKeys parameter description</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/redis/developer-reference/api-r-kvstore-2015-01-01-describehistorymonitorvalues-redis#monitorKeys-note">MonitorKeys parameter description</a>.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is empty by default. If this parameter is not specified, the UsedMemory and quotaMemory metrics are returned.</li>
     * <li>To ensure query efficiency, specify no more than 5 monitoring metrics in a single request when querying metrics for a single node. Specify no more than 1 monitoring metric in a single request when querying aggregated monitoring metrics.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CpuUsage</p>
     */
    @NameInMap("MonitorKeys")
    public String monitorKeys;

    /**
     * <p>The node ID of the instance. Specify this parameter to query the monitoring information of a specific node.</p>
     * <blockquote>
     * <ul>
     * <li>This parameter is available only when the instance uses a read/write splitting or cluster architecture.</li>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/473786.html">DescribeLogicInstanceTopology</a> operation to query node IDs.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****-db-0#1679****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>To query the metrics of a read-only node in a cloud-native read/write splitting instance, specify the <strong>NodeId</strong> parameter and set this parameter to <strong>READONLY</strong>.</p>
     * <blockquote>
     * <p> In other cases, you do not need to specify this parameter (or set it to <strong>MASTER</strong>).</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>READONLY</p>
     */
    @NameInMap("NodeRole")
    public String nodeRole;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The start time of the query for historical monitoring data. Specify the time in the <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z format (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11-06T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("Type")
    public String type;

    public static DescribeHistoryMonitorValuesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeHistoryMonitorValuesRequest self = new DescribeHistoryMonitorValuesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeHistoryMonitorValuesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeHistoryMonitorValuesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeHistoryMonitorValuesRequest setIntervalForHistory(String intervalForHistory) {
        this.intervalForHistory = intervalForHistory;
        return this;
    }
    public String getIntervalForHistory() {
        return this.intervalForHistory;
    }

    public DescribeHistoryMonitorValuesRequest setMonitorKeys(String monitorKeys) {
        this.monitorKeys = monitorKeys;
        return this;
    }
    public String getMonitorKeys() {
        return this.monitorKeys;
    }

    public DescribeHistoryMonitorValuesRequest setNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }
    public String getNodeId() {
        return this.nodeId;
    }

    public DescribeHistoryMonitorValuesRequest setNodeRole(String nodeRole) {
        this.nodeRole = nodeRole;
        return this;
    }
    public String getNodeRole() {
        return this.nodeRole;
    }

    public DescribeHistoryMonitorValuesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeHistoryMonitorValuesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeHistoryMonitorValuesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeHistoryMonitorValuesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeHistoryMonitorValuesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeHistoryMonitorValuesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeHistoryMonitorValuesRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
