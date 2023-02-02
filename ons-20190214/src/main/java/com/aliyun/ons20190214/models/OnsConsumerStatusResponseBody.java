// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ons20190214.models;

import com.aliyun.tea.*;

public class OnsConsumerStatusResponseBody extends TeaModel {
    /**
     * <p>The query results.</p>
     */
    @NameInMap("Data")
    public OnsConsumerStatusResponseBodyData data;

    /**
     * <p>The ID of the request. This parameter is a common parameter. Each request has a unique ID. You can use this ID to troubleshoot issues.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static OnsConsumerStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OnsConsumerStatusResponseBody self = new OnsConsumerStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public OnsConsumerStatusResponseBody setData(OnsConsumerStatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public OnsConsumerStatusResponseBodyData getData() {
        return this.data;
    }

    public OnsConsumerStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class OnsConsumerStatusResponseBodyDataConnectionSetConnectionDo extends TeaModel {
        /**
         * <p>The IP address and port number of the consumer instance.</p>
         */
        @NameInMap("ClientAddr")
        public String clientAddr;

        /**
         * <p>The ID of the consumer instance.</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The programming language that the consumer client supports.</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The private or public IP address of the host.</p>
         */
        @NameInMap("RemoteIP")
        public String remoteIP;

        /**
         * <p>The version of the consumer client.</p>
         */
        @NameInMap("Version")
        public String version;

        public static OnsConsumerStatusResponseBodyDataConnectionSetConnectionDo build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConnectionSetConnectionDo self = new OnsConsumerStatusResponseBodyDataConnectionSetConnectionDo();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConnectionSetConnectionDo setClientAddr(String clientAddr) {
            this.clientAddr = clientAddr;
            return this;
        }
        public String getClientAddr() {
            return this.clientAddr;
        }

        public OnsConsumerStatusResponseBodyDataConnectionSetConnectionDo setClientId(String clientId) {
            this.clientId = clientId;
            return this;
        }
        public String getClientId() {
            return this.clientId;
        }

        public OnsConsumerStatusResponseBodyDataConnectionSetConnectionDo setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
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
        /**
         * <p>The name of the thread.</p>
         */
        @NameInMap("Thread")
        public String thread;

        /**
         * <p>The details of thread stack traces.</p>
         */
        @NameInMap("TrackList")
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDoTrackList trackList;

