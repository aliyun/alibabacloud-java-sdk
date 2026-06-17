// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAndNodesParametersRequest extends TeaModel {
    /**
     * <p>Specifies whether to clear binlog. This parameter is valid only when binlog is disabled.</p>
     */
    @NameInMap("ClearBinlog")
    public Boolean clearBinlog;

    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**********</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The IDs of the nodes. By setting this parameter, you can modify the parameters of the cluster and specified nodes. Separate multiple node IDs with commas (,).</p>
     * <blockquote>
     * <p>If this parameter is not specified, only the cluster parameters are modified.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pi-<strong><strong><strong><strong><strong>,pi-</strong></strong></strong></strong></strong></p>
     */
    @NameInMap("DBNodeIds")
    public String DBNodeIds;

    /**
     * <p>Specifies whether to immediately or scheduledly modify parameters and restart the cluster. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong> (default): scheduled execution</p>
     * </li>
     * <li><p><strong>true</strong>: immediate execution</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FromTimeService")
    public Boolean fromTimeService;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the parameter template.</p>
     * 
     * <strong>example:</strong>
     * <p>pcpg-**********</p>
     */
    @NameInMap("ParameterGroupId")
    public String parameterGroupId;

    /**
     * <p>The JSON string that consists of parameters and their values.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;wait_timeout&quot;:&quot;86&quot;,&quot;innodb_old_blocks_time&quot;:&quot;10&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The latest time to start the scheduled task. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li><p>The latest start time must be 30 minutes or more later than the earliest start time.</p>
     * </li>
     * <li><p>If you specify <code>PlannedStartTime</code> but not this parameter, the latest start time of the task is <code>the earliest start time + 30 minutes</code> by default. For example, if you set <code>PlannedStartTime</code> to <code>2021-01-14T09:00:00Z</code> and leave this parameter empty, the task will start no later than <code>2021-01-14T09:30:00Z</code>.</p>
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
     * <p>The earliest time to start the scheduled task. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * <ul>
     * <li><p>The start time can be any time within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, you can specify a time that ranges from <code>2021-01-14T09:00:00Z</code> to <code>2021-01-15T09:00:00Z</code>.</p>
     * </li>
     * <li><p>If you leave this parameter empty, the task is immediately executed.</p>
     * </li>
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
     * <p>The list of GDN standby clusters to which you want to synchronize the parameter settings.</p>
     * 
     * <strong>example:</strong>
     * <p>gdn-<strong><strong><strong><strong><strong>,gdn-</strong></strong></strong></strong></strong></p>
     */
    @NameInMap("StandbyClusterIdListNeedToSync")
    public String standbyClusterIdListNeedToSync;

    public static ModifyDBClusterAndNodesParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAndNodesParametersRequest self = new ModifyDBClusterAndNodesParametersRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterAndNodesParametersRequest setClearBinlog(Boolean clearBinlog) {
        this.clearBinlog = clearBinlog;
        return this;
    }
    public Boolean getClearBinlog() {
        return this.clearBinlog;
    }

    public ModifyDBClusterAndNodesParametersRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterAndNodesParametersRequest setDBNodeIds(String DBNodeIds) {
        this.DBNodeIds = DBNodeIds;
        return this;
    }
    public String getDBNodeIds() {
        return this.DBNodeIds;
    }

    public ModifyDBClusterAndNodesParametersRequest setFromTimeService(Boolean fromTimeService) {
        this.fromTimeService = fromTimeService;
        return this;
    }
    public Boolean getFromTimeService() {
        return this.fromTimeService;
    }

    public ModifyDBClusterAndNodesParametersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBClusterAndNodesParametersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBClusterAndNodesParametersRequest setParameterGroupId(String parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
        return this;
    }
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

    public ModifyDBClusterAndNodesParametersRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ModifyDBClusterAndNodesParametersRequest setPlannedEndTime(String plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
        return this;
    }
    public String getPlannedEndTime() {
        return this.plannedEndTime;
    }

    public ModifyDBClusterAndNodesParametersRequest setPlannedStartTime(String plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
        return this;
    }
    public String getPlannedStartTime() {
        return this.plannedStartTime;
    }

    public ModifyDBClusterAndNodesParametersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBClusterAndNodesParametersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public ModifyDBClusterAndNodesParametersRequest setStandbyClusterIdListNeedToSync(String standbyClusterIdListNeedToSync) {
        this.standbyClusterIdListNeedToSync = standbyClusterIdListNeedToSync;
        return this;
    }
    public String getStandbyClusterIdListNeedToSync() {
        return this.standbyClusterIdListNeedToSync;
    }

}
