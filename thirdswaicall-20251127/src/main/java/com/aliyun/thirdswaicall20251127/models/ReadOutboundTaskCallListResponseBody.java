// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.thirdswaicall20251127.models;

import com.aliyun.tea.*;

public class ReadOutboundTaskCallListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Records")
    public java.util.List<ReadOutboundTaskCallListResponseBodyRecords> records;

    /**
     * <strong>example:</strong>
     * <p>202BFA44-28D8-571E-B992-BA70F2E92FB0</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <strong>example:</strong>
     * <p>True</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1743387963</p>
     */
    @NameInMap("Timestamp")
    public String timestamp;

    /**
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("Total")
    public Long total;

    /**
     * <strong>example:</strong>
     * <p>F47D4976-FC5A-5687-A890-B7923D3B429B</p>
     */
    @NameInMap("TraceId")
    public String traceId;

    public static ReadOutboundTaskCallListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReadOutboundTaskCallListResponseBody self = new ReadOutboundTaskCallListResponseBody();
        return TeaModel.build(map, self);
    }

    public ReadOutboundTaskCallListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ReadOutboundTaskCallListResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ReadOutboundTaskCallListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ReadOutboundTaskCallListResponseBody setRecords(java.util.List<ReadOutboundTaskCallListResponseBodyRecords> records) {
        this.records = records;
        return this;
    }
    public java.util.List<ReadOutboundTaskCallListResponseBodyRecords> getRecords() {
        return this.records;
    }

    public ReadOutboundTaskCallListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReadOutboundTaskCallListResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ReadOutboundTaskCallListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ReadOutboundTaskCallListResponseBody setTimestamp(String timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public String getTimestamp() {
        return this.timestamp;
    }

    public ReadOutboundTaskCallListResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public ReadOutboundTaskCallListResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public static class ReadOutboundTaskCallListResponseBodyRecordsDialogueList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("BeginTime")
        public Integer beginTime;

        /**
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("EndTime")
        public Integer endTime;

        /**
         * <strong>example:</strong>
         * <p>agent</p>
         */
        @NameInMap("Role")
        public String role;

        /**
         * <strong>example:</strong>
         * <p>您好，请问有什么可以帮助您？</p>
         */
        @NameInMap("Text")
        public String text;

        public static ReadOutboundTaskCallListResponseBodyRecordsDialogueList build(java.util.Map<String, ?> map) throws Exception {
            ReadOutboundTaskCallListResponseBodyRecordsDialogueList self = new ReadOutboundTaskCallListResponseBodyRecordsDialogueList();
            return TeaModel.build(map, self);
        }

        public ReadOutboundTaskCallListResponseBodyRecordsDialogueList setBeginTime(Integer beginTime) {
            this.beginTime = beginTime;
            return this;
        }
        public Integer getBeginTime() {
            return this.beginTime;
        }

        public ReadOutboundTaskCallListResponseBodyRecordsDialogueList setEndTime(Integer endTime) {
            this.endTime = endTime;
            return this;
        }
        public Integer getEndTime() {
            return this.endTime;
        }

        public ReadOutboundTaskCallListResponseBodyRecordsDialogueList setRole(String role) {
            this.role = role;
            return this;
        }
        public String getRole() {
            return this.role;
        }

        public ReadOutboundTaskCallListResponseBodyRecordsDialogueList setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class ReadOutboundTaskCallListResponseBodyRecords extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-09-23 19:38:44</p>
         */
        @NameInMap("CallEndTime")
        public String callEndTime;

        /**
         * <strong>example:</strong>
         * <p>call_123456</p>
         */
        @NameInMap("CallId")
        public String callId;

        /**
         * <strong>example:</strong>
         * <p>2025-09-23 19:34:12</p>
         */
        @NameInMap("CallStartTime")
        public String callStartTime;

        /**
         * <strong>example:</strong>
         * <p>客户对双十一活动很感兴趣</p>
         */
        @NameInMap("CallSummary")
        public String callSummary;

        /**
         * <strong>example:</strong>
         * <p>normal</p>
         */
        @NameInMap("Channel")
        public String channel;

        /**
         * <strong>example:</strong>
         * <p>张先生</p>
         */
        @NameInMap("CustomerName")
        public String customerName;

        /**
         * <strong>example:</strong>
         * <p>131****9908</p>
         */
        @NameInMap("CustomerPhone")
        public String customerPhone;

        /**
         * <strong>example:</strong>
         * <p>[]</p>
         */
        @NameInMap("DialogueList")
        public java.util.List<ReadOutboundTaskCallListResponseBodyRecordsDialogueList> dialogueList;

        /**
         * <strong>example:</strong>
         * <p>已接通</p>
         */
        @NameInMap("DisplayStatus")
        public String displayStatus;

        /**
         * <strong>example:</strong>
         * <p>272</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>4m32s</p>
         */
        @NameInMap("DurationText")
        public String durationText;

        /**
         * <strong>example:</strong>
         * <p>{&quot;123&quot;:&quot;122&quot;}</p>
         */
        @NameInMap("ExtInfo")
        public String extInfo;

        /**
         * <strong>example:</strong>
         * <p>2025-09-23 19:34:12</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-09-23 19:34:12</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>instance_001</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>[&quot;有意向&quot;, &quot;高净值&quot;]</p>
         */
        @NameInMap("LabelTags")
        public java.util.List<String> labelTags;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RecordDetailReady")
        public Boolean recordDetailReady;

        /**
         * <strong>example:</strong>
         * <p><a href="https://xxx.com/record.mp3">https://xxx.com/record.mp3</a></p>
         */
        @NameInMap("RecordUrl")
        public String recordUrl;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RetryCount")
        public Integer retryCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SceneId")
        public String sceneId;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>tenant_001</p>
         */
        @NameInMap("TenantId")
        public String tenantId;

        /**
         * <strong>example:</strong>
         * <p>xiaomei</p>
         */
        @NameInMap("TtsVoiceCode")
        public String ttsVoiceCode;

        /**
         * <strong>example:</strong>
         * <p>小美(声音甜美)</p>
         */
        @NameInMap("TtsVoiceDesc")
        public String ttsVoiceDesc;

        /**
         * <strong>example:</strong>
         * <p>123456789</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ReadOutboundTaskCallListResponseBodyRecords build(java.util.Map<String, ?> map) throws Exception {
            ReadOutboundTaskCallListResponseBodyRecords self = new ReadOutboundTaskCallListResponseBodyRecords();
            return TeaModel.build(map, self);
        }

        public ReadOutboundTaskCallListResponseBodyRecords setCallEndTime(String callEndTime) {
            this.callEndTime = callEndTime;
            return this;
        }
        public String getCallEndTime() {
            return this.callEndTime;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setCallId(String callId) {
            this.callId = callId;
            return this;
        }
        public String getCallId() {
            return this.callId;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setCallStartTime(String callStartTime) {
            this.callStartTime = callStartTime;
            return this;
        }
        public String getCallStartTime() {
            return this.callStartTime;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setCallSummary(String callSummary) {
            this.callSummary = callSummary;
            return this;
        }
        public String getCallSummary() {
            return this.callSummary;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setCustomerName(String customerName) {
            this.customerName = customerName;
            return this;
        }
        public String getCustomerName() {
            return this.customerName;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setCustomerPhone(String customerPhone) {
            this.customerPhone = customerPhone;
            return this;
        }
        public String getCustomerPhone() {
            return this.customerPhone;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setDialogueList(java.util.List<ReadOutboundTaskCallListResponseBodyRecordsDialogueList> dialogueList) {
            this.dialogueList = dialogueList;
            return this;
        }
        public java.util.List<ReadOutboundTaskCallListResponseBodyRecordsDialogueList> getDialogueList() {
            return this.dialogueList;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setDisplayStatus(String displayStatus) {
            this.displayStatus = displayStatus;
            return this;
        }
        public String getDisplayStatus() {
            return this.displayStatus;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setDurationText(String durationText) {
            this.durationText = durationText;
            return this;
        }
        public String getDurationText() {
            return this.durationText;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setExtInfo(String extInfo) {
            this.extInfo = extInfo;
            return this;
        }
        public String getExtInfo() {
            return this.extInfo;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setLabelTags(java.util.List<String> labelTags) {
            this.labelTags = labelTags;
            return this;
        }
        public java.util.List<String> getLabelTags() {
            return this.labelTags;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setRecordDetailReady(Boolean recordDetailReady) {
            this.recordDetailReady = recordDetailReady;
            return this;
        }
        public Boolean getRecordDetailReady() {
            return this.recordDetailReady;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setRecordUrl(String recordUrl) {
            this.recordUrl = recordUrl;
            return this;
        }
        public String getRecordUrl() {
            return this.recordUrl;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setRetryCount(Integer retryCount) {
            this.retryCount = retryCount;
            return this;
        }
        public Integer getRetryCount() {
            return this.retryCount;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setSceneId(String sceneId) {
            this.sceneId = sceneId;
            return this;
        }
        public String getSceneId() {
            return this.sceneId;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setTtsVoiceCode(String ttsVoiceCode) {
            this.ttsVoiceCode = ttsVoiceCode;
            return this;
        }
        public String getTtsVoiceCode() {
            return this.ttsVoiceCode;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setTtsVoiceDesc(String ttsVoiceDesc) {
            this.ttsVoiceDesc = ttsVoiceDesc;
            return this;
        }
        public String getTtsVoiceDesc() {
            return this.ttsVoiceDesc;
        }

        public ReadOutboundTaskCallListResponseBodyRecords setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
