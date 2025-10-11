// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeDBLogFilesRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>pc-*************</p>
     */
    @NameInMap("DBClusterId")
    public String DBClusterId;

    /**
     * <strong>example:</strong>
     * <p>pi-*************</p>
     */
    @NameInMap("DBNodeId")
    public String DBNodeId;

    @NameInMap("DescribeSimulateSwitchMode")
    public String describeSimulateSwitchMode;

    /**
     * <strong>example:</strong>
     * <p>2023-09-20T16:00:00Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The log type. Valid values:</p>
     * <ul>
     * <li><strong>HaSwitchLogList</strong>: failover logs.</li>
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
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("SimulateListId")
    public String simulateListId;

    @NameInMap("SimulateModeList")
    public String simulateModeList;

    @NameInMap("SimulateStatusList")
    public String simulateStatusList;

    /**
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
