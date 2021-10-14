// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class DescribeDataLimitsResponseBody extends TeaModel {
    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Items")
    public java.util.List<DescribeDataLimitsResponseBodyItems> items;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("SupportEvent")
        public Boolean supportEvent;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("CheckStatus")
        public Integer checkStatus;

        @NameInMap("LocalName")
        public String localName;

        @NameInMap("TenantName")
        public String tenantName;

        @NameInMap("NextStartTime")
        public Long nextStartTime;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("CheckStatusName")
        public String checkStatusName;

        @NameInMap("SamplingSize")
        public Integer samplingSize;

        @NameInMap("ParentId")
        public String parentId;

        @NameInMap("DatamaskStatus")
        public Integer datamaskStatus;

        @NameInMap("ProcessTotalCount")
        public Integer processTotalCount;

        @NameInMap("ResourceType")
        public Long resourceType;

        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("OcrStatus")
        public Integer ocrStatus;

        @NameInMap("LogStoreDay")
        public Integer logStoreDay;

        @NameInMap("EventStatus")
        public Integer eventStatus;

        @NameInMap("SupportScan")
        public Boolean supportScan;

        @NameInMap("LastFinishedTime")
        public Long lastFinishedTime;

        @NameInMap("UserName")
        public String userName;

        @NameInMap("AuditStatus")
        public Integer auditStatus;

        @NameInMap("SupportOcr")
        public Boolean supportOcr;

        @NameInMap("EngineType")
        public String engineType;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("TotalCount")
        public Integer totalCount;

        @NameInMap("InstanceDescription")
        public String instanceDescription;

        @NameInMap("DbVersion")
        public String dbVersion;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("SupportAudit")
        public Boolean supportAudit;

        @NameInMap("AutoScan")
        public Integer autoScan;

        @NameInMap("ResourceTypeCode")
        public String resourceTypeCode;

        @NameInMap("SupportDatamask")
        public Boolean supportDatamask;

        @NameInMap("ProcessStatus")
        public Integer processStatus;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Enable")
        public Integer enable;

        public static DescribeDataLimitsResponseBodyItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeDataLimitsResponseBodyItems self = new DescribeDataLimitsResponseBodyItems();
            return TeaModel.build(map, self);
        }

        public DescribeDataLimitsResponseBodyItems setSupportEvent(Boolean supportEvent) {
            this.supportEvent = supportEvent;
            return this;
        }
        public Boolean getSupportEvent() {
            return this.supportEvent;
        }

        public DescribeDataLimitsResponseBodyItems setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public DescribeDataLimitsResponseBodyItems setCheckStatus(Integer checkStatus) {
            this.checkStatus = checkStatus;
            return this;
        }
        public Integer getCheckStatus() {
            return this.checkStatus;
        }

        public DescribeDataLimitsResponseBodyItems setLocalName(String localName) {
            this.localName = localName;
            return this;
        }
        public String getLocalName() {
            return this.localName;
        }

        public DescribeDataLimitsResponseBodyItems setTenantName(String tenantName) {
            this.tenantName = tenantName;
            return this;
        }
        public String getTenantName() {
            return this.tenantName;
        }

        public DescribeDataLimitsResponseBodyItems setNextStartTime(Long nextStartTime) {
            this.nextStartTime = nextStartTime;
            return this;
        }
        public Long getNextStartTime() {
            return this.nextStartTime;
        }

        public DescribeDataLimitsResponseBodyItems setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public DescribeDataLimitsResponseBodyItems setCheckStatusName(String checkStatusName) {
            this.checkStatusName = checkStatusName;
            return this;
        }
        public String getCheckStatusName() {
            return this.checkStatusName;
        }

        public DescribeDataLimitsResponseBodyItems setSamplingSize(Integer samplingSize) {
            this.samplingSize = samplingSize;
            return this;
        }
        public Integer getSamplingSize() {
            return this.samplingSize;
        }

        public DescribeDataLimitsResponseBodyItems setParentId(String parentId) {
            this.parentId = parentId;
            return this;
        }
        public String getParentId() {
            return this.parentId;
        }

        public DescribeDataLimitsResponseBodyItems setDatamaskStatus(Integer datamaskStatus) {
            this.datamaskStatus = datamaskStatus;
            return this;
        }
        public Integer getDatamaskStatus() {
            return this.datamaskStatus;
        }

        public DescribeDataLimitsResponseBodyItems setProcessTotalCount(Integer processTotalCount) {
            this.processTotalCount = processTotalCount;
            return this;
        }
        public Integer getProcessTotalCount() {
            return this.processTotalCount;
        }

        public DescribeDataLimitsResponseBodyItems setResourceType(Long resourceType) {
            this.resourceType = resourceType;
            return this;
        }
        public Long getResourceType() {
            return this.resourceType;
        }

        public DescribeDataLimitsResponseBodyItems setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public DescribeDataLimitsResponseBodyItems setOcrStatus(Integer ocrStatus) {
            this.ocrStatus = ocrStatus;
            return this;
        }
        public Integer getOcrStatus() {
            return this.ocrStatus;
        }

        public DescribeDataLimitsResponseBodyItems setLogStoreDay(Integer logStoreDay) {
            this.logStoreDay = logStoreDay;
            return this;
        }
        public Integer getLogStoreDay() {
            return this.logStoreDay;
        }

        public DescribeDataLimitsResponseBodyItems setEventStatus(Integer eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }
        public Integer getEventStatus() {
            return this.eventStatus;
        }

        public DescribeDataLimitsResponseBodyItems setSupportScan(Boolean supportScan) {
            this.supportScan = supportScan;
            return this;
        }
        public Boolean getSupportScan() {
            return this.supportScan;
        }

        public DescribeDataLimitsResponseBodyItems setLastFinishedTime(Long lastFinishedTime) {
            this.lastFinishedTime = lastFinishedTime;
            return this;
        }
        public Long getLastFinishedTime() {
            return this.lastFinishedTime;
        }

        public DescribeDataLimitsResponseBodyItems setUserName(String userName) {
            this.userName = userName;
            return this;
        }
        public String getUserName() {
            return this.userName;
        }

        public DescribeDataLimitsResponseBodyItems setAuditStatus(Integer auditStatus) {
            this.auditStatus = auditStatus;
            return this;
        }
        public Integer getAuditStatus() {
            return this.auditStatus;
        }

        public DescribeDataLimitsResponseBodyItems setSupportOcr(Boolean supportOcr) {
            this.supportOcr = supportOcr;
            return this;
        }
        public Boolean getSupportOcr() {
            return this.supportOcr;
        }

        public DescribeDataLimitsResponseBodyItems setEngineType(String engineType) {
            this.engineType = engineType;
            return this;
        }
        public String getEngineType() {
            return this.engineType;
        }

        public DescribeDataLimitsResponseBodyItems setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDataLimitsResponseBodyItems setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

        public DescribeDataLimitsResponseBodyItems setInstanceDescription(String instanceDescription) {
            this.instanceDescription = instanceDescription;
            return this;
        }
        public String getInstanceDescription() {
            return this.instanceDescription;
        }

        public DescribeDataLimitsResponseBodyItems setDbVersion(String dbVersion) {
            this.dbVersion = dbVersion;
            return this;
        }
        public String getDbVersion() {
            return this.dbVersion;
        }

        public DescribeDataLimitsResponseBodyItems setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public DescribeDataLimitsResponseBodyItems setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribeDataLimitsResponseBodyItems setSupportAudit(Boolean supportAudit) {
            this.supportAudit = supportAudit;
            return this;
        }
        public Boolean getSupportAudit() {
            return this.supportAudit;
        }

        public DescribeDataLimitsResponseBodyItems setAutoScan(Integer autoScan) {
            this.autoScan = autoScan;
            return this;
        }
        public Integer getAutoScan() {
            return this.autoScan;
        }

        public DescribeDataLimitsResponseBodyItems setResourceTypeCode(String resourceTypeCode) {
            this.resourceTypeCode = resourceTypeCode;
            return this;
        }
        public String getResourceTypeCode() {
            return this.resourceTypeCode;
        }

        public DescribeDataLimitsResponseBodyItems setSupportDatamask(Boolean supportDatamask) {
            this.supportDatamask = supportDatamask;
            return this;
        }
        public Boolean getSupportDatamask() {
            return this.supportDatamask;
        }

        public DescribeDataLimitsResponseBodyItems setProcessStatus(Integer processStatus) {
            this.processStatus = processStatus;
            return this;
        }
        public Integer getProcessStatus() {
            return this.processStatus;
        }

        public DescribeDataLimitsResponseBodyItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeDataLimitsResponseBodyItems setEnable(Integer enable) {
            this.enable = enable;
            return this;
        }
        public Integer getEnable() {
            return this.enable;
        }

    }

}
