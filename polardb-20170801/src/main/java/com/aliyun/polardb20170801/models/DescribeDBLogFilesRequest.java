// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBLogFilesRequest extends TeaModel {
    /**
     * <p>The cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <p>The ID of the node in the PolarDB cluster.</p>
     * 
     * <strong>example:</strong>
     * <p>pi-*************</p>
     */
    @NameInMap("DBNodeId")
    public String DBNodeId;

    /**
     * <p>The mode to query simulation records. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Queries the simulation records of a logical instance. You can specify the simulation ID.</p>
     * </li>
     * <li><p><strong>1</strong>: Queries the simulation records of a physical instance based on a specified <code>SimulateListId</code>.</p>
     * </li>
     * <li><p><strong>2</strong>: Queries the records of the most recent simulation in progress.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("DescribeSimulateSwitchMode")
    public String describeSimulateSwitchMode;

    /**
     * <p>The end of the time range to query. The time must be in UTC and formatted as <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-09-20T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The log type. Valid values:</p>
     * <ul>
     * <li><p><strong>HaSwitchLogList</strong>: A list of failover logs.</p>
     * </li>
     * <li><p><strong>HaSwitchLogInfo</strong>: Details of a failover log.</p>
     * </li>
     * <li><p><strong>SimulateSwitchLogs</strong>: Failover simulation logs.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>HaSwitchLogList</p>
     */
    @NameInMap("LogType")
    public String logType;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The page number. The value must be an integer that is greater than 0. The default value is <strong>1</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The page size. Valid values: 5 to 50. The default value is 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of a logical instance simulation record.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;95&quot;</p>
     */
    @NameInMap("SimulateListId")
    public String simulateListId;

    /**
     * <p>Filters the results by one or more simulation modes. Specify multiple modes as a comma-separated string. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Fault is injected into the primary availability zone.</p>
     * </li>
     * <li><p><strong>1</strong>: Fault is injected into the DB instance.</p>
     * </li>
     * <li><p><strong>2</strong>: Fault is injected into the disaster recovery data center.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>0,1,2</p>
     */
    @NameInMap("SimulateModeList")
    public String simulateModeList;

    /**
     * <p>Filters the results by one or more simulation statuses. Specify multiple statuses as a comma-separated string. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Waiting for scheduling</p>
     * </li>
     * <li><p><strong>1</strong>: Succeeded</p>
     * </li>
     * <li><p><strong>2</strong>: Running</p>
     * </li>
     * <li><p><strong>3</strong>: Failed</p>
     * </li>
     * <li><p><strong>4</strong>: Interrupted</p>
     * </li>
     * <li><p><strong>5</strong>: Waiting for switchback</p>
     * </li>
     * <li><p><strong>6</strong>: Canceled</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>&quot;0,1,2,3,4,5&quot;</p>
     */
    @NameInMap("SimulateStatusList")
    public String simulateStatusList;

    /**
     * <p>The start of the time range to query. The time must be in UTC and formatted as <code>yyyy-MM-ddTHH:mm:ssZ</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>2023-08-20T16:00:00Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBLogFilesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBLogFilesRequest self = new DescribeDBLogFilesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBLogFilesRequest setDBClusterId(String DBClusterId) {
        this.DBClusterId = DBClusterId;
        return this;
    }
    public String getDBClusterId() {
        return this.DBClusterId;
    }

    public DescribeDBLogFilesRequest setDBNodeId(String DBNodeId) {
        this.DBNodeId = DBNodeId;
        return this;
    }
    public String getDBNodeId() {
        return this.DBNodeId;
    }

    public DescribeDBLogFilesRequest setDescribeSimulateSwitchMode(String describeSimulateSwitchMode) {
        this.describeSimulateSwitchMode = describeSimulateSwitchMode;
        return this;
    }
    public String getDescribeSimulateSwitchMode() {
        return this.describeSimulateSwitchMode;
    }

    public DescribeDBLogFilesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBLogFilesRequest setLogType(String logType) {
        this.logType = logType;
        return this;
    }
    public String getLogType() {
        return this.logType;
    }

    public DescribeDBLogFilesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeDBLogFilesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeDBLogFilesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBLogFilesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBLogFilesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeDBLogFilesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeDBLogFilesRequest setSimulateListId(String simulateListId) {
        this.simulateListId = simulateListId;
        return this;
    }
    public String getSimulateListId() {
        return this.simulateListId;
    }

    public DescribeDBLogFilesRequest setSimulateModeList(String simulateModeList) {
        this.simulateModeList = simulateModeList;
        return this;
    }
    public String getSimulateModeList() {
        return this.simulateModeList;
    }

    public DescribeDBLogFilesRequest setSimulateStatusList(String simulateStatusList) {
        this.simulateStatusList = simulateStatusList;
        return this;
    }
    public String getSimulateStatusList() {
        return this.simulateStatusList;
    }

    public DescribeDBLogFilesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
