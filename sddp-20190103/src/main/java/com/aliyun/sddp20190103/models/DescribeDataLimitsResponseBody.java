// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitsResponseBody extends TeaModel {
    /**
     * <p>The page number of the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The list of data assets.</p>
     */
    @NameInMap("Items")
    public java.util.List<DescribeDataLimitsResponseBodyItems> items;

    /**
     * <p>The maximum number of entries returned per page.</p>
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
     * <p>769FB3C1-F4C9-42DF-9B72-7077A8989***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
         * <p>The audit status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: audit enabled.</li>
         * <li><strong>0</strong>: audit disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AuditStatus")
        public Integer auditStatus;

        /**
         * <p>Indicates whether automatic scanning is enabled. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled.</li>
         * <li><strong>1</strong>: enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("AutoScan")
        public Integer autoScan;

        /**
         * <p>The data detection status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: ready.</li>
         * <li><strong>1</strong>: running.</li>
         * <li><strong>2</strong>: connectivity test in progress.</li>
         * <li><strong>3</strong>: connectivity test passed.</li>
         * <li><strong>4</strong>: connectivity test failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("CheckStatus")
        public Integer checkStatus;

        /**
         * <p>The name of the data detection status.</p>
         * 
         * <strong>example:</strong>
         * <p>Connectivity detection status</p>
         */
        @NameInMap("CheckStatusName")
        public String checkStatusName;

        /**
         * <p>The data masking permission status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled.</li>
         * <li><strong>0</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DatamaskStatus")
        public Integer datamaskStatus;

        /**
         * <p>The database version.</p>
         * 
         * <strong>example:</strong>
         * <p>2.0</p>
         */
        @NameInMap("DbVersion")
        public String dbVersion;

        /**
         * <p>The detection permission status. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: enabled.</li>
         * <li><strong>0</strong>: disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Enable")
        public Integer enable;

        /**
         * <p>The database type. Valid values: <strong>MySQL</strong>, <strong>SQLServer</strong>, <strong>Oracle</strong>, <strong>PostgreSQL</strong>, <strong>MongoDB</strong>, and others.</p>
         * 
         * <strong>example:</strong>
         * <p>MySQL</p>
         */
        @NameInMap("EngineType")
        public String engineType;

        /**
         * <p>The error code.</p>
         * 
         * <strong>example:</strong>
         * <p>connect_network_error</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The failure reason.</p>
         * 
         * <strong>example:</strong>
         * <p>Incorrect password.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The data leak prevention switch. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled.</li>
         * <li><strong>1</strong>: enabled (default).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EventStatus")
        public Integer eventStatus;

        /**
         * <p>The creation time. Format: timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>145600000</p>
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
         * <p>123</p>
         */
        @NameInMap("InstanceDescription")
        public String instanceDescription;

        /**
         * <p>The instance ID of the asset to which the data asset table belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>12332</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The time when the last full scan was completed.</p>
         * <ul>
         * <li>Format: timestamp</li>
         * <li>Unit: milliseconds</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>145600000</p>
         */
        @NameInMap("LastFinishedTime")
        public Long lastFinishedTime;

        /**
         * <p>The time when the last scan of the data asset started. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>145600000</p>
         */
        @NameInMap("LastStartTime")
        public Long lastStartTime;

        /**
         * <p>The name of the region where the data resides.</p>
         * 
         * <strong>example:</strong>
         * <p>China (Hangzhou)</p>
         */
        @NameInMap("LocalName")
        public String localName;

        /**
         * <p>The raw log storage duration. Unit: days.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("LogStoreDay")
        public Integer logStoreDay;

        /**
         * <p>The member accounts ID.</p>
         * 
         * <strong>example:</strong>
         * <p>**********8103</p>
         */
        @NameInMap("MemberAccount")
        public Long memberAccount;

        /**
         * <p>The next execution time. Format: timestamp. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1676620236000</p>
         */
        @NameInMap("NextStartTime")
        public Long nextStartTime;

        /**
         * <p>The OCR status. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: disabled.</li>
         * <li><strong>1</strong>: enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OcrStatus")
        public Integer ocrStatus;

        /**
         * <p>The parent ID of the asset to query. Valid values: <strong>bucket</strong>, <strong>db</strong>, <strong>project</strong>, and others.</p>
         * 
         * <strong>example:</strong>
         * <p>project</p>
         */
        @NameInMap("ParentId")
        public String parentId;

        /**
         * <p>The port number of the self-managed database.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The scan status. Valid values:</p>
         * <ul>
         * <li><strong>-1</strong>: invalid.</li>
         * <li><strong>0</strong>: waiting.</li>
         * <li><strong>1</strong>: scanning.</li>
         * <li><strong>2</strong>: paused.</li>
         * <li><strong>3</strong>: completed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("ProcessStatus")
        public Integer processStatus;

        /**
         * <p>The total number of tables or files.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("ProcessTotalCount")
        public Integer processTotalCount;

        /**
         * <p>The region where the asset resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The type of the product to which the data asset belongs. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: MaxCompute</li>
         * <li><strong>2</strong>: OSS</li>
         * <li><strong>3</strong>: ADS</li>
         * <li><strong>4</strong>: OTS</li>
         * <li><strong>5</strong>: RDS</li>
         * <li><strong>6</strong>: SELF_DB</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("ResourceType")
        public Long resourceType;

        /**
         * <p>The product type code of the data source. Valid values: <strong>MaxCompute</strong>, <strong>OSS</strong>, <strong>ADS</strong>, <strong>OTS</strong>, <strong>RDS</strong>, and others.</p>
         * 
         * <strong>example:</strong>
         * <p>RDS</p>
         */
        @NameInMap("ResourceTypeCode")
        public String resourceTypeCode;

        /**
         * <p>The sensitive data sampling size. Valid values: <strong>0</strong>, <strong>5</strong>, and <strong>10</strong>. Unit: entries.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("SamplingSize")
        public Integer samplingSize;

        /**
         * <p>The list of security group IDs used by PrivateLink in agent-based auditing.</p>
         */
        @NameInMap("SecurityGroupIdList")
        public java.util.List<String> securityGroupIdList;

        /**
         * <p>Indicates whether auditing is supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Supported.</li>
         * <li><strong>false</strong>: Not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportAudit")
        public Boolean supportAudit;

        /**
         * <p>Indicates whether data masking is supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Supported.</li>
         * <li><strong>false</strong>: Not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportDatamask")
        public Boolean supportDatamask;

        /**
         * <p>Indicates whether anomalous activity detection is supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Supported.</li>
         * <li><strong>false</strong>: Not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportEvent")
        public Boolean supportEvent;

        /**
         * <p>Indicates whether OCR is supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Supported.</li>
         * <li><strong>false</strong>: Not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportOcr")
        public Boolean supportOcr;

        /**
         * <p>Indicates whether scanning is supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Supported.</li>
         * <li><strong>false</strong>: Not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportScan")
        public Boolean supportScan;

        /**
         * <p>The tenant alias.</p>
         * 
         * <strong>example:</strong>
         * <p>insta_gram</p>
         */
        @NameInMap("TenantName")
        public String tenantName;

        /**
         * <p>The total number of fields in the data asset table.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TotalCount")
        public Integer totalCount;

        /**
         * <p>The username of the data owner.</p>
         * 
         * <strong>example:</strong>
         * <p>tsts</p>
         */
        @NameInMap("UserName")
        public String userName;

        /**
         * <p>The list of vSwitch IDs used by PrivateLink in agent-based auditing.</p>
         */
        @NameInMap("VSwitchIdList")
        public java.util.List<String> vSwitchIdList;

        /**
         * <p>The VPC ID to which the data asset belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-2zevcqke6hh09c41****</p>
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

        public DescribeDataLimitsResponseBodyItems setLastStartTime(Long lastStartTime) {
            this.lastStartTime = lastStartTime;
            return this;
        }
        public Long getLastStartTime() {
            return this.lastStartTime;
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

        public DescribeDataLimitsResponseBodyItems setMemberAccount(Long memberAccount) {
            this.memberAccount = memberAccount;
            return this;
        }
        public Long getMemberAccount() {
            return this.memberAccount;
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
