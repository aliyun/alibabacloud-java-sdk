// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeInstanceSourcesResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>An array that consists of the queried data assets.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeInstanceSourcesResponseBodyItems> items;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request, which is used to locate and troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>5A7E8FB9-5011-5A90-97D9-AE587047****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
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
         * <p>Indicates whether the security audit feature is enabled. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuditStatus")
        public Integer auditStatus;

        /**
         * <p>Indicates whether the automatic scan feature is enabled to detect sensitive data. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: no</li>
         * <li><strong>1</strong>: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutoScan")
        public Integer autoScan;

        /**
         * <p>Indicates whether the username and password can be changed. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: yes</li>
         * <li><strong>false</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanModifyUserName")
        public Boolean canModifyUserName;

        /**
         * <p>The data detection status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The data detection is ready.</li>
         * <li><strong>1</strong>: The data detection is running.</li>
         * <li><strong>2</strong>: The connectivity test is in progress.</li>
         * <li><strong>3</strong>: The connectivity test passed.</li>
         * <li><strong>4</strong>: The connectivity test failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CheckStatus")
        public Integer checkStatus;

        /**
         * <p>Indicates whether DSC has the data de-identification permissions on the data asset. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DatamaskStatus")
        public Integer datamaskStatus;

        /**
         * <p>The name of the database to which the data asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("DbName")
        public String dbName;

        /**
         * <p>Indicates whether sensitive data detection is enabled for the data asset. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Enable")
        public Integer enable;

        /**
         * <p>The type of the database engine. Valid values: <strong>MySQL, MariaDB, Oracle, PostgreSQL, and SQLServer</strong>.</p>
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
         * <p>The password is invalid.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The time when the data asset was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1625587423000</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The unique ID of the data asset.</p>
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
         * <p>Test</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The ID of the instance</p>
         * 
         * <strong>example:</strong>
         * <p>rm-****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The storage space size of the instance. This parameter is valid only if the value of the ProductId parameter is 2. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>409600</p>
         */
        @NameInMap("InstanceSize")
        public Long instanceSize;

        /**
         * <p>The time when the data asset was last modified. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1625587423000</p>
         */
        @NameInMap("LastModifyTime")
        public Long lastModifyTime;

        /**
         * <p>The ID of the account that is last used to modify the data asset.</p>
         * 
         * <strong>example:</strong>
         * <p>demo</p>
         */
        @NameInMap("LastModifyUserId")
        public String lastModifyUserId;

        /**
         * <p>The retention period of raw logs. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("LogStoreDay")
        public Integer logStoreDay;

        /**
         * <p>Indicates whether the password is used. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: yes</li>
         * <li><strong>0</strong>: no</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PasswordStatus")
        public Integer passwordStatus;

        /**
         * <p>The ID of the service to which the data asset belongs. Valid values include <strong>1</strong>, <strong>2</strong>, <strong>3</strong>, <strong>4</strong>, and <strong>5</strong>. The value 1 indicates MaxCompute. The value 2 indicates OSS. The value 3 indicates AnalyticDB for MySQL. The value 4 indicates Tablestore. The value 5 indicates ApsaraDB RDS.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ProductId")
        public Long productId;

        /**
         * <p>The ID of the region where the instance resides.</p>
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
         * <p>China (Hangzhou)</p>
         */
        @NameInMap("RegionName")
        public String regionName;

        /**
         * <p>The number of sensitive data samples. Valid values: <strong>0</strong>, <strong>5</strong>, and <strong>10</strong>. Unit: data entries.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("SamplingSize")
        public Integer samplingSize;

        /**
         * <p>The ID of the tenant.</p>
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
