// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelUsersResponseBody extends TeaModel {
    // 页号
    @NameInMap("PageNo")
    public Integer pageNo;

    // 显示数量
    @NameInMap("PageSize")
    public Integer pageSize;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 总数
    @NameInMap("TotalCnt")
    public Integer totalCnt;

    // 用户列表
    @NameInMap("UserList")
    public DescribeRtcChannelUsersResponseBodyUserList userList;

    public static DescribeRtcChannelUsersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelUsersResponseBody self = new DescribeRtcChannelUsersResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelUsersResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeRtcChannelUsersResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRtcChannelUsersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcChannelUsersResponseBody setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public Integer getTotalCnt() {
        return this.totalCnt;
    }

    public DescribeRtcChannelUsersResponseBody setUserList(DescribeRtcChannelUsersResponseBodyUserList userList) {
        this.userList = userList;
        return this;
    }
    public DescribeRtcChannelUsersResponseBodyUserList getUserList() {
        return this.userList;
    }

    public static class DescribeRtcChannelUsersResponseBodyUserListUserList extends TeaModel {
        // ChannelID
        @NameInMap("Channel")
        public String channel;

        // 用户离开频道时间
        @NameInMap("EndTime")
        public String endTime;

        // 用户地理位置
        @NameInMap("Location")
        public String location;

        // 发布音频时长(单位分钟)
        @NameInMap("PubAudio")
        public Integer pubAudio;

        // 发布屏幕共享时长(单位分钟)
        @NameInMap("PubContent")
        public Integer pubContent;

        // 发布1080视频时长(单位分钟)
        @NameInMap("PubVideo1080")
        public Integer pubVideo1080;

        // 发布360视频时长(单位分钟)
        @NameInMap("PubVideo360")
        public Integer pubVideo360;

        // 发布720视频时长(单位分钟)
        @NameInMap("PubVideo720")
        public Integer pubVideo720;

        // 服务大区
        @NameInMap("ServiceArea")
        public String serviceArea;

        // 用户加入频道时间
        @NameInMap("StartTime")
        public String startTime;

        // 订阅音频时长(单位分钟)
        @NameInMap("SubAudio")
        public Integer subAudio;

        // 订阅屏幕共享时长(单位分钟)
        @NameInMap("SubContent")
        public Integer subContent;

        // 订阅1080视频时长(单位分钟)
        @NameInMap("SubVideo1080")
        public Integer subVideo1080;

        // 订阅时360视频长(单位分钟)
        @NameInMap("SubVideo360")
        public Integer subVideo360;

        // 订阅720视频时长(单位分钟)
        @NameInMap("SubVideo720")
        public Integer subVideo720;

        // 用户ID
        @NameInMap("UserId")
        public String userId;

        public static DescribeRtcChannelUsersResponseBodyUserListUserList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelUsersResponseBodyUserListUserList self = new DescribeRtcChannelUsersResponseBodyUserListUserList();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelUsersResponseBodyUserListUserList setChannel(String channel) {
            this.channel = channel;
            return this;
        }
        public String getChannel() {
            return this.channel;
        }

        public DescribeRtcChannelUsersResponseBodyUserListUserList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRtcChannelUsersResponseBodyUserListUserList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeRtcChannelUsersResponseBodyUserListUserList setPubAudio(Integer pubAudio) {
            this.pubAudio = pubAudio;
            return this;
        }
        public Integer getPubAudio() {
            return this.pubAudio;
        }

        public DescribeRtcChannelUsersResponseBodyUserListUserList setPubContent(Integer pubContent) {
            this.pubContent = pubContent;
            return this;
        }
        public Integer getPubContent() {
            return this.pubContent;
        }

        public DescribeRtcChannelUsersResponseBodyUserListUserList setPubVideo1080(Integer pubVideo1080) {
            this.pubVideo1080 = pubVideo1080;
            return this;
        }
        public Integer getPubVideo1080() {
            return this.pubVideo1080;
        }

        public DescribeRtcChannelUsersResponseBodyUserListUserList setPubVideo360(Integer pubVideo360) {
            this.pubVideo360 = pubVideo360;
            return this;
        }
        public Integer getPubVideo360() {
            return this.pubVideo360;
        }

        public DescribeRtcChannelUsersResponseBodyUserListUserList setPubVideo720(Integer pubVideo720) {
            this.pubVideo720 = pubVideo720;
            return this;
        }
        public Integer getPubVideo720() {
            return this.pubVideo720;
        }

        public DescribeRtcChannelUsersResponseBodyUserListUserList setServiceArea(String serviceArea) {
            this.serviceArea = serviceArea;
            return this;
        }
        public String getServiceArea() {
            return this.serviceArea;
        }

        public DescribeRtcChannelUsersResponseBodyUserListUserList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRtcChannelUsersResponseBodyUserListUserList setSubAudio(Integer subAudio) {
            this.subAudio = subAudio;
            return this;
        }
        public Integer getSubAudio() {
            return this.subAudio;
        }

        public DescribeRtcChannelUsersResponseBodyUserListUserList setSubContent(Integer subContent) {
            this.subContent = subContent;
            return this;
        }
        public Integer getSubContent() {
            return this.subContent;
        }

        public DescribeRtcChannelUsersResponseBodyUserListUserList setSubVideo1080(Integer subVideo1080) {
            this.subVideo1080 = subVideo1080;
            return this;
        }
        public Integer getSubVideo1080() {
            return this.subVideo1080;
        }

        public DescribeRtcChannelUsersResponseBodyUserListUserList setSubVideo360(Integer subVideo360) {
            this.subVideo360 = subVideo360;
            return this;
        }
        public Integer getSubVideo360() {
            return this.subVideo360;
        }

        public DescribeRtcChannelUsersResponseBodyUserListUserList setSubVideo720(Integer subVideo720) {
            this.subVideo720 = subVideo720;
            return this;
        }
        public Integer getSubVideo720() {
            return this.subVideo720;
        }

        public DescribeRtcChannelUsersResponseBodyUserListUserList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class DescribeRtcChannelUsersResponseBodyUserList extends TeaModel {
        @NameInMap("UserList")
        public java.util.List<DescribeRtcChannelUsersResponseBodyUserListUserList> userList;

        public static DescribeRtcChannelUsersResponseBodyUserList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelUsersResponseBodyUserList self = new DescribeRtcChannelUsersResponseBodyUserList();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelUsersResponseBodyUserList setUserList(java.util.List<DescribeRtcChannelUsersResponseBodyUserListUserList> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<DescribeRtcChannelUsersResponseBodyUserListUserList> getUserList() {
            return this.userList;
        }

    }

}
