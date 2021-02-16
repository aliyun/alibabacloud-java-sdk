// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSQLLogRecordsRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("MaxRecordsPerPage")
    public Integer maxRecordsPerPage;

    @NameInMap("PageNumbers")
    public Integer pageNumbers;

    @NameInMap("QueryKeyword")
    public String queryKeyword;

    @NameInMap("HostAddress")
    public String hostAddress;

    @NameInMap("DBName")
    public String DBName;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("SortKey")
    public String sortKey;

    @NameInMap("SortMethod")
    public String sortMethod;

    @NameInMap("MinConsume")
    public Long minConsume;

    @NameInMap("MaxConsume")
    public Long maxConsume;

    @NameInMap("MinScanRows")
    public Long minScanRows;

    @NameInMap("MaxScanRows")
    public Long maxScanRows;

    @NameInMap("State")
    public String state;

    @NameInMap("SqlType")
    public String sqlType;

    @NameInMap("AccountName")
    public String accountName;

    @NameInMap("ThreadID")
    public String threadID;

    @NameInMap("PagingID")
    public String pagingID;

    @NameInMap("LogicalOperator")
    public String logicalOperator;

    @NameInMap("ChildDBInstanceIDs")
    public String childDBInstanceIDs;

    @NameInMap("JobId")
    public String jobId;

    public static DescribeSQLLogRecordsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogRecordsRequest self = new DescribeSQLLogRecordsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogRecordsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeSQLLogRecordsRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSQLLogRecordsRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSQLLogRecordsRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSQLLogRecordsRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSQLLogRecordsRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSQLLogRecordsRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSQLLogRecordsRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSQLLogRecordsRequest setMaxRecordsPerPage(Integer maxRecordsPerPage) {
        this.maxRecordsPerPage = maxRecordsPerPage;
        return this;
    }
    public Integer getMaxRecordsPerPage() {
        return this.maxRecordsPerPage;
    }

    public DescribeSQLLogRecordsRequest setPageNumbers(Integer pageNumbers) {
        this.pageNumbers = pageNumbers;
        return this;
    }
    public Integer getPageNumbers() {
        return this.pageNumbers;
    }

    public DescribeSQLLogRecordsRequest setQueryKeyword(String queryKeyword) {
        this.queryKeyword = queryKeyword;
        return this;
    }
    public String getQueryKeyword() {
        return this.queryKeyword;
    }

    public DescribeSQLLogRecordsRequest setHostAddress(String hostAddress) {
        this.hostAddress = hostAddress;
        return this;
    }
    public String getHostAddress() {
        return this.hostAddress;
    }

    public DescribeSQLLogRecordsRequest setDBName(String DBName) {
        this.DBName = DBName;
        return this;
    }
    public String getDBName() {
        return this.DBName;
    }

    public DescribeSQLLogRecordsRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public DescribeSQLLogRecordsRequest setSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }
    public String getSortKey() {
        return this.sortKey;
    }

    public DescribeSQLLogRecordsRequest setSortMethod(String sortMethod) {
        this.sortMethod = sortMethod;
        return this;
    }
    public String getSortMethod() {
        return this.sortMethod;
    }

    public DescribeSQLLogRecordsRequest setMinConsume(Long minConsume) {
        this.minConsume = minConsume;
        return this;
    }
    public Long getMinConsume() {
        return this.minConsume;
    }

    public DescribeSQLLogRecordsRequest setMaxConsume(Long maxConsume) {
        this.maxConsume = maxConsume;
        return this;
    }
    public Long getMaxConsume() {
        return this.maxConsume;
    }

    public DescribeSQLLogRecordsRequest setMinScanRows(Long minScanRows) {
        this.minScanRows = minScanRows;
        return this;
    }
    public Long getMinScanRows() {
        return this.minScanRows;
    }

    public DescribeSQLLogRecordsRequest setMaxScanRows(Long maxScanRows) {
        this.maxScanRows = maxScanRows;
        return this;
    }
    public Long getMaxScanRows() {
        return this.maxScanRows;
    }

    public DescribeSQLLogRecordsRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeSQLLogRecordsRequest setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }
    public String getSqlType() {
        return this.sqlType;
    }

    public DescribeSQLLogRecordsRequest setAccountName(String accountName) {
        this.accountName = accountName;
        return this;
    }
    public String getAccountName() {
        return this.accountName;
    }

    public DescribeSQLLogRecordsRequest setThreadID(String threadID) {
        this.threadID = threadID;
        return this;
    }
    public String getThreadID() {
        return this.threadID;
    }

    public DescribeSQLLogRecordsRequest setPagingID(String pagingID) {
        this.pagingID = pagingID;
        return this;
    }
    public String getPagingID() {
        return this.pagingID;
    }

    public DescribeSQLLogRecordsRequest setLogicalOperator(String logicalOperator) {
        this.logicalOperator = logicalOperator;
        return this;
    }
    public String getLogicalOperator() {
        return this.logicalOperator;
    }

    public DescribeSQLLogRecordsRequest setChildDBInstanceIDs(String childDBInstanceIDs) {
        this.childDBInstanceIDs = childDBInstanceIDs;
        return this;
    }
    public String getChildDBInstanceIDs() {
        return this.childDBInstanceIDs;
    }

    public DescribeSQLLogRecordsRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

}
