// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMqSofamqTraceResultResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetMqSofamqTraceResultResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static GetMqSofamqTraceResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMqSofamqTraceResultResponseBody self = new GetMqSofamqTraceResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMqSofamqTraceResultResponseBody setData(GetMqSofamqTraceResultResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMqSofamqTraceResultResponseBodyData getData() {
        return this.data;
    }

    public GetMqSofamqTraceResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMqSofamqTraceResultResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMqSofamqTraceResultResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class GetMqSofamqTraceResultResponseBodyDataTraceListSubListClientList extends TeaModel {
        @NameInMap("ClientHost")
        public String clientHost;

        @NameInMap("CostTime")
        public Long costTime;

        @NameInMap("ReconsumeTimes")
        public Long reconsumeTimes;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubGroupName")
        public String subGroupName;

        @NameInMap("SubTime")
        public Long subTime;

        public static GetMqSofamqTraceResultResponseBodyDataTraceListSubListClientList build(java.util.Map<String, ?> map) throws Exception {
            GetMqSofamqTraceResultResponseBodyDataTraceListSubListClientList self = new GetMqSofamqTraceResultResponseBodyDataTraceListSubListClientList();
            return TeaModel.build(map, self);
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceListSubListClientList setClientHost(String clientHost) {
            this.clientHost = clientHost;
            return this;
        }
        public String getClientHost() {
            return this.clientHost;
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceListSubListClientList setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceListSubListClientList setReconsumeTimes(Long reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Long getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceListSubListClientList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceListSubListClientList setSubGroupName(String subGroupName) {
            this.subGroupName = subGroupName;
            return this;
        }
        public String getSubGroupName() {
            return this.subGroupName;
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceListSubListClientList setSubTime(Long subTime) {
            this.subTime = subTime;
            return this;
        }
        public Long getSubTime() {
            return this.subTime;
        }

    }

    public static class GetMqSofamqTraceResultResponseBodyDataTraceListSubList extends TeaModel {
        /**
         * <p>cell name</p>
         */
        @NameInMap("Cell")
        public String cell;

        @NameInMap("ClientList")
        public java.util.List<GetMqSofamqTraceResultResponseBodyDataTraceListSubListClientList> clientList;

        @NameInMap("FailCount")
        public Long failCount;

        @NameInMap("SubGroupName")
        public String subGroupName;

        @NameInMap("SuccessCount")
        public Long successCount;

        public static GetMqSofamqTraceResultResponseBodyDataTraceListSubList build(java.util.Map<String, ?> map) throws Exception {
            GetMqSofamqTraceResultResponseBodyDataTraceListSubList self = new GetMqSofamqTraceResultResponseBodyDataTraceListSubList();
            return TeaModel.build(map, self);
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceListSubList setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceListSubList setClientList(java.util.List<GetMqSofamqTraceResultResponseBodyDataTraceListSubListClientList> clientList) {
            this.clientList = clientList;
            return this;
        }
        public java.util.List<GetMqSofamqTraceResultResponseBodyDataTraceListSubListClientList> getClientList() {
            return this.clientList;
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceListSubList setFailCount(Long failCount) {
            this.failCount = failCount;
            return this;
        }
        public Long getFailCount() {
            return this.failCount;
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceListSubList setSubGroupName(String subGroupName) {
            this.subGroupName = subGroupName;
            return this;
        }
        public String getSubGroupName() {
            return this.subGroupName;
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceListSubList setSuccessCount(Long successCount) {
            this.successCount = successCount;
            return this;
        }
        public Long getSuccessCount() {
            return this.successCount;
        }

    }

    public static class GetMqSofamqTraceResultResponseBodyDataTraceList extends TeaModel {
        @NameInMap("BornHost")
        public String bornHost;

        @NameInMap("Cell")
        public String cell;

        @NameInMap("CostTime")
        public Long costTime;

        @NameInMap("MsgId")
        public String msgId;

        @NameInMap("MsgKey")
        public String msgKey;

        @NameInMap("PubGroupName")
        public String pubGroupName;

        @NameInMap("PubTime")
        public Long pubTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("SubList")
        public java.util.List<GetMqSofamqTraceResultResponseBodyDataTraceListSubList> subList;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("Topic")
        public String topic;

        public static GetMqSofamqTraceResultResponseBodyDataTraceList build(java.util.Map<String, ?> map) throws Exception {
            GetMqSofamqTraceResultResponseBodyDataTraceList self = new GetMqSofamqTraceResultResponseBodyDataTraceList();
            return TeaModel.build(map, self);
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceList setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceList setCell(String cell) {
            this.cell = cell;
            return this;
        }
        public String getCell() {
            return this.cell;
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceList setCostTime(Long costTime) {
            this.costTime = costTime;
            return this;
        }
        public Long getCostTime() {
            return this.costTime;
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceList setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceList setMsgKey(String msgKey) {
            this.msgKey = msgKey;
            return this;
        }
        public String getMsgKey() {
            return this.msgKey;
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceList setPubGroupName(String pubGroupName) {
            this.pubGroupName = pubGroupName;
            return this;
        }
        public String getPubGroupName() {
            return this.pubGroupName;
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceList setPubTime(Long pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public Long getPubTime() {
            return this.pubTime;
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceList setSubList(java.util.List<GetMqSofamqTraceResultResponseBodyDataTraceListSubList> subList) {
            this.subList = subList;
            return this;
        }
        public java.util.List<GetMqSofamqTraceResultResponseBodyDataTraceListSubList> getSubList() {
            return this.subList;
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public GetMqSofamqTraceResultResponseBodyDataTraceList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class GetMqSofamqTraceResultResponseBodyData extends TeaModel {
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MsgId")
        public String msgId;

        @NameInMap("MsgKey")
        public String msgKey;

        @NameInMap("QueryId")
        public String queryId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("TraceList")
        public java.util.List<GetMqSofamqTraceResultResponseBodyDataTraceList> traceList;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("UserId")
        public String userId;

        public static GetMqSofamqTraceResultResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMqSofamqTraceResultResponseBodyData self = new GetMqSofamqTraceResultResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMqSofamqTraceResultResponseBodyData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public GetMqSofamqTraceResultResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetMqSofamqTraceResultResponseBodyData setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public GetMqSofamqTraceResultResponseBodyData setMsgKey(String msgKey) {
            this.msgKey = msgKey;
            return this;
        }
        public String getMsgKey() {
            return this.msgKey;
        }

        public GetMqSofamqTraceResultResponseBodyData setQueryId(String queryId) {
            this.queryId = queryId;
            return this;
        }
        public String getQueryId() {
            return this.queryId;
        }

        public GetMqSofamqTraceResultResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMqSofamqTraceResultResponseBodyData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetMqSofamqTraceResultResponseBodyData setTraceList(java.util.List<GetMqSofamqTraceResultResponseBodyDataTraceList> traceList) {
            this.traceList = traceList;
            return this;
        }
        public java.util.List<GetMqSofamqTraceResultResponseBodyDataTraceList> getTraceList() {
            return this.traceList;
        }

        public GetMqSofamqTraceResultResponseBodyData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public GetMqSofamqTraceResultResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
