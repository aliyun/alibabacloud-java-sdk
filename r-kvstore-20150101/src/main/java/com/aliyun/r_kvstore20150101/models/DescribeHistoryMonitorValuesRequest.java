// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeHistoryMonitorValuesRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <ul>
     * <li>You can query the monitoring data of the last month. The maximum time range that you can specify for a query is seven days.</li>
     * <li>If the number of data nodes in the instance is greater than 32, the time range to query for the Data Node Aggregation and Proxy Node Aggregation metrics cannot exceed 1 hour.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11-06T00:30:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The ID of the instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The interval at which to collect monitoring data. Unit: minutes. Set the value to <code>01m</code>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>01m</p>
     */
    @NameInMap("IntervalForHistory")
    public String intervalForHistory;

    /**
     * <p>The monitoring metrics. Separate the metrics with commas (,). Take CpuUsage as an example:</p>
     * <ul>
     * <li>To query the overall CPU utilization of all data nodes, specify <strong>CpuUsage$db</strong>.</li>
     * <li>To query the CPU utilization of a single data node, specify <strong>CpuUsage</strong> and NodeId.</li>
     * </ul>
     * <p>For more information about the monitoring metrics, see <strong>Additional description of MonitorKeys</strong>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is empty by default, which indicates that the UsedMemory and quotaMemory metrics are returned.</p>
     * </li>
     * <li><p>To ensure query efficiency, we recommend that you specify no more than five metrics for a single node at a time, and specify only a single metric when you query aggregate metrics.</p>
     * </li>
     * </ul>
     * <p><a href="https://help.aliyun.com/zh/redis/developer-reference/api-r-kvstore-2015-01-01-describehistorymonitorvalues-redis">Additional description of MonitorKeys</a></p>
     * 
     * <strong>example:</strong>
     * <p>memoryUsage</p>
     */
    @NameInMap("MonitorKeys")
    public String monitorKeys;

    /**
     * <p>The ID of the node in the instance. You can set this parameter to query the data of a specified node.</p>
     * <ul>
     * <li><p>This parameter is available only for read/write splitting or cluster instances of ApsaraDB for Redis.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/94665.html">DescribeLogicInstanceTopology</a> operation to query node IDs.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****-db-0#1679****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>If you want to query the metrics of the read replicas in a cloud-native read/write splitting instance, you must set this parameter to <strong>READONLY</strong> and specify <strong>NodeId</strong>.</p>
     * <blockquote>
     * <p>In other cases, you do not need to specify this parameter or you can set this parameter to <strong>MASTER</strong>.</p>
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
     * <p>The beginning of the time range to query. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2022-11-06T00:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

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

}
