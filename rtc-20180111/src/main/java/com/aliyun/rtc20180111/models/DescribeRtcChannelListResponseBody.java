// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelListResponseBody extends TeaModel {
    @NameInMap("ChannelList")
    public DescribeRtcChannelListResponseBodyChannelList channelList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNo")
    public Long pageNo;

    /**
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1000</p>
     */
    @NameInMap("TotalCnt")
    public Long totalCnt;

    public static DescribeRtcChannelListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelListResponseBody self = new DescribeRtcChannelListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelListResponseBody setChannelList(DescribeRtcChannelListResponseBodyChannelList channelList) {
        this.channelList = channelList;
        return this;
    }
    public DescribeRtcChannelListResponseBodyChannelList getChannelList() {
        return this.channelList;
    }

    public DescribeRtcChannelListResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribeRtcChannelListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeRtcChannelListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcChannelListResponseBody setTotalCnt(Long totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public Long getTotalCnt() {
        return this.totalCnt;
    }

    public static class DescribeRtcChannelListResponseBodyChannelListChannelListCallArea extends TeaModel {
        @NameInMap("CallArea")
        public java.util.List<String> callArea;

        public static DescribeRtcChannelListResponseBodyChannelListChannelListCallArea build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelListResponseBodyChannelListChannelListCallArea self = new DescribeRtcChannelListResponseBodyChannelListChannelListCallArea();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelListResponseBodyChannelListChannelListCallArea setCallArea(java.util.List<String> callArea) {
            this.callArea = callArea;
            return this;
        }
        public java.util.List<String> getCallArea() {
            return this.callArea;
        }

    }

    public static class DescribeRtcChannelListResponseBodyChannelListChannelList extends TeaModel {
        @NameInMap("CallArea")
        public DescribeRtcChannelListResponseBodyChannelListChannelListCallArea callArea;

        /**
         * <strong>example:</strong>
         * <p>testChannel</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <strong>example:</strong>
         * <p>2018-01-29T02:00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <strong>example:</strong>
         * <p>2018-01-29T01:00:00Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("TotalUserCnt")
        public Long totalUserCnt;

        public static DescribeRtcChannelListResponseBodyChannelListChannelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelListResponseBodyChannelListChannelList self = new DescribeRtcChannelListResponseBodyChannelListChannelList();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelListResponseBodyChannelListChannelList setCallArea(DescribeRtcChannelListResponseBodyChannelListChannelListCallArea callArea) {
            this.callArea = callArea;
            return this;
        }
        public DescribeRtcChannelListResponseBodyChannelListChannelListCallArea getCallArea() {
            return this.callArea;
        }

        public DescribeRtcChannelListResponseBodyChannelListChannelList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeRtcChannelListResponseBodyChannelListChannelList setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRtcChannelListResponseBodyChannelListChannelList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRtcChannelListResponseBodyChannelListChannelList setTotalUserCnt(Long totalUserCnt) {
            this.totalUserCnt = totalUserCnt;
            return this;
        }
        public Long getTotalUserCnt() {
            return this.totalUserCnt;
        }

    }

    public static class DescribeRtcChannelListResponseBodyChannelList extends TeaModel {
        @NameInMap("ChannelList")
        public java.util.List<DescribeRtcChannelListResponseBodyChannelListChannelList> channelList;

        public static DescribeRtcChannelListResponseBodyChannelList build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelListResponseBodyChannelList self = new DescribeRtcChannelListResponseBodyChannelList();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelListResponseBodyChannelList setChannelList(java.util.List<DescribeRtcChannelListResponseBodyChannelListChannelList> channelList) {
            this.channelList = channelList;
            return this;
        }
        public java.util.List<DescribeRtcChannelListResponseBodyChannelListChannelList> getChannelList() {
            return this.channelList;
        }

    }

}
