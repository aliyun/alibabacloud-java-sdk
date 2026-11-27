// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribePubUserListBySubUserResponseBody extends TeaModel {
    /**
     * <p>Communication status. Valid values:  </p>
     * <ul>
     * <li><strong>IN</strong>: In progress.  </li>
     * <li><strong>OUT</strong>: Ended.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>IN</p>
     */
    @NameInMap("CallStatus")
    public String callStatus;

    /**
     * <p>Details of publishing users.</p>
     */
    @NameInMap("PubUserDetailList")
    public java.util.List<DescribePubUserListBySubUserResponseBodyPubUserDetailList> pubUserDetailList;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Subscriber user details.</p>
     */
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
        /**
         * <p>The time when the user joined the channel, represented as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614936817</p>
         */
        @NameInMap("JoinTs")
        public Long joinTs;

        /**
         * <p>The time when the user left the channel, represented as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614936817</p>
         */
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
        /**
         * <p>Call IDs of the user&quot;s communication streams.</p>
         */
        @NameInMap("CallIdList")
        public java.util.List<String> callIdList;

        /**
         * <p>Client type. Valid values: WEB: Web client. NATIVE: Native client.</p>
         * 
         * <strong>example:</strong>
         * <p>NATIVE</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>The time when the user first joined the channel, represented as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614936817</p>
         */
        @NameInMap("CreatedTs")
        public Long createdTs;

        /**
         * <p>The time when the user last left the channel, represented as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614936817</p>
         */
        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        /**
         * <p>Communication duration, measured from the first entry to the final exit, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>Geographical location information, such as Zhejiang Province-Hangzhou City.</p>
         * 
         * <strong>example:</strong>
         * <p>浙江省-杭州市</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>Network type, such as WiFi, 4G, etc.</p>
         * 
         * <strong>example:</strong>
         * <p>4G</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>Network types, such as WiFi, 4G, etc.</p>
         */
        @NameInMap("NetworkList")
        public java.util.List<String> networkList;

        /**
         * <p>Online duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OnlineDuration")
        public Long onlineDuration;

        /**
         * <p>Online period information.</p>
         */
        @NameInMap("OnlinePeriods")
        public java.util.List<DescribePubUserListBySubUserResponseBodyPubUserDetailListOnlinePeriods> onlinePeriods;

        /**
         * <p>Platform Type: If the client type is WEB, this field indicates the type of the browser. If the client type is NATIVE, this field indicates the operating system.</p>
         * 
         * <strong>example:</strong>
         * <p>iOS</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>Platform Type: If the client type is WEB, this field indicates the type of the browser. If the client type is NATIVE, this field indicates the operating system.</p>
         */
        @NameInMap("OsList")
        public java.util.List<String> osList;

        /**
         * <p>User roles. Valid values: SENDER: sender. RECEIVER: receiver.</p>
         */
        @NameInMap("Roles")
        public java.util.List<String> roles;

        /**
         * <p>SDK Version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("SdkVersion")
        public String sdkVersion;

        /**
         * <p>List of software development kit (SDK) versions, such as 1.0.0, 1.1.1, etc.</p>
         */
        @NameInMap("SdkVersionList")
        public java.util.List<String> sdkVersionList;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>testuserid</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>User ID alias.</p>
         * 
         * <strong>example:</strong>
         * <p>yi****</p>
         */
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
        /**
         * <p>The time when the user joined the channel, represented as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614936817</p>
         */
        @NameInMap("JoinTs")
        public Long joinTs;

        /**
         * <p>The time when the user left the channel, represented as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614936817</p>
         */
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
        /**
         * <p>Client type. Valid values: WEB: Web client. NATIVE: Native client.</p>
         * 
         * <strong>example:</strong>
         * <p>NATIVE</p>
         */
        @NameInMap("ClientType")
        public String clientType;

        /**
         * <p>The time when the user first joined the channel, represented as a UNIX timestamp in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614936817</p>
         */
        @NameInMap("CreatedTs")
        public Long createdTs;

        /**
         * <p>The time when the user last left the channel, represented as a UNIX timestamp, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1614936817</p>
         */
        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        /**
         * <p>Communication duration, from the first entry to the final exit, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>Geographic location information, such as Zhejiang Province-Hangzhou City.</p>
         * 
         * <strong>example:</strong>
         * <p>浙江省-杭州市</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>Network type, such as WiFi, 4G, etc.</p>
         * 
         * <strong>example:</strong>
         * <p>4G</p>
         */
        @NameInMap("Network")
        public String network;

        /**
         * <p>Network type, such as WiFi, 4G, etc.</p>
         */
        @NameInMap("NetworkList")
        public java.util.List<String> networkList;

        /**
         * <p>Online duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OnlineDuration")
        public Long onlineDuration;

        /**
         * <p>Online period information.</p>
         */
        @NameInMap("OnlinePeriods")
        public java.util.List<DescribePubUserListBySubUserResponseBodySubUserDetailOnlinePeriods> onlinePeriods;

        /**
         * <p>Platform Type: If the client type is WEB, this field indicates the type of the browser. If the client type is NATIVE, this field indicates the operating system type.</p>
         * 
         * <strong>example:</strong>
         * <p>iOS</p>
         */
        @NameInMap("Os")
        public String os;

        /**
         * <p>Platform Type: If the client type is WEB, this field indicates the type of the browser. If the client type is NATIVE, this field indicates the operating system type.</p>
         */
        @NameInMap("OsList")
        public java.util.List<String> osList;

        /**
         * <p>User role.</p>
         */
        @NameInMap("Roles")
        public java.util.List<String> roles;

        /**
         * <p>SDK Version.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0.0</p>
         */
        @NameInMap("SdkVersion")
        public String sdkVersion;

        /**
         * <p>List of SDK versions, such as 1.0.0, 1.1.1, etc.</p>
         */
        @NameInMap("SdkVersionList")
        public java.util.List<String> sdkVersionList;

        /**
         * <p>User ID.</p>
         * 
         * <strong>example:</strong>
         * <p>testuserid</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>User ID alias.</p>
         * 
         * <strong>example:</strong>
         * <p>yi****</p>
         */
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
