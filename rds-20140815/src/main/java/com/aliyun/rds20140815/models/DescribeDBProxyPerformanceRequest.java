// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDBProxyPerformanceRequest extends TeaModel {
    /**
     * <p>The instance ID. You can call DescribeDBInstances to obtain the instance ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rm-t4n3a****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>A reserved parameter. You do not need to configure this parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>normal</p>
     */
    @NameInMap("DBProxyEngineType")
    public String DBProxyEngineType;

    /**
     * <p>The type of the database proxy instance. Valid values:</p>
     * <ul>
     * <li>common: general-purpose database proxy</li>
     * <li>exclusive: dedicated database proxy</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>exclusive</p>
     */
    @NameInMap("DBProxyInstanceType")
    public String DBProxyInstanceType;

    /**
     * <p>The aggregation dimension. Valid values. The service and server values cannot be specified at the same time.</p>
     * <ul>
     * <li><p>service: aggregates monitoring metrics by proxy endpoint.</p>
     * </li>
     * <li><p>node: aggregates monitoring metrics by proxy node.</p>
     * </li>
     * <li><p>server: aggregates monitoring metrics by database node.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>service,node
     * server,node
     * service</p>
     */
    @NameInMap("Dimension")
    public String dimension;

    /**
     * <p>The end time of the query. The end time must be later than the start time. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-21T18:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The performance metrics.</p>
     * <p>RDS MySQL supports only <strong>Maxscale_CpuUsage</strong>: CPU utilization.</p>
     * <p>RDS PostgreSQL supports the following performance metrics:</p>
     * <ul>
     * <li><strong>Maxscale_TotalConns</strong>: connection rate</li>
     * <li><strong>Maxscale_CurrentConns</strong>: current connections</li>
     * <li><strong>Maxscale_DownFlows</strong>: outbound traffic</li>
     * <li><strong>Maxscale_UpFlows</strong>: inbound traffic</li>
     * <li><strong>Maxscale_QPS</strong>: request rate (QPS)</li>
     * <li><strong>Maxscale_MemUsage</strong>: memory utilization</li>
     * <li><strong>Maxscale_CpuUsage</strong>: CPU utilization</li>
     * </ul>
     * <p>To query multiple performance metrics, separate them with commas (,). You can query up to six performance metrics at a time.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Maxscale_CpuUsage</p>
     */
    @NameInMap("MetricsName")
    public String metricsName;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID. You can call DescribeRegions to obtain the region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The start time of the query. Format: <i>yyyy-MM-dd</i>T<i>HH:mm:ss</i>Z (UTC).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-09-19T01:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBProxyPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBProxyPerformanceRequest self = new DescribeDBProxyPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBProxyPerformanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBProxyPerformanceRequest setDBProxyEngineType(String DBProxyEngineType) {
        this.DBProxyEngineType = DBProxyEngineType;
        return this;
    }
    public String getDBProxyEngineType() {
        return this.DBProxyEngineType;
    }

    public DescribeDBProxyPerformanceRequest setDBProxyInstanceType(String DBProxyInstanceType) {
        this.DBProxyInstanceType = DBProxyInstanceType;
        return this;
    }
    public String getDBProxyInstanceType() {
        return this.DBProxyInstanceType;
    }

    public DescribeDBProxyPerformanceRequest setDimension(String dimension) {
        this.dimension = dimension;
        return this;
    }
    public String getDimension() {
        return this.dimension;
    }

    public DescribeDBProxyPerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBProxyPerformanceRequest setMetricsName(String metricsName) {
        this.metricsName = metricsName;
        return this;
    }
    public String getMetricsName() {
        return this.metricsName;
    }

    public DescribeDBProxyPerformanceRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBProxyPerformanceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDBProxyPerformanceRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBProxyPerformanceRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBProxyPerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