        public static OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDo build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDo self = new OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDo();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDo setThread(String thread) {
            this.thread = thread;
            return this;
        }
        public String getThread() {
            return this.thread;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDo setTrackList(OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDoTrackList trackList) {
            this.trackList = trackList;
            return this;
        }
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstackThreadTrackDoTrackList getTrackList() {
            return this.trackList;
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

    public static class OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo extends TeaModel {
        /**
         * <p>The number of messages that failed to be consumed each hour.</p>
         */
        @NameInMap("FailedCountPerHour")
        public Long failedCountPerHour;

        /**
         * <p>The TPS for failed message consumption.</p>
         */
        @NameInMap("FailedTps")
        public Float failedTps;

        /**
         * <p>The ID of the consumer group.</p>
         */
        @NameInMap("GroupId")
        public String groupId;

        /**
         * <p>The TPS for successful message consumption.</p>
         */
        @NameInMap("OkTps")
        public Float okTps;

        /**
         * <p>The consumption RT. Unit: milliseconds.</p>
         */
        @NameInMap("Rt")
        public Float rt;

        /**
         * <p>The name of the topic to which the consumer subscribes.</p>
         */
        @NameInMap("Topic")
        public String topic;

        public static OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo self = new OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo setFailedCountPerHour(Long failedCountPerHour) {
            this.failedCountPerHour = failedCountPerHour;
            return this;
        }
        public Long getFailedCountPerHour() {
            return this.failedCountPerHour;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo setFailedTps(Float failedTps) {
            this.failedTps = failedTps;
            return this;
        }
        public Float getFailedTps() {
            return this.failedTps;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo setGroupId(String groupId) {
            this.groupId = groupId;
            return this;
        }
        public String getGroupId() {
            return this.groupId;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataListConsumerRunningDataDo setOkTps(Float okTps) {
            this.okTps = okTps;
            return this;
        }
        public Float getOkTps() {
            return this.okTps;
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
        /**
         * <p>The expression that is used to specify the tags of messages in the subscribed topic.</p>
         */
        @NameInMap("SubString")
        public String subString;

        /**
         * <p>The subscription version. The value is of the LONG type and is automatically incremented.</p>
         */
        @NameInMap("SubVersion")
        public Long subVersion;

        /**
         * <p>The information about the tags of the topic to which the consumer subscribes.</p>
         */
        @NameInMap("TagsSet")
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionDataTagsSet tagsSet;

        /**
         * <p>The name of the topic to which the consumer subscribes.</p>
         */
        @NameInMap("Topic")
        public String topic;

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

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionData setTagsSet(OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionDataTagsSet tagsSet) {
            this.tagsSet = tagsSet;
            return this;
        }
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionDataTagsSet getTagsSet() {
            return this.tagsSet;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSetSubscriptionData setTopic(String topic) {
            this.topic = topic;
            return this;
        }
        public String getTopic() {
            return this.topic;
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

    public static class OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo extends TeaModel {
        /**
         * <p>The ID of the consumer instance.</p>
         */
        @NameInMap("ClientId")
        public String clientId;

        /**
         * <p>The connection information.</p>
         */
        @NameInMap("Connection")
        public String connection;

        /**
         * <p>The consumption mode. Valid values:</p>
         * <br>
         * <p>*   **CLUSTERING:** the clustering consumption mode</p>
         * <p>*   **BROADCASTING:** the broadcasting consumption mode</p>
         * <br>
         * <p>For more information about consumption modes, see [Clustering consumption and broadcasting consumption](~~43163~~).</p>
         */
        @NameInMap("ConsumeModel")
        public String consumeModel;

        /**
         * <p>The mode in which the consumer consumes messages. Valid values:</p>
         * <br>
         * <p>*   **PUSH:** The Message Queue for Apache RocketMQ broker pushes messages to the consumer.</p>
         * <p>*   **PULL:** The consumer pulls messages from the Message Queue for Apache RocketMQ broker.</p>
         */
        @NameInMap("ConsumeType")
        public String consumeType;

        /**
         * <p>The information about thread stack traces. If you want to obtain the information about thread stack traces, make sure that the **NeedJstack** parameter in the request is set to **true**. If the NeedJstack parameter is not set to true, the value of this parameter is empty.</p>
         */
        @NameInMap("Jstack")
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstack jstack;

        /**
         * <p>The programming language that the consumer supports.</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The most recent point in time when a message was consumed.</p>
         * <br>
         * <p>The value of this parameter is a UNIX timestamp in milliseconds.</p>
         */
        @NameInMap("LastTimeStamp")
        public Long lastTimeStamp;

        /**
         * <p>The real-time statistics.</p>
         */
        @NameInMap("RunningDataList")
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataList runningDataList;

        /**
         * <p>The earliest point in time when a message was consumed.</p>
         * <br>
         * <p>The value of this parameter is a UNIX timestamp in milliseconds.</p>
         */
        @NameInMap("StartTimeStamp")
        public Long startTimeStamp;

        /**
         * <p>The information about subscriptions.</p>
         */
        @NameInMap("SubscriptionSet")
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSet subscriptionSet;

        /**
         * <p>The number of consumer threads.</p>
         */
        @NameInMap("ThreadCount")
        public Integer threadCount;

        /**
         * <p>The version of the consumer client.</p>
         */
        @NameInMap("Version")
        public String version;

        public static OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo self = new OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo();
            return TeaModel.build(map, self);
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

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setConsumeModel(String consumeModel) {
            this.consumeModel = consumeModel;
            return this;
        }
        public String getConsumeModel() {
            return this.consumeModel;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setConsumeType(String consumeType) {
            this.consumeType = consumeType;
            return this;
        }
        public String getConsumeType() {
            return this.consumeType;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setJstack(OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstack jstack) {
            this.jstack = jstack;
            return this;
        }
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoJstack getJstack() {
            return this.jstack;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setLastTimeStamp(Long lastTimeStamp) {
            this.lastTimeStamp = lastTimeStamp;
            return this;
        }
        public Long getLastTimeStamp() {
            return this.lastTimeStamp;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setRunningDataList(OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataList runningDataList) {
            this.runningDataList = runningDataList;
            return this;
        }
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoRunningDataList getRunningDataList() {
            return this.runningDataList;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setStartTimeStamp(Long startTimeStamp) {
            this.startTimeStamp = startTimeStamp;
            return this;
        }
        public Long getStartTimeStamp() {
            return this.startTimeStamp;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setSubscriptionSet(OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSet subscriptionSet) {
            this.subscriptionSet = subscriptionSet;
            return this;
        }
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDoSubscriptionSet getSubscriptionSet() {
            return this.subscriptionSet;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setThreadCount(Integer threadCount) {
            this.threadCount = threadCount;
            return this;
        }
        public Integer getThreadCount() {
            return this.threadCount;
        }

        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoListConsumerConnectionInfoDo setVersion(String version) {
            this.version = version;
            return this;
        }
        public String getVersion() {
            return this.version;
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
        /**
         * <p>The latency of message consumption in the topic. Unit: milliseconds.</p>
         */
        @NameInMap("DelayTime")
        public Long delayTime;

        /**
         * <p>The most recent point in time when a message was consumed.</p>
         * <br>
         * <p>The value of this parameter is a UNIX timestamp in milliseconds.</p>
         */
        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        /**
         * <p>The name of the topic.</p>
         */
        @NameInMap("Topic")
        public String topic;

        /**
         * <p>The number of accumulated messages in the topic.</p>
         */
        @NameInMap("TotalDiff")
        public Long totalDiff;

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

        public OnsConsumerStatusResponseBodyDataDetailInTopicListDetailInTopicDo setTotalDiff(Long totalDiff) {
            this.totalDiff = totalDiff;
            return this;
        }
        public Long getTotalDiff() {
            return this.totalDiff;
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
        /**
         * <p>The information about online consumers in the consumer group.</p>
         */
        @NameInMap("ConnectionSet")
        public OnsConsumerStatusResponseBodyDataConnectionSet connectionSet;

        /**
         * <p>The consumption mode. Valid values:</p>
         * <br>
         * <p>*   **CLUSTERING:** the clustering consumption mode</p>
         * <p>*   **BROADCASTING:** the broadcasting consumption mode</p>
         * <br>
         * <p>For more information about consumption modes, see [Clustering consumption and broadcasting consumption](~~43163~~).</p>
         */
        @NameInMap("ConsumeModel")
        public String consumeModel;

        /**
         * <p>The TPS for message consumption.</p>
         */
        @NameInMap("ConsumeTps")
        public Float consumeTps;

        /**
         * <p>The details of online consumers in the consumer group, including the information about the thread stack traces and the consumption response time (RT). If you want to obtain the details of online consumers in the consumer group, make sure that the **Detail** parameter in the request is set to **true**. If the Detail parameter is not set to true, the value of this parameter is empty.</p>
         */
        @NameInMap("ConsumerConnectionInfoList")
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList consumerConnectionInfoList;

        /**
         * <p>The maximum latency of message consumption in all topics to which the consumer group subscribe. Unit: milliseconds.</p>
         */
        @NameInMap("DelayTime")
        public Long delayTime;

        /**
         * <p>The information about message consumption by topic. If you want to obtain the information about the consumption status of each topic, make sure that the **Detail** parameter in the request is set to **true**. If the Detail parameter is not set to true, the value of this parameter is empty.</p>
         */
        @NameInMap("DetailInTopicList")
        public OnsConsumerStatusResponseBodyDataDetailInTopicList detailInTopicList;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The most recent point in time when a message was consumed.</p>
         * <br>
         * <p>The value of this parameter is a UNIX timestamp in milliseconds.</p>
         */
        @NameInMap("LastTimestamp")
        public Long lastTimestamp;

        /**
         * <p>Indicates whether the consumer group is online.</p>
         */
        @NameInMap("Online")
        public Boolean online;

        /**
         * <p>Indicates whether load balancing is performed as expected. Valid values:</p>
         * <br>
         * <p>*   **true:** Load balancing is performed as expected.</p>
         * <p>*   **false:** Load balancing is not performed as expected.</p>
         */
        @NameInMap("RebalanceOK")
        public Boolean rebalanceOK;

        /**
         * <p>Indicates whether all consumers in the consumer group subscribe to the same topics and tags.</p>
         */
        @NameInMap("SubscriptionSame")
        public Boolean subscriptionSame;

        /**
         * <p>The total number of accumulated messages.</p>
         */
        @NameInMap("TotalDiff")
        public Long totalDiff;

        public static OnsConsumerStatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            OnsConsumerStatusResponseBodyData self = new OnsConsumerStatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public OnsConsumerStatusResponseBodyData setConnectionSet(OnsConsumerStatusResponseBodyDataConnectionSet connectionSet) {
            this.connectionSet = connectionSet;
            return this;
        }
        public OnsConsumerStatusResponseBodyDataConnectionSet getConnectionSet() {
            return this.connectionSet;
        }

        public OnsConsumerStatusResponseBodyData setConsumeModel(String consumeModel) {
            this.consumeModel = consumeModel;
            return this;
        }
        public String getConsumeModel() {
            return this.consumeModel;
        }

        public OnsConsumerStatusResponseBodyData setConsumeTps(Float consumeTps) {
            this.consumeTps = consumeTps;
            return this;
        }
        public Float getConsumeTps() {
            return this.consumeTps;
        }

        public OnsConsumerStatusResponseBodyData setConsumerConnectionInfoList(OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList consumerConnectionInfoList) {
            this.consumerConnectionInfoList = consumerConnectionInfoList;
            return this;
        }
        public OnsConsumerStatusResponseBodyDataConsumerConnectionInfoList getConsumerConnectionInfoList() {
            return this.consumerConnectionInfoList;
        }

        public OnsConsumerStatusResponseBodyData setDelayTime(Long delayTime) {
            this.delayTime = delayTime;
            return this;
        }
        public Long getDelayTime() {
            return this.delayTime;
        }

        public OnsConsumerStatusResponseBodyData setDetailInTopicList(OnsConsumerStatusResponseBodyDataDetailInTopicList detailInTopicList) {
            this.detailInTopicList = detailInTopicList;
            return this;
        }
        public OnsConsumerStatusResponseBodyDataDetailInTopicList getDetailInTopicList() {
            return this.detailInTopicList;
        }

        public OnsConsumerStatusResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
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

        public OnsConsumerStatusResponseBodyData setSubscriptionSame(Boolean subscriptionSame) {
            this.subscriptionSame = subscriptionSame;
            return this;
        }
        public Boolean getSubscriptionSame() {
            return this.subscriptionSame;
        }

        public OnsConsumerStatusResponseBodyData setTotalDiff(Long totalDiff) {
            this.totalDiff = totalDiff;
            return this;
        }
        public Long getTotalDiff() {
            return this.totalDiff;
        }

    }

}
