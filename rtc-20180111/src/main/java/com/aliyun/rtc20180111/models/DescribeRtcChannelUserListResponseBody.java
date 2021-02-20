// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelUserListResponseBody extends TeaModel {
    @NameInMap("TotalCnt")
    public Long totalCnt;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("UserList")
    public DescribeRtcChannelUserListResponseBodyUserList userList;

    public static DescribeRtcChannelUserListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelUserListResponseBody self = new DescribeRtcChannelUserListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelUserListResponseBody setTotalCnt(Long totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public Long getTotalCnt() {
        return this.totalCnt;
    }

    public DescribeRtcChannelUserListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcChannelUserListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeRtcChannelUserListResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribeRtcChannelUserListResponseBody setUserList(DescribeRtcChannelUserListResponseBodyUserList userList) {
        this.userList = userList;
        return this;
    }
    public DescribeRtcChannelUserListResponseBodyUserList getUserList() {
        return this.userList;
    }

    public static class DescribeRtcChannelUserListResponseBodyUserListUserList extends TeaModel {
        @NameInMap("SubVideo720")
        public Integer subVideo720;

        @NameInMap("SubVideo1080")
        public Integer subVideo1080;

        @NameInMap("SubContent")
        public Integer subContent;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("PubVideo360")
        public Integer pubVideo360;

        @NameInMap("SubVideo360")
        public Integer subVideo360;

        @NameInMap("ServiceArea")
        public String serviceArea;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("PubContent")
        public Integer pubContent;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("PubVideo1080")
        public Integer pubVideo1080;

        @NameInMap("PubAudio")
        public Integer pubAudio;

        @NameInMap("PubVideo720")
        public Integer pubVideo720;

        @NameInMap("SubAudio")
        public Integer subAudio;

        public static DescribeRtcChannelUserListResponseBodyUserListUserList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelUserListResponseBodyUserListUserList self = new DescribeRtcChannelUserListResponseBodyUserListUserList();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelUserListResponseBodyUserListUserList setSubVideo720(Integer subVideo720) {
            this.subVideo720 = subVideo720;
            return this;
        }
        public Integer getSubVideo720() {
            return this.subVideo720;
        }

        public DescribeRtcChannelUserListResponseBodyUserListUserList setSubVideo1080(Integer subVideo1080) {
            this.subVideo1080 = subVideo1080;
            return this;
        }
        public Integer getSubVideo1080() {
            return this.subVideo1080;
        }

        public DescribeRtcChannelUserListResponseBodyUserListUserList setSubContent(Integer subContent) {
            this.subContent = subContent;
            return this;
        }
        public Integer getSubContent() {
            return this.subContent;
        }

        public DescribeRtcChannelUserListResponseBodyUserListUserList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeRtcChannelUserListResponseBodyUserListUserList setPubVideo360(Integer pubVideo360) {
            this.pubVideo360 = pubVideo360;
            return this;
        }
        public Integer getPubVideo360() {
            return this.pubVideo360;
        }

        public DescribeRtcChannelUserListResponseBodyUserListUserList setSubVideo360(Integer subVideo360) {
            this.subVideo360 = subVideo360;
            return this;
        }
        public Integer getSubVideo360() {
            return this.subVideo360;
        }

        public DescribeRtcChannelUserListResponseBodyUserListUserList setServiceArea(String serviceArea) {
            this.serviceArea = serviceArea;
            return this;
        }
        public String getServiceArea() {
            return this.serviceArea;
        }

        public DescribeRtcChannelUserListResponseBodyUserListUserList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRtcChannelUserListResponseBodyUserListUserList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRtcChannelUserListResponseBodyUserListUserList setPubContent(Integer pubContent) {
            this.pubContent = pubContent;
            return this;
        }
        public Integer getPubContent() {
            return this.pubContent;
        }

        public DescribeRtcChannelUserListResponseBodyUserListUserList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeRtcChannelUserListResponseBodyUserListUserList setPubVideo1080(Integer pubVideo1080) {
            this.pubVideo1080 = pubVideo1080;
            return this;
        }
        public Integer getPubVideo1080() {
            return this.pubVideo1080;
        }

        public DescribeRtcChannelUserListResponseBodyUserListUserList setPubAudio(Integer pubAudio) {
            this.pubAudio = pubAudio;
            return this;
        }
        public Integer getPubAudio() {
            return this.pubAudio;
        }

        public DescribeRtcChannelUserListResponseBodyUserListUserList setPubVideo720(Integer pubVideo720) {
            this.pubVideo720 = pubVideo720;
            return this;
        }
        public Integer getPubVideo720() {
            return this.pubVideo720;
        }

        public DescribeRtcChannelUserListResponseBodyUserListUserList setSubAudio(Integer subAudio) {
            this.subAudio = subAudio;
            return this;
        }
        public Integer getSubAudio() {
            return this.subAudio;
        }

    }

    public static class DescribeRtcChannelUserListResponseBodyUserList extends TeaModel {
        @NameInMap("UserList")
        public java.util.List<DescribeRtcChannelUserListResponseBodyUserListUserList> userList;

        public static DescribeRtcChannelUserListResponseBodyUserList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelUserListResponseBodyUserList self = new DescribeRtcChannelUserListResponseBodyUserList();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelUserListResponseBodyUserList setUserList(java.util.List<DescribeRtcChannelUserListResponseBodyUserListUserList> userList) {
            this.userList = userList;
            return this;
        }
        public java.util.List<DescribeRtcChannelUserListResponseBodyUserListUserList> getUserList() {
            return this.userList;
        }

    }

}
