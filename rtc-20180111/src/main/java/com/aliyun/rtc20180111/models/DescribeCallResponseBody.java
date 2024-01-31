// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeCallResponseBody extends TeaModel {
    @NameInMap("CallInfo")
    public DescribeCallResponseBodyCallInfo callInfo;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UserDetailList")
    public java.util.List<DescribeCallResponseBodyUserDetailList> userDetailList;

    public static DescribeCallResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCallResponseBody self = new DescribeCallResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCallResponseBody setCallInfo(DescribeCallResponseBodyCallInfo callInfo) {
        this.callInfo = callInfo;
        return this;
    }
    public DescribeCallResponseBodyCallInfo getCallInfo() {
        return this.callInfo;
    }

    public DescribeCallResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCallResponseBody setUserDetailList(java.util.List<DescribeCallResponseBodyUserDetailList> userDetailList) {
        this.userDetailList = userDetailList;
        return this;
    }
    public java.util.List<DescribeCallResponseBodyUserDetailList> getUserDetailList() {
        return this.userDetailList;
    }

    public static class DescribeCallResponseBodyCallInfo extends TeaModel {
        /**
         * <p>App ID。</p>
         */
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CallStatus")
        public String callStatus;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("CreatedTs")
        public Long createdTs;

        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        @NameInMap("Duration")
        public Long duration;

        public static DescribeCallResponseBodyCallInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCallResponseBodyCallInfo self = new DescribeCallResponseBodyCallInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCallResponseBodyCallInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeCallResponseBodyCallInfo setCallStatus(String callStatus) {
            this.callStatus = callStatus;
            return this;
        }
        public String getCallStatus() {
            return this.callStatus;
        }

        public DescribeCallResponseBodyCallInfo setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeCallResponseBodyCallInfo setCreatedTs(Long createdTs) {
            this.createdTs = createdTs;
            return this;
        }
        public Long getCreatedTs() {
            return this.createdTs;
        }

        public DescribeCallResponseBodyCallInfo setDestroyedTs(Long destroyedTs) {
            this.destroyedTs = destroyedTs;
            return this;
        }
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        public DescribeCallResponseBodyCallInfo setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

    }

    public static class DescribeCallResponseBodyUserDetailListDurMetricStatData extends TeaModel {
        @NameInMap("PubAudio")
        public Long pubAudio;

        @NameInMap("PubVideo1080")
        public Long pubVideo1080;

        @NameInMap("PubVideo360")
        public Long pubVideo360;

        @NameInMap("PubVideo720")
        public Long pubVideo720;

        @NameInMap("PubVideoScreenShare")
        public Long pubVideoScreenShare;

        @NameInMap("SubAudio")
        public Long subAudio;

        @NameInMap("SubVideo1080")
        public Long subVideo1080;

        @NameInMap("SubVideo360")
        public Long subVideo360;

        @NameInMap("SubVideo720")
        public Long subVideo720;

        @NameInMap("SubVideoScreenShare")
        public Long subVideoScreenShare;

        public static DescribeCallResponseBodyUserDetailListDurMetricStatData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCallResponseBodyUserDetailListDurMetricStatData self = new DescribeCallResponseBodyUserDetailListDurMetricStatData();
            return TeaModel.build(map, self);
        }

        public DescribeCallResponseBodyUserDetailListDurMetricStatData setPubAudio(Long pubAudio) {
            this.pubAudio = pubAudio;
            return this;
        }
        public Long getPubAudio() {
            return this.pubAudio;
        }

        public DescribeCallResponseBodyUserDetailListDurMetricStatData setPubVideo1080(Long pubVideo1080) {
            this.pubVideo1080 = pubVideo1080;
            return this;
        }
        public Long getPubVideo1080() {
            return this.pubVideo1080;
        }

        public DescribeCallResponseBodyUserDetailListDurMetricStatData setPubVideo360(Long pubVideo360) {
            this.pubVideo360 = pubVideo360;
            return this;
        }
        public Long getPubVideo360() {
            return this.pubVideo360;
        }

        public DescribeCallResponseBodyUserDetailListDurMetricStatData setPubVideo720(Long pubVideo720) {
            this.pubVideo720 = pubVideo720;
            return this;
        }
        public Long getPubVideo720() {
            return this.pubVideo720;
        }

        public DescribeCallResponseBodyUserDetailListDurMetricStatData setPubVideoScreenShare(Long pubVideoScreenShare) {
            this.pubVideoScreenShare = pubVideoScreenShare;
            return this;
        }
        public Long getPubVideoScreenShare() {
            return this.pubVideoScreenShare;
        }

        public DescribeCallResponseBodyUserDetailListDurMetricStatData setSubAudio(Long subAudio) {
            this.subAudio = subAudio;
            return this;
        }
        public Long getSubAudio() {
            return this.subAudio;
        }

        public DescribeCallResponseBodyUserDetailListDurMetricStatData setSubVideo1080(Long subVideo1080) {
            this.subVideo1080 = subVideo1080;
            return this;
        }
        public Long getSubVideo1080() {
            return this.subVideo1080;
        }

        public DescribeCallResponseBodyUserDetailListDurMetricStatData setSubVideo360(Long subVideo360) {
            this.subVideo360 = subVideo360;
            return this;
        }
        public Long getSubVideo360() {
            return this.subVideo360;
        }

        public DescribeCallResponseBodyUserDetailListDurMetricStatData setSubVideo720(Long subVideo720) {
            this.subVideo720 = subVideo720;
            return this;
        }
        public Long getSubVideo720() {
            return this.subVideo720;
        }

        public DescribeCallResponseBodyUserDetailListDurMetricStatData setSubVideoScreenShare(Long subVideoScreenShare) {
            this.subVideoScreenShare = subVideoScreenShare;
            return this;
        }
        public Long getSubVideoScreenShare() {
            return this.subVideoScreenShare;
        }

    }

    public static class DescribeCallResponseBodyUserDetailListOnlinePeriods extends TeaModel {
        @NameInMap("JoinTs")
        public Long joinTs;

        @NameInMap("LeaveTs")
        public Long leaveTs;

        public static DescribeCallResponseBodyUserDetailListOnlinePeriods build(java.util.Map<String, ?> map) throws Exception {
            DescribeCallResponseBodyUserDetailListOnlinePeriods self = new DescribeCallResponseBodyUserDetailListOnlinePeriods();
            return TeaModel.build(map, self);
        }

        public DescribeCallResponseBodyUserDetailListOnlinePeriods setJoinTs(Long joinTs) {
            this.joinTs = joinTs;
            return this;
        }
        public Long getJoinTs() {
            return this.joinTs;
        }

        public DescribeCallResponseBodyUserDetailListOnlinePeriods setLeaveTs(Long leaveTs) {
            this.leaveTs = leaveTs;
            return this;
        }
        public Long getLeaveTs() {
            return this.leaveTs;
        }

    }

    public static class DescribeCallResponseBodyUserDetailList extends TeaModel {
        @NameInMap("CallExp")
        public String callExp;

        @NameInMap("CreatedTs")
        public Long createdTs;

        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        @NameInMap("DurMetricStatData")
        public DescribeCallResponseBodyUserDetailListDurMetricStatData durMetricStatData;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Location")
        public String location;

        @NameInMap("Network")
        public String network;

        @NameInMap("NetworkList")
        public java.util.List<String> networkList;

        @NameInMap("OnlineDuration")
        public Long onlineDuration;

        @NameInMap("OnlinePeriods")
        public java.util.List<DescribeCallResponseBodyUserDetailListOnlinePeriods> onlinePeriods;

        @NameInMap("Os")
        public String os;

        @NameInMap("OsList")
        public java.util.List<String> osList;

        @NameInMap("Roles")
        public java.util.List<String> roles;

        @NameInMap("SdkVersion")
        public String sdkVersion;

        @NameInMap("SdkVersionList")
        public java.util.List<String> sdkVersionList;

        @NameInMap("UserId")
        public String userId;

        public static DescribeCallResponseBodyUserDetailList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCallResponseBodyUserDetailList self = new DescribeCallResponseBodyUserDetailList();
            return TeaModel.build(map, self);
        }

        public DescribeCallResponseBodyUserDetailList setCallExp(String callExp) {
            this.callExp = callExp;
            return this;
        }
        public String getCallExp() {
            return this.callExp;
        }

        public DescribeCallResponseBodyUserDetailList setCreatedTs(Long createdTs) {
            this.createdTs = createdTs;
            return this;
        }
        public Long getCreatedTs() {
            return this.createdTs;
        }

        public DescribeCallResponseBodyUserDetailList setDestroyedTs(Long destroyedTs) {
            this.destroyedTs = destroyedTs;
            return this;
        }
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        public DescribeCallResponseBodyUserDetailList setDurMetricStatData(DescribeCallResponseBodyUserDetailListDurMetricStatData durMetricStatData) {
            this.durMetricStatData = durMetricStatData;
            return this;
        }
        public DescribeCallResponseBodyUserDetailListDurMetricStatData getDurMetricStatData() {
            return this.durMetricStatData;
        }

        public DescribeCallResponseBodyUserDetailList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeCallResponseBodyUserDetailList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeCallResponseBodyUserDetailList setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeCallResponseBodyUserDetailList setNetworkList(java.util.List<String> networkList) {
            this.networkList = networkList;
            return this;
        }
        public java.util.List<String> getNetworkList() {
            return this.networkList;
        }

        public DescribeCallResponseBodyUserDetailList setOnlineDuration(Long onlineDuration) {
            this.onlineDuration = onlineDuration;
            return this;
        }
        public Long getOnlineDuration() {
            return this.onlineDuration;
        }

        public DescribeCallResponseBodyUserDetailList setOnlinePeriods(java.util.List<DescribeCallResponseBodyUserDetailListOnlinePeriods> onlinePeriods) {
            this.onlinePeriods = onlinePeriods;
            return this;
        }
        public java.util.List<DescribeCallResponseBodyUserDetailListOnlinePeriods> getOnlinePeriods() {
            return this.onlinePeriods;
        }

        public DescribeCallResponseBodyUserDetailList setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeCallResponseBodyUserDetailList setOsList(java.util.List<String> osList) {
            this.osList = osList;
            return this;
        }
        public java.util.List<String> getOsList() {
            return this.osList;
        }

        public DescribeCallResponseBodyUserDetailList setRoles(java.util.List<String> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<String> getRoles() {
            return this.roles;
        }

        public DescribeCallResponseBodyUserDetailList setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        public DescribeCallResponseBodyUserDetailList setSdkVersionList(java.util.List<String> sdkVersionList) {
            this.sdkVersionList = sdkVersionList;
            return this;
        }
        public java.util.List<String> getSdkVersionList() {
            return this.sdkVersionList;
        }

        public DescribeCallResponseBodyUserDetailList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
