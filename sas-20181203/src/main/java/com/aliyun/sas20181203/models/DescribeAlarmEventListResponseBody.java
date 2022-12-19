// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventListResponseBody extends TeaModel {
    // The pagination information.
    @NameInMap("PageInfo")
    public DescribeAlarmEventListResponseBodyPageInfo pageInfo;

    // The ID of the request, which is used to locate and troubleshoot issues.
    @NameInMap("RequestId")
    public String requestId;

    // An array that consists of the alert events.
    @NameInMap("SuspEvents")
    public java.util.List<DescribeAlarmEventListResponseBodySuspEvents> suspEvents;

    public static DescribeAlarmEventListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAlarmEventListResponseBody self = new DescribeAlarmEventListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAlarmEventListResponseBody setPageInfo(DescribeAlarmEventListResponseBodyPageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }
    public DescribeAlarmEventListResponseBodyPageInfo getPageInfo() {
        return this.pageInfo;
    }

    public DescribeAlarmEventListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAlarmEventListResponseBody setSuspEvents(java.util.List<DescribeAlarmEventListResponseBodySuspEvents> suspEvents) {
        this.suspEvents = suspEvents;
        return this;
    }
    public java.util.List<DescribeAlarmEventListResponseBodySuspEvents> getSuspEvents() {
        return this.suspEvents;
    }

    public static class DescribeAlarmEventListResponseBodyPageInfo extends TeaModel {
        // The number of entries returned per page.
        @NameInMap("Count")
        public Integer count;

        // The page number of the returned page.
        @NameInMap("CurrentPage")
        public Integer currentPage;

        // The number of entries returned per page. Default value: **20**.
        @NameInMap("PageSize")
        public Integer pageSize;

        // The total number of entries returned.
        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeAlarmEventListResponseBodyPageInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmEventListResponseBodyPageInfo self = new DescribeAlarmEventListResponseBodyPageInfo();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmEventListResponseBodyPageInfo setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeAlarmEventListResponseBodyPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeAlarmEventListResponseBodyPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeAlarmEventListResponseBodyPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeAlarmEventListResponseBodySuspEventsTacticItems extends TeaModel {
        // The tactic name of ATT\&CK.
        @NameInMap("TacticDisplayName")
        public String tacticDisplayName;

        // The tactic ID of ATT\&CK.
        @NameInMap("TacticId")
        public String tacticId;

        public static DescribeAlarmEventListResponseBodySuspEventsTacticItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmEventListResponseBodySuspEventsTacticItems self = new DescribeAlarmEventListResponseBodySuspEventsTacticItems();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmEventListResponseBodySuspEventsTacticItems setTacticDisplayName(String tacticDisplayName) {
            this.tacticDisplayName = tacticDisplayName;
            return this;
        }
        public String getTacticDisplayName() {
            return this.tacticDisplayName;
        }

        public DescribeAlarmEventListResponseBodySuspEventsTacticItems setTacticId(String tacticId) {
            this.tacticId = tacticId;
            return this;
        }
        public String getTacticId() {
            return this.tacticId;
        }

    }

    public static class DescribeAlarmEventListResponseBodySuspEvents extends TeaModel {
        // The name of the alert event.
        @NameInMap("AlarmEventName")
        public String alarmEventName;

        // The original parent name of the alert event.
        @NameInMap("AlarmEventNameOriginal")
        public String alarmEventNameOriginal;

        // The type of the alert event.
        @NameInMap("AlarmEventType")
        public String alarmEventType;

        // The ID of the alert event.
        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        // Indicates whether the online processing of the alert event is supported, such as quarantining the source file of the malicious process, adding the alert event to the whitelist, and ignoring the alert event. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("CanBeDealOnLine")
        public Boolean canBeDealOnLine;

        // Indicates whether you can cancel marking the alert event as a false positive. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("CanCancelFault")
        public Boolean canCancelFault;

        // The data source of the alert event.
        @NameInMap("DataSource")
        public String dataSource;

        // Indicates whether the alert event is handled. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("Dealed")
        public Boolean dealed;

        // The description of the alert event.
        @NameInMap("Description")
        public String description;

        // The timestamp when the alert event was last detected. Unit: milliseconds.
        @NameInMap("EndTime")
        public Long endTime;

        // The timestamp when the alert event was last modified. Unit: milliseconds.
        @NameInMap("GmtModified")
        public Long gmtModified;

        // Indicates whether the alert event has tracing information. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("HasTraceInfo")
        public Boolean hasTraceInfo;

        // The ID of the affected asset.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the affected asset.
        @NameInMap("InstanceName")
        public String instanceName;

        // The public IP address of the affected asset.
        @NameInMap("InternetIp")
        public String internetIp;

        // The private IP address of the affected asset.
        @NameInMap("IntranetIp")
        public String intranetIp;

        // The risk level of the alert event. Valid values:
        // 
        // *   **serious**
        // *   **suspicious**
        // *   **remind**
        @NameInMap("Level")
        public String level;

        // The handling result code of the alert event.
        @NameInMap("OperateErrorCode")
        public String operateErrorCode;

        // The timestamp when the alert event was handled. Unit: milliseconds.
        @NameInMap("OperateTime")
        public Long operateTime;

        // The edition of Security Center in which the alert event can be detected. Valid values:
        // 
        // *   **0**: Basic edition
        // *   **1**: Advanced edition
        // *   **2**: Enterprise edition
        @NameInMap("SaleVersion")
        public String saleVersion;

        // The IDs of the associated exceptions.
        @NameInMap("SecurityEventIds")
        public String securityEventIds;

        // The solution to the alert event.
        @NameInMap("Solution")
        public String solution;

        // The stage at which the attack or intrusion is detected.
        @NameInMap("Stages")
        public String stages;

        // The timestamp when the alert event starts. Unit: milliseconds.
        @NameInMap("StartTime")
        public Long startTime;

        // The number of associated exceptions.
        @NameInMap("SuspiciousEventCount")
        public Integer suspiciousEventCount;

        // An array that consists of the stage information about ATT\&CK.
        @NameInMap("TacticItems")
        public java.util.List<DescribeAlarmEventListResponseBodySuspEventsTacticItems> tacticItems;

        // The ID of the associated instance.
        @NameInMap("Uuid")
        public String uuid;

        public static DescribeAlarmEventListResponseBodySuspEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeAlarmEventListResponseBodySuspEvents self = new DescribeAlarmEventListResponseBodySuspEvents();
            return TeaModel.build(map, self);
        }

        public DescribeAlarmEventListResponseBodySuspEvents setAlarmEventName(String alarmEventName) {
            this.alarmEventName = alarmEventName;
            return this;
        }
        public String getAlarmEventName() {
            return this.alarmEventName;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setAlarmEventNameOriginal(String alarmEventNameOriginal) {
            this.alarmEventNameOriginal = alarmEventNameOriginal;
            return this;
        }
        public String getAlarmEventNameOriginal() {
            return this.alarmEventNameOriginal;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setAlarmEventType(String alarmEventType) {
            this.alarmEventType = alarmEventType;
            return this;
        }
        public String getAlarmEventType() {
            return this.alarmEventType;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setAlarmUniqueInfo(String alarmUniqueInfo) {
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setCanBeDealOnLine(Boolean canBeDealOnLine) {
            this.canBeDealOnLine = canBeDealOnLine;
            return this;
        }
        public Boolean getCanBeDealOnLine() {
            return this.canBeDealOnLine;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setCanCancelFault(Boolean canCancelFault) {
            this.canCancelFault = canCancelFault;
            return this;
        }
        public Boolean getCanCancelFault() {
            return this.canCancelFault;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setDealed(Boolean dealed) {
            this.dealed = dealed;
            return this;
        }
        public Boolean getDealed() {
            return this.dealed;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setHasTraceInfo(Boolean hasTraceInfo) {
            this.hasTraceInfo = hasTraceInfo;
            return this;
        }
        public Boolean getHasTraceInfo() {
            return this.hasTraceInfo;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setOperateErrorCode(String operateErrorCode) {
            this.operateErrorCode = operateErrorCode;
            return this;
        }
        public String getOperateErrorCode() {
            return this.operateErrorCode;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public Long getOperateTime() {
            return this.operateTime;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setSaleVersion(String saleVersion) {
            this.saleVersion = saleVersion;
            return this;
        }
        public String getSaleVersion() {
            return this.saleVersion;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setSecurityEventIds(String securityEventIds) {
            this.securityEventIds = securityEventIds;
            return this;
        }
        public String getSecurityEventIds() {
            return this.securityEventIds;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setSolution(String solution) {
            this.solution = solution;
            return this;
        }
        public String getSolution() {
            return this.solution;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setStages(String stages) {
            this.stages = stages;
            return this;
        }
        public String getStages() {
            return this.stages;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setSuspiciousEventCount(Integer suspiciousEventCount) {
            this.suspiciousEventCount = suspiciousEventCount;
            return this;
        }
        public Integer getSuspiciousEventCount() {
            return this.suspiciousEventCount;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setTacticItems(java.util.List<DescribeAlarmEventListResponseBodySuspEventsTacticItems> tacticItems) {
            this.tacticItems = tacticItems;
            return this;
        }
        public java.util.List<DescribeAlarmEventListResponseBodySuspEventsTacticItems> getTacticItems() {
            return this.tacticItems;
        }

        public DescribeAlarmEventListResponseBodySuspEvents setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

}
