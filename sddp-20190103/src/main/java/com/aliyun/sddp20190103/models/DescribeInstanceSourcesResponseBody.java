// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeInstanceSourcesResponseBody extends TeaModel {
    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>A list of assets.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeInstanceSourcesResponseBodyItems> items;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5A7E8FB9-5011-5A90-97D9-AE587047****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of assets.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
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
        /**
         * <p>The audit authorization status. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Authorized.</p>
         * </li>
         * <li><p><strong>0</strong>: Unauthorized.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuditStatus")
        public Integer auditStatus;

        /**
         * <p>Indicates whether automatic scanning for sensitive data is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Disabled.</p>
         * </li>
         * <li><p><strong>1</strong>: Enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoScan")
        public Integer autoScan;

        /**
         * <p>Indicates whether the username and password can be modified. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Yes.</p>
         * </li>
         * <li><p><strong>false</strong>: No.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanModifyUserName")
        public Boolean canModifyUserName;

        /**
         * <p>The data check status. Valid values:</p>
         * <ul>
         * <li><p><strong>0</strong>: Ready.</p>
         * </li>
         * <li><p><strong>1</strong>: Running.</p>
         * </li>
         * <li><p><strong>2</strong>: Connectivity test in progress.</p>
         * </li>
         * <li><p><strong>3</strong>: Connectivity test passed.</p>
         * </li>
         * <li><p><strong>4</strong>: Connectivity test failed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CheckStatus")
        public Integer checkStatus;

        /**
         * <p>The status of data masking authorization. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>0</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DatamaskStatus")
        public Integer datamaskStatus;

        /**
         * <p>The name of the database to which the asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>Indicates whether sensitive data detection is enabled for the asset. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>0</strong>: Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Enable")
        public Integer enable;

        /**
         * <p>The database engine type. Valid values:</p>
         * <ul>
         * <li><p><strong>MySQL</strong></p>
         * </li>
         * <li><p><strong>MariaDB</strong></p>
         * </li>
         * <li><p><strong>Oracle</strong></p>
         * </li>
         * <li><p><strong>PostgreSQL</strong></p>
         * </li>
         * <li><p><strong>SQLServer</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>The reason for the failure.</p>
         * 
         * <strong>example:</strong>
         * <p>password error</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The time when the asset was created. This value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1625587423000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The unique ID of the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The description of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance test</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The size of the instance. This parameter is valid only for OSS assets. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>409600</p>
         */
        @NameInMap("InstanceSize")
        public Long instanceSize;

        /**
         * <p>The timestamp when the asset was last modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1625587423000</p>
         */
        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        /**
         * <p>The ID of the account that last modified the asset.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("LastModifyUserId")
        public String lastModifyUserId;

        /**
         * <p>The storage duration of raw logs. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("LogStoreDay")
        public Integer logStoreDay;

        /**
         * <p>The status of the password. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: In use.</p>
         * </li>
         * <li><p><strong>0</strong>: Not in use.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PasswordStatus")
        public Integer passwordStatus;

        /**
         * <p>The product type ID. Valid values:</p>
         * <ul>
         * <li><p><strong>1</strong>: MaxCompute</p>
         * </li>
         * <li><p><strong>2</strong>: OSS</p>
         * </li>
         * <li><p><strong>3</strong>: ADS</p>
         * </li>
         * <li><p><strong>4</strong>: OTS</p>
         * </li>
         * <li><p><strong>5</strong>: RDS</p>
         * </li>
         * <li><p><strong>6</strong>: SELF_DB</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ProductId")
        public Long productId;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The name of the region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The sensitive data sampling size. Valid values: <strong>0</strong>, <strong>5</strong>, and <strong>10</strong>. Unit: number of entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SamplingSize")
        public Integer samplingSize;

        /**
         * <p>The tenant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <p>The name of the tenant.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>The username of the account.</p>
         * 
         * <strong>example:</strong>
         * <p>User01</p>
         */
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
