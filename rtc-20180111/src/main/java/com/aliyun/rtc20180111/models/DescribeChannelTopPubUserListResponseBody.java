// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelTopPubUserListResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TopPubUserDetailList")
    public java.util.List<DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList> topPubUserDetailList;

    public static DescribeChannelTopPubUserListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelTopPubUserListResponseBody self = new DescribeChannelTopPubUserListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelTopPubUserListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeChannelTopPubUserListResponseBody setTopPubUserDetailList(java.util.List<DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList> topPubUserDetailList) {
        this.topPubUserDetailList = topPubUserDetailList;
        return this;
    }
    public java.util.List<DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList> getTopPubUserDetailList() {
        return this.topPubUserDetailList;
    }

    public static class DescribeChannelTopPubUserListResponseBodyTopPubUserDetailListOnlinePeriods extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1615893327</p>
         */
        @NameInMap("JoinTs")
        public Long joinTs;

        /**
         * <strong>example:</strong>
         * <p>1615893442</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>1615893327</p>
         */
        @NameInMap("CreatedTs")
        public Long createdTs;

        /**
         * <strong>example:</strong>
         * <p>1615893442</p>
         */
        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>浙江省-杭州市</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("OnlineDuration")
        public Long onlineDuration;

        @NameInMap("OnlinePeriods")
        public java.util.List<DescribeChannelTopPubUserListResponseBodyTopPubUserDetailListOnlinePeriods> onlinePeriods;

        /**
         * <strong>example:</strong>
         * <p>testuserid</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList self = new DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList();
            return TeaModel.build(map, self);
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

        public DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList setOnlineDuration(Long onlineDuration) {
            this.onlineDuration = onlineDuration;
            return this;
        }
        public Long getOnlineDuration() {
            return this.onlineDuration;
        }

        public DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList setOnlinePeriods(java.util.List<DescribeChannelTopPubUserListResponseBodyTopPubUserDetailListOnlinePeriods> onlinePeriods) {
            this.onlinePeriods = onlinePeriods;
            return this;
        }
        public java.util.List<DescribeChannelTopPubUserListResponseBodyTopPubUserDetailListOnlinePeriods> getOnlinePeriods() {
            return this.onlinePeriods;
        }

        public DescribeChannelTopPubUserListResponseBodyTopPubUserDetailList setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
