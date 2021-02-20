// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelDetailResponseBody extends TeaModel {
    @NameInMap("TotalCnt")
    public Long totalCnt;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("ChannelInfo")
    public java.util.List<DescribeRtcChannelDetailResponseBodyChannelInfo> channelInfo;

    @NameInMap("ChannelId")
    public String channelId;

    public static DescribeRtcChannelDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelDetailResponseBody self = new DescribeRtcChannelDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelDetailResponseBody setTotalCnt(Long totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public Long getTotalCnt() {
        return this.totalCnt;
    }

    public DescribeRtcChannelDetailResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeRtcChannelDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcChannelDetailResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribeRtcChannelDetailResponseBody setChannelInfo(java.util.List<DescribeRtcChannelDetailResponseBodyChannelInfo> channelInfo) {
        this.channelInfo = channelInfo;
        return this;
    }
    public java.util.List<DescribeRtcChannelDetailResponseBodyChannelInfo> getChannelInfo() {
        return this.channelInfo;
    }

    public DescribeRtcChannelDetailResponseBody setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public static class DescribeRtcChannelDetailResponseBodyChannelInfo extends TeaModel {
        @NameInMap("Sid")
        public String sid;

        @NameInMap("DeviceType")
        public String deviceType;

        @NameInMap("OS")
        public String OS;

        @NameInMap("LeaveTime")
        public String leaveTime;

        @NameInMap("JoinTime")
        public String joinTime;

        @NameInMap("Platform")
        public String platform;

        @NameInMap("SdkVersion")
        public String sdkVersion;

        @NameInMap("Uid")
        public String uid;

        public static DescribeRtcChannelDetailResponseBodyChannelInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelDetailResponseBodyChannelInfo self = new DescribeRtcChannelDetailResponseBodyChannelInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelDetailResponseBodyChannelInfo setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public DescribeRtcChannelDetailResponseBodyChannelInfo setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

        public DescribeRtcChannelDetailResponseBodyChannelInfo setOS(String OS) {
            this.OS = OS;
            return this;
        }
        public String getOS() {
            return this.OS;
        }

        public DescribeRtcChannelDetailResponseBodyChannelInfo setLeaveTime(String leaveTime) {
            this.leaveTime = leaveTime;
            return this;
        }
        public String getLeaveTime() {
            return this.leaveTime;
        }

        public DescribeRtcChannelDetailResponseBodyChannelInfo setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public DescribeRtcChannelDetailResponseBodyChannelInfo setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeRtcChannelDetailResponseBodyChannelInfo setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        public DescribeRtcChannelDetailResponseBodyChannelInfo setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

    }

}
