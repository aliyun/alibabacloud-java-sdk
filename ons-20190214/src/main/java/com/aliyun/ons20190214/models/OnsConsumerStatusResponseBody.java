// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public OnsConsumerStatusResponseBodyData data;

    public static OnsConsumerStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerStatusResponseBody self = new OnsConsumerStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsConsumerStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OnsConsumerStatusResponseBody setData(OnsConsumerStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsConsumerStatusResponseBodyData getData() {
        return this.data;
    }

    public static class OnsConsumerStatusResponseBodyDataConnectionSet extends TeaModel {
        @NameInMap("RemoteIP")
        public String remoteIP;

        @NameInMap("Version")
        public String version;

        @NameInMap("ClientAddr")
        public String clientAddr;

        @NameInMap("Language")
        public String language;

        @NameInMap("ClientId")
        public String clientId;

        public static OnsConsumerStatusResponseBodyDataConnectionSet build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConnectionSet self = new OnsConsumerStatusResponseBodyDataConnectionSet();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConnectionSet setRemoteIP(String remoteIP) {
            this.remoteIP = remoteIP;
            return this;
        }
        public String getRemoteIP() {
            return this.remoteIP;
        }

        public OnsConsumerStatusResponseBodyDataConnectionSet setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public OnsConsumerStatusResponseBodyDataConnectionSet setClientAddr(String clientAddr) {
            this.clientAddr = clientAddr;
            return this;
        }
        public String getClientAddr() {
            return this.clientAddr;
        }

        public OnsConsumerStatusResponseBodyDataConnectionSet setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public OnsConsumerStatusResponseBodyDataConnectionSet setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

    }

    public static class OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList extends TeaModel {
        @NameInMap("GroupId")
        public String groupId;

        @NameInMap("Rt")
        public Float rt;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("FailedCountPerHour")
        public Long failedCountPerHour;

        @NameInMap("OkTps")
        public Float okTps;

        @NameInMap("FailedTps")
        public Float failedTps;

        public static OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList self = new OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList setFailedCountPerHour(Long failedCountPerHour) {
            this.failedCountPerHour = failedCountPerHour;
            return this;
        }
        public Long getFailedCountPerHour() {
            return this.failedCountPerHour;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList setOkTps(Float okTps) {
            this.okTps = okTps;
            return this;
        }
        public Float getOkTps() {
            return this.okTps;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList setFailedTps(Float failedTps) {
            this.failedTps = failedTps;
            return this;
        }
        public Float getFailedTps() {
            return this.failedTps;
        }

    }

    public static class OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet extends TeaModel {
        @NameInMap("SubString")
        public String subString;

        @NameInMap("SubVersion")
        public Long subVersion;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("TagsSet")
        public java.util.List<String> tagsSet;

        public static OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet self = new OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet setSubString(String subString) {
            this.subString = subString;
            return this;
        }
        public String getSubString() {
            return this.subString;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet setSubVersion(Long subVersion) {
            this.subVersion = subVersion;
            return this;
        }
        public Long getSubVersion() {
            return this.subVersion;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet setTagsSet(java.util.List<String> tagsSet) {
            this.tagsSet = tagsSet;
            return this;
        }
        public java.util.List<String> getTagsSet() {
            return this.tagsSet;
        }

    }

    public static class OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListJstack extends TeaModel {
        @NameInMap("TrackList")
        public java.util.List<String> trackList;

        @NameInMap("Thread")
        public String thread;

        public static OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListJstack build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListJstack self = new OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListJstack();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListJstack setTrackList(java.util.List<String> trackList) {
            this.trackList = trackList;
            return this;
        }
        public java.util.List<String> getTrackList() {
            return this.trackList;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListJstack setThread(String thread) {
            this.thread = thread;
            return this;
        }
        public String getThread() {
            return this.thread;
        }

    }

    public static class OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList extends TeaModel {
        @NameInMap("ConsumeModel")
        public String consumeModel;

        @NameInMap("RunningDataList")
        public java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList> runningDataList;

        @NameInMap("SubscriptionSet")
        public java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet> subscriptionSet;

        @NameInMap("Jstack")
        public java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListJstack> jstack;

        @NameInMap("LastTimeStamp")
        public Long lastTimeStamp;

        @NameInMap("StartTimeStamp")
        public Long startTimeStamp;

        @NameInMap("Language")
        public String language;

        @NameInMap("ClientId")
        public String clientId;

        @NameInMap("Connection")
        public String connection;

        @NameInMap("Version")
        public String version;

        @NameInMap("ConsumeType")
        public String consumeType;

        @NameInMap("ThreadCount")
        public Integer threadCount;

        public static OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList self = new OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList setConsumeModel(String consumeModel) {
            this.consumeModel = consumeModel;
            return this;
        }
        public String getConsumeModel() {
            return this.consumeModel;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList setRunningDataList(java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList> runningDataList) {
            this.runningDataList = runningDataList;
            return this;
        }
        public java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListRunningDataList> getRunningDataList() {
            return this.runningDataList;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList setSubscriptionSet(java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet> subscriptionSet) {
            this.subscriptionSet = subscriptionSet;
            return this;
        }
        public java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListSubscriptionSet> getSubscriptionSet() {
            return this.subscriptionSet;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList setJstack(java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListJstack> jstack) {
            this.jstack = jstack;
            return this;
        }
        public java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListJstack> getJstack() {
            return this.jstack;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList setLastTimeStamp(Long lastTimeStamp) {
            this.lastTimeStamp = lastTimeStamp;
            return this;
        }
        public Long getLastTimeStamp() {
            return this.lastTimeStamp;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList setStartTimeStamp(Long startTimeStamp) {
            this.startTimeStamp = startTimeStamp;
            return this;
        }
        public Long getStartTimeStamp() {
            return this.startTimeStamp;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList setConsumeType(String consumeType) {
            this.consumeType = consumeType;
            return this;
        }
        public String getConsumeType() {
            return this.consumeType;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList setThreadCount(Integer threadCount) {
            this.threadCount = threadCount;
            return this;
        }
        public Integer getThreadCount() {
            return this.threadCount;
        }

    }

    public static class OnsConsumerStatusResponseBodyDataDetailInTopicList extends TeaModel {
        @NameInMap("DelayTime")
        public Long delayTime;

        @NameInMap("TotalDiff")
        public Long totalDiff;

        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        @NameInMap("Topic")
        public String topic;

        public static OnsConsumerStatusResponseBodyDataDetailInTopicList build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataDetailInTopicList self = new OnsConsumerStatusResponseBodyDataDetailInTopicList();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataDetailInTopicList setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public OnsConsumerStatusResponseBodyDataDetailInTopicList setTotalDiff(Long totalDiff) {
            this.totalDiff = totalDiff;
            return this;
        }
        public Long getTotalDiff() {
            return this.totalDiff;
        }

        public OnsConsumerStatusResponseBodyDataDetailInTopicList setLastTimestamp(Long lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        public OnsConsumerStatusResponseBodyDataDetailInTopicList setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class OnsConsumerStatusResponseBodyData extends TeaModel {
        @NameInMap("ConsumeTps")
        public Float consumeTps;

        @NameInMap("ConsumeModel")
        public String consumeModel;

        @NameInMap("ConnectionSet")
        public java.util.List<OnsConsumerStatusResponseBodyDataConnectionSet> connectionSet;

        @NameInMap("TotalDiff")
        public Long totalDiff;

        @NameInMap("ConsumerConnectionInfoList")
        public java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList> consumerConnectionInfoList;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("DetailInTopicList")
        public java.util.List<OnsConsumerStatusResponseBodyDataDetailInTopicList> detailInTopicList;

        @NameInMap("SubscriptionSame")
        public Boolean subscriptionSame;

        @NameInMap("DelayTime")
        public Long delayTime;

        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        @NameInMap("Online")
        public Boolean online;

        @NameInMap("RebalanceOK")
        public Boolean rebalanceOK;

        public static OnsConsumerStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyData self = new OnsConsumerStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyData setConsumeTps(Float consumeTps) {
            this.consumeTps = consumeTps;
            return this;
        }
        public Float getConsumeTps() {
            return this.consumeTps;
        }

        public OnsConsumerStatusResponseBodyData setConsumeModel(String consumeModel) {
            this.consumeModel = consumeModel;
            return this;
        }
        public String getConsumeModel() {
            return this.consumeModel;
        }

        public OnsConsumerStatusResponseBodyData setConnectionSet(java.util.List<OnsConsumerStatusResponseBodyDataConnectionSet> connectionSet) {
            this.connectionSet = connectionSet;
            return this;
        }
        public java.util.List<OnsConsumerStatusResponseBodyDataConnectionSet> getConnectionSet() {
            return this.connectionSet;
        }

        public OnsConsumerStatusResponseBodyData setTotalDiff(Long totalDiff) {
            this.totalDiff = totalDiff;
            return this;
        }
        public Long getTotalDiff() {
            return this.totalDiff;
        }

        public OnsConsumerStatusResponseBodyData setConsumerConnectionInfoList(java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList> consumerConnectionInfoList) {
            this.consumerConnectionInfoList = consumerConnectionInfoList;
            return this;
        }
        public java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList> getConsumerConnectionInfoList() {
            return this.consumerConnectionInfoList;
        }

        public OnsConsumerStatusResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsConsumerStatusResponseBodyData setDetailInTopicList(java.util.List<OnsConsumerStatusResponseBodyDataDetailInTopicList> detailInTopicList) {
            this.detailInTopicList = detailInTopicList;
            return this;
        }
        public java.util.List<OnsConsumerStatusResponseBodyDataDetailInTopicList> getDetailInTopicList() {
            return this.detailInTopicList;
        }

        public OnsConsumerStatusResponseBodyData setSubscriptionSame(Boolean subscriptionSame) {
            this.subscriptionSame = subscriptionSame;
            return this;
        }
        public Boolean getSubscriptionSame() {
            return this.subscriptionSame;
        }

        public OnsConsumerStatusResponseBodyData setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public OnsConsumerStatusResponseBodyData setLastTimestamp(Long lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        public OnsConsumerStatusResponseBodyData setOnline(Boolean online) {
            this.online = online;
            return this;
        }
        public Boolean getOnline() {
            return this.online;
        }

        public OnsConsumerStatusResponseBodyData setRebalanceOK(Boolean rebalanceOK) {
            this.rebalanceOK = rebalanceOK;
            return this;
        }
        public Boolean getRebalanceOK() {
            return this.rebalanceOK;
        }

    }

}
