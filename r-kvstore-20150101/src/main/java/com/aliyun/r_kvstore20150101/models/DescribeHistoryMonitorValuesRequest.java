// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class DescribeHistoryMonitorValuesRequest extends TeaModel {
    /**
     * <p>The end of the time range to query. The end time must be later than the start time. Specify the time in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time must be in UTC.</p>
     * <blockquote>
     * <p>You can query monitoring data within the past month. The maximum time range to query is 7 days.</p>
     * </blockquote>
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
     * <p>r-bp1zxszhcgatnx******</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>This parameter is deprecated and its value is fixed at <code>01m</code>.</p>
     * <p>The system automatically determines the <strong>query interval</strong> based on the specified start and end times. For example, if the specified time range is 10 minutes or less, data is aggregated every 5 seconds, and the query results are returned at 5-second intervals.</p>
     * <blockquote>
     * <ul>
     * <li><p>If the specified <code>StartTime</code> is not at a data aggregation point, the first time point returned by the system is the nearest preceding data aggregation point. For example, if you set StartTime to <code>2022-01-20T12:01:48Z</code>, the first time point returned is <code>2022-01-20T12:01:45Z</code>.</p>
     * </li>
     * <li><p>If the instance has 32 or more data shards, the minimum data aggregation frequency is 1 minute.</p>
     * </li>
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
     * <p>The monitoring metric to query, such as <code>CpuUsage</code>. To specify multiple metrics, separate them with a comma (,).</p>
     * <ul>
     * <li><p>For instances that use the cluster or read/write splitting architecture:</p>
     * <ul>
     * <li><p>To query the overall CPU utilization of all data nodes, set this parameter to <strong>CpuUsage$db</strong>.</p>
     * </li>
     * <li><p>To query the CPU utilization of a single data node, set this parameter to <strong>CpuUsage</strong> and specify the node in the <code>NodeId</code> parameter.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p>For instances that use the standard architecture (primary/standby), set this parameter to <strong>CpuUsage</strong>.</p>
     * </li>
     * </ul>
     * <p>For more information about monitoring metrics, see &lt;props=&quot;china&quot;&gt;<a href="https://help.aliyun.com/zh/redis/developer-reference/api-r-kvstore-2015-01-01-describehistorymonitorvalues-redis#monitorKeys-note">Additional information about the MonitorKeys parameter</a>&lt;props=&quot;intl&quot;&gt;<a href="https://www.alibabacloud.com/help/zh/redis/developer-reference/api-r-kvstore-2015-01-01-describehistorymonitorvalues-redis#monitorKeys-note">Additional information about the MonitorKeys parameter</a> below.</p>
     * <blockquote>
     * <ul>
     * <li><p>If you do not specify this parameter, the <code>UsedMemory</code> and <code>quotaMemory</code> metrics are returned by default.</p>
     * </li>
     * <li><p>To ensure query efficiency, we recommend that you specify a maximum of 5 monitoring metrics for a single node and a maximum of 1 aggregate monitoring metric per query.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>CpuUsage</p>
     */
    @NameInMap("MonitorKeys")
    public String monitorKeys;

    /**
     * <p>The ID of a node in the instance. You can use this parameter to query the monitoring data of a specific node.</p>
     * <blockquote>
     * <ul>
     * <li><p>This parameter is available only for instances that use the read/write splitting or cluster architecture.</p>
     * </li>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/473786.html">DescribeLogicInstanceTopology</a> operation to query node IDs.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>r-bp1zxszhcgatnx****-db-0#1679****</p>
     */
    @NameInMap("NodeId")
    public String nodeId;

    /**
     * <p>If you want to query the metrics of a read-only node in a cloud-native instance that uses a read/write splitting architecture, you must specify the <strong>NodeId</strong> and set this parameter to <strong>READONLY</strong>.</p>
     * <blockquote>
     * <p>In all other cases, you do not need to specify this parameter. You can also set it to <strong>MASTER</strong>.</p>
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
