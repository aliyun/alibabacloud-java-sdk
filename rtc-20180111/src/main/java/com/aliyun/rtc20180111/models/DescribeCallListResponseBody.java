// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeCallListResponseBody extends TeaModel {
    @NameInMap("CallList")
    public java.util.List<DescribeCallListResponseBodyCallList> callList;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageNo")
    public Integer pageNo;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCnt")
    public Integer totalCnt;

    public static DescribeCallListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCallListResponseBody self = new DescribeCallListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCallListResponseBody setCallList(java.util.List<DescribeCallListResponseBodyCallList> callList) {
        this.callList = callList;
        return this;
    }
    public java.util.List<DescribeCallListResponseBodyCallList> getCallList() {
        return this.callList;
    }

    public DescribeCallListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeCallListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeCallListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCallListResponseBody setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public Integer getTotalCnt() {
        return this.totalCnt;
    }

    public static class DescribeCallListResponseBodyCallList extends TeaModel {
        /**
         * <p>App ID。</p>
         * 
         * <strong>example:</strong>
         * <p>9qb1****</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BadExpUserCnt")
        public Integer badExpUserCnt;

        /**
         * <strong>example:</strong>
         * <p>OUT</p>
         */
        @NameInMap("CallStatus")
        public String callStatus;

        /**
         * <strong>example:</strong>
         * <p>904</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>1614936817</p>
         */
        @NameInMap("CreatedTs")
        public Long createdTs;

        /**
         * <strong>example:</strong>
         * <p>1614936817</p>
         */
        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("UserCnt")
        public Integer userCnt;

        public static DescribeCallListResponseBodyCallList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCallListResponseBodyCallList self = new DescribeCallListResponseBodyCallList();
            return TeaModel.build(map, self);
        }

        public DescribeCallListResponseBodyCallList setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeCallListResponseBodyCallList setBadExpUserCnt(Integer badExpUserCnt) {
            this.badExpUserCnt = badExpUserCnt;
            return this;
        }
        public Integer getBadExpUserCnt() {
            return this.badExpUserCnt;
        }

        public DescribeCallListResponseBodyCallList setCallStatus(String callStatus) {
            this.callStatus = callStatus;
            return this;
        }
        public String getCallStatus() {
            return this.callStatus;
        }

        public DescribeCallListResponseBodyCallList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeCallListResponseBodyCallList setCreatedTs(Long createdTs) {
            this.createdTs = createdTs;
            return this;
        }
        public Long getCreatedTs() {
            return this.createdTs;
        }

        public DescribeCallListResponseBodyCallList setDestroyedTs(Long destroyedTs) {
            this.destroyedTs = destroyedTs;
            return this;
        }
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        public DescribeCallListResponseBodyCallList setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public DescribeCallListResponseBodyCallList setUserCnt(Integer userCnt) {
            this.userCnt = userCnt;
            return this;
        }
        public Integer getUserCnt() {
            return this.userCnt;
        }

    }

}
