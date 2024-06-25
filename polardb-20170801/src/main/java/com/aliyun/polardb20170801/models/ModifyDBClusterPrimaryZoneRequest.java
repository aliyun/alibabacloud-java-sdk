// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterPrimaryZoneRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/173433.html">DescribeDBClusters</a> operation to query information about all clusters that are deployed in a specified region, such as the cluster ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to change the primary zone immediately. Valid values:</p>
     * <ul>
     * <li>false (default): changes the primary zone as scheduled.</li>
     * <li>true: changes the primary zone immediately.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FromTimeService")
    public Boolean fromTimeService;

    /**
     * <p>Specifies whether to switch back to the original primary zone.</p>
     * <ul>
     * <li>true: switches back to the original primary zone.</li>
     * <li>false: does not switch back to the original primary zone.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("IsSwitchOverForDisaster")
    public String isSwitchOverForDisaster;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The latest start time to switch the primary zone within the scheduled time period. Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>The latest start time must be at least 30 minutes later than the earliest start time.</li>
     * <li>If you specify the <code>PlannedStartTime</code> parameter but do not specify the PlannedEndTime parameter, the latest start time of the task is set to a value that is calculated by <code>the value of the PlannedEndTime parameter + 30 minutes</code> by default. For example, if you set the <code>PlannedStartTime</code> parameter to <code>2021-01-14T09:00:00Z</code> and you do not specify the PlannedEndTime parameter, the latest start time of the task is set to <code>2021-01-14T09:30:00Z</code>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:30:00Z</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The start time to change the primary zone within the scheduled time period. Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li>The start time of the task can be a point in time within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, you can specify a point in time from <code>2021-01-14T09:00:00Z</code> to <code>2021-01-15T09:00:00Z</code>.</li>
     * <li>If you leave this parameter empty, the primary zone is immediately changed.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2021-01-14T09:00:00Z</p>
     */
    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The virtual private cloud (VPC) ID of the destination primary zone.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-**********</p>
     */
    @NameInMap("VPCId")
    public String VPCId;

    /**
     * <p>The ID of the vSwitch in the destination primary zone.</p>
     * <blockquote>
     * <ul>
     * <li>For a PolarDB for PostgreSQL (Compatible with Oracle) cluster or a PolarDB for PostgreSQL cluster, this parameter is required.</li>
     * <li>For a PolarDB for MySQL cluster, the default vSwitch is used if no vSwitches are created in the destination zone. If a vSwitch is in the destination zone, this parameter is required.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>vsw-**************</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The ID of the destination primary zone.</p>
     * <blockquote>
     * <p> You can call the DescribeRegions operation to query available zones.<a href="~~98041~~"></a></p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou-g</p>
     */
    @NameInMap("ZoneId")
    public String zoneId;

    /**
     * <p>The type of the zone. Valid values:</p>
     * <ul>
     * <li><strong>Primary</strong>: primary zone</li>
     * <li><strong>Standby</strong>: secondary zone</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Primary</p>
     */
    @NameInMap("ZoneType")
    public String zoneType;

    public static ModifyDBClusterPrimaryZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterPrimaryZoneRequest self = new ModifyDBClusterPrimaryZoneRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterPrimaryZoneRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterPrimaryZoneRequest setFromTimeService(Boolean fromTimeService) {
        this.fromTimeService = fromTimeService;
        return this;
    }
    public Boolean getFromTimeService() {
        return this.fromTimeService;
    }

    public ModifyDBClusterPrimaryZoneRequest setIsSwitchOverForDisaster(String isSwitchOverForDisaster) {
        this.isSwitchOverForDisaster = isSwitchOverForDisaster;
        return this;
    }
    public String getIsSwitchOverForDisaster() {
        return this.isSwitchOverForDisaster;
    }

    public ModifyDBClusterPrimaryZoneRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBClusterPrimaryZoneRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBClusterPrimaryZoneRequest setPlannedEndTime(String plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
        return this;
    }
    public String getPlannedEndTime() {
        return this.plannedEndTime;
    }

    public ModifyDBClusterPrimaryZoneRequest setPlannedStartTime(String plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
        return this;
    }
    public String getPlannedStartTime() {
        return this.plannedStartTime;
    }

    public ModifyDBClusterPrimaryZoneRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBClusterPrimaryZoneRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBClusterPrimaryZoneRequest setVPCId(String VPCId) {
        this.VPCId = VPCId;
        return this;
    }
    public String getVPCId() {
        return this.VPCId;
    }

    public ModifyDBClusterPrimaryZoneRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public ModifyDBClusterPrimaryZoneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public ModifyDBClusterPrimaryZoneRequest setZoneType(String zoneType) {
        this.zoneType = zoneType;
        return this;
    }
    public String getZoneType() {
        return this.zoneType;
    }

}
