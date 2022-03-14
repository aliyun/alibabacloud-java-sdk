// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeAlarmEventListResponseBody extends TeaModel {
    @NameInMap("PageInfo")
    public DescribeAlarmEventListResponseBodyPageInfo pageInfo;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

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
        @NameInMap("TacticDisplayName")
        public String tacticDisplayName;

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
        @NameInMap("AlarmEventName")
        public String alarmEventName;

        @NameInMap("AlarmEventNameOriginal")
        public String alarmEventNameOriginal;

        @NameInMap("AlarmEventType")
        public String alarmEventType;

        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        @NameInMap("CanBeDealOnLine")
        public Boolean canBeDealOnLine;

        @NameInMap("CanCancelFault")
        public Boolean canCancelFault;

        @NameInMap("DataSource")
        public String dataSource;

        @NameInMap("Dealed")
        public Boolean dealed;

        @NameInMap("Description")
        public String description;

        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("GmtModified")
        public Long gmtModified;

        @NameInMap("HasTraceInfo")
        public Boolean hasTraceInfo;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("Level")
        public String level;

        @NameInMap("OperateErrorCode")
        public String operateErrorCode;

        @NameInMap("OperateTime")
        public Long operateTime;

        @NameInMap("SaleVersion")
        public String saleVersion;

        @NameInMap("SecurityEventIds")
        public String securityEventIds;

        @NameInMap("Solution")
        public String solution;

        @NameInMap("Stages")
        public String stages;

        @NameInMap("StartTime")
        public Long startTime;

        @NameInMap("SuspiciousEventCount")
        public Integer suspiciousEventCount;

        // 攻击阶段展示名
        @NameInMap("TacticItems")
        public java.util.List<DescribeAlarmEventListResponseBodySuspEventsTacticItems> tacticItems;

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
