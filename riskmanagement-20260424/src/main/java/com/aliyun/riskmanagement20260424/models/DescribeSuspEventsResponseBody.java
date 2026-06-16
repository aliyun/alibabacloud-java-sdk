// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.riskmanagement20260424.models;

import com.aliyun.tea.*;

public class DescribeSuspEventsResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DescribeSuspEventsResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DescribeSuspEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventsResponseBody self = new DescribeSuspEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeSuspEventsResponseBody setData(DescribeSuspEventsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DescribeSuspEventsResponseBodyData getData() {
        return this.data;
    }

    public DescribeSuspEventsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeSuspEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSuspEventsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeSuspEventsResponseBodyDataBodySuspEventsDetails extends TeaModel {
        @NameInMap("NameDisplay")
        public String nameDisplay;

        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        @NameInMap("ValueDisplay")
        public String valueDisplay;

        public static DescribeSuspEventsResponseBodyDataBodySuspEventsDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventsResponseBodyDataBodySuspEventsDetails self = new DescribeSuspEventsResponseBodyDataBodySuspEventsDetails();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEventsDetails setNameDisplay(String nameDisplay) {
            this.nameDisplay = nameDisplay;
            return this;
        }
        public String getNameDisplay() {
            return this.nameDisplay;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEventsDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEventsDetails setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEventsDetails setValueDisplay(String valueDisplay) {
            this.valueDisplay = valueDisplay;
            return this;
        }
        public String getValueDisplay() {
            return this.valueDisplay;
        }

    }

    public static class DescribeSuspEventsResponseBodyDataBodySuspEventsEventNotes extends TeaModel {
        @NameInMap("Note")
        public String note;

        @NameInMap("NoteId")
        public Long noteId;

        @NameInMap("NoteTime")
        public String noteTime;

        public static DescribeSuspEventsResponseBodyDataBodySuspEventsEventNotes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventsResponseBodyDataBodySuspEventsEventNotes self = new DescribeSuspEventsResponseBodyDataBodySuspEventsEventNotes();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEventsEventNotes setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEventsEventNotes setNoteId(Long noteId) {
            this.noteId = noteId;
            return this;
        }
        public Long getNoteId() {
            return this.noteId;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEventsEventNotes setNoteTime(String noteTime) {
            this.noteTime = noteTime;
            return this;
        }
        public String getNoteTime() {
            return this.noteTime;
        }

    }

    public static class DescribeSuspEventsResponseBodyDataBodySuspEventsTacticItems extends TeaModel {
        @NameInMap("TacticDisplayName")
        public String tacticDisplayName;

        @NameInMap("TacticId")
        public String tacticId;

        public static DescribeSuspEventsResponseBodyDataBodySuspEventsTacticItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventsResponseBodyDataBodySuspEventsTacticItems self = new DescribeSuspEventsResponseBodyDataBodySuspEventsTacticItems();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEventsTacticItems setTacticDisplayName(String tacticDisplayName) {
            this.tacticDisplayName = tacticDisplayName;
            return this;
        }
        public String getTacticDisplayName() {
            return this.tacticDisplayName;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEventsTacticItems setTacticId(String tacticId) {
            this.tacticId = tacticId;
            return this;
        }
        public String getTacticId() {
            return this.tacticId;
        }

    }

    public static class DescribeSuspEventsResponseBodyDataBodySuspEvents extends TeaModel {
        @NameInMap("Advanced")
        public Boolean advanced;

        @NameInMap("AlarmEventName")
        public String alarmEventName;

        @NameInMap("AlarmEventNameDisplay")
        public String alarmEventNameDisplay;

        @NameInMap("AlarmEventType")
        public String alarmEventType;

        @NameInMap("AlarmEventTypeDisplay")
        public String alarmEventTypeDisplay;

        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        @NameInMap("AppName")
        public String appName;

        @NameInMap("AutoBreaking")
        public Boolean autoBreaking;

        @NameInMap("CanBeDealOnLine")
        public Boolean canBeDealOnLine;

        @NameInMap("CanCancelFault")
        public Boolean canCancelFault;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ContainHwMode")
        public Boolean containHwMode;

        @NameInMap("ContainerId")
        public String containerId;

        @NameInMap("ContainerImageId")
        public String containerImageId;

        @NameInMap("ContainerImageName")
        public String containerImageName;

        @NameInMap("DataSource")
        public String dataSource;

        @NameInMap("Desc")
        public String desc;

        @NameInMap("Details")
        public java.util.List<DescribeSuspEventsResponseBodyDataBodySuspEventsDetails> details;

        @NameInMap("DetectSource")
        public String detectSource;

        @NameInMap("DisplaySandboxResult")
        public Boolean displaySandboxResult;

        @NameInMap("EventNotes")
        public java.util.List<DescribeSuspEventsResponseBodyDataBodySuspEventsEventNotes> eventNotes;

        @NameInMap("EventStatus")
        public Integer eventStatus;

        @NameInMap("EventSubType")
        public String eventSubType;

        @NameInMap("HasTraceInfo")
        public Boolean hasTraceInfo;

        @NameInMap("Id")
        public Long id;

        @NameInMap("ImageUuid")
        public String imageUuid;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("InternetIp")
        public String internetIp;

        @NameInMap("IntranetIp")
        public String intranetIp;

        @NameInMap("K8sClusterId")
        public String k8sClusterId;

        @NameInMap("K8sClusterName")
        public String k8sClusterName;

        @NameInMap("K8sNamespace")
        public String k8sNamespace;

        @NameInMap("K8sNodeId")
        public String k8sNodeId;

        @NameInMap("K8sNodeName")
        public String k8sNodeName;

        @NameInMap("K8sPodName")
        public String k8sPodName;

        @NameInMap("LargeModel")
        public Boolean largeModel;

        @NameInMap("LastTime")
        public String lastTime;

        @NameInMap("LastTimeStamp")
        public Long lastTimeStamp;

        @NameInMap("Level")
        public String level;

        @NameInMap("MaliciousRuleStatus")
        public String maliciousRuleStatus;

        @NameInMap("MarkList")
        public java.util.List<String> markList;

        @NameInMap("MarkMisRules")
        public String markMisRules;

        @NameInMap("Name")
        public String name;

        @NameInMap("OccurrenceTime")
        public String occurrenceTime;

        @NameInMap("OccurrenceTimeStamp")
        public Long occurrenceTimeStamp;

        @NameInMap("OperateErrorCode")
        public String operateErrorCode;

        @NameInMap("OperateMsg")
        public String operateMsg;

        @NameInMap("OperateTime")
        public Long operateTime;

        @NameInMap("SaleVersion")
        public String saleVersion;

        @NameInMap("SecurityEventIds")
        public String securityEventIds;

        @NameInMap("SourceAliUid")
        public Long sourceAliUid;

        @NameInMap("Stages")
        public String stages;

        @NameInMap("SupportOperateCode")
        public String supportOperateCode;

        @NameInMap("TacticItems")
        public java.util.List<DescribeSuspEventsResponseBodyDataBodySuspEventsTacticItems> tacticItems;

        @NameInMap("UniqueInfo")
        public String uniqueInfo;

        @NameInMap("Uuid")
        public String uuid;

        public static DescribeSuspEventsResponseBodyDataBodySuspEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventsResponseBodyDataBodySuspEvents self = new DescribeSuspEventsResponseBodyDataBodySuspEvents();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setAdvanced(Boolean advanced) {
            this.advanced = advanced;
            return this;
        }
        public Boolean getAdvanced() {
            return this.advanced;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setAlarmEventName(String alarmEventName) {
            this.alarmEventName = alarmEventName;
            return this;
        }
        public String getAlarmEventName() {
            return this.alarmEventName;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setAlarmEventNameDisplay(String alarmEventNameDisplay) {
            this.alarmEventNameDisplay = alarmEventNameDisplay;
            return this;
        }
        public String getAlarmEventNameDisplay() {
            return this.alarmEventNameDisplay;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setAlarmEventType(String alarmEventType) {
            this.alarmEventType = alarmEventType;
            return this;
        }
        public String getAlarmEventType() {
            return this.alarmEventType;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setAlarmEventTypeDisplay(String alarmEventTypeDisplay) {
            this.alarmEventTypeDisplay = alarmEventTypeDisplay;
            return this;
        }
        public String getAlarmEventTypeDisplay() {
            return this.alarmEventTypeDisplay;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setAlarmUniqueInfo(String alarmUniqueInfo) {
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setAutoBreaking(Boolean autoBreaking) {
            this.autoBreaking = autoBreaking;
            return this;
        }
        public Boolean getAutoBreaking() {
            return this.autoBreaking;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setCanBeDealOnLine(Boolean canBeDealOnLine) {
            this.canBeDealOnLine = canBeDealOnLine;
            return this;
        }
        public Boolean getCanBeDealOnLine() {
            return this.canBeDealOnLine;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setCanCancelFault(Boolean canCancelFault) {
            this.canCancelFault = canCancelFault;
            return this;
        }
        public Boolean getCanCancelFault() {
            return this.canCancelFault;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setContainHwMode(Boolean containHwMode) {
            this.containHwMode = containHwMode;
            return this;
        }
        public Boolean getContainHwMode() {
            return this.containHwMode;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setContainerImageId(String containerImageId) {
            this.containerImageId = containerImageId;
            return this;
        }
        public String getContainerImageId() {
            return this.containerImageId;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setContainerImageName(String containerImageName) {
            this.containerImageName = containerImageName;
            return this;
        }
        public String getContainerImageName() {
            return this.containerImageName;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setDetails(java.util.List<DescribeSuspEventsResponseBodyDataBodySuspEventsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<DescribeSuspEventsResponseBodyDataBodySuspEventsDetails> getDetails() {
            return this.details;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setDetectSource(String detectSource) {
            this.detectSource = detectSource;
            return this;
        }
        public String getDetectSource() {
            return this.detectSource;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setDisplaySandboxResult(Boolean displaySandboxResult) {
            this.displaySandboxResult = displaySandboxResult;
            return this;
        }
        public Boolean getDisplaySandboxResult() {
            return this.displaySandboxResult;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setEventNotes(java.util.List<DescribeSuspEventsResponseBodyDataBodySuspEventsEventNotes> eventNotes) {
            this.eventNotes = eventNotes;
            return this;
        }
        public java.util.List<DescribeSuspEventsResponseBodyDataBodySuspEventsEventNotes> getEventNotes() {
            return this.eventNotes;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setEventStatus(Integer eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }
        public Integer getEventStatus() {
            return this.eventStatus;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setEventSubType(String eventSubType) {
            this.eventSubType = eventSubType;
            return this;
        }
        public String getEventSubType() {
            return this.eventSubType;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setHasTraceInfo(Boolean hasTraceInfo) {
            this.hasTraceInfo = hasTraceInfo;
            return this;
        }
        public Boolean getHasTraceInfo() {
            return this.hasTraceInfo;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setImageUuid(String imageUuid) {
            this.imageUuid = imageUuid;
            return this;
        }
        public String getImageUuid() {
            return this.imageUuid;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setK8sClusterId(String k8sClusterId) {
            this.k8sClusterId = k8sClusterId;
            return this;
        }
        public String getK8sClusterId() {
            return this.k8sClusterId;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setK8sClusterName(String k8sClusterName) {
            this.k8sClusterName = k8sClusterName;
            return this;
        }
        public String getK8sClusterName() {
            return this.k8sClusterName;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setK8sNamespace(String k8sNamespace) {
            this.k8sNamespace = k8sNamespace;
            return this;
        }
        public String getK8sNamespace() {
            return this.k8sNamespace;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setK8sNodeId(String k8sNodeId) {
            this.k8sNodeId = k8sNodeId;
            return this;
        }
        public String getK8sNodeId() {
            return this.k8sNodeId;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setK8sNodeName(String k8sNodeName) {
            this.k8sNodeName = k8sNodeName;
            return this;
        }
        public String getK8sNodeName() {
            return this.k8sNodeName;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setK8sPodName(String k8sPodName) {
            this.k8sPodName = k8sPodName;
            return this;
        }
        public String getK8sPodName() {
            return this.k8sPodName;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setLargeModel(Boolean largeModel) {
            this.largeModel = largeModel;
            return this;
        }
        public Boolean getLargeModel() {
            return this.largeModel;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setLastTime(String lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public String getLastTime() {
            return this.lastTime;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setLastTimeStamp(Long lastTimeStamp) {
            this.lastTimeStamp = lastTimeStamp;
            return this;
        }
        public Long getLastTimeStamp() {
            return this.lastTimeStamp;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setMaliciousRuleStatus(String maliciousRuleStatus) {
            this.maliciousRuleStatus = maliciousRuleStatus;
            return this;
        }
        public String getMaliciousRuleStatus() {
            return this.maliciousRuleStatus;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setMarkList(java.util.List<String> markList) {
            this.markList = markList;
            return this;
        }
        public java.util.List<String> getMarkList() {
            return this.markList;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setMarkMisRules(String markMisRules) {
            this.markMisRules = markMisRules;
            return this;
        }
        public String getMarkMisRules() {
            return this.markMisRules;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setOccurrenceTime(String occurrenceTime) {
            this.occurrenceTime = occurrenceTime;
            return this;
        }
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setOccurrenceTimeStamp(Long occurrenceTimeStamp) {
            this.occurrenceTimeStamp = occurrenceTimeStamp;
            return this;
        }
        public Long getOccurrenceTimeStamp() {
            return this.occurrenceTimeStamp;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setOperateErrorCode(String operateErrorCode) {
            this.operateErrorCode = operateErrorCode;
            return this;
        }
        public String getOperateErrorCode() {
            return this.operateErrorCode;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setOperateMsg(String operateMsg) {
            this.operateMsg = operateMsg;
            return this;
        }
        public String getOperateMsg() {
            return this.operateMsg;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public Long getOperateTime() {
            return this.operateTime;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setSaleVersion(String saleVersion) {
            this.saleVersion = saleVersion;
            return this;
        }
        public String getSaleVersion() {
            return this.saleVersion;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setSecurityEventIds(String securityEventIds) {
            this.securityEventIds = securityEventIds;
            return this;
        }
        public String getSecurityEventIds() {
            return this.securityEventIds;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setSourceAliUid(Long sourceAliUid) {
            this.sourceAliUid = sourceAliUid;
            return this;
        }
        public Long getSourceAliUid() {
            return this.sourceAliUid;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setStages(String stages) {
            this.stages = stages;
            return this;
        }
        public String getStages() {
            return this.stages;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setSupportOperateCode(String supportOperateCode) {
            this.supportOperateCode = supportOperateCode;
            return this;
        }
        public String getSupportOperateCode() {
            return this.supportOperateCode;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setTacticItems(java.util.List<DescribeSuspEventsResponseBodyDataBodySuspEventsTacticItems> tacticItems) {
            this.tacticItems = tacticItems;
            return this;
        }
        public java.util.List<DescribeSuspEventsResponseBodyDataBodySuspEventsTacticItems> getTacticItems() {
            return this.tacticItems;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setUniqueInfo(String uniqueInfo) {
            this.uniqueInfo = uniqueInfo;
            return this;
        }
        public String getUniqueInfo() {
            return this.uniqueInfo;
        }

        public DescribeSuspEventsResponseBodyDataBodySuspEvents setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

    }

    public static class DescribeSuspEventsResponseBodyDataBody extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("CurrentPage")
        public Integer currentPage;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("RequestId")
        public String requestId;

        @NameInMap("SuspEvents")
        public java.util.List<DescribeSuspEventsResponseBodyDataBodySuspEvents> suspEvents;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static DescribeSuspEventsResponseBodyDataBody build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventsResponseBodyDataBody self = new DescribeSuspEventsResponseBodyDataBody();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventsResponseBodyDataBody setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeSuspEventsResponseBodyDataBody setCurrentPage(Integer currentPage) {
            this.currentPage = currentPage;
            return this;
        }
        public Integer getCurrentPage() {
            return this.currentPage;
        }

        public DescribeSuspEventsResponseBodyDataBody setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public DescribeSuspEventsResponseBodyDataBody setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public DescribeSuspEventsResponseBodyDataBody setSuspEvents(java.util.List<DescribeSuspEventsResponseBodyDataBodySuspEvents> suspEvents) {
            this.suspEvents = suspEvents;
            return this;
        }
        public java.util.List<DescribeSuspEventsResponseBodyDataBodySuspEvents> getSuspEvents() {
            return this.suspEvents;
        }

        public DescribeSuspEventsResponseBodyDataBody setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

    public static class DescribeSuspEventsResponseBodyData extends TeaModel {
        @NameInMap("Body")
        public DescribeSuspEventsResponseBodyDataBody body;

        public static DescribeSuspEventsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventsResponseBodyData self = new DescribeSuspEventsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventsResponseBodyData setBody(DescribeSuspEventsResponseBodyDataBody body) {
            this.body = body;
            return this;
        }
        public DescribeSuspEventsResponseBodyDataBody getBody() {
            return this.body;
        }

    }

}
