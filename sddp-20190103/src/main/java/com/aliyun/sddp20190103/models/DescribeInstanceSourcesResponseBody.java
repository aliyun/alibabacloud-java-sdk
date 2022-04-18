// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeInstanceSourcesResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeInstanceSourcesResponseBodyItems> items;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeInstanceSourcesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceSourcesResponseBody self = new DescribeInstanceSourcesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceSourcesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeInstanceSourcesResponseBody setItems(java.util.List<DescribeInstanceSourcesResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeInstanceSourcesResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeInstanceSourcesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeInstanceSourcesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeInstanceSourcesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeInstanceSourcesResponseBodyItems extends TeaModel {
        @NameInMap("AuditStatus")
        public Integer auditStatus;

        @NameInMap("AutoScan")
        public Integer autoScan;

        @NameInMap("CanModifyUserName")
        public Boolean canModifyUserName;

        @NameInMap("CheckStatus")
        public Integer checkStatus;

        @NameInMap("DatamaskStatus")
        public Integer datamaskStatus;

        @NameInMap("DbName")
        public String dbName;

        @NameInMap("Enable")
        public Integer enable;

        @NameInMap("EngineType")
        public String engineType;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("Id")
        public Long id;

        @NameInMap("InstanceDescription")
        public String instanceDescription;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceSize")
        public Long instanceSize;

        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        @NameInMap("LastModifyUserId")
        public String lastModifyUserId;

        @NameInMap("LogStoreDay")
        public Integer logStoreDay;

        @NameInMap("PasswordStatus")
        public Integer passwordStatus;

        @NameInMap("ProductId")
        public Long productId;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("RegionName")
        public String regionName;

        @NameInMap("SamplingSize")
        public Integer samplingSize;

        @NameInMap("TenantId")
        public String tenantId;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("UserName")
        public String userName;

        public static DescribeInstanceSourcesResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeInstanceSourcesResponseBodyItems self = new DescribeInstanceSourcesResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeInstanceSourcesResponseBodyItems setAuditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public Integer getAuditStatus() {
            return this.auditStatus;
        }

        public DescribeInstanceSourcesResponseBodyItems setAutoScan(Integer autoScan) {
            this.autoScan = autoScan;
            return this;
        }
        public Integer getAutoScan() {
            return this.autoScan;
        }

        public DescribeInstanceSourcesResponseBodyItems setCanModifyUserName(Boolean canModifyUserName) {
            this.canModifyUserName = canModifyUserName;
            return this;
        }
        public Boolean getCanModifyUserName() {
            return this.canModifyUserName;
        }

        public DescribeInstanceSourcesResponseBodyItems setCheckStatus(Integer checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public Integer getCheckStatus() {
            return this.checkStatus;
        }

        public DescribeInstanceSourcesResponseBodyItems setDatamaskStatus(Integer datamaskStatus) {
            this.datamaskStatus = datamaskStatus;
            return this;
        }
        public Integer getDatamaskStatus() {
            return this.datamaskStatus;
        }

        public DescribeInstanceSourcesResponseBodyItems setDbName(String dbName) {
            this.dbName = dbName;
            return this;
        }
        public String getDbName() {
            return this.dbName;
        }

        public DescribeInstanceSourcesResponseBodyItems setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

        public DescribeInstanceSourcesResponseBodyItems setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public DescribeInstanceSourcesResponseBodyItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeInstanceSourcesResponseBodyItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeInstanceSourcesResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeInstanceSourcesResponseBodyItems setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public DescribeInstanceSourcesResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeInstanceSourcesResponseBodyItems setInstanceSize(Long instanceSize) {
            this.instanceSize = instanceSize;
            return this;
        }
        public Long getInstanceSize() {
            return this.instanceSize;
        }

        public DescribeInstanceSourcesResponseBodyItems setLastModifyTime(Long lastModifyTime) {
            this.lastModifyTime = lastModifyTime;
            return this;
        }
        public Long getLastModifyTime() {
            return this.lastModifyTime;
        }

        public DescribeInstanceSourcesResponseBodyItems setLastModifyUserId(String lastModifyUserId) {
            this.lastModifyUserId = lastModifyUserId;
            return this;
        }
        public String getLastModifyUserId() {
            return this.lastModifyUserId;
        }

        public DescribeInstanceSourcesResponseBodyItems setLogStoreDay(Integer logStoreDay) {
            this.logStoreDay = logStoreDay;
            return this;
        }
        public Integer getLogStoreDay() {
            return this.logStoreDay;
        }

        public DescribeInstanceSourcesResponseBodyItems setPasswordStatus(Integer passwordStatus) {
            this.passwordStatus = passwordStatus;
            return this;
        }
        public Integer getPasswordStatus() {
            return this.passwordStatus;
        }

        public DescribeInstanceSourcesResponseBodyItems setProductId(Long productId) {
            this.productId = productId;
            return this;
        }
        public Long getProductId() {
            return this.productId;
        }

        public DescribeInstanceSourcesResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeInstanceSourcesResponseBodyItems setRegionName(String regionName) {
            this.regionName = regionName;
            return this;
        }
        public String getRegionName() {
            return this.regionName;
        }

        public DescribeInstanceSourcesResponseBodyItems setSamplingSize(Integer samplingSize) {
            this.samplingSize = samplingSize;
            return this;
        }
        public Integer getSamplingSize() {
            return this.samplingSize;
        }

        public DescribeInstanceSourcesResponseBodyItems setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public DescribeInstanceSourcesResponseBodyItems setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeInstanceSourcesResponseBodyItems setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

    }

}
