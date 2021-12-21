// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeCallResponseBody extends TeaModel {
    // 通信基本信息。
    @NameInMap("CallInfo")
    public DescribeCallResponseBodyCallInfo callInfo;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 用户详情列表。
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
        // App ID。
        @NameInMap("AppId")
        public String appId;

        // 通信状态。取值：IN：进行中。OUT：已结束。
        @NameInMap("CallStatus")
        public String callStatus;

        // 频道ID。
        @NameInMap("ChannelId")
        public String channelId;

        // 创建通信时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("CreatedTs")
        public Long createdTs;

        // 释放通信时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        // 通信持续时长，单位：秒。
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
        // 发布音频时长，单位秒
        @NameInMap("PubAudio")
        public Long pubAudio;

        // 发布1080P视频时长，单位：秒
        @NameInMap("PubVideo1080")
        public Long pubVideo1080;

        // 发布360P视频时长，单位秒
        @NameInMap("PubVideo360")
        public Long pubVideo360;

        // 发布720P视频时长，单位：秒
        @NameInMap("PubVideo720")
        public Long pubVideo720;

        // 发布屏幕共享时长，单位：秒
        @NameInMap("PubVideoScreenShare")
        public Long pubVideoScreenShare;

        // 订阅音频时长，单位秒
        @NameInMap("SubAudio")
        public Long subAudio;

        // 订阅1080P视频时长，单位：秒
        @NameInMap("SubVideo1080")
        public Long subVideo1080;

        // 订阅360P视频时长，单位：秒
        @NameInMap("SubVideo360")
        public Long subVideo360;

        // 订阅720P视频时长，单位：秒
        @NameInMap("SubVideo720")
        public Long subVideo720;

        // 订阅屏幕共享时长，单位：秒
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
        // 加入通话时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("JoinTs")
        public Long joinTs;

        // 离开通话时间，使用UNIX时间戳表示，单位：秒。
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
        // 通话体验，取值：GOOD:优良，BAD:欠佳。
        @NameInMap("CallExp")
        public String callExp;

        // 创建通话时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("CreatedTs")
        public Long createdTs;

        // 释放通话时间，使用UNIX时间戳表示，单位：秒。通话未结束时值为0。
        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        // 时长统计数据
        @NameInMap("DurMetricStatData")
        public DescribeCallResponseBodyUserDetailListDurMetricStatData durMetricStatData;

        // 通话时长，首次进入到最后离开，单位：秒。
        @NameInMap("Duration")
        public Long duration;

        // 地理位置信息，例如：北京市-北京市
        @NameInMap("Location")
        public String location;

        // 网络类型，如WiFi，4G等
        @NameInMap("Network")
        public String network;

        // 网络类型，如WiFi，4G等
        @NameInMap("NetworkList")
        public java.util.List<String> networkList;

        // 在线时长，单位：秒。
        @NameInMap("OnlineDuration")
        public Long onlineDuration;

        // 在线时段信息。
        @NameInMap("OnlinePeriods")
        public java.util.List<DescribeCallResponseBodyUserDetailListOnlinePeriods> onlinePeriods;

        // 平台类型：若用户客户端为WEB则是浏览器类型，若客户端为NATIVE则是操作系统类型
        @NameInMap("Os")
        public String os;

        // 平台类型：若用户客户端为WEB则是浏览器类型，若客户端为NATIVE则是操作系统类型
        @NameInMap("OsList")
        public java.util.List<String> osList;

        // 用户角色，取值：SENDER：发布端。RECEIVER：订阅端。
        @NameInMap("Roles")
        public java.util.List<String> roles;

        // SDK版本，如1.0.0、1.1.1等
        @NameInMap("SdkVersion")
        public String sdkVersion;

        // SDK版本列表，如1.0.0、1.1.1等
        @NameInMap("SdkVersionList")
        public java.util.List<String> sdkVersionList;

        // 用户ID。
        @NameInMap("UserId")
        public String userId;

        // 用户ID 别称
        @NameInMap("UserIdAlias")
        public String userIdAlias;

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

        public DescribeCallResponseBodyUserDetailList setUserIdAlias(String userIdAlias) {
            this.userIdAlias = userIdAlias;
            return this;
        }
        public String getUserIdAlias() {
            return this.userIdAlias;
        }

    }

}
