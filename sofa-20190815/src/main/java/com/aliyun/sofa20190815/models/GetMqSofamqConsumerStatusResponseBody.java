// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetMqSofamqConsumerStatusResponseBody extends TeaModel {
    @NameInMap("Data")
    public GetMqSofamqConsumerStatusResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    public static GetMqSofamqConsumerStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMqSofamqConsumerStatusResponseBody self = new GetMqSofamqConsumerStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMqSofamqConsumerStatusResponseBody setData(GetMqSofamqConsumerStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMqSofamqConsumerStatusResponseBodyData getData() {
        return this.data;
    }

    public GetMqSofamqConsumerStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMqSofamqConsumerStatusResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetMqSofamqConsumerStatusResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public static class GetMqSofamqConsumerStatusResponseBodyDataConnectionSet extends TeaModel {
        @NameInMap("ClientAddr")
        public String clientAddr;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("Language")
        public String language;

        @NameInMap("RemoteIp")
        public String remoteIp;

        @NameInMap("Version")
        public String version;

        public static GetMqSofamqConsumerStatusResponseBodyDataConnectionSet build(java.util.Map<String, ?> map) throws Exception {
            GetMqSofamqConsumerStatusResponseBodyDataConnectionSet self = new GetMqSofamqConsumerStatusResponseBodyDataConnectionSet();
            return TeaModel.build(map, self);
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConnectionSet setClientAddr(String clientAddr) {
            this.clientAddr = clientAddr;
            return this;
        }
        public String getClientAddr() {
            return this.clientAddr;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConnectionSet setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConnectionSet setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConnectionSet setRemoteIp(String remoteIp) {
            this.remoteIp = remoteIp;
            return this;
        }
        public String getRemoteIp() {
            return this.remoteIp;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConnectionSet setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListJstack extends TeaModel {
        @NameInMap("Thread")
        public String thread;

        @NameInMap("TrackList")
        public java.util.List<String> trackList;

        public static GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListJstack build(java.util.Map<String, ?> map) throws Exception {
            GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListJstack self = new GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListJstack();
            return TeaModel.build(map, self);
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListJstack setThread(String thread) {
            this.thread = thread;
            return this;
        }
        public String getThread() {
            return this.thread;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListJstack setTrackList(java.util.List<String> trackList) {
            this.trackList = trackList;
            return this;
        }
        public java.util.List<String> getTrackList() {
            return this.trackList;
        }

    }

    public static class GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList extends TeaModel {
        @NameInMap("Diff")
        public Long diff;

        @NameInMap("FailedCountPerHour")
        public Long failedCountPerHour;

        @NameInMap("FailedTps")
        public String failedTps;

        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("OkTps")
        public String okTps;

        @NameInMap("Rt")
        public String rt;

        @NameInMap("Topic")
        public String topic;

        public static GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList build(java.util.Map<String, ?> map) throws Exception {
            GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList self = new GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList();
            return TeaModel.build(map, self);
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList setDiff(Long diff) {
            this.diff = diff;
            return this;
        }
        public Long getDiff() {
            return this.diff;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList setFailedCountPerHour(Long failedCountPerHour) {
            this.failedCountPerHour = failedCountPerHour;
            return this;
        }
        public Long getFailedCountPerHour() {
            return this.failedCountPerHour;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList setFailedTps(String failedTps) {
            this.failedTps = failedTps;
            return this;
        }
        public String getFailedTps() {
            return this.failedTps;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList setOkTps(String okTps) {
            this.okTps = okTps;
            return this;
        }
        public String getOkTps() {
            return this.okTps;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList setRt(String rt) {
            this.rt = rt;
            return this;
        }
        public String getRt() {
            return this.rt;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet extends TeaModel {
        @NameInMap("SubString")
        public String subString;

        @NameInMap("SubVersion")
        public Long subVersion;

        @NameInMap("TagsSet")
        public java.util.List<String> tagsSet;

        @NameInMap("Topic")
        public String topic;

        public static GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet build(java.util.Map<String, ?> map) throws Exception {
            GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet self = new GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet();
            return TeaModel.build(map, self);
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet setSubString(String subString) {
            this.subString = subString;
            return this;
        }
        public String getSubString() {
            return this.subString;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet setSubVersion(Long subVersion) {
            this.subVersion = subVersion;
            return this;
        }
        public Long getSubVersion() {
            return this.subVersion;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet setTagsSet(java.util.List<String> tagsSet) {
            this.tagsSet = tagsSet;
            return this;
        }
        public java.util.List<String> getTagsSet() {
            return this.tagsSet;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoList extends TeaModel {
        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("Connection")
        public String connection;

        /**
         * <p>PUSH/PULL</p>
         */
        @NameInMap("ConsumeType")
        public String consumeType;

        @NameInMap("Jstack")
        public java.util.List<GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListJstack> jstack;

        @NameInMap("Language")
        public String language;

        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        @NameInMap("MessageModel")
        public String messageModel;

        @NameInMap("RunningDataList")
        public java.util.List<GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList> runningDataList;

        @NameInMap("StartTimestamp")
        public Long startTimestamp;

        @NameInMap("SubscriptionSet")
        public java.util.List<GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet> subscriptionSet;

        @NameInMap("ThreadCount")
        public Long threadCount;

        @NameInMap("Version")
        public String version;

        public static GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoList build(java.util.Map<String, ?> map) throws Exception {
            GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoList self = new GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoList();
            return TeaModel.build(map, self);
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoList setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoList setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoList setConsumeType(String consumeType) {
            this.consumeType = consumeType;
            return this;
        }
        public String getConsumeType() {
            return this.consumeType;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoList setJstack(java.util.List<GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListJstack> jstack) {
            this.jstack = jstack;
            return this;
        }
        public java.util.List<GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListJstack> getJstack() {
            return this.jstack;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoList setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoList setLastTimestamp(Long lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoList setMessageModel(String messageModel) {
            this.messageModel = messageModel;
            return this;
        }
        public String getMessageModel() {
            return this.messageModel;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoList setRunningDataList(java.util.List<GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList> runningDataList) {
            this.runningDataList = runningDataList;
            return this;
        }
        public java.util.List<GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList> getRunningDataList() {
            return this.runningDataList;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoList setStartTimestamp(Long startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }
        public Long getStartTimestamp() {
            return this.startTimestamp;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoList setSubscriptionSet(java.util.List<GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet> subscriptionSet) {
            this.subscriptionSet = subscriptionSet;
            return this;
        }
        public java.util.List<GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet> getSubscriptionSet() {
            return this.subscriptionSet;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoList setThreadCount(Long threadCount) {
            this.threadCount = threadCount;
            return this;
        }
        public Long getThreadCount() {
            return this.threadCount;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

    }

    public static class GetMqSofamqConsumerStatusResponseBodyDataDetailInTopicList extends TeaModel {
        @NameInMap("DelayTime")
        public Long delayTime;

        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("TotalDiff")
        public Long totalDiff;

        public static GetMqSofamqConsumerStatusResponseBodyDataDetailInTopicList build(java.util.Map<String, ?> map) throws Exception {
            GetMqSofamqConsumerStatusResponseBodyDataDetailInTopicList self = new GetMqSofamqConsumerStatusResponseBodyDataDetailInTopicList();
            return TeaModel.build(map, self);
        }

        public GetMqSofamqConsumerStatusResponseBodyDataDetailInTopicList setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataDetailInTopicList setLastTimestamp(Long lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataDetailInTopicList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public GetMqSofamqConsumerStatusResponseBodyDataDetailInTopicList setTotalDiff(Long totalDiff) {
            this.totalDiff = totalDiff;
            return this;
        }
        public Long getTotalDiff() {
            return this.totalDiff;
        }

    }

    public static class GetMqSofamqConsumerStatusResponseBodyData extends TeaModel {
        @NameInMap("ConnectionSet")
        public java.util.List<GetMqSofamqConsumerStatusResponseBodyDataConnectionSet> connectionSet;

        @NameInMap("ConsumeModel")
        public String consumeModel;

        @NameInMap("ConsumeTps")
        public String consumeTps;

        @NameInMap("ConsumerConnectionInfoList")
        public java.util.List<GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoList> consumerConnectionInfoList;

        @NameInMap("DelayTime")
        public Long delayTime;

        @NameInMap("DetailInTopicList")
        public java.util.List<GetMqSofamqConsumerStatusResponseBodyDataDetailInTopicList> detailInTopicList;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("RebalanceOk")
        public Boolean rebalanceOk;

        @NameInMap("SubscriptionSame")
        public Boolean subscriptionSame;

        @NameInMap("TotalDiff")
        public Long totalDiff;

        public static GetMqSofamqConsumerStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMqSofamqConsumerStatusResponseBodyData self = new GetMqSofamqConsumerStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMqSofamqConsumerStatusResponseBodyData setConnectionSet(java.util.List<GetMqSofamqConsumerStatusResponseBodyDataConnectionSet> connectionSet) {
            this.connectionSet = connectionSet;
            return this;
        }
        public java.util.List<GetMqSofamqConsumerStatusResponseBodyDataConnectionSet> getConnectionSet() {
            return this.connectionSet;
        }

        public GetMqSofamqConsumerStatusResponseBodyData setConsumeModel(String consumeModel) {
            this.consumeModel = consumeModel;
            return this;
        }
        public String getConsumeModel() {
            return this.consumeModel;
        }

        public GetMqSofamqConsumerStatusResponseBodyData setConsumeTps(String consumeTps) {
            this.consumeTps = consumeTps;
            return this;
        }
        public String getConsumeTps() {
            return this.consumeTps;
        }

        public GetMqSofamqConsumerStatusResponseBodyData setConsumerConnectionInfoList(java.util.List<GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoList> consumerConnectionInfoList) {
            this.consumerConnectionInfoList = consumerConnectionInfoList;
            return this;
        }
        public java.util.List<GetMqSofamqConsumerStatusResponseBodyDataConsumerConnectionInfoList> getConsumerConnectionInfoList() {
            return this.consumerConnectionInfoList;
        }

        public GetMqSofamqConsumerStatusResponseBodyData setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public GetMqSofamqConsumerStatusResponseBodyData setDetailInTopicList(java.util.List<GetMqSofamqConsumerStatusResponseBodyDataDetailInTopicList> detailInTopicList) {
            this.detailInTopicList = detailInTopicList;
            return this;
        }
        public java.util.List<GetMqSofamqConsumerStatusResponseBodyDataDetailInTopicList> getDetailInTopicList() {
            return this.detailInTopicList;
        }

        public GetMqSofamqConsumerStatusResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetMqSofamqConsumerStatusResponseBodyData setLastTimestamp(Long lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        public GetMqSofamqConsumerStatusResponseBodyData setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public GetMqSofamqConsumerStatusResponseBodyData setRebalanceOk(Boolean rebalanceOk) {
            this.rebalanceOk = rebalanceOk;
            return this;
        }
        public Boolean getRebalanceOk() {
            return this.rebalanceOk;
        }

        public GetMqSofamqConsumerStatusResponseBodyData setSubscriptionSame(Boolean subscriptionSame) {
            this.subscriptionSame = subscriptionSame;
            return this;
        }
        public Boolean getSubscriptionSame() {
            return this.subscriptionSame;
        }

        public GetMqSofamqConsumerStatusResponseBodyData setTotalDiff(Long totalDiff) {
            this.totalDiff = totalDiff;
            return this;
        }
        public Long getTotalDiff() {
            return this.totalDiff;
        }

    }

}
