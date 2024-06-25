// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterParametersRequest extends TeaModel {
    /**
     * <p>The ID of the cluster.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/98094.html">DescribeDBClusters</a> operation to query information about all clusters that are deployed in a specified region, such as the cluster ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-**************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>Specifies an immediate or scheduled task to modify parameters and restart the cluster. Valid values:</p>
     * <ul>
     * <li>false: scheduled task</li>
     * <li>true: immediate task</li>
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
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/207178.html">DescribeParameterGroups</a> operation to query the parameter template ID.</p>
     * </li>
     * <li><p>You must specify this parameter or the <code>Parameters</code> parameter.</p>
     * </li>
     * <li><p>This parameter is valid only for a PolarDB for MySQL cluster.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>pcpg-**************</p>
     */
    @NameInMap("ParameterGroupId")
    public String parameterGroupId;

    /**
     * <p>The JSON string that consists of parameters and values. The parameter values are strings, for example, <code>{&quot;wait_timeout&quot;:&quot;86&quot;,&quot;innodb_old_blocks_time&quot;:&quot;10&quot;}</code>.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>You can call the <a href="https://help.aliyun.com/document_detail/98122.html">DescribeDBClusterParameters</a> operation to query the parameters of the PolarDB cluster.</p>
     * </li>
     * <li><p>This parameter is required for a PolarDB for Oracle or PolarDB for PostgreSQL cluster.</p>
     * </li>
     * <li><p>For PolarDB for MySQL clusters, you must specify this parameter or the <code>ParameterGroupId</code> parameter.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;wait_timeout&quot;:&quot;86&quot;,&quot;innodb_old_blocks_time&quot;:&quot;10&quot;}</p>
     */
    @NameInMap("Parameters")
    public String parameters;

    /**
     * <p>The latest start time to run the task. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The value of this parameter must be at least 30 minutes later than the value of the PlannedStartTime parameter.</p>
     * </li>
     * <li><p>By default, if you specify the <code>PlannedStartTime</code> parameter but do not specify the PlannedEndTime parameter, the latest start time of the task is set to a value that is calculated by using the following formula: <code>Value of the PlannedEndTime parameter + 30 minutes</code>. For example, if you set the <code>PlannedStartTime</code> parameter to <code>2021-01-14T09:00:00Z</code> and you do not specify the PlannedEndTime parameter, the latest start time of the task is set to <code>2021-01-14T09:30:00Z</code>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2022-04-28T14:30:00Z</p>
     */
    @NameInMap("PlannedEndTime")
    public String plannedEndTime;

    /**
     * <p>The earliest time to upgrade the specifications within the scheduled time period. Specify the time in the <code>YYYY-MM-DDThh:mm:ssZ</code> format. The time must be in UTC.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>The earliest start time of the task can be a point in time within the next 24 hours. For example, if the current time is <code>2021-01-14T09:00:00Z</code>, you can specify a point in the time range from <code>2021-01-14T09:00:00Z</code> to <code>2021-01-15T09:00:00Z</code>.</p>
     * </li>
     * <li><p>If this parameter is empty, the upgrade task is immediately performed.</p>
     * </li>
     * </ul>
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
