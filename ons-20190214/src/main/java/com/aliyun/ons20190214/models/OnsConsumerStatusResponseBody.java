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

    public static class OnsConsumerStatusResponseBodyDataConnectionSetConnectionDo extends TeaModel {
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

        public static OnsConsumerStatusResponseBodyDataConnectionSetConnectionDo build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConnectionSetConnectionDo self = new OnsConsumerStatusResponseBodyDataConnectionSetConnectionDo();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConnectionSetConnectionDo setRemoteIP(String remoteIP) {
            this.remoteIP = remoteIP;
            return this;
        }
        public String getRemoteIP() {
            return this.remoteIP;
        }

        public OnsConsumerStatusResponseBodyDataConnectionSetConnectionDo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public OnsConsumerStatusResponseBodyDataConnectionSetConnectionDo setClientAddr(String clientAddr) {
            this.clientAddr = clientAddr;
            return this;
        }
        public String getClientAddr() {
            return this.clientAddr;
        }

        public OnsConsumerStatusResponseBodyDataConnectionSetConnectionDo setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public OnsConsumerStatusResponseBodyDataConnectionSetConnectionDo setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

    }

    public static class OnsConsumerStatusResponseBodyDataConnectionSet extends TeaModel {
        @NameInMap("ConnectionDo")
        public java.util.List<OnsConsumerStatusResponseBodyDataConnectionSetConnectionDo> connectionDo;

        public static OnsConsumerStatusResponseBodyDataConnectionSet build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConnectionSet self = new OnsConsumerStatusResponseBodyDataConnectionSet();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConnectionSet setConnectionDo(java.util.List<OnsConsumerStatusResponseBodyDataConnectionSetConnectionDo> connectionDo) {
            this.connectionDo = connectionDo;
            return this;
        }
        public java.util.List<OnsConsumerStatusResponseBodyDataConnectionSetConnectionDo> getConnectionDo() {
            return this.connectionDo;
        }

    }

    public static class OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo extends TeaModel {
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

        public static OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo self = new OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo setRt(Float rt) {
            this.rt = rt;
            return this;
        }
        public Float getRt() {
            return this.rt;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo setFailedCountPerHour(Long failedCountPerHour) {
            this.failedCountPerHour = failedCountPerHour;
            return this;
        }
        public Long getFailedCountPerHour() {
            return this.failedCountPerHour;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo setOkTps(Float okTps) {
            this.okTps = okTps;
            return this;
        }
        public Float getOkTps() {
            return this.okTps;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo setFailedTps(Float failedTps) {
            this.failedTps = failedTps;
            return this;
        }
        public Float getFailedTps() {
            return this.failedTps;
        }

    }

    public static class OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataList extends TeaModel {
        @NameInMap("ConsumerRunningDataDo")
        public java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo> consumerRunningDataDo;

        public static OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataList build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataList self = new OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataList();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataList setConsumerRunningDataDo(java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo> consumerRunningDataDo) {
            this.consumerRunningDataDo = consumerRunningDataDo;
            return this;
        }
        public java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo> getConsumerRunningDataDo() {
            return this.consumerRunningDataDo;
        }

    }

    public static class OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionDataTagsSet extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<String> tag;

        public static OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionDataTagsSet build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionDataTagsSet self = new OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionDataTagsSet();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionDataTagsSet setTag(java.util.List<String> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<String> getTag() {
            return this.tag;
        }

    }

    public static class OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionData extends TeaModel {
        @NameInMap("SubString")
        public String subString;

        @NameInMap("SubVersion")
        public Long subVersion;

        @NameInMap("Topic")
        public String topic;

        @NameInMap("TagsSet")
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionDataTagsSet tagsSet;

        public static OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionData build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionData self = new OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionData();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionData setSubString(String subString) {
            this.subString = subString;
            return this;
        }
        public String getSubString() {
            return this.subString;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionData setSubVersion(Long subVersion) {
            this.subVersion = subVersion;
            return this;
        }
        public Long getSubVersion() {
            return this.subVersion;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionData setTagsSet(OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionDataTagsSet tagsSet) {
            this.tagsSet = tagsSet;
            return this;
        }
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionDataTagsSet getTagsSet() {
            return this.tagsSet;
        }

    }

    public static class OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSet extends TeaModel {
        @NameInMap("SubscriptionData")
        public java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionData> subscriptionData;

        public static OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSet build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSet self = new OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSet();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSet setSubscriptionData(java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionData> subscriptionData) {
            this.subscriptionData = subscriptionData;
            return this;
        }
        public java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionData> getSubscriptionData() {
            return this.subscriptionData;
        }

    }

    public static class OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDoTrackList extends TeaModel {
        @NameInMap("Track")
        public java.util.List<String> track;

        public static OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDoTrackList build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDoTrackList self = new OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDoTrackList();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDoTrackList setTrack(java.util.List<String> track) {
            this.track = track;
            return this;
        }
        public java.util.List<String> getTrack() {
            return this.track;
        }

    }

    public static class OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDo extends TeaModel {
        @NameInMap("TrackList")
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDoTrackList trackList;

        @NameInMap("Thread")
        public String thread;

        public static OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDo build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDo self = new OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDo();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDo setTrackList(OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDoTrackList trackList) {
            this.trackList = trackList;
            return this;
        }
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDoTrackList getTrackList() {
            return this.trackList;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDo setThread(String thread) {
            this.thread = thread;
            return this;
        }
        public String getThread() {
            return this.thread;
        }

    }

    public static class OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstack extends TeaModel {
        @NameInMap("ThreadTrackDo")
        public java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDo> threadTrackDo;

        public static OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstack build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstack self = new OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstack();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstack setThreadTrackDo(java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDo> threadTrackDo) {
            this.threadTrackDo = threadTrackDo;
            return this;
        }
        public java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDo> getThreadTrackDo() {
            return this.threadTrackDo;
        }

    }

    public static class OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo extends TeaModel {
        @NameInMap("ConsumeModel")
        public String consumeModel;

        @NameInMap("RunningDataList")
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataList runningDataList;

        @NameInMap("SubscriptionSet")
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSet subscriptionSet;

        @NameInMap("Jstack")
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstack jstack;

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

        public static OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo self = new OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setConsumeModel(String consumeModel) {
            this.consumeModel = consumeModel;
            return this;
        }
        public String getConsumeModel() {
            return this.consumeModel;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setRunningDataList(OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataList runningDataList) {
            this.runningDataList = runningDataList;
            return this;
        }
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataList getRunningDataList() {
            return this.runningDataList;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setSubscriptionSet(OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSet subscriptionSet) {
            this.subscriptionSet = subscriptionSet;
            return this;
        }
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSet getSubscriptionSet() {
            return this.subscriptionSet;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setJstack(OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstack jstack) {
            this.jstack = jstack;
            return this;
        }
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstack getJstack() {
            return this.jstack;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setLastTimeStamp(Long lastTimeStamp) {
            this.lastTimeStamp = lastTimeStamp;
            return this;
        }
        public Long getLastTimeStamp() {
            return this.lastTimeStamp;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setStartTimeStamp(Long startTimeStamp) {
            this.startTimeStamp = startTimeStamp;
            return this;
        }
        public Long getStartTimeStamp() {
            return this.startTimeStamp;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setConnection(String connection) {
            this.connection = connection;
            return this;
        }
        public String getConnection() {
            return this.connection;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setConsumeType(String consumeType) {
            this.consumeType = consumeType;
            return this;
        }
        public String getConsumeType() {
            return this.consumeType;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setThreadCount(Integer threadCount) {
            this.threadCount = threadCount;
            return this;
        }
        public Integer getThreadCount() {
            return this.threadCount;
        }

    }

    public static class OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList extends TeaModel {
        @NameInMap("ConsumerConnectionInfoDo")
        public java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo> consumerConnectionInfoDo;

        public static OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList self = new OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList setConsumerConnectionInfoDo(java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo> consumerConnectionInfoDo) {
            this.consumerConnectionInfoDo = consumerConnectionInfoDo;
            return this;
        }
        public java.util.List<OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo> getConsumerConnectionInfoDo() {
            return this.consumerConnectionInfoDo;
        }

    }

    public static class OnsConsumerStatusResponseBodyDataDetailInTopicListDetailInTopicDo extends TeaModel {
        @NameInMap("DelayTime")
        public Long delayTime;

        @NameInMap("TotalDiff")
        public Long totalDiff;

        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        @NameInMap("Topic")
        public String topic;

        public static OnsConsumerStatusResponseBodyDataDetailInTopicListDetailInTopicDo build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataDetailInTopicListDetailInTopicDo self = new OnsConsumerStatusResponseBodyDataDetailInTopicListDetailInTopicDo();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataDetailInTopicListDetailInTopicDo setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public OnsConsumerStatusResponseBodyDataDetailInTopicListDetailInTopicDo setTotalDiff(Long totalDiff) {
            this.totalDiff = totalDiff;
            return this;
        }
        public Long getTotalDiff() {
            return this.totalDiff;
        }

        public OnsConsumerStatusResponseBodyDataDetailInTopicListDetailInTopicDo setLastTimestamp(Long lastTimestamp) {
            this.lastTimestamp = lastTimestamp;
            return this;
        }
        public Long getLastTimestamp() {
            return this.lastTimestamp;
        }

        public OnsConsumerStatusResponseBodyDataDetailInTopicListDetailInTopicDo setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
        }

    }

    public static class OnsConsumerStatusResponseBodyDataDetailInTopicList extends TeaModel {
        @NameInMap("DetailInTopicDo")
        public java.util.List<OnsConsumerStatusResponseBodyDataDetailInTopicListDetailInTopicDo> detailInTopicDo;

        public static OnsConsumerStatusResponseBodyDataDetailInTopicList build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataDetailInTopicList self = new OnsConsumerStatusResponseBodyDataDetailInTopicList();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataDetailInTopicList setDetailInTopicDo(java.util.List<OnsConsumerStatusResponseBodyDataDetailInTopicListDetailInTopicDo> detailInTopicDo) {
            this.detailInTopicDo = detailInTopicDo;
            return this;
        }
        public java.util.List<OnsConsumerStatusResponseBodyDataDetailInTopicListDetailInTopicDo> getDetailInTopicDo() {
            return this.detailInTopicDo;
        }

    }

    public static class OnsConsumerStatusResponseBodyData extends TeaModel {
        @NameInMap("ConsumeTps")
        public Float consumeTps;

        @NameInMap("ConsumeModel")
        public String consumeModel;

        @NameInMap("ConnectionSet")
        public OnsConsumerStatusResponseBodyDataConnectionSet connectionSet;

        @NameInMap("TotalDiff")
        public Long totalDiff;

        @NameInMap("ConsumerConnectionInfoList")
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList consumerConnectionInfoList;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("DetailInTopicList")
        public OnsConsumerStatusResponseBodyDataDetailInTopicList detailInTopicList;

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

        public OnsConsumerStatusResponseBodyData setConnectionSet(OnsConsumerStatusResponseBodyDataConnectionSet connectionSet) {
            this.connectionSet = connectionSet;
            return this;
        }
        public OnsConsumerStatusResponseBodyDataConnectionSet getConnectionSet() {
            return this.connectionSet;
        }

        public OnsConsumerStatusResponseBodyData setTotalDiff(Long totalDiff) {
            this.totalDiff = totalDiff;
            return this;
        }
        public Long getTotalDiff() {
            return this.totalDiff;
        }

        public OnsConsumerStatusResponseBodyData setConsumerConnectionInfoList(OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList consumerConnectionInfoList) {
            this.consumerConnectionInfoList = consumerConnectionInfoList;
            return this;
        }
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList getConsumerConnectionInfoList() {
            return this.consumerConnectionInfoList;
        }

        public OnsConsumerStatusResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OnsConsumerStatusResponseBodyData setDetailInTopicList(OnsConsumerStatusResponseBodyDataDetailInTopicList detailInTopicList) {
            this.detailInTopicList = detailInTopicList;
            return this;
        }
        public OnsConsumerStatusResponseBodyDataDetailInTopicList getDetailInTopicList() {
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
