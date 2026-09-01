// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterParametersRequest extends TeaModel {
    /**
     * <p>Specifies whether to clear binlogs. This parameter takes effect only when binlog is disabled.</p>
     */
    @NameInMap("ClearBinlog")
    public Boolean clearBinlog;

    /**
     * <p>The cluster ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query information about all clusters in the specified region, including cluster IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies whether to immediately or schedule the parameter modification and cluster restart. Valid values:  </p>
     * <ul>
     * <li><p>false (default): Scheduled execution.</p>
     * </li>
     * <li><p>true: Immediate execution.</p>
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
     * <p>The parameter template ID.</p>
     * <blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/207178.html">DescribeParameterGroups</a> operation to query the parameter template ID.</li>
     * <li>You must specify either this parameter or the <code>Parameters</code> parameter.</li>
     * <li>Only PolarDB for MySQL supports this parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>pcpg-**************</p>
     */
    @NameInMap("ParameterGroupId")
    public String parameterGroupId;

    /**
     * <p>A JSON string that consists of parameters and their values. Parameter values are of the STRING type. Example: <code>{&quot;wait_timeout&quot;:&quot;86&quot;,&quot;innodb_old_blocks_time&quot;:&quot;10&quot;}</code>.</p>
     * <blockquote>
     * <ul>
     * <li>You can call the <a href="https://help.aliyun.com/document_detail/98122.html">DescribeDBClusterParameters</a> operation to query the parameters of a PolarDB cluster.</li>
     * <li>If the cluster runs PolarDB for PostgreSQL or PolarDB for PostgreSQL (Compatible with Oracle), this parameter is required.</li>
     * <li>If the cluster runs PolarDB for MySQL, you must specify either this parameter or the <code>ParameterGroupId</code> parameter.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;wait_timeout&quot;:&quot;86&quot;,&quot;innodb_old_blocks_time&quot;:&quot;10&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The latest time to start running the scheduled task. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC).</p>
     * <blockquote>
     * <ul>
     * <li>The latest time must be at least 30 minutes later than the start time.</li>
     * <li>If you specify <code>PlannedStartTime</code> but do not specify this parameter, the latest time defaults to <code>start time + 30 minutes</code>. For example, if <code>PlannedStartTime</code> is set to <code>2021-01-14T09:00:00Z</code> and this parameter is left empty, the task starts no later than <code>2021-01-14T09:30:00Z</code>.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-04-28T14:30:00Z</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The earliest time to start running the scheduled task within the specified time range. The time is in the <code>YYYY-MM-DDThh:mm:ssZ</code> format (UTC).</p>
     * <blockquote>
     * <ul>
     * <li>The start time must be within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, the start time can range from <code>2021-01-14T09:00:00Z</code> to <code>2021-01-15T09:00:00Z</code>.</li>
     * <li>If this parameter is left empty, the task is immediately executed.</li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2022-04-28T14:00:00Z</p>
     */
    @NameInMap("PlannedStartTime")
    public String plannedStartTime;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    public static ModifyDBClusterParametersRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterParametersRequest self = new ModifyDBClusterParametersRequest();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterParametersRequest setClearBinlog(Boolean clearBinlog) {
        this.clearBinlog = clearBinlog;
        return this;
    }
    public Boolean getClearBinlog() {
        return this.clearBinlog;
    }

    public ModifyDBClusterParametersRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public ModifyDBClusterParametersRequest setFromTimeService(Boolean fromTimeService) {
        this.fromTimeService = fromTimeService;
        return this;
    }
    public Boolean getFromTimeService() {
        return this.fromTimeService;
    }

    public ModifyDBClusterParametersRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public ModifyDBClusterParametersRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyDBClusterParametersRequest setParameterGroupId(String parameterGroupId) {
        this.parameterGroupId = parameterGroupId;
        return this;
    }
    public String getParameterGroupId() {
        return this.parameterGroupId;
    }

    public ModifyDBClusterParametersRequest setParameters(String parameters) {
        this.parameters = parameters;
        return this;
    }
    public String getParameters() {
        return this.parameters;
    }

    public ModifyDBClusterParametersRequest setPlannedEndTime(String plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
        return this;
    }
    public String getPlannedEndTime() {
        return this.plannedEndTime;
    }

    public ModifyDBClusterParametersRequest setPlannedStartTime(String plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
        return this;
    }
    public String getPlannedStartTime() {
        return this.plannedStartTime;
    }

    public ModifyDBClusterParametersRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public ModifyDBClusterParametersRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

}
