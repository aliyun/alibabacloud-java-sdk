// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeSuspEventsResponseBody extends TeaModel {
    /**
     * <p>The number of entries returned on the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Count")
    public Integer count;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0D6E20E4-8326-1D03-A553-2182BE9E82F9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the alert events.</p>
     */
    @NameInMap("SuspEvents")
    public java.util.List<DescribeSuspEventsResponseBodySuspEvents> suspEvents;

    /**
     * <p>The total number of alert events.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
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
        /**
         * <p>The display name of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>Login with unusual location</p>
         */
        @NameInMap("NameDisplay")
        public String nameDisplay;

        /**
         * <p>The type of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>text</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The path of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>/etc/crontab</p>
         */
        @NameInMap("Value")
        public String value;

        /**
         * <p>The display name of the path of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>/etc/crontab</p>
         */
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
        /**
         * <p>The note.</p>
         * 
         * <strong>example:</strong>
         * <p>Test</p>
         */
        @NameInMap("Note")
        public String note;

        /**
         * <p>The ID of the note.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("NoteId")
        public Long noteId;

        /**
         * <p>The time when the note was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-26 01:51:01</p>
         */
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
        /**
         * <p>The tactic name of ATT\&amp;CK.</p>
         * 
         * <strong>example:</strong>
         * <p>Malicious scripts-Malicious script code execution</p>
         */
        @NameInMap("TacticDisplayName")
        public String tacticDisplayName;

        /**
         * <p>The stage information about ATT\&amp;CK.</p>
         * 
         * <strong>example:</strong>
         * <p>TA0001</p>
         */
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
        /**
         * <p>Indicates whether the alert event was analyzed offline.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Advanced")
        public Boolean advanced;

        /**
         * <p>The name of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>login_common_location</p>
         */
        @NameInMap("AlarmEventName")
        public String alarmEventName;

        /**
         * <p>The name of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>Login with unusual location</p>
         */
        @NameInMap("AlarmEventNameDisplay")
        public String alarmEventNameDisplay;

        /**
         * <p>The type of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>Unusual Logon</p>
         */
        @NameInMap("AlarmEventType")
        public String alarmEventType;

        /**
         * <p>The display name of the type of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>Unusual Logon</p>
         */
        @NameInMap("AlarmEventTypeDisplay")
        public String alarmEventTypeDisplay;

        /**
         * <p>The unique ID of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>8df914418f****</p>
         */
        @NameInMap("AlarmUniqueInfo")
        public String alarmUniqueInfo;

        /**
         * <p>The name of the application to which the alert event belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>pro-deploy-tibasic</p>
         */
        @NameInMap("AppName")
        public String appName;

        /**
         * <p>Indicates whether automatic defense is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoBreaking")
        public Boolean autoBreaking;

        /**
         * <p>Indicates whether you can handle the alert event online, such as quarantining the source file of the malicious process. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CanBeDealOnLine")
        public Boolean canBeDealOnLine;

        /**
         * <p>Indicates whether you can cancel marking the alert event as a false positive. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("CanCancelFault")
        public Boolean canCancelFault;

        /**
         * <p>Indicates whether the safeguard mode for major activities is enabled for the server. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("ContainHwMode")
        public Boolean containHwMode;

        /**
         * <p>The ID of the container.</p>
         * 
         * <strong>example:</strong>
         * <p>container_1648601865161_14925_02_000****</p>
         */
        @NameInMap("ContainerId")
        public String containerId;

        /**
         * <p>The ID of the container image.</p>
         * 
         * <strong>example:</strong>
         * <p>sha256:2e5a3b0ae5f452b3cb458789a9a7542ef40035a84318469a8528c5e444db1****</p>
         */
        @NameInMap("ContainerImageId")
        public String containerImageId;

        /**
         * <p>The name of the container image.</p>
         * 
         * <strong>example:</strong>
         * <p>centos7_apache:v1.0.1</p>
         */
        @NameInMap("ContainerImageName")
        public String containerImageName;

        /**
         * <p>The source of data. This parameter can be ignored.</p>
         * 
         * <strong>example:</strong>
         * <p>aegis_suspicious_****</p>
         */
        @NameInMap("DataSource")
        public String dataSource;

        /**
         * <p>The impact of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>webshell</p>
         */
        @NameInMap("Desc")
        public String desc;

        /**
         * <p>The details of the alert event.</p>
         */
        @NameInMap("Details")
        public java.util.List<DescribeSuspEventsResponseBodySuspEventsDetails> details;

        /**
         * <p>Indicates whether the alert event can be detected by cloud sandbox. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("DisplaySandboxResult")
        public Boolean displaySandboxResult;

        /**
         * <p>The note information about the alert event.</p>
         */
        @NameInMap("EventNotes")
        public java.util.List<DescribeSuspEventsResponseBodySuspEventsEventNotes> eventNotes;

        /**
         * <p>The status of the alert event. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: pending handling</li>
         * <li><strong>2</strong>: ignored</li>
         * <li><strong>4</strong>: confirmed</li>
         * <li><strong>8</strong>: marked as a false positive</li>
         * <li><strong>16</strong>: handling</li>
         * <li><strong>32</strong>: handled</li>
         * <li><strong>64</strong>: expired</li>
         * <li><strong>604</strong>: marked as a false positive by the system</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EventStatus")
        public Integer eventStatus;

        /**
         * <p>The subtype of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>login_common_location</p>
         */
        @NameInMap("EventSubType")
        public String eventSubType;

        /**
         * <p>Indicates whether the alert event has tracing information. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("HasTraceInfo")
        public Boolean hasTraceInfo;

        /**
         * <p>The unique ID of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The UUID of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>70489fb520cea585ad9761d5a842****</p>
         */
        @NameInMap("ImageUuid")
        public String imageUuid;

        /**
         * <p>The instance ID of the affected asset.</p>
         * 
         * <strong>example:</strong>
         * <p>i-9dp6dwsxdl9z5u1e2f****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The name of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>nginx</p>
         */
        @NameInMap("InstanceName")
        public String instanceName;

        /**
         * <p>The public IP address of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1.2.XX.XX</p>
         */
        @NameInMap("InternetIp")
        public String internetIp;

        /**
         * <p>The private IP address of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>100.100.XX.XX</p>
         */
        @NameInMap("IntranetIp")
        public String intranetIp;

        /**
         * <p>The ID of the Kubernetes cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c517b37e1401e4961b3951863a49a****</p>
         */
        @NameInMap("K8sClusterId")
        public String k8sClusterId;

        /**
         * <p>The name of the Kubernetes cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>k8s-daily</p>
         */
        @NameInMap("K8sClusterName")
        public String k8sClusterName;

        /**
         * <p>The namespace of the Kubernetes cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("K8sNamespace")
        public String k8sNamespace;

        /**
         * <p>The ID of the Kubernetes node.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp14a1ay8e0aa9t0****</p>
         */
        @NameInMap("K8sNodeId")
        public String k8sNodeId;

        /**
         * <p>The name of the Kubernetes node.</p>
         * 
         * <strong>example:</strong>
         * <p>N/A</p>
         */
        @NameInMap("K8sNodeName")
        public String k8sNodeName;

        /**
         * <p>The name of the Kubernetes pod.</p>
         * 
         * <strong>example:</strong>
         * <p>myapp-pod</p>
         */
        @NameInMap("K8sPodName")
        public String k8sPodName;

        /**
         * <p>Indicates whether the large model analysis tag is supported. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LargeModel")
        public Boolean largeModel;

        /**
         * <p>The time when the alert event was last detected.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-26 01:51:01</p>
         */
        @NameInMap("LastTime")
        public String lastTime;

        /**
         * <p>The timestamp when the alert event was last detected. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1631699497000</p>
         */
        @NameInMap("LastTimeStamp")
        public Long lastTimeStamp;

        /**
         * <p>The severity of the alert event. Valid values:</p>
         * <ul>
         * <li><strong>serious</strong></li>
         * <li><strong>suspicious</strong></li>
         * <li><strong>remind</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>serious</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The status of the malicious behavior defense rule. Valid values:</p>
         * <ul>
         * <li><strong>open</strong></li>
         * <li><strong>close</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>open</p>
         */
        @NameInMap("MaliciousRuleStatus")
        public String maliciousRuleStatus;

        /**
         * <p>The tags of the alert events.</p>
         */
        @NameInMap("MarkList")
        public java.util.List<String> markList;

        /**
         * <p>The advanced whitelist rule.</p>
         * 
         * <strong>example:</strong>
         * <p>[{\&quot;uuid\&quot;:\&quot;ALL\&quot;,\&quot;field\&quot;:\&quot;gmtModified\&quot;,\&quot;operate\&quot;:\&quot;contains\&quot;,\&quot;fieldValue\&quot;:\&quot;222\&quot;}]</p>
         */
        @NameInMap("MarkMisRules")
        public String markMisRules;

        /**
         * <p>The complete name of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>Unusual Logon-Login with unusual location</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The time when the alert event was first detected.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-09-26 01:51:01</p>
         */
        @NameInMap("OccurrenceTime")
        public String occurrenceTime;

        /**
         * <p>The timestamp when the alert event was first detected. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1631699497000</p>
         */
        @NameInMap("OccurrenceTimeStamp")
        public Long occurrenceTimeStamp;

        /**
         * <p>The handling result code of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>kill_and_quara.Success</p>
         */
        @NameInMap("OperateErrorCode")
        public String operateErrorCode;

        /**
         * <p>The handing result message of the alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("OperateMsg")
        public String operateMsg;

        /**
         * <p>The handling timestamp of the alert event. Unit: milliseconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1631699497000</p>
         */
        @NameInMap("OperateTime")
        public Long operateTime;

        /**
         * <p>The edition of Security Center in which the alert event can be detected. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Basic edition</li>
         * <li><strong>1</strong>: Enterprise edition</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SaleVersion")
        public String saleVersion;

        /**
         * <p>The ID of the associated alert event.</p>
         * 
         * <strong>example:</strong>
         * <p>270789</p>
         */
        @NameInMap("SecurityEventIds")
        public String securityEventIds;

        /**
         * <p>The ID of the Alibaba Cloud account within which an alert is generated.</p>
         * 
         * <strong>example:</strong>
         * <p>196072141348****</p>
         */
        @NameInMap("SourceAliUid")
        public Long sourceAliUid;

        /**
         * <p>The stage at which the attack is detected.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;[&quot;authority_maintenance&quot;]&quot;</p>
         */
        @NameInMap("Stages")
        public String stages;

        /**
         * <p>The display name of the attack stage.</p>
         */
        @NameInMap("TacticItems")
        public java.util.List<DescribeSuspEventsResponseBodySuspEventsTacticItems> tacticItems;

        /**
         * <p>The unique key of the alert.</p>
         * 
         * <strong>example:</strong>
         * <p>e17e****</p>
         */
        @NameInMap("UniqueInfo")
        public String uniqueInfo;

        /**
         * <p>The unique ID of the associated instance.</p>
         * 
         * <strong>example:</strong>
         * <p>bf6b30d3-eea8-4924-9f0a-****</p>
         */
        @NameInMap("Uuid")
        public String uuid;

        /**
         * <p>The ID of the cluster.</p>
         * 
         * <strong>example:</strong>
         * <p>c2051775877374cccbf68af596e6****</p>
         */
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

        public DescribeSuspEventsResponseBodySuspEvents setImageUuid(String imageUuid) {
            this.imageUuid = imageUuid;
            return this;
        }
        public String getImageUuid() {
            return this.imageUuid;
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

        public DescribeSuspEventsResponseBodySuspEvents setLargeModel(Boolean largeModel) {
            this.largeModel = largeModel;
            return this;
        }
        public Boolean getLargeModel() {
            return this.largeModel;
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

        public DescribeSuspEventsResponseBodySuspEvents setMarkList(java.util.List<String> markList) {
            this.markList = markList;
            return this;
        }
        public java.util.List<String> getMarkList() {
            return this.markList;
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

        public DescribeSuspEventsResponseBodySuspEvents setSourceAliUid(Long sourceAliUid) {
            this.sourceAliUid = sourceAliUid;
            return this;
        }
        public Long getSourceAliUid() {
            return this.sourceAliUid;
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
