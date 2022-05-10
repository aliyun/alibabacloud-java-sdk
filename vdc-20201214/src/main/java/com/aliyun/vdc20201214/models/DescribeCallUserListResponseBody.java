// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeCallUserListResponseBody extends TeaModel {
    @NameInMap("PageNo")
    public Integer pageNo;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCnt")
    public Integer totalCnt;

    @NameInMap("UserDetailList")
    public java.util.List<DescribeCallUserListResponseBodyUserDetailList> userDetailList;

    public static DescribeCallUserListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCallUserListResponseBody self = new DescribeCallUserListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCallUserListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeCallUserListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCallUserListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCallUserListResponseBody setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public Integer getTotalCnt() {
        return this.totalCnt;
    }

    public DescribeCallUserListResponseBody setUserDetailList(java.util.List<DescribeCallUserListResponseBodyUserDetailList> userDetailList) {
        this.userDetailList = userDetailList;
        return this;
    }
    public java.util.List<DescribeCallUserListResponseBodyUserDetailList> getUserDetailList() {
        return this.userDetailList;
    }

    public static class DescribeCallUserListResponseBodyUserDetailListDurMetricStatData extends TeaModel {
        @NameInMap("PubAudio")
        public Long pubAudio;

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

        public static DescribeCallUserListResponseBodyUserDetailListDurMetricStatData build(java.util.Map<String, ?> map) throws Exception {
            DescribeCallUserListResponseBodyUserDetailListDurMetricStatData self = new DescribeCallUserListResponseBodyUserDetailListDurMetricStatData();
            return TeaModel.build(map, self);
        }

        public DescribeCallUserListResponseBodyUserDetailListDurMetricStatData setPubAudio(Long pubAudio) {
            this.pubAudio = pubAudio;
            return this;
        }
        public Long getPubAudio() {
            return this.pubAudio;
        }

        public DescribeCallUserListResponseBodyUserDetailListDurMetricStatData setPubVideo360(Long pubVideo360) {
            this.pubVideo360 = pubVideo360;
            return this;
        }
        public Long getPubVideo360() {
            return this.pubVideo360;
        }

        public DescribeCallUserListResponseBodyUserDetailListDurMetricStatData setPubVideo720(Long pubVideo720) {
            this.pubVideo720 = pubVideo720;
            return this;
        }
        public Long getPubVideo720() {
            return this.pubVideo720;
        }

        public DescribeCallUserListResponseBodyUserDetailListDurMetricStatData setPubVideoScreenShare(Long pubVideoScreenShare) {
            this.pubVideoScreenShare = pubVideoScreenShare;
            return this;
        }
        public Long getPubVideoScreenShare() {
            return this.pubVideoScreenShare;
        }

        public DescribeCallUserListResponseBodyUserDetailListDurMetricStatData setSubAudio(Long subAudio) {
            this.subAudio = subAudio;
            return this;
        }
        public Long getSubAudio() {
            return this.subAudio;
        }

        public DescribeCallUserListResponseBodyUserDetailListDurMetricStatData setSubVideo1080(Long subVideo1080) {
            this.subVideo1080 = subVideo1080;
            return this;
        }
        public Long getSubVideo1080() {
            return this.subVideo1080;
        }

        public DescribeCallUserListResponseBodyUserDetailListDurMetricStatData setSubVideo360(Long subVideo360) {
            this.subVideo360 = subVideo360;
            return this;
        }
        public Long getSubVideo360() {
            return this.subVideo360;
        }

        public DescribeCallUserListResponseBodyUserDetailListDurMetricStatData setSubVideo720(Long subVideo720) {
            this.subVideo720 = subVideo720;
            return this;
        }
        public Long getSubVideo720() {
            return this.subVideo720;
        }

        public DescribeCallUserListResponseBodyUserDetailListDurMetricStatData setSubVideoScreenShare(Long subVideoScreenShare) {
            this.subVideoScreenShare = subVideoScreenShare;
            return this;
        }
        public Long getSubVideoScreenShare() {
            return this.subVideoScreenShare;
        }

    }

    public static class DescribeCallUserListResponseBodyUserDetailListOnlinePeriods extends TeaModel {
        @NameInMap("JoinTs")
        public Long joinTs;

        @NameInMap("LeaveTs")
        public Long leaveTs;

        public static DescribeCallUserListResponseBodyUserDetailListOnlinePeriods build(java.util.Map<String, ?> map) throws Exception {
            DescribeCallUserListResponseBodyUserDetailListOnlinePeriods self = new DescribeCallUserListResponseBodyUserDetailListOnlinePeriods();
            return TeaModel.build(map, self);
        }

        public DescribeCallUserListResponseBodyUserDetailListOnlinePeriods setJoinTs(Long joinTs) {
            this.joinTs = joinTs;
            return this;
        }
        public Long getJoinTs() {
            return this.joinTs;
        }

        public DescribeCallUserListResponseBodyUserDetailListOnlinePeriods setLeaveTs(Long leaveTs) {
            this.leaveTs = leaveTs;
            return this;
        }
        public Long getLeaveTs() {
            return this.leaveTs;
        }

    }

    public static class DescribeCallUserListResponseBodyUserDetailList extends TeaModel {
        @NameInMap("CallExp")
        public String callExp;

        @NameInMap("CreatedTs")
        public Long createdTs;

        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        @NameInMap("DurMetricStatData")
        public DescribeCallUserListResponseBodyUserDetailListDurMetricStatData durMetricStatData;

        @NameInMap("Duration")
        public Long duration;

        @NameInMap("Location")
        public String location;

        @NameInMap("LocationCn")
        public String locationCn;

        @NameInMap("LocationEn")
        public String locationEn;

        @NameInMap("Network")
        public String network;

        @NameInMap("NetworkList")
        public java.util.List<String> networkList;

        @NameInMap("OnlineDuration")
        public Long onlineDuration;

        @NameInMap("OnlinePeriods")
        public java.util.List<DescribeCallUserListResponseBodyUserDetailListOnlinePeriods> onlinePeriods;

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

        public static DescribeCallUserListResponseBodyUserDetailList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCallUserListResponseBodyUserDetailList self = new DescribeCallUserListResponseBodyUserDetailList();
            return TeaModel.build(map, self);
        }

        public DescribeCallUserListResponseBodyUserDetailList setCallExp(String callExp) {
            this.callExp = callExp;
            return this;
        }
        public String getCallExp() {
            return this.callExp;
        }

        public DescribeCallUserListResponseBodyUserDetailList setCreatedTs(Long createdTs) {
            this.createdTs = createdTs;
            return this;
        }
        public Long getCreatedTs() {
            return this.createdTs;
        }

        public DescribeCallUserListResponseBodyUserDetailList setDestroyedTs(Long destroyedTs) {
            this.destroyedTs = destroyedTs;
            return this;
        }
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        public DescribeCallUserListResponseBodyUserDetailList setDurMetricStatData(DescribeCallUserListResponseBodyUserDetailListDurMetricStatData durMetricStatData) {
            this.durMetricStatData = durMetricStatData;
            return this;
        }
        public DescribeCallUserListResponseBodyUserDetailListDurMetricStatData getDurMetricStatData() {
            return this.durMetricStatData;
        }

        public DescribeCallUserListResponseBodyUserDetailList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeCallUserListResponseBodyUserDetailList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeCallUserListResponseBodyUserDetailList setLocationCn(String locationCn) {
            this.locationCn = locationCn;
            return this;
        }
        public String getLocationCn() {
            return this.locationCn;
        }

        public DescribeCallUserListResponseBodyUserDetailList setLocationEn(String locationEn) {
            this.locationEn = locationEn;
            return this;
        }
        public String getLocationEn() {
            return this.locationEn;
        }

        public DescribeCallUserListResponseBodyUserDetailList setNetwork(String network) {
            this.network = network;
            return this;
        }
        public String getNetwork() {
            return this.network;
        }

        public DescribeCallUserListResponseBodyUserDetailList setNetworkList(java.util.List<String> networkList) {
            this.networkList = networkList;
            return this;
        }
        public java.util.List<String> getNetworkList() {
            return this.networkList;
        }

        public DescribeCallUserListResponseBodyUserDetailList setOnlineDuration(Long onlineDuration) {
            this.onlineDuration = onlineDuration;
            return this;
        }
        public Long getOnlineDuration() {
            return this.onlineDuration;
        }

        public DescribeCallUserListResponseBodyUserDetailList setOnlinePeriods(java.util.List<DescribeCallUserListResponseBodyUserDetailListOnlinePeriods> onlinePeriods) {
            this.onlinePeriods = onlinePeriods;
            return this;
        }
        public java.util.List<DescribeCallUserListResponseBodyUserDetailListOnlinePeriods> getOnlinePeriods() {
            return this.onlinePeriods;
        }

        public DescribeCallUserListResponseBodyUserDetailList setOs(String os) {
            this.os = os;
            return this;
        }
        public String getOs() {
            return this.os;
        }

        public DescribeCallUserListResponseBodyUserDetailList setOsList(java.util.List<String> osList) {
            this.osList = osList;
            return this;
        }
        public java.util.List<String> getOsList() {
            return this.osList;
        }

        public DescribeCallUserListResponseBodyUserDetailList setRoles(java.util.List<String> roles) {
            this.roles = roles;
            return this;
        }
        public java.util.List<String> getRoles() {
            return this.roles;
        }

        public DescribeCallUserListResponseBodyUserDetailList setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        public DescribeCallUserListResponseBodyUserDetailList setSdkVersionList(java.util.List<String> sdkVersionList) {
            this.sdkVersionList = sdkVersionList;
            return this;
        }
        public java.util.List<String> getSdkVersionList() {
            return this.sdkVersionList;
        }

        public DescribeCallUserListResponseBodyUserDetailList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeCallUserListResponseBodyUserDetailList setUserIdAlias(String userIdAlias) {
            this.userIdAlias = userIdAlias;
            return this;
        }
        public String getUserIdAlias() {
            return this.userIdAlias;
        }

    }

}
