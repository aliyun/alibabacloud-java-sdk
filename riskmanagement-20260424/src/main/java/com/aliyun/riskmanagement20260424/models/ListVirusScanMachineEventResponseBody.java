// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class ListVirusScanMachineEventResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListVirusScanMachineEventResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListVirusScanMachineEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListVirusScanMachineEventResponseBody self = new ListVirusScanMachineEventResponseBody();
        return TeaModel.build(map, self);
    }

    public ListVirusScanMachineEventResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListVirusScanMachineEventResponseBody setData(ListVirusScanMachineEventResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListVirusScanMachineEventResponseBodyData getData() {
        return this.data;
    }

    public ListVirusScanMachineEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListVirusScanMachineEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListVirusScanMachineEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic extends TeaModel {
        @NameInMap("CompleteMachine")
        public Integer completeMachine;

        @NameInMap("MachineName")
        public String machineName;

        @NameInMap("Progress")
        public String progress;

        @NameInMap("RiskLevel")
        public String riskLevel;

        @NameInMap("SafeMachine")
        public Integer safeMachine;

        @NameInMap("ScanMachine")
        public Integer scanMachine;

        @NameInMap("ScanPath")
        public java.util.List<String> scanPath;

        @NameInMap("ScanTime")
        public Long scanTime;

        @NameInMap("ScanType")
        public String scanType;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SuspiciousCount")
        public Integer suspiciousCount;

        @NameInMap("SuspiciousMachine")
        public Integer suspiciousMachine;

        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("UnCompleteMachine")
        public Integer unCompleteMachine;

        public static ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic self = new ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic();
            return TeaModel.build(map, self);
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic setCompleteMachine(Integer completeMachine) {
            this.completeMachine = completeMachine;
            return this;
        }
        public Integer getCompleteMachine() {
            return this.completeMachine;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic setMachineName(String machineName) {
            this.machineName = machineName;
            return this;
        }
        public String getMachineName() {
            return this.machineName;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic setProgress(String progress) {
            this.progress = progress;
            return this;
        }
        public String getProgress() {
            return this.progress;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic setRiskLevel(String riskLevel) {
            this.riskLevel = riskLevel;
            return this;
        }
        public String getRiskLevel() {
            return this.riskLevel;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic setSafeMachine(Integer safeMachine) {
            this.safeMachine = safeMachine;
            return this;
        }
        public Integer getSafeMachine() {
            return this.safeMachine;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic setScanMachine(Integer scanMachine) {
            this.scanMachine = scanMachine;
            return this;
        }
        public Integer getScanMachine() {
            return this.scanMachine;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic setScanPath(java.util.List<String> scanPath) {
            this.scanPath = scanPath;
            return this;
        }
        public java.util.List<String> getScanPath() {
            return this.scanPath;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic setScanTime(Long scanTime) {
            this.scanTime = scanTime;
            return this;
        }
        public Long getScanTime() {
            return this.scanTime;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic setScanType(String scanType) {
            this.scanType = scanType;
            return this;
        }
        public String getScanType() {
            return this.scanType;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic setSuspiciousCount(Integer suspiciousCount) {
            this.suspiciousCount = suspiciousCount;
            return this;
        }
        public Integer getSuspiciousCount() {
            return this.suspiciousCount;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic setSuspiciousMachine(Integer suspiciousMachine) {
            this.suspiciousMachine = suspiciousMachine;
            return this;
        }
        public Integer getSuspiciousMachine() {
            return this.suspiciousMachine;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic setUnCompleteMachine(Integer unCompleteMachine) {
            this.unCompleteMachine = unCompleteMachine;
            return this;
        }
        public Integer getUnCompleteMachine() {
            return this.unCompleteMachine;
        }

    }

    public static class ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListDataDetails extends TeaModel {
        @NameInMap("InfoType")
        public String infoType;

        @NameInMap("NameDisplay")
        public String nameDisplay;

        @NameInMap("Type")
        public String type;

        @NameInMap("ValueDisplay")
        public String valueDisplay;

        public static ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListDataDetails build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListDataDetails self = new ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListDataDetails();
            return TeaModel.build(map, self);
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListDataDetails setInfoType(String infoType) {
            this.infoType = infoType;
            return this;
        }
        public String getInfoType() {
            return this.infoType;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListDataDetails setNameDisplay(String nameDisplay) {
            this.nameDisplay = nameDisplay;
            return this;
        }
        public String getNameDisplay() {
            return this.nameDisplay;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListDataDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListDataDetails setValueDisplay(String valueDisplay) {
            this.valueDisplay = valueDisplay;
            return this;
        }
        public String getValueDisplay() {
            return this.valueDisplay;
        }

    }

    public static class ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListData extends TeaModel {
        @NameInMap("Details")
        public java.util.List<ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListDataDetails> details;

        @NameInMap("EventId")
        public Long eventId;

        @NameInMap("EventName")
        public String eventName;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("LastTimeStamp")
        public Long lastTimeStamp;

        @NameInMap("Level")
        public String level;

        public static ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListData build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListData self = new ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListData();
            return TeaModel.build(map, self);
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListData setDetails(java.util.List<ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListDataDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListDataDetails> getDetails() {
            return this.details;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListData setEventId(Long eventId) {
            this.eventId = eventId;
            return this;
        }
        public Long getEventId() {
            return this.eventId;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListData setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListData setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListData setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListData setLastTimeStamp(Long lastTimeStamp) {
            this.lastTimeStamp = lastTimeStamp;
            return this;
        }
        public Long getLastTimeStamp() {
            return this.lastTimeStamp;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListData setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListPageInfo extends TeaModel {
        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListPageInfo build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListPageInfo self = new ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListPageInfo();
            return TeaModel.build(map, self);
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListPageInfo setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListPageInfo setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListPageInfo setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventList extends TeaModel {
        @NameInMap("Data")
        public java.util.List<ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListData> data;

        @NameInMap("PageInfo")
        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListPageInfo pageInfo;

        public static ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventList build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventList self = new ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventList();
            return TeaModel.build(map, self);
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventList setData(java.util.List<ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListData> getData() {
            return this.data;
        }

        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventList setPageInfo(ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListPageInfo pageInfo) {
            this.pageInfo = pageInfo;
            return this;
        }
        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventListPageInfo getPageInfo() {
            return this.pageInfo;
        }

    }

    public static class ListVirusScanMachineEventResponseBodyData extends TeaModel {
        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("VirusScanLatestTaskStatistic")
        public ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic virusScanLatestTaskStatistic;

        @NameInMap("VirusScanMachineEventList")
        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventList virusScanMachineEventList;

        public static ListVirusScanMachineEventResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListVirusScanMachineEventResponseBodyData self = new ListVirusScanMachineEventResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListVirusScanMachineEventResponseBodyData setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListVirusScanMachineEventResponseBodyData setVirusScanLatestTaskStatistic(ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic virusScanLatestTaskStatistic) {
            this.virusScanLatestTaskStatistic = virusScanLatestTaskStatistic;
            return this;
        }
        public ListVirusScanMachineEventResponseBodyDataVirusScanLatestTaskStatistic getVirusScanLatestTaskStatistic() {
            return this.virusScanLatestTaskStatistic;
        }

        public ListVirusScanMachineEventResponseBodyData setVirusScanMachineEventList(ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventList virusScanMachineEventList) {
            this.virusScanMachineEventList = virusScanMachineEventList;
            return this;
        }
        public ListVirusScanMachineEventResponseBodyDataVirusScanMachineEventList getVirusScanMachineEventList() {
            return this.virusScanMachineEventList;
        }

    }

}
