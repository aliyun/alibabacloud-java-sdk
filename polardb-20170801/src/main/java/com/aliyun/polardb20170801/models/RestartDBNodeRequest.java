// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class RestartDBNodeRequest extends TeaModel {
    /**
     * <p>The ID of the cluster node.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/185342.html">DescribeDBClusters</a> operation to query the details of all clusters under your account, including node IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pi-*************</p>
     */
    @NameInMap("DBNodeId")
    public String DBNodeId;

    /**
     * <p>Specifies whether to restart the node immediately or at a scheduled time. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): The node is restarted at a scheduled time.</p>
     * </li>
     * <li><p><strong>true</strong>: The node is restarted immediately.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FromTimeService")
    public String fromTimeService;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The latest time to start the scheduled task. The time must be in the <code>YYYY-MM-DDThh:mm:ssZ</code> format and in UTC.</p>
     * <blockquote>
     * <ul>
     * <li><p>The latest time must be at least 30 minutes later than the earliest time.</p>
     * </li>
     * <li><p>If PlannedStartTime is specified but this parameter is not, the latest start time of the task is PlannedStartTime plus 30 minutes by default. For example, if PlannedStartTime is set to <code>2021-01-14T09:00:00Z</code> and this parameter is empty, the task starts no later than <code>2021-01-14T09:30:00Z</code>.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:30:00Z</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The earliest time to start the scheduled node restart. The task is executed within a specified time window. The time must be in the <code>YYYY-MM-DDThh:mm:ssZ</code> format and in UTC.</p>
     * <blockquote>
     * <ul>
     * <li><p>The start time can be set to any point in time within the next 72 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, the start time can be set to a value in the range from <code>2021-01-14T09:00:00Z</code> to <code>2021-01-17T09:00:00Z</code>.</p>
     * </li>
     * <li><p>If this parameter is empty, the node is restarted immediately.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:00:00Z</p>
     */
    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    /**
     * <p>The region ID.</p>
     * <blockquote>
     * <p>Call the <a href="https://help.aliyun.com/document_detail/98041.html">DescribeRegions</a> operation to query the available regions.</p>
     * </blockquote>
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

    public static RestartDBNodeRequest build(java.util.Map<String, ?> map) throws Exception {
        RestartDBNodeRequest self = new RestartDBNodeRequest();
        return TeaModel.build(map, self);
    }

    public RestartDBNodeRequest setDBNodeId(String DBNodeId) {
        this.DBNodeId = DBNodeId;
        return this;
    }
    public String getDBNodeId() {
        return this.DBNodeId;
    }

    public RestartDBNodeRequest setFromTimeService(String fromTimeService) {
        this.fromTimeService = fromTimeService;
        return this;
    }
    public String getFromTimeService() {
        return this.fromTimeService;
    }

    public RestartDBNodeRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public RestartDBNodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public RestartDBNodeRequest setPlannedEndTime(String plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
        return this;
    }
    public String getPlannedEndTime() {
        return this.plannedEndTime;
    }

    public RestartDBNodeRequest setPlannedStartTime(String plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
        return this;
    }
    public String getPlannedStartTime() {
        return this.plannedStartTime;
    }

    public RestartDBNodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RestartDBNodeRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public RestartDBNodeRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
