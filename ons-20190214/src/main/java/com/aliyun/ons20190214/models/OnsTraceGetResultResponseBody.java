// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTraceGetResultResponseBody extends TeaModel {
    /**
     * <p>The ID of the request. The system generates a unique ID for each request. You can troubleshoot issues based on the request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The details of the message trace.</p>
     */
    @NameInMap("TraceData")
    public OnsTraceGetResultResponseBodyTraceData traceData;

    public static OnsTraceGetResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsTraceGetResultResponseBody self = new OnsTraceGetResultResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsTraceGetResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsTraceGetResultResponseBody setTraceData(OnsTraceGetResultResponseBodyTraceData traceData) {
        this.traceData = traceData;
        return this;
    }
    public OnsTraceGetResultResponseBodyTraceData getTraceData() {
        return this.traceData;
    }

    public static class OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientListSubClientInfoDo extends TeaModel {
        /**
         * <p>The address of the consumer.</p>
         */
        @NameInMap("ClientHost")
        public String clientHost;

        /**
         * <p>The period of time that the system took to consume the message. Unit: milliseconds.</p>
         */
        @NameInMap("CostTime")
        public Integer costTime;

        /**
         * <p>The number of attempts that the Message Queue for Apache RocketMQ broker tried to send the message to the consumer.</p>
         */
        @NameInMap("ReconsumeTimes")
        public Integer reconsumeTimes;

        /**
         * <p>Indicates whether the message is consumed. Valid values:</p>
         * <br>
         * <p>*   **CONSUME_FAILED**: The message failed to be consumed.</p>
         * <p>*   **CONSUME_SUCCESS**: The message is consumed.</p>
         * <p>*   **CONSUME_NOT_RETURN:** No responses are returned.</p>
         * <p>*   **SEND_UNKNOWN:** The message is a transactional message and is not committed.</p>
         * <p>*   **SEND_DELAY:** The message is a scheduled or delayed message and is waiting to be consumed at the specified point in time.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the group that contains the consumer.</p>
         */
        @NameInMap("SubGroupName")
        public String subGroupName;

        /**
         * <p>The earliest point in time when the message was consumed.</p>
         */
        @NameInMap("SubTime")
        public Long subTime;

        public static OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientListSubClientInfoDo build(java.util.Map<String, ?> map) throws Exception {
            OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientListSubClientInfoDo self = new OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientListSubClientInfoDo();
            return TeaModel.build(map, self);
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientListSubClientInfoDo setClientHost(String clientHost) {
            this.clientHost = clientHost;
            return this;
        }
        public String getClientHost() {
            return this.clientHost;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientListSubClientInfoDo setCostTime(Integer costTime) {
            this.costTime = costTime;
            return this;
        }
        public Integer getCostTime() {
            return this.costTime;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientListSubClientInfoDo setReconsumeTimes(Integer reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Integer getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientListSubClientInfoDo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientListSubClientInfoDo setSubGroupName(String subGroupName) {
            this.subGroupName = subGroupName;
            return this;
        }
        public String getSubGroupName() {
            return this.subGroupName;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientListSubClientInfoDo setSubTime(Long subTime) {
            this.subTime = subTime;
            return this;
        }
        public Long getSubTime() {
            return this.subTime;
        }

    }

    public static class OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientList extends TeaModel {
        @NameInMap("SubClientInfoDo")
        public java.util.List<OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientListSubClientInfoDo> subClientInfoDo;

        public static OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientList build(java.util.Map<String, ?> map) throws Exception {
            OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientList self = new OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientList();
            return TeaModel.build(map, self);
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientList setSubClientInfoDo(java.util.List<OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientListSubClientInfoDo> subClientInfoDo) {
            this.subClientInfoDo = subClientInfoDo;
            return this;
        }
        public java.util.List<OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientListSubClientInfoDo> getSubClientInfoDo() {
            return this.subClientInfoDo;
        }

    }

    public static class OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDo extends TeaModel {
        /**
         * <p>The information about message consumption by consumers in the group.</p>
         */
        @NameInMap("ClientList")
        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientList clientList;

        /**
         * <p>The number of consumption failures.</p>
         */
        @NameInMap("FailCount")
        public Integer failCount;

        /**
         * <p>The ID of the consumer group.</p>
         */
        @NameInMap("SubGroupName")
        public String subGroupName;

        /**
         * <p>The number of successful consumptions.</p>
         */
        @NameInMap("SuccessCount")
        public Integer successCount;

        public static OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDo build(java.util.Map<String, ?> map) throws Exception {
            OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDo self = new OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDo();
            return TeaModel.build(map, self);
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDo setClientList(OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientList clientList) {
            this.clientList = clientList;
            return this;
        }
        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDoClientList getClientList() {
            return this.clientList;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDo setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDo setSubGroupName(String subGroupName) {
            this.subGroupName = subGroupName;
            return this;
        }
        public String getSubGroupName() {
            return this.subGroupName;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDo setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

    }

    public static class OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubList extends TeaModel {
        @NameInMap("SubMapDo")
        public java.util.List<OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDo> subMapDo;

        public static OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubList build(java.util.Map<String, ?> map) throws Exception {
            OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubList self = new OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubList();
            return TeaModel.build(map, self);
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubList setSubMapDo(java.util.List<OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDo> subMapDo) {
            this.subMapDo = subMapDo;
            return this;
        }
        public java.util.List<OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubListSubMapDo> getSubMapDo() {
            return this.subMapDo;
        }

    }

    public static class OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDo extends TeaModel {
        /**
         * <p>The address of the producer that generated the message.</p>
         */
        @NameInMap("BornHost")
        public String bornHost;

        /**
         * <p>The period of time that the system took to send the message. Unit: milliseconds.</p>
         */
        @NameInMap("CostTime")
        public Integer costTime;

        /**
         * <p>The ID of the message.</p>
         */
        @NameInMap("MsgId")
        public String msgId;

        /**
         * <p>The key of the message.</p>
         */
        @NameInMap("MsgKey")
        public String msgKey;

        /**
         * <p>The ID of the group that contains the producer.</p>
         */
        @NameInMap("PubGroupName")
        public String pubGroupName;

        /**
         * <p>The point in time when the message was sent.</p>
         */
        @NameInMap("PubTime")
        public Long pubTime;

        /**
         * <p>Indicates whether the message is sent. Valid values:</p>
         * <br>
         * <p>*   **SEND_SUCCESS**: The message is sent.</p>
         * <p>*   **SEND_FAILED**: The message failed to be sent.</p>
         * <p>*   **SEND_ROLLBACK:** The message is a transactional message and is rolled back.</p>
         * <p>*   **SEND_UNKNOWN:** The message is a transactional message and is not committed.</p>
         * <p>*   **SEND_DELAY:** The message is a scheduled or delayed message and is waiting to be sent at the specified point in time.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The consumption traces of the message.</p>
         */
        @NameInMap("SubList")
        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubList subList;

        /**
         * <p>The tag of the message.</p>
         */
        @NameInMap("Tag")
        public String tag;

        /**
         * <p>The topic in which the message is stored.</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDo build(java.util.Map<String, ?> map) throws Exception {
            OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDo self = new OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDo();
            return TeaModel.build(map, self);
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDo setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDo setCostTime(Integer costTime) {
            this.costTime = costTime;
            return this;
        }
        public Integer getCostTime() {
            return this.costTime;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDo setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDo setMsgKey(String msgKey) {
            this.msgKey = msgKey;
            return this;
        }
        public String getMsgKey() {
            return this.msgKey;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDo setPubGroupName(String pubGroupName) {
            this.pubGroupName = pubGroupName;
            return this;
        }
        public String getPubGroupName() {
            return this.pubGroupName;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDo setPubTime(Long pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public Long getPubTime() {
            return this.pubTime;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDo setSubList(OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubList subList) {
            this.subList = subList;
            return this;
        }
        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDoSubList getSubList() {
            return this.subList;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDo setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDo setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class OnsTraceGetResultResponseBodyTraceDataTraceList extends TeaModel {
        @NameInMap("TraceMapDo")
        public java.util.List<OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDo> traceMapDo;

        public static OnsTraceGetResultResponseBodyTraceDataTraceList build(java.util.Map<String, ?> map) throws Exception {
            OnsTraceGetResultResponseBodyTraceDataTraceList self = new OnsTraceGetResultResponseBodyTraceDataTraceList();
            return TeaModel.build(map, self);
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceList setTraceMapDo(java.util.List<OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDo> traceMapDo) {
            this.traceMapDo = traceMapDo;
            return this;
        }
        public java.util.List<OnsTraceGetResultResponseBodyTraceDataTraceListTraceMapDo> getTraceMapDo() {
            return this.traceMapDo;
        }

    }

    public static class OnsTraceGetResultResponseBodyTraceData extends TeaModel {
        /**
         * <p>The point in time when the task was created.</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the instance that contains the message.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The ID of the message that is queried.</p>
         */
        @NameInMap("MsgId")
        public String msgId;

        /**
         * <p>The key of the message that is queried.</p>
         */
        @NameInMap("MsgKey")
        public String msgKey;

        /**
         * <p>The ID of the task.</p>
         */
        @NameInMap("QueryId")
        public String queryId;

        /**
         * <p>The status of the task. Valid values:</p>
         * <br>
         * <p>*   **finish**: The task is complete.</p>
         * <p>*   **working**: The task is in progress.</p>
         * <p>*   **removed**: The task is deleted.</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The topic in which the message is stored.</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The details of the message trace.</p>
         */
        @NameInMap("TraceList")
        public OnsTraceGetResultResponseBodyTraceDataTraceList traceList;

        /**
         * <p>The most recent point in time when the task was updated.</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The ID of the user who created the task.</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static OnsTraceGetResultResponseBodyTraceData build(java.util.Map<String, ?> map) throws Exception {
            OnsTraceGetResultResponseBodyTraceData self = new OnsTraceGetResultResponseBodyTraceData();
            return TeaModel.build(map, self);
        }

        public OnsTraceGetResultResponseBodyTraceData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public OnsTraceGetResultResponseBodyTraceData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsTraceGetResultResponseBodyTraceData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public OnsTraceGetResultResponseBodyTraceData setMsgKey(String msgKey) {
            this.msgKey = msgKey;
            return this;
        }
        public String getMsgKey() {
            return this.msgKey;
        }

        public OnsTraceGetResultResponseBodyTraceData setQueryId(String queryId) {
            this.queryId = queryId;
            return this;
        }
        public String getQueryId() {
            return this.queryId;
        }

        public OnsTraceGetResultResponseBodyTraceData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public OnsTraceGetResultResponseBodyTraceData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public OnsTraceGetResultResponseBodyTraceData setTraceList(OnsTraceGetResultResponseBodyTraceDataTraceList traceList) {
            this.traceList = traceList;
            return this;
        }
        public OnsTraceGetResultResponseBodyTraceDataTraceList getTraceList() {
            return this.traceList;
        }

        public OnsTraceGetResultResponseBodyTraceData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public OnsTraceGetResultResponseBodyTraceData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
