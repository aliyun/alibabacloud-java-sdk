// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventsResponseBody extends TeaModel {
    // The number of entries returned on the current page.
    @NameInMap("Count")
    public Integer count;

    // The page number of the returned page.
    @NameInMap("CurrentPage")
    public Integer currentPage;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Integer pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // An array that consists of the information about the alert event.
    @NameInMap("SuspEvents")
    public java.util.List<DescribeSuspEventsResponseBodySuspEvents> suspEvents;

    // The total number of alert events.
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static DescribeSuspEventsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeSuspEventsResponseBody self = new DescribeSuspEventsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeSuspEventsResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public DescribeSuspEventsResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public DescribeSuspEventsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeSuspEventsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeSuspEventsResponseBody setSuspEvents(java.util.List<DescribeSuspEventsResponseBodySuspEvents> suspEvents) {
        this.suspEvents = suspEvents;
        return this;
    }
    public java.util.List<DescribeSuspEventsResponseBodySuspEvents> getSuspEvents() {
        return this.suspEvents;
    }

    public DescribeSuspEventsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeSuspEventsResponseBodySuspEventsDetails extends TeaModel {
        // The display name of the alert event.
        @NameInMap("NameDisplay")
        public String nameDisplay;

        // The type of the alert event.
        @NameInMap("Type")
        public String type;

        // The path of the alert event.
        @NameInMap("Value")
        public String value;

        // The display path of the alert event.
        @NameInMap("ValueDisplay")
        public String valueDisplay;

        public static DescribeSuspEventsResponseBodySuspEventsDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventsResponseBodySuspEventsDetails self = new DescribeSuspEventsResponseBodySuspEventsDetails();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventsResponseBodySuspEventsDetails setNameDisplay(String nameDisplay) {
            this.nameDisplay = nameDisplay;
            return this;
        }
        public String getNameDisplay() {
            return this.nameDisplay;
        }

        public DescribeSuspEventsResponseBodySuspEventsDetails setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeSuspEventsResponseBodySuspEventsDetails setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

        public DescribeSuspEventsResponseBodySuspEventsDetails setValueDisplay(String valueDisplay) {
            this.valueDisplay = valueDisplay;
            return this;
        }
        public String getValueDisplay() {
            return this.valueDisplay;
        }

    }

    public static class DescribeSuspEventsResponseBodySuspEventsEventNotes extends TeaModel {
        // The remarks.
        @NameInMap("Note")
        public String note;

        // The ID of the event record.
        @NameInMap("NoteId")
        public Long noteId;

        // The time when the event record was created.
        @NameInMap("NoteTime")
        public String noteTime;

        public static DescribeSuspEventsResponseBodySuspEventsEventNotes build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventsResponseBodySuspEventsEventNotes self = new DescribeSuspEventsResponseBodySuspEventsEventNotes();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventsResponseBodySuspEventsEventNotes setNote(String note) {
            this.note = note;
            return this;
        }
        public String getNote() {
            return this.note;
        }

        public DescribeSuspEventsResponseBodySuspEventsEventNotes setNoteId(Long noteId) {
            this.noteId = noteId;
            return this;
        }
        public Long getNoteId() {
            return this.noteId;
        }

        public DescribeSuspEventsResponseBodySuspEventsEventNotes setNoteTime(String noteTime) {
            this.noteTime = noteTime;
            return this;
        }
        public String getNoteTime() {
            return this.noteTime;
        }

    }

    public static class DescribeSuspEventsResponseBodySuspEventsTacticItems extends TeaModel {
        // The tactic name of ATT\&CK.
        @NameInMap("TacticDisplayName")
        public String tacticDisplayName;

        // The stage information about ATT\&CK.
        @NameInMap("TacticId")
        public String tacticId;

        public static DescribeSuspEventsResponseBodySuspEventsTacticItems build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventsResponseBodySuspEventsTacticItems self = new DescribeSuspEventsResponseBodySuspEventsTacticItems();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventsResponseBodySuspEventsTacticItems setTacticDisplayName(String tacticDisplayName) {
            this.tacticDisplayName = tacticDisplayName;
            return this;
        }
        public String getTacticDisplayName() {
            return this.tacticDisplayName;
        }

        public DescribeSuspEventsResponseBodySuspEventsTacticItems setTacticId(String tacticId) {
            this.tacticId = tacticId;
            return this;
        }
        public String getTacticId() {
            return this.tacticId;
        }

    }

    public static class DescribeSuspEventsResponseBodySuspEvents extends TeaModel {
        // Indicates whether the alert was analyzed offline.
        @NameInMap("Advanced")
        public Boolean advanced;

        // The name of the alert event.
        @NameInMap("AlarmEventName")
        public String alarmEventName;

        // The description of the alert event to which the alert event is associated.
        @NameInMap("AlarmEventNameDisplay")
        public String alarmEventNameDisplay;

        // The type of the alert event.
        @NameInMap("AlarmEventType")
        public String alarmEventType;

        // The type of the alert event.
        @NameInMap("AlarmEventTypeDisplay")
        public String alarmEventTypeDisplay;

        // The ID of the alert event.
        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        // The name of the application to which the alert event belongs.
        @NameInMap("AppName")
        public String appName;

        // Indicates whether the exception is automatically blocked.
        @NameInMap("AutoBreaking")
        public Boolean autoBreaking;

        // Indicates whether the online handling of the alert event is supported, such as quarantining the source file of the malicious process. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("CanBeDealOnLine")
        public Boolean canBeDealOnLine;

        // Indicates whether you can cancel marking the alert event as a false positive.
        @NameInMap("CanCancelFault")
        public Boolean canCancelFault;

        // Indicates whether the Safeguard Mode For Major Activities mode is enabled for the server. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("ContainHwMode")
        public Boolean containHwMode;

        // The ID of the container.
        @NameInMap("ContainerId")
        public String containerId;

        // The ID of the image to which the container belongs.
        @NameInMap("ContainerImageId")
        public String containerImageId;

        // The name of the container image.
        @NameInMap("ContainerImageName")
        public String containerImageName;

        // The source of data. This parameter can be ignored.
        @NameInMap("DataSource")
        public String dataSource;

        // The impact of the alert event.
        @NameInMap("Desc")
        public String desc;

        // The details of the alert event.
        @NameInMap("Details")
        public java.util.List<DescribeSuspEventsResponseBodySuspEventsDetails> details;

        // Indicates whether the exception can be detected by cloud sandbox. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("DisplaySandboxResult")
        public Boolean displaySandboxResult;

        // An array that consists of the remarks on the exception.
        @NameInMap("EventNotes")
        public java.util.List<DescribeSuspEventsResponseBodySuspEventsEventNotes> eventNotes;

        // The status of the alert event. Valid values:
        // 
        // *   **1**: pending handling
        // *   **2**: ignored
        // *   **4**: confirmed
        // *   **8**: marked as a false positive
        // *   **16**: being handled
        // *   **32**: handled
        // *   **64**: expired
        @NameInMap("EventStatus")
        public Integer eventStatus;

        // The name of the alert event.
        @NameInMap("EventSubType")
        public String eventSubType;

        // Indicates whether the alert event has trace information. Valid values:
        // 
        // *   **true**: yes
        // *   **false**: no
        @NameInMap("HasTraceInfo")
        public Boolean hasTraceInfo;

        // The ID of the alert event.
        @NameInMap("Id")
        public Long id;

        // The ID of the affected asset.
        @NameInMap("InstanceId")
        public String instanceId;

        // The name of the associated instance.
        @NameInMap("InstanceName")
        public String instanceName;

        // The public IP address of the associated instance.
        @NameInMap("InternetIp")
        public String internetIp;

        // The private IP address of the associated instance.
        @NameInMap("IntranetIp")
        public String intranetIp;

        // The ID of the Kubernetes cluster.
        @NameInMap("K8sClusterId")
        public String k8sClusterId;

        // The name of the Kubernetes cluster.
        @NameInMap("K8sClusterName")
        public String k8sClusterName;

        // The namespace of the Kubernetes cluster.
        @NameInMap("K8sNamespace")
        public String k8sNamespace;

        // The ID of the Kubernetes cluster node.
        @NameInMap("K8sNodeId")
        public String k8sNodeId;

        // The name of the Kubernetes cluster node.
        @NameInMap("K8sNodeName")
        public String k8sNodeName;

        // The name of the Kubernetes pod.
        @NameInMap("K8sPodName")
        public String k8sPodName;

        // The time when the alert event was last generated.
        @NameInMap("LastTime")
        public String lastTime;

        // The timestamp when the exception was last detected. Unit: milliseconds.
        @NameInMap("LastTimeStamp")
        public Long lastTimeStamp;

        // The severity of the alert event. Valid values:
        // 
        // *   **serious**
        // *   **suspicious**
        // *   **remind**
        @NameInMap("Level")
        public String level;

        // The status of the malicious behavior defense rule. Valid values:
        // 
        // *   **open**: enabled
        // *   **close**: disabled
        @NameInMap("MaliciousRuleStatus")
        public String maliciousRuleStatus;

        // The advanced whitelist rule.
        @NameInMap("MarkMisRules")
        public String markMisRules;

        // The complete name of the alert event.
        @NameInMap("Name")
        public String name;

        // The time when the alert event was first detected.
        @NameInMap("OccurrenceTime")
        public String occurrenceTime;

        // The timestamp when the exception was first detected. Unit: milliseconds.
        @NameInMap("OccurrenceTimeStamp")
        public Long occurrenceTimeStamp;

        // The handling result code of the alert event.
        @NameInMap("OperateErrorCode")
        public String operateErrorCode;

        // The description of the handing result of the alert event.
        @NameInMap("OperateMsg")
        public String operateMsg;

        // The handling timestamp of the alert event. Unit: milliseconds.
        @NameInMap("OperateTime")
        public Long operateTime;

        // The edition of Security Center in which the exception can be detected. Valid values:
        // 
        // *   **0**: Basic edition
        // *   **1**: Enterprise edition
        @NameInMap("SaleVersion")
        public String saleVersion;

        // The IDs of the associated alert events.
        @NameInMap("SecurityEventIds")
        public String securityEventIds;

        // The stage at which the attack is detected.
        @NameInMap("Stages")
        public String stages;

        // The display name of the attack stage.
        @NameInMap("TacticItems")
        public java.util.List<DescribeSuspEventsResponseBodySuspEventsTacticItems> tacticItems;

        // The unique key of the alert.
        @NameInMap("UniqueInfo")
        public String uniqueInfo;

        // The ID of the associated instance.
        @NameInMap("Uuid")
        public String uuid;

        // The ID of the cluster.
        @NameInMap("clusterId")
        public String clusterId;

        public static DescribeSuspEventsResponseBodySuspEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeSuspEventsResponseBodySuspEvents self = new DescribeSuspEventsResponseBodySuspEvents();
            return TeaModel.build(map, self);
        }

        public DescribeSuspEventsResponseBodySuspEvents setAdvanced(Boolean advanced) {
            this.advanced = advanced;
            return this;
        }
        public Boolean getAdvanced() {
            return this.advanced;
        }

        public DescribeSuspEventsResponseBodySuspEvents setAlarmEventName(String alarmEventName) {
            this.alarmEventName = alarmEventName;
            return this;
        }
        public String getAlarmEventName() {
            return this.alarmEventName;
        }

        public DescribeSuspEventsResponseBodySuspEvents setAlarmEventNameDisplay(String alarmEventNameDisplay) {
            this.alarmEventNameDisplay = alarmEventNameDisplay;
            return this;
        }
        public String getAlarmEventNameDisplay() {
            return this.alarmEventNameDisplay;
        }

        public DescribeSuspEventsResponseBodySuspEvents setAlarmEventType(String alarmEventType) {
            this.alarmEventType = alarmEventType;
            return this;
        }
        public String getAlarmEventType() {
            return this.alarmEventType;
        }

        public DescribeSuspEventsResponseBodySuspEvents setAlarmEventTypeDisplay(String alarmEventTypeDisplay) {
            this.alarmEventTypeDisplay = alarmEventTypeDisplay;
            return this;
        }
        public String getAlarmEventTypeDisplay() {
            return this.alarmEventTypeDisplay;
        }

        public DescribeSuspEventsResponseBodySuspEvents setAlarmUniqueInfo(String alarmUniqueInfo) {
            this.alarmUniqueInfo = alarmUniqueInfo;
            return this;
        }
        public String getAlarmUniqueInfo() {
            return this.alarmUniqueInfo;
        }

        public DescribeSuspEventsResponseBodySuspEvents setAppName(String appName) {
            this.appName = appName;
            return this;
        }
        public String getAppName() {
            return this.appName;
        }

        public DescribeSuspEventsResponseBodySuspEvents setAutoBreaking(Boolean autoBreaking) {
            this.autoBreaking = autoBreaking;
            return this;
        }
        public Boolean getAutoBreaking() {
            return this.autoBreaking;
        }

        public DescribeSuspEventsResponseBodySuspEvents setCanBeDealOnLine(Boolean canBeDealOnLine) {
            this.canBeDealOnLine = canBeDealOnLine;
            return this;
        }
        public Boolean getCanBeDealOnLine() {
            return this.canBeDealOnLine;
        }

        public DescribeSuspEventsResponseBodySuspEvents setCanCancelFault(Boolean canCancelFault) {
            this.canCancelFault = canCancelFault;
            return this;
        }
        public Boolean getCanCancelFault() {
            return this.canCancelFault;
        }

        public DescribeSuspEventsResponseBodySuspEvents setContainHwMode(Boolean containHwMode) {
            this.containHwMode = containHwMode;
            return this;
        }
        public Boolean getContainHwMode() {
            return this.containHwMode;
        }

        public DescribeSuspEventsResponseBodySuspEvents setContainerId(String containerId) {
            this.containerId = containerId;
            return this;
        }
        public String getContainerId() {
            return this.containerId;
        }

        public DescribeSuspEventsResponseBodySuspEvents setContainerImageId(String containerImageId) {
            this.containerImageId = containerImageId;
            return this;
        }
        public String getContainerImageId() {
            return this.containerImageId;
        }

        public DescribeSuspEventsResponseBodySuspEvents setContainerImageName(String containerImageName) {
            this.containerImageName = containerImageName;
            return this;
        }
        public String getContainerImageName() {
            return this.containerImageName;
        }

        public DescribeSuspEventsResponseBodySuspEvents setDataSource(String dataSource) {
            this.dataSource = dataSource;
            return this;
        }
        public String getDataSource() {
            return this.dataSource;
        }

        public DescribeSuspEventsResponseBodySuspEvents setDesc(String desc) {
            this.desc = desc;
            return this;
        }
        public String getDesc() {
            return this.desc;
        }

        public DescribeSuspEventsResponseBodySuspEvents setDetails(java.util.List<DescribeSuspEventsResponseBodySuspEventsDetails> details) {
            this.details = details;
            return this;
        }
        public java.util.List<DescribeSuspEventsResponseBodySuspEventsDetails> getDetails() {
            return this.details;
        }

        public DescribeSuspEventsResponseBodySuspEvents setDisplaySandboxResult(Boolean displaySandboxResult) {
            this.displaySandboxResult = displaySandboxResult;
            return this;
        }
        public Boolean getDisplaySandboxResult() {
            return this.displaySandboxResult;
        }

        public DescribeSuspEventsResponseBodySuspEvents setEventNotes(java.util.List<DescribeSuspEventsResponseBodySuspEventsEventNotes> eventNotes) {
            this.eventNotes = eventNotes;
            return this;
        }
        public java.util.List<DescribeSuspEventsResponseBodySuspEventsEventNotes> getEventNotes() {
            return this.eventNotes;
        }

        public DescribeSuspEventsResponseBodySuspEvents setEventStatus(Integer eventStatus) {
            this.eventStatus = eventStatus;
            return this;
        }
        public Integer getEventStatus() {
            return this.eventStatus;
        }

        public DescribeSuspEventsResponseBodySuspEvents setEventSubType(String eventSubType) {
            this.eventSubType = eventSubType;
            return this;
        }
        public String getEventSubType() {
            return this.eventSubType;
        }

        public DescribeSuspEventsResponseBodySuspEvents setHasTraceInfo(Boolean hasTraceInfo) {
            this.hasTraceInfo = hasTraceInfo;
            return this;
        }
        public Boolean getHasTraceInfo() {
            return this.hasTraceInfo;
        }

        public DescribeSuspEventsResponseBodySuspEvents setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public DescribeSuspEventsResponseBodySuspEvents setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeSuspEventsResponseBodySuspEvents setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeSuspEventsResponseBodySuspEvents setInternetIp(String internetIp) {
            this.internetIp = internetIp;
            return this;
        }
        public String getInternetIp() {
            return this.internetIp;
        }

        public DescribeSuspEventsResponseBodySuspEvents setIntranetIp(String intranetIp) {
            this.intranetIp = intranetIp;
            return this;
        }
        public String getIntranetIp() {
            return this.intranetIp;
        }

        public DescribeSuspEventsResponseBodySuspEvents setK8sClusterId(String k8sClusterId) {
            this.k8sClusterId = k8sClusterId;
            return this;
        }
        public String getK8sClusterId() {
            return this.k8sClusterId;
        }

        public DescribeSuspEventsResponseBodySuspEvents setK8sClusterName(String k8sClusterName) {
            this.k8sClusterName = k8sClusterName;
            return this;
        }
        public String getK8sClusterName() {
            return this.k8sClusterName;
        }

        public DescribeSuspEventsResponseBodySuspEvents setK8sNamespace(String k8sNamespace) {
            this.k8sNamespace = k8sNamespace;
            return this;
        }
        public String getK8sNamespace() {
            return this.k8sNamespace;
        }

        public DescribeSuspEventsResponseBodySuspEvents setK8sNodeId(String k8sNodeId) {
            this.k8sNodeId = k8sNodeId;
            return this;
        }
        public String getK8sNodeId() {
            return this.k8sNodeId;
        }

        public DescribeSuspEventsResponseBodySuspEvents setK8sNodeName(String k8sNodeName) {
            this.k8sNodeName = k8sNodeName;
            return this;
        }
        public String getK8sNodeName() {
            return this.k8sNodeName;
        }

        public DescribeSuspEventsResponseBodySuspEvents setK8sPodName(String k8sPodName) {
            this.k8sPodName = k8sPodName;
            return this;
        }
        public String getK8sPodName() {
            return this.k8sPodName;
        }

        public DescribeSuspEventsResponseBodySuspEvents setLastTime(String lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public String getLastTime() {
            return this.lastTime;
        }

        public DescribeSuspEventsResponseBodySuspEvents setLastTimeStamp(Long lastTimeStamp) {
            this.lastTimeStamp = lastTimeStamp;
            return this;
        }
        public Long getLastTimeStamp() {
            return this.lastTimeStamp;
        }

        public DescribeSuspEventsResponseBodySuspEvents setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeSuspEventsResponseBodySuspEvents setMaliciousRuleStatus(String maliciousRuleStatus) {
            this.maliciousRuleStatus = maliciousRuleStatus;
            return this;
        }
        public String getMaliciousRuleStatus() {
            return this.maliciousRuleStatus;
        }

        public DescribeSuspEventsResponseBodySuspEvents setMarkMisRules(String markMisRules) {
            this.markMisRules = markMisRules;
            return this;
        }
        public String getMarkMisRules() {
            return this.markMisRules;
        }

        public DescribeSuspEventsResponseBodySuspEvents setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeSuspEventsResponseBodySuspEvents setOccurrenceTime(String occurrenceTime) {
            this.occurrenceTime = occurrenceTime;
            return this;
        }
        public String getOccurrenceTime() {
            return this.occurrenceTime;
        }

        public DescribeSuspEventsResponseBodySuspEvents setOccurrenceTimeStamp(Long occurrenceTimeStamp) {
            this.occurrenceTimeStamp = occurrenceTimeStamp;
            return this;
        }
        public Long getOccurrenceTimeStamp() {
            return this.occurrenceTimeStamp;
        }

        public DescribeSuspEventsResponseBodySuspEvents setOperateErrorCode(String operateErrorCode) {
            this.operateErrorCode = operateErrorCode;
            return this;
        }
        public String getOperateErrorCode() {
            return this.operateErrorCode;
        }

        public DescribeSuspEventsResponseBodySuspEvents setOperateMsg(String operateMsg) {
            this.operateMsg = operateMsg;
            return this;
        }
        public String getOperateMsg() {
            return this.operateMsg;
        }

        public DescribeSuspEventsResponseBodySuspEvents setOperateTime(Long operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public Long getOperateTime() {
            return this.operateTime;
        }

        public DescribeSuspEventsResponseBodySuspEvents setSaleVersion(String saleVersion) {
            this.saleVersion = saleVersion;
            return this;
        }
        public String getSaleVersion() {
            return this.saleVersion;
        }

        public DescribeSuspEventsResponseBodySuspEvents setSecurityEventIds(String securityEventIds) {
            this.securityEventIds = securityEventIds;
            return this;
        }
        public String getSecurityEventIds() {
            return this.securityEventIds;
        }

        public DescribeSuspEventsResponseBodySuspEvents setStages(String stages) {
            this.stages = stages;
            return this;
        }
        public String getStages() {
            return this.stages;
        }

        public DescribeSuspEventsResponseBodySuspEvents setTacticItems(java.util.List<DescribeSuspEventsResponseBodySuspEventsTacticItems> tacticItems) {
            this.tacticItems = tacticItems;
            return this;
        }
        public java.util.List<DescribeSuspEventsResponseBodySuspEventsTacticItems> getTacticItems() {
            return this.tacticItems;
        }

        public DescribeSuspEventsResponseBodySuspEvents setUniqueInfo(String uniqueInfo) {
            this.uniqueInfo = uniqueInfo;
            return this;
        }
        public String getUniqueInfo() {
            return this.uniqueInfo;
        }

        public DescribeSuspEventsResponseBodySuspEvents setUuid(String uuid) {
            this.uuid = uuid;
            return this;
        }
        public String getUuid() {
            return this.uuid;
        }

        public DescribeSuspEventsResponseBodySuspEvents setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

    }

}
