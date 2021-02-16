// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribeSQLLogTemplatesRequest extends TeaModel {
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

    @NameInMap("MinAvgConsume")
    public Float minAvgConsume;

    @NameInMap("MaxAvgConsume")
    public Float maxAvgConsume;

    @NameInMap("MinAvgScanRows")
    public Float minAvgScanRows;

    @NameInMap("MaxAvgScanRows")
    public Float maxAvgScanRows;

    @NameInMap("PagingId")
    public String pagingId;

    @NameInMap("SortKey")
    public String sortKey;

    @NameInMap("SortMethod")
    public String sortMethod;

    @NameInMap("SqlType")
    public String sqlType;

    @NameInMap("JobId")
    public String jobId;

    @NameInMap("ChildDBInstanceIDs")
    public String childDBInstanceIDs;

    public static DescribeSQLLogTemplatesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLLogTemplatesRequest self = new DescribeSQLLogTemplatesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSQLLogTemplatesRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public DescribeSQLLogTemplatesRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public DescribeSQLLogTemplatesRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public DescribeSQLLogTemplatesRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public DescribeSQLLogTemplatesRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public DescribeSQLLogTemplatesRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeSQLLogTemplatesRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeSQLLogTemplatesRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeSQLLogTemplatesRequest setMaxRecordsPerPage(Integer maxRecordsPerPage) {
        this.maxRecordsPerPage = maxRecordsPerPage;
        return this;
    }
    public Integer getMaxRecordsPerPage() {
        return this.maxRecordsPerPage;
    }

    public DescribeSQLLogTemplatesRequest setPageNumbers(Integer pageNumbers) {
        this.pageNumbers = pageNumbers;
        return this;
    }
    public Integer getPageNumbers() {
        return this.pageNumbers;
    }

    public DescribeSQLLogTemplatesRequest setMinAvgConsume(Float minAvgConsume) {
        this.minAvgConsume = minAvgConsume;
        return this;
    }
    public Float getMinAvgConsume() {
        return this.minAvgConsume;
    }

    public DescribeSQLLogTemplatesRequest setMaxAvgConsume(Float maxAvgConsume) {
        this.maxAvgConsume = maxAvgConsume;
        return this;
    }
    public Float getMaxAvgConsume() {
        return this.maxAvgConsume;
    }

    public DescribeSQLLogTemplatesRequest setMinAvgScanRows(Float minAvgScanRows) {
        this.minAvgScanRows = minAvgScanRows;
        return this;
    }
    public Float getMinAvgScanRows() {
        return this.minAvgScanRows;
    }

    public DescribeSQLLogTemplatesRequest setMaxAvgScanRows(Float maxAvgScanRows) {
        this.maxAvgScanRows = maxAvgScanRows;
        return this;
    }
    public Float getMaxAvgScanRows() {
        return this.maxAvgScanRows;
    }

    public DescribeSQLLogTemplatesRequest setPagingId(String pagingId) {
        this.pagingId = pagingId;
        return this;
    }
    public String getPagingId() {
        return this.pagingId;
    }

    public DescribeSQLLogTemplatesRequest setSortKey(String sortKey) {
        this.sortKey = sortKey;
        return this;
    }
    public String getSortKey() {
        return this.sortKey;
    }

    public DescribeSQLLogTemplatesRequest setSortMethod(String sortMethod) {
        this.sortMethod = sortMethod;
        return this;
    }
    public String getSortMethod() {
        return this.sortMethod;
    }

    public DescribeSQLLogTemplatesRequest setSqlType(String sqlType) {
        this.sqlType = sqlType;
        return this;
    }
    public String getSqlType() {
        return this.sqlType;
    }

    public DescribeSQLLogTemplatesRequest setJobId(String jobId) {
        this.jobId = jobId;
        return this;
    }
    public String getJobId() {
        return this.jobId;
    }

    public DescribeSQLLogTemplatesRequest setChildDBInstanceIDs(String childDBInstanceIDs) {
        this.childDBInstanceIDs = childDBInstanceIDs;
        return this;
    }
    public String getChildDBInstanceIDs() {
        return this.childDBInstanceIDs;
    }

}
