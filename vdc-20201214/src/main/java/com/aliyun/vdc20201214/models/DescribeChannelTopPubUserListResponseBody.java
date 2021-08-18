// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeChannelTopPubUserListResponseBody extends TeaModel {
    // Top发布用户详情列表
    @NameInMap("TopPubUserDetailList")
    public java.util.List<DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList> topPubUserDetailList;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeChannelTopPubUserListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelTopPubUserListResponseBody self = new DescribeChannelTopPubUserListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelTopPubUserListResponseBody setTopPubUserDetailList(java.util.List<DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList> topPubUserDetailList) {
        this.topPubUserDetailList = topPubUserDetailList;
        return this;
    }
    public java.util.List<DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList> getTopPubUserDetailList() {
        return this.topPubUserDetailList;
    }

    public DescribeChannelTopPubUserListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeChannelTopPubUserListResponseBodyTopPubUserDetailListOnlinePeriods extends TeaModel {
        // 加入通话时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("JoinTs")
        public Long joinTs;

        // 离开通话时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("LeaveTs")
        public Long leaveTs;

        public static DescribeChannelTopPubUserListResponseBodyTopPubUserDetailListOnlinePeriods build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelTopPubUserListResponseBodyTopPubUserDetailListOnlinePeriods self = new DescribeChannelTopPubUserListResponseBodyTopPubUserDetailListOnlinePeriods();
            return TeaModel.build(map, self);
        }

        public DescribeChannelTopPubUserListResponseBodyTopPubUserDetailListOnlinePeriods setJoinTs(Long joinTs) {
            this.joinTs = joinTs;
            return this;
        }
        public Long getJoinTs() {
            return this.joinTs;
        }

        public DescribeChannelTopPubUserListResponseBodyTopPubUserDetailListOnlinePeriods setLeaveTs(Long leaveTs) {
            this.leaveTs = leaveTs;
            return this;
        }
        public Long getLeaveTs() {
            return this.leaveTs;
        }

    }

    public static class DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList extends TeaModel {
        // 用户ID。
        @NameInMap("UserId")
        public String userId;

        // 地域位置，例如：北京市-北京市
        @NameInMap("Location")
        public String location;

        // 在线期间用户列表。
        @NameInMap("OnlinePeriods")
        public java.util.List<DescribeChannelTopPubUserListResponseBodyTopPubUserDetailListOnlinePeriods> onlinePeriods;

        // 第一次加入通话的时间，使用UNIX时间戳表示，单位：秒。
        @NameInMap("CreatedTs")
        public Long createdTs;

        // 最后一次离开通话的时间，使用UNIX时间戳表示，单位：秒。通话未结束时值为0。
        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        // 通信时长，单位：秒。
        @NameInMap("OnlineDuration")
        public Long onlineDuration;

        // 总时长，单位：秒。
        @NameInMap("Duration")
        public Long duration;

        public static DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList self = new DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList();
            return TeaModel.build(map, self);
        }

        public DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList setOnlinePeriods(java.util.List<DescribeChannelTopPubUserListResponseBodyTopPubUserDetailListOnlinePeriods> onlinePeriods) {
            this.onlinePeriods = onlinePeriods;
            return this;
        }
        public java.util.List<DescribeChannelTopPubUserListResponseBodyTopPubUserDetailListOnlinePeriods> getOnlinePeriods() {
            return this.onlinePeriods;
        }

        public DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList setCreatedTs(Long createdTs) {
            this.createdTs = createdTs;
            return this;
        }
        public Long getCreatedTs() {
            return this.createdTs;
        }

        public DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList setDestroyedTs(Long destroyedTs) {
            this.destroyedTs = destroyedTs;
            return this;
        }
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        public DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList setOnlineDuration(Long onlineDuration) {
            this.onlineDuration = onlineDuration;
            return this;
        }
        public Long getOnlineDuration() {
            return this.onlineDuration;
        }

        public DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

    }

}
