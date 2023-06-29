// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitsResponseBody extends TeaModel {
    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>An array that consists of the data assets.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDataLimitsResponseBodyItems> items;

    /**
     * <p>The number of entries returned per page.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeDataLimitsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDataLimitsResponseBody self = new DescribeDataLimitsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDataLimitsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeDataLimitsResponseBody setItems(java.util.List<DescribeDataLimitsResponseBodyItems> items) {
        this.items = items;
        return this;
    }
    public java.util.List<DescribeDataLimitsResponseBodyItems> getItems() {
        return this.items;
    }

    public DescribeDataLimitsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDataLimitsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDataLimitsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDataLimitsResponseBodyItems extends TeaModel {
        /**
         * <p>Indicates whether the security audit feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **1**: yes</p>
         * <p>*   **0**: no</p>
         */
        @NameInMap("AuditStatus")
        public Integer auditStatus;

        /**
         * <p>Indicates whether the data asset can be automatically scanned. Valid values:</p>
         * <br>
         * <p>*   **0**: no</p>
         * <p>*   **1**: yes</p>
         */
        @NameInMap("AutoScan")
        public Integer autoScan;

        /**
         * <p>The data detection status. Valid values:</p>
         * <br>
         * <p>*   **0**: The data detection is ready.</p>
         * <p>*   **1**: The data detection is running.</p>
         * <p>*   **2**: The connectivity test is in progress.</p>
         * <p>*   **3**: The connectivity test passed.</p>
         * <p>*   **4**: The connectivity test failed.</p>
         */
        @NameInMap("CheckStatus")
        public Integer checkStatus;

        /**
         * <p>The name of the data detection status.</p>
         */
        @NameInMap("CheckStatusName")
        public String checkStatusName;

        /**
         * <p>Indicates whether DSC has the data de-identification permissions on the data asset. Valid values:</p>
         * <br>
         * <p>*   **1**: yes</p>
         * <p>*   **0**: no</p>
         */
        @NameInMap("DatamaskStatus")
        public Integer datamaskStatus;

        /**
         * <p>The database engine version of the instance.</p>
         */
        @NameInMap("DbVersion")
        public String dbVersion;

        /**
         * <p>Indicates whether DSC has the data detection permissions on the data asset. Valid values:</p>
         * <br>
         * <p>*   **1**: yes</p>
         * <p>*   **0**: no</p>
         */
        @NameInMap("Enable")
        public Integer enable;

        /**
         * <p>The type of the database engine. Valid values include **MySQL**, **SQLServer**, **Oracle**, **PostgreSQL**, and **MongoDB**.</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>The error code that is returned.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The reason for the failure.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>Indicates whether the data leak prevention feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **0**: no</p>
         * <p>*   **1**: yes (default value)</p>
         */
        @NameInMap("EventStatus")
        public Integer eventStatus;

        /**
         * <p>The time when the data asset was created. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("GmtCreate")
        public Long gmtCreate;

        /**
         * <p>The ID of the data asset.</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The description of the instance.</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The ID of the instance to which the table belongs.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the last scan was finished.</p>
         * <br>
         * <p>*   The value is a UNIX timestamp.</p>
         * <p>*   Unit: milliseconds.</p>
         */
        @NameInMap("LastFinishedTime")
        public Long lastFinishedTime;

        /**
         * <p>The region in which the data asset resides.</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The retention period of raw logs. Unit: days.</p>
         */
        @NameInMap("LogStoreDay")
        public Integer logStoreDay;

        /**
         * <p>The next time when the data asset is scanned. The value is a UNIX timestamp. Unit: milliseconds.</p>
         */
        @NameInMap("NextStartTime")
        public Long nextStartTime;

        /**
         * <p>Indicates whether the optical character recognition (OCR) feature is enabled. Valid values:</p>
         * <br>
         * <p>*   **0**: no</p>
         * <p>*   **1**: yes</p>
         */
        @NameInMap("OcrStatus")
        public Integer ocrStatus;

        /**
         * <p>The parent ID of the data asset. Valid values include **bucket, db, and project**.</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The port number of the self-managed database.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The status of the data asset scan. Valid values:</p>
         * <br>
         * <p>*   **-1**: invalid</p>
         * <p>*   **0**: waiting</p>
         * <p>*   **1**: being scanned</p>
         * <p>*   **2**: suspended</p>
         * <p>*   **3**: completed</p>
         */
        @NameInMap("ProcessStatus")
        public Integer processStatus;

        /**
         * <p>The total number of data tables or files.</p>
         */
        @NameInMap("ProcessTotalCount")
        public Integer processTotalCount;

        /**
         * <p>The region in which the data asset resides.</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The type of the service to which the data asset belongs. Valid values:</p>
         * <br>
         * <p>*   **1**: MaxCompute</p>
         * <p>*   **2**: OSS</p>
         * <p>*   **3**: AnalyticDB for MySQL</p>
         * <p>*   **4**: Tablestore</p>
         * <p>*   **5**: ApsaraDB RDS</p>
         * <p>*   **6**: self-managed database</p>
         */
        @NameInMap("ResourceType")
        public Long resourceType;

        /**
         * <p>The code of the service to which the data asset belongs. Valid values include **MaxCompute, OSS, ADS, OTS, and RDS**.</p>
         */
        @NameInMap("ResourceTypeCode")
        public String resourceTypeCode;

        /**
         * <p>The number of sensitive data samples. Valid values: **0**, **5**, and **10**. Unit: data entries.</p>
         */
        @NameInMap("SamplingSize")
        public Integer samplingSize;

        /**
         * <p>The array consisting of the IDs of the security groups that are used by PrivateLink when you install the DSC agent.</p>
         */
        @NameInMap("SecurityGroupIdList")
        public java.util.List<String> securityGroupIdList;

        /**
         * <p>Indicates whether the security audit feature is supported. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("SupportAudit")
        public Boolean supportAudit;

        /**
         * <p>Indicates whether data de-identification is supported. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("SupportDatamask")
        public Boolean supportDatamask;

        /**
         * <p>Indicates whether anomalous event detection is supported. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("SupportEvent")
        public Boolean supportEvent;

        /**
         * <p>Indicates whether OCR is supported. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("SupportOcr")
        public Boolean supportOcr;

        /**
         * <p>Indicates whether the data asset scan feature is supported. Valid values:</p>
         * <br>
         * <p>*   **true**: yes</p>
         * <p>*   **false**: no</p>
         */
        @NameInMap("SupportScan")
        public Boolean supportScan;

        /**
         * <p>The alias of the tenant.</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>The total number of fields in the table.</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The username that is used to access the data asset.</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The array consisting of the IDs of the vSwitches that are used by PrivateLink when you install the DSC agent.</p>
         */
        @NameInMap("VSwitchIdList")
        public java.util.List<String> vSwitchIdList;

        /**
         * <p>The ID of the virtual private cloud (VPC) to which the data asset belongs.</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static DescribeDataLimitsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataLimitsResponseBodyItems self = new DescribeDataLimitsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataLimitsResponseBodyItems setAuditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public Integer getAuditStatus() {
            return this.auditStatus;
        }

        public DescribeDataLimitsResponseBodyItems setAutoScan(Integer autoScan) {
            this.autoScan = autoScan;
            return this;
        }
        public Integer getAutoScan() {
            return this.autoScan;
        }

        public DescribeDataLimitsResponseBodyItems setCheckStatus(Integer checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public Integer getCheckStatus() {
            return this.checkStatus;
        }

        public DescribeDataLimitsResponseBodyItems setCheckStatusName(String checkStatusName) {
            this.checkStatusName = checkStatusName;
            return this;
        }
        public String getCheckStatusName() {
            return this.checkStatusName;
        }

        public DescribeDataLimitsResponseBodyItems setDatamaskStatus(Integer datamaskStatus) {
            this.datamaskStatus = datamaskStatus;
            return this;
        }
        public Integer getDatamaskStatus() {
            return this.datamaskStatus;
        }

        public DescribeDataLimitsResponseBodyItems setDbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            return this;
        }
        public String getDbVersion() {
            return this.dbVersion;
        }

        public DescribeDataLimitsResponseBodyItems setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

        public DescribeDataLimitsResponseBodyItems setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public DescribeDataLimitsResponseBodyItems setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeDataLimitsResponseBodyItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDataLimitsResponseBodyItems setEventStatus(Integer eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }
        public Integer getEventStatus() {
            return this.eventStatus;
        }

        public DescribeDataLimitsResponseBodyItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDataLimitsResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDataLimitsResponseBodyItems setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public DescribeDataLimitsResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDataLimitsResponseBodyItems setLastFinishedTime(Long lastFinishedTime) {
            this.lastFinishedTime = lastFinishedTime;
            return this;
        }
        public Long getLastFinishedTime() {
            return this.lastFinishedTime;
        }

        public DescribeDataLimitsResponseBodyItems setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeDataLimitsResponseBodyItems setLogStoreDay(Integer logStoreDay) {
            this.logStoreDay = logStoreDay;
            return this;
        }
        public Integer getLogStoreDay() {
            return this.logStoreDay;
        }

        public DescribeDataLimitsResponseBodyItems setNextStartTime(Long nextStartTime) {
            this.nextStartTime = nextStartTime;
            return this;
        }
        public Long getNextStartTime() {
            return this.nextStartTime;
        }

        public DescribeDataLimitsResponseBodyItems setOcrStatus(Integer ocrStatus) {
            this.ocrStatus = ocrStatus;
            return this;
        }
        public Integer getOcrStatus() {
            return this.ocrStatus;
        }

        public DescribeDataLimitsResponseBodyItems setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeDataLimitsResponseBodyItems setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDataLimitsResponseBodyItems setProcessStatus(Integer processStatus) {
            this.processStatus = processStatus;
            return this;
        }
        public Integer getProcessStatus() {
            return this.processStatus;
        }

        public DescribeDataLimitsResponseBodyItems setProcessTotalCount(Integer processTotalCount) {
            this.processTotalCount = processTotalCount;
            return this;
        }
        public Integer getProcessTotalCount() {
            return this.processTotalCount;
        }

        public DescribeDataLimitsResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDataLimitsResponseBodyItems setResourceType(Long resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Long getResourceType() {
            return this.resourceType;
        }

        public DescribeDataLimitsResponseBodyItems setResourceTypeCode(String resourceTypeCode) {
            this.resourceTypeCode = resourceTypeCode;
            return this;
        }
        public String getResourceTypeCode() {
            return this.resourceTypeCode;
        }

        public DescribeDataLimitsResponseBodyItems setSamplingSize(Integer samplingSize) {
            this.samplingSize = samplingSize;
            return this;
        }
        public Integer getSamplingSize() {
            return this.samplingSize;
        }

        public DescribeDataLimitsResponseBodyItems setSecurityGroupIdList(java.util.List<String> securityGroupIdList) {
            this.securityGroupIdList = securityGroupIdList;
            return this;
        }
        public java.util.List<String> getSecurityGroupIdList() {
            return this.securityGroupIdList;
        }

        public DescribeDataLimitsResponseBodyItems setSupportAudit(Boolean supportAudit) {
            this.supportAudit = supportAudit;
            return this;
        }
        public Boolean getSupportAudit() {
            return this.supportAudit;
        }

        public DescribeDataLimitsResponseBodyItems setSupportDatamask(Boolean supportDatamask) {
            this.supportDatamask = supportDatamask;
            return this;
        }
        public Boolean getSupportDatamask() {
            return this.supportDatamask;
        }

        public DescribeDataLimitsResponseBodyItems setSupportEvent(Boolean supportEvent) {
            this.supportEvent = supportEvent;
            return this;
        }
        public Boolean getSupportEvent() {
            return this.supportEvent;
        }

        public DescribeDataLimitsResponseBodyItems setSupportOcr(Boolean supportOcr) {
            this.supportOcr = supportOcr;
            return this;
        }
        public Boolean getSupportOcr() {
            return this.supportOcr;
        }

        public DescribeDataLimitsResponseBodyItems setSupportScan(Boolean supportScan) {
            this.supportScan = supportScan;
            return this;
        }
        public Boolean getSupportScan() {
            return this.supportScan;
        }

        public DescribeDataLimitsResponseBodyItems setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeDataLimitsResponseBodyItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeDataLimitsResponseBodyItems setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeDataLimitsResponseBodyItems setVSwitchIdList(java.util.List<String> vSwitchIdList) {
            this.vSwitchIdList = vSwitchIdList;
            return this;
        }
        public java.util.List<String> getVSwitchIdList() {
            return this.vSwitchIdList;
        }

        public DescribeDataLimitsResponseBodyItems setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

}
