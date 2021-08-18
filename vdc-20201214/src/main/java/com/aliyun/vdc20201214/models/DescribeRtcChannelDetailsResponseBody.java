// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelDetailsResponseBody extends TeaModel {
    // 请求Id
    @NameInMap("RequestId")
    public String requestId;

    // 页号
    @NameInMap("PageNo")
    public Integer pageNo;

    // 显示数量
    @NameInMap("PageSize")
    public Integer pageSize;

    // 总数量
    @NameInMap("TotalSize")
    public Integer totalSize;

    // 频道ID
    @NameInMap("ChannelId")
    public String channelId;

    // 频道信息
    @NameInMap("ChannelInfo")
    public java.util.List<DescribeRtcChannelDetailsResponseBodyChannelInfo> channelInfo;

    public static DescribeRtcChannelDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelDetailsResponseBody self = new DescribeRtcChannelDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcChannelDetailsResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeRtcChannelDetailsResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRtcChannelDetailsResponseBody setTotalSize(Integer totalSize) {
        this.totalSize = totalSize;
        return this;
    }
    public Integer getTotalSize() {
        return this.totalSize;
    }

    public DescribeRtcChannelDetailsResponseBody setChannelId(String channelId) {
        this.channelId = channelId;
        return this;
    }
    public String getChannelId() {
        return this.channelId;
    }

    public DescribeRtcChannelDetailsResponseBody setChannelInfo(java.util.List<DescribeRtcChannelDetailsResponseBodyChannelInfo> channelInfo) {
        this.channelInfo = channelInfo;
        return this;
    }
    public java.util.List<DescribeRtcChannelDetailsResponseBodyChannelInfo> getChannelInfo() {
        return this.channelInfo;
    }

    public static class DescribeRtcChannelDetailsResponseBodyChannelInfo extends TeaModel {
        // SessionID
        @NameInMap("Sid")
        public String sid;

        // 参会者ID
        @NameInMap("Uid")
        public String uid;

        // 用户入会时间，UTC格式
        @NameInMap("JoinTime")
        public String joinTime;

        // 用户离会时间，UTC格式
        @NameInMap("LeaveTime")
        public String leaveTime;

        // SDK版本
        @NameInMap("SdkVersion")
        public String sdkVersion;

        // 平台信息
        @NameInMap("Platform")
        public String platform;

        // 操作系统
        @NameInMap("OS")
        public String OS;

        // 设备类型
        @NameInMap("DeviceType")
        public String deviceType;

        public static DescribeRtcChannelDetailsResponseBodyChannelInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelDetailsResponseBodyChannelInfo self = new DescribeRtcChannelDetailsResponseBodyChannelInfo();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelDetailsResponseBodyChannelInfo setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public DescribeRtcChannelDetailsResponseBodyChannelInfo setUid(String uid) {
            this.uid = uid;
            return this;
        }
        public String getUid() {
            return this.uid;
        }

        public DescribeRtcChannelDetailsResponseBodyChannelInfo setJoinTime(String joinTime) {
            this.joinTime = joinTime;
            return this;
        }
        public String getJoinTime() {
            return this.joinTime;
        }

        public DescribeRtcChannelDetailsResponseBodyChannelInfo setLeaveTime(String leaveTime) {
            this.leaveTime = leaveTime;
            return this;
        }
        public String getLeaveTime() {
            return this.leaveTime;
        }

        public DescribeRtcChannelDetailsResponseBodyChannelInfo setSdkVersion(String sdkVersion) {
            this.sdkVersion = sdkVersion;
            return this;
        }
        public String getSdkVersion() {
            return this.sdkVersion;
        }

        public DescribeRtcChannelDetailsResponseBodyChannelInfo setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeRtcChannelDetailsResponseBodyChannelInfo setOS(String OS) {
            this.OS = OS;
            return this;
        }
        public String getOS() {
            return this.OS;
        }

        public DescribeRtcChannelDetailsResponseBodyChannelInfo setDeviceType(String deviceType) {
            this.deviceType = deviceType;
            return this;
        }
        public String getDeviceType() {
            return this.deviceType;
        }

    }

}
