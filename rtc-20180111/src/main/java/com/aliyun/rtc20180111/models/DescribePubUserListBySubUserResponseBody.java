// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribePubUserListBySubUserResponseBody extends TeaModel {
    @NameInMap("CallStatus")
    public String callStatus;

    @NameInMap("PubUserDetailList")
    public java.util.List<DescribePubUserListBySubUserResponseBodyPubUserDetailList> pubUserDetailList;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("JoinTs")
        public Long joinTs;

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
        @NameInMap("CallIdList")
        public java.util.List<String> callIdList;

        @NameInMap("ClientType")
        public String clientType;

        @NameInMap("CreatedTs")
        public Long createdTs;

        @NameInMap("DestroyedTs")
        public Long destroyedTs;

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
        public java.util.List<DescribePubUserListBySubUserResponseBodyPubUserDetailListOnlinePeriods> onlinePeriods;

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
        @NameInMap("JoinTs")
        public Long joinTs;

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
        @NameInMap("ClientType")
        public String clientType;

        @NameInMap("CreatedTs")
        public Long createdTs;

        @NameInMap("DestroyedTs")
        public Long destroyedTs;

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
        public java.util.List<DescribePubUserListBySubUserResponseBodySubUserDetailOnlinePeriods> onlinePeriods;

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
