// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribePubUserListBySubUserResponseBody extends TeaModel {
    // 通信状态。取值：IN：进行中。OUT：已结束。
    @NameInMap("CallStatus")
    public String callStatus;

    // 发布端用户详情信息。
    @NameInMap("PubUserDetailList")
    public java.util.List<DescribePubUserListBySubUserResponseBodyPubUserDetailList> pubUserDetailList;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    // 订阅端用户详细信息。
    @NameInMap("SubUserDetail")
    public DescribePubUserListBySubUserResponseBodySubUserDetail subUserDetail;

    public static DescribePubUserListBySubUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePubUserListBySubUserResponseBody self = new DescribePubUserListBySubUserResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePubUserListBySubUserResponseBody setCallStatus(String callStatus) {
        this.callStatus = callStatus;
        return this;
    }
    public String getCallStatus() {
        return this.callStatus;
    }

    public DescribePubUserListBySubUserResponseBody setPubUserDetailList(java.util.List<DescribePubUserListBySubUserResponseBodyPubUserDetailList> pubUserDetailList) {
        this.pubUserDetailList = pubUserDetailList;
        return this;
    }
    public java.util.List<DescribePubUserListBySubUserResponseBodyPubUserDetailList> getPubUserDetailList() {
        return this.pubUserDetailList;
    }

    public DescribePubUserListBySubUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePubUserListBySubUserResponseBody setSubUserDetail(DescribePubUserListBySubUserResponseBodySubUserDetail subUserDetail) {
        this.subUserDetail = subUserDetail;
        return this;
    }
    public DescribePubUserListBySubUserResponseBodySubUserDetail getSubUserDetail() {
        return this.subUserDetail;
    }

    public static class DescribePubUserListBySubUserResponseBodyPubUserDetailListOnlinePeriods extends TeaModel {
        // 加入通话时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("JoinTs")
        public Long joinTs;

        // 离开通话时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("LeaveTs")
        public Long leaveTs;

        public static DescribePubUserListBySubUserResponseBodyPubUserDetailListOnlinePeriods build(java.util.Map<String, ?> map) throws Exception {
            DescribePubUserListBySubUserResponseBodyPubUserDetailListOnlinePeriods self = new DescribePubUserListBySubUserResponseBodyPubUserDetailListOnlinePeriods();
            return TeaModel.build(map, self);
        }

        public DescribePubUserListBySubUserResponseBodyPubUserDetailListOnlinePeriods setJoinTs(Long joinTs) {
            this.joinTs = joinTs;
            return this;
        }
        public Long getJoinTs() {
            return this.joinTs;
        }

        public DescribePubUserListBySubUserResponseBodyPubUserDetailListOnlinePeriods setLeaveTs(Long leaveTs) {
            this.leaveTs = leaveTs;
            return this;
        }
        public Long getLeaveTs() {
            return this.leaveTs;
        }

    }

    public static class DescribePubUserListBySubUserResponseBodyPubUserDetailList extends TeaModel {
        // 用户通信流的Call ID。
        @NameInMap("CallIdList")
        public java.util.List<String> callIdList;

        // 端类型，取值：WEB：Web端。NATIVE：本地端。
        @NameInMap("ClientType")
        public String clientType;

        // 第一次加入通话的时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("CreatedTs")
        public Long createdTs;

        // 最后一次离开通话的时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        // 通话时长，首次进入到最后离开，单位：秒。
        @NameInMap("Duration")
        public Long duration;

        // 地理位置信息，例如：浙江省-杭州市。
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
        public java.util.List<DescribePubUserListBySubUserResponseBodyPubUserDetailListOnlinePeriods> onlinePeriods;

        // 平台类型：若用户客户端为WEB则是浏览器类型，若客户端为NATIVE则是操作系统类型
        @NameInMap("Os")
        public String os;

        // 平台类型：若用户客户端为WEB则是浏览器类型，若客户端为NATIVE则是操作系统类型
        @NameInMap("OsList")
        public java.util.List<String> osList;

        // 用户角色，取值：SENDER：发起者。RECEIVER：接收者。
        @NameInMap("Roles")
        public java.util.List<String> roles;

        // SDK版本。
        @NameInMap("SdkVersion")
        public String sdkVersion;

        // SDK版本列表，如1.0.0、1.1.1等
        @NameInMap("SdkVersionList")
        public java.util.List<String> sdkVersionList;

        // 用户ID。
        @NameInMap("UserId")
        public String userId;

        // 用户ID别称
        @NameInMap("UserIdAlias")
        public String userIdAlias;

        public static DescribePubUserListBySubUserResponseBodyPubUserDetailList build(java.util.Map<String, ?> map) throws Exception {
            DescribePubUserListBySubUserResponseBodyPubUserDetailList self = new DescribePubUserListBySubUserResponseBodyPubUserDetailList();
            return TeaModel.build(map, self);
        }

        public DescribePubUserListBySubUserResponseBodyPubUserDetailList setCallIdList(java.util.List<String> callIdList) {
            this.callIdList = callIdList;
            return this;
        }
        public java.util.List<String> getCallIdList() {
            return this.callIdList;
        }

        public DescribePubUserListBySubUserResponseBodyPubUserDetailList setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public DescribePubUserListBySubUserResponseBodyPubUserDetailList setCreatedTs(Long createdTs) {
            this.createdTs = createdTs;
            return this;
        }
        public Long getCreatedTs() {
            return this.createdTs;
        }

        public DescribePubUserListBySubUserResponseBodyPubUserDetailList setDestroyedTs(Long destroyedTs) {
            this.destroyedTs = destroyedTs;
            return this;
        }
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        public DescribePubUserListBySubUserResponseBodyPubUserDetailList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribePubUserListBySubUserResponseBodyPubUserDetailList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribePubUserListBySubUserResponseBodyPubUserDetailList setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribePubUserListBySubUserResponseBodyPubUserDetailList setNetworkList(java.util.List<String> networkList) {
            this.networkList = networkList;
            return this;
        }
        public java.util.List<String> getNetworkList() {
            return this.networkList;
        }

        public DescribePubUserListBySubUserResponseBodyPubUserDetailList setOnlineDuration(Long onlineDuration) {
            this.onlineDuration = onlineDuration;
            return this;
        }
        public Long getOnlineDuration() {
            return this.onlineDuration;
        }

        public DescribePubUserListBySubUserResponseBodyPubUserDetailList setOnlinePeriods(java.util.List<DescribePubUserListBySubUserResponseBodyPubUserDetailListOnlinePeriods> onlinePeriods) {
            this.onlinePeriods = onlinePeriods;
            return this;
        }
        public java.util.List<DescribePubUserListBySubUserResponseBodyPubUserDetailListOnlinePeriods> getOnlinePeriods() {
            return this.onlinePeriods;
        }

        public DescribePubUserListBySubUserResponseBodyPubUserDetailList setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribePubUserListBySubUserResponseBodyPubUserDetailList setOsList(java.util.List<String> osList) {
            this.osList = osList;
            return this;
        }
        public java.util.List<String> getOsList() {
            return this.osList;
        }

        public DescribePubUserListBySubUserResponseBodyPubUserDetailList setRoles(java.util.List<String> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<String> getRoles() {
            return this.roles;
        }

        public DescribePubUserListBySubUserResponseBodyPubUserDetailList setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        public DescribePubUserListBySubUserResponseBodyPubUserDetailList setSdkVersionList(java.util.List<String> sdkVersionList) {
            this.sdkVersionList = sdkVersionList;
            return this;
        }
        public java.util.List<String> getSdkVersionList() {
            return this.sdkVersionList;
        }

        public DescribePubUserListBySubUserResponseBodyPubUserDetailList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribePubUserListBySubUserResponseBodyPubUserDetailList setUserIdAlias(String userIdAlias) {
            this.userIdAlias = userIdAlias;
            return this;
        }
        public String getUserIdAlias() {
            return this.userIdAlias;
        }

    }

    public static class DescribePubUserListBySubUserResponseBodySubUserDetailOnlinePeriods extends TeaModel {
        // 加入通话时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("JoinTs")
        public Long joinTs;

        // 离开通话时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("LeaveTs")
        public Long leaveTs;

        public static DescribePubUserListBySubUserResponseBodySubUserDetailOnlinePeriods build(java.util.Map<String, ?> map) throws Exception {
            DescribePubUserListBySubUserResponseBodySubUserDetailOnlinePeriods self = new DescribePubUserListBySubUserResponseBodySubUserDetailOnlinePeriods();
            return TeaModel.build(map, self);
        }

        public DescribePubUserListBySubUserResponseBodySubUserDetailOnlinePeriods setJoinTs(Long joinTs) {
            this.joinTs = joinTs;
            return this;
        }
        public Long getJoinTs() {
            return this.joinTs;
        }

        public DescribePubUserListBySubUserResponseBodySubUserDetailOnlinePeriods setLeaveTs(Long leaveTs) {
            this.leaveTs = leaveTs;
            return this;
        }
        public Long getLeaveTs() {
            return this.leaveTs;
        }

    }

    public static class DescribePubUserListBySubUserResponseBodySubUserDetail extends TeaModel {
        // 端类型，取值：WEB：Web端。NATIVE：本地端。
        @NameInMap("ClientType")
        public String clientType;

        // 第一次加入通话的时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("CreatedTs")
        public Long createdTs;

        // 最后一次离开通话的时间，使用UNIX时间戳表示，单位：秒。通话未结束时值为0。
        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        // 通话时长，首次进入到最后离开，单位：秒。
        @NameInMap("Duration")
        public Long duration;

        // 地理位置信息，例如：浙江省-杭州市。
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
        public java.util.List<DescribePubUserListBySubUserResponseBodySubUserDetailOnlinePeriods> onlinePeriods;

        // 平台类型：若用户客户端为WEB则是浏览器类型，若客户端为NATIVE则是操作系统类型
        @NameInMap("Os")
        public String os;

        // 平台类型：若用户客户端为WEB则是浏览器类型，若客户端为NATIVE则是操作系统类型
        @NameInMap("OsList")
        public java.util.List<String> osList;

        // 用户角色，取值：SENDER：发布端。RECEIVER：订阅端。
        @NameInMap("Roles")
        public java.util.List<String> roles;

        // SDK版本。
        @NameInMap("SdkVersion")
        public String sdkVersion;

        // SDK版本列表，如1.0.0、1.1.1等
        @NameInMap("SdkVersionList")
        public java.util.List<String> sdkVersionList;

        // 用户ID。
        @NameInMap("UserId")
        public String userId;

        // 用户ID别称
        @NameInMap("UserIdAlias")
        public String userIdAlias;

        public static DescribePubUserListBySubUserResponseBodySubUserDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribePubUserListBySubUserResponseBodySubUserDetail self = new DescribePubUserListBySubUserResponseBodySubUserDetail();
            return TeaModel.build(map, self);
        }

        public DescribePubUserListBySubUserResponseBodySubUserDetail setClientType(String clientType) {
            this.clientType = clientType;
            return this;
        }
        public String getClientType() {
            return this.clientType;
        }

        public DescribePubUserListBySubUserResponseBodySubUserDetail setCreatedTs(Long createdTs) {
            this.createdTs = createdTs;
            return this;
        }
        public Long getCreatedTs() {
            return this.createdTs;
        }

        public DescribePubUserListBySubUserResponseBodySubUserDetail setDestroyedTs(Long destroyedTs) {
            this.destroyedTs = destroyedTs;
            return this;
        }
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        public DescribePubUserListBySubUserResponseBodySubUserDetail setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribePubUserListBySubUserResponseBodySubUserDetail setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribePubUserListBySubUserResponseBodySubUserDetail setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribePubUserListBySubUserResponseBodySubUserDetail setNetworkList(java.util.List<String> networkList) {
            this.networkList = networkList;
            return this;
        }
        public java.util.List<String> getNetworkList() {
            return this.networkList;
        }

        public DescribePubUserListBySubUserResponseBodySubUserDetail setOnlineDuration(Long onlineDuration) {
            this.onlineDuration = onlineDuration;
            return this;
        }
        public Long getOnlineDuration() {
            return this.onlineDuration;
        }

        public DescribePubUserListBySubUserResponseBodySubUserDetail setOnlinePeriods(java.util.List<DescribePubUserListBySubUserResponseBodySubUserDetailOnlinePeriods> onlinePeriods) {
            this.onlinePeriods = onlinePeriods;
            return this;
        }
        public java.util.List<DescribePubUserListBySubUserResponseBodySubUserDetailOnlinePeriods> getOnlinePeriods() {
            return this.onlinePeriods;
        }

        public DescribePubUserListBySubUserResponseBodySubUserDetail setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribePubUserListBySubUserResponseBodySubUserDetail setOsList(java.util.List<String> osList) {
            this.osList = osList;
            return this;
        }
        public java.util.List<String> getOsList() {
            return this.osList;
        }

        public DescribePubUserListBySubUserResponseBodySubUserDetail setRoles(java.util.List<String> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<String> getRoles() {
            return this.roles;
        }

        public DescribePubUserListBySubUserResponseBodySubUserDetail setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        public DescribePubUserListBySubUserResponseBodySubUserDetail setSdkVersionList(java.util.List<String> sdkVersionList) {
            this.sdkVersionList = sdkVersionList;
            return this;
        }
        public java.util.List<String> getSdkVersionList() {
            return this.sdkVersionList;
        }

        public DescribePubUserListBySubUserResponseBodySubUserDetail setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribePubUserListBySubUserResponseBodySubUserDetail setUserIdAlias(String userIdAlias) {
            this.userIdAlias = userIdAlias;
            return this;
        }
        public String getUserIdAlias() {
            return this.userIdAlias;
        }

    }

}
