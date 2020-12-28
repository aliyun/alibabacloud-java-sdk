// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsTraceGetResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

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

    public static class OnsTraceGetResultResponseBodyTraceDataTraceListSubListClientList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("SubTime")
        public Long subTime;

        @NameInMap("ReconsumeTimes")
        public Integer reconsumeTimes;

        @NameInMap("SubGroupName")
        public String subGroupName;

        @NameInMap("ClientHost")
        public String clientHost;

        @NameInMap("CostTime")
        public Integer costTime;

        public static OnsTraceGetResultResponseBodyTraceDataTraceListSubListClientList build(java.util.Map<String, ?> map) throws Exception {
            OnsTraceGetResultResponseBodyTraceDataTraceListSubListClientList self = new OnsTraceGetResultResponseBodyTraceDataTraceListSubListClientList();
            return TeaModel.build(map, self);
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListSubListClientList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListSubListClientList setSubTime(Long subTime) {
            this.subTime = subTime;
            return this;
        }
        public Long getSubTime() {
            return this.subTime;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListSubListClientList setReconsumeTimes(Integer reconsumeTimes) {
            this.reconsumeTimes = reconsumeTimes;
            return this;
        }
        public Integer getReconsumeTimes() {
            return this.reconsumeTimes;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListSubListClientList setSubGroupName(String subGroupName) {
            this.subGroupName = subGroupName;
            return this;
        }
        public String getSubGroupName() {
            return this.subGroupName;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListSubListClientList setClientHost(String clientHost) {
            this.clientHost = clientHost;
            return this;
        }
        public String getClientHost() {
            return this.clientHost;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListSubListClientList setCostTime(Integer costTime) {
            this.costTime = costTime;
            return this;
        }
        public Integer getCostTime() {
            return this.costTime;
        }

    }

    public static class OnsTraceGetResultResponseBodyTraceDataTraceListSubList extends TeaModel {
        @NameInMap("ClientList")
        public java.util.List<OnsTraceGetResultResponseBodyTraceDataTraceListSubListClientList> clientList;

        @NameInMap("FailCount")
        public Integer failCount;

        @NameInMap("SubGroupName")
        public String subGroupName;

        @NameInMap("SuccessCount")
        public Integer successCount;

        public static OnsTraceGetResultResponseBodyTraceDataTraceListSubList build(java.util.Map<String, ?> map) throws Exception {
            OnsTraceGetResultResponseBodyTraceDataTraceListSubList self = new OnsTraceGetResultResponseBodyTraceDataTraceListSubList();
            return TeaModel.build(map, self);
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListSubList setClientList(java.util.List<OnsTraceGetResultResponseBodyTraceDataTraceListSubListClientList> clientList) {
            this.clientList = clientList;
            return this;
        }
        public java.util.List<OnsTraceGetResultResponseBodyTraceDataTraceListSubListClientList> getClientList() {
            return this.clientList;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListSubList setFailCount(Integer failCount) {
            this.failCount = failCount;
            return this;
        }
        public Integer getFailCount() {
            return this.failCount;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListSubList setSubGroupName(String subGroupName) {
            this.subGroupName = subGroupName;
            return this;
        }
        public String getSubGroupName() {
            return this.subGroupName;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceListSubList setSuccessCount(Integer successCount) {
            this.successCount = successCount;
            return this;
        }
        public Integer getSuccessCount() {
            return this.successCount;
        }

    }

    public static class OnsTraceGetResultResponseBodyTraceDataTraceList extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("MsgKey")
        public String msgKey;

        @NameInMap("PubTime")
        public Long pubTime;

        @NameInMap("SubList")
        public java.util.List<OnsTraceGetResultResponseBodyTraceDataTraceListSubList> subList;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("CostTime")
        public Integer costTime;

        @NameInMap("Tag")
        public String tag;

        @NameInMap("MsgId")
        public String msgId;

        @NameInMap("PubGroupName")
        public String pubGroupName;

        @NameInMap("BornHost")
        public String bornHost;

        public static OnsTraceGetResultResponseBodyTraceDataTraceList build(java.util.Map<String, ?> map) throws Exception {
            OnsTraceGetResultResponseBodyTraceDataTraceList self = new OnsTraceGetResultResponseBodyTraceDataTraceList();
            return TeaModel.build(map, self);
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceList setMsgKey(String msgKey) {
            this.msgKey = msgKey;
            return this;
        }
        public String getMsgKey() {
            return this.msgKey;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceList setPubTime(Long pubTime) {
            this.pubTime = pubTime;
            return this;
        }
        public Long getPubTime() {
            return this.pubTime;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceList setSubList(java.util.List<OnsTraceGetResultResponseBodyTraceDataTraceListSubList> subList) {
            this.subList = subList;
            return this;
        }
        public java.util.List<OnsTraceGetResultResponseBodyTraceDataTraceListSubList> getSubList() {
            return this.subList;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceList setCostTime(Integer costTime) {
            this.costTime = costTime;
            return this;
        }
        public Integer getCostTime() {
            return this.costTime;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceList setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceList setMsgId(String msgId) {
            this.msgId = msgId;
            return this;
        }
        public String getMsgId() {
            return this.msgId;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceList setPubGroupName(String pubGroupName) {
            this.pubGroupName = pubGroupName;
            return this;
        }
        public String getPubGroupName() {
            return this.pubGroupName;
        }

        public OnsTraceGetResultResponseBodyTraceDataTraceList setBornHost(String bornHost) {
            this.bornHost = bornHost;
            return this;
        }
        public String getBornHost() {
            return this.bornHost;
        }

    }

    public static class OnsTraceGetResultResponseBodyTraceData extends TeaModel {
        @NameInMap("Status")
        public String status;

        @NameInMap("MsgKey")
        public String msgKey;

        @NameInMap("UpdateTime")
        public Long updateTime;

        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("MsgId")
        public String msgId;

        @NameInMap("TraceList")
        public java.util.List<OnsTraceGetResultResponseBodyTraceDataTraceList> traceList;

        @NameInMap("QueryId")
        public String queryId;

        public static OnsTraceGetResultResponseBodyTraceData build(java.util.Map<String, ?> map) throws Exception {
            OnsTraceGetResultResponseBodyTraceData self = new OnsTraceGetResultResponseBodyTraceData();
            return TeaModel.build(map, self);
        }

        public OnsTraceGetResultResponseBodyTraceData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public OnsTraceGetResultResponseBodyTraceData setMsgKey(String msgKey) {
            this.msgKey = msgKey;
            return this;
        }
        public String getMsgKey() {
            return this.msgKey;
        }

        public OnsTraceGetResultResponseBodyTraceData setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public OnsTraceGetResultResponseBodyTraceData setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public OnsTraceGetResultResponseBodyTraceData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public OnsTraceGetResultResponseBodyTraceData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
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

        public OnsTraceGetResultResponseBodyTraceData setTraceList(java.util.List<OnsTraceGetResultResponseBodyTraceDataTraceList> traceList) {
            this.traceList = traceList;
            return this;
        }
        public java.util.List<OnsTraceGetResultResponseBodyTraceDataTraceList> getTraceList() {
            return this.traceList;
        }

        public OnsTraceGetResultResponseBodyTraceData setQueryId(String queryId) {
            this.queryId = queryId;
            return this;
        }
        public String getQueryId() {
            return this.queryId;
        }

    }

}
