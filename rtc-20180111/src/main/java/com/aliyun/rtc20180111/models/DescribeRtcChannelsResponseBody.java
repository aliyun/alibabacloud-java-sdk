// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelsResponseBody extends TeaModel {
    @NameInMap("TotalCnt")
    public Long totalCnt;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("Channels")
    public java.util.List<DescribeRtcChannelsResponseBodyChannels> channels;

    public static DescribeRtcChannelsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelsResponseBody self = new DescribeRtcChannelsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelsResponseBody setTotalCnt(Long totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public Long getTotalCnt() {
        return this.totalCnt;
    }

    public DescribeRtcChannelsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcChannelsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeRtcChannelsResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribeRtcChannelsResponseBody setChannels(java.util.List<DescribeRtcChannelsResponseBodyChannels> channels) {
        this.channels = channels;
        return this;
    }
    public java.util.List<DescribeRtcChannelsResponseBodyChannels> getChannels() {
        return this.channels;
    }

    public static class DescribeRtcChannelsResponseBodyChannels extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("Finished")
        public Boolean finished;

        public static DescribeRtcChannelsResponseBodyChannels build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelsResponseBodyChannels self = new DescribeRtcChannelsResponseBodyChannels();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelsResponseBodyChannels setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRtcChannelsResponseBodyChannels setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeRtcChannelsResponseBodyChannels setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeRtcChannelsResponseBodyChannels setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

    }

}
