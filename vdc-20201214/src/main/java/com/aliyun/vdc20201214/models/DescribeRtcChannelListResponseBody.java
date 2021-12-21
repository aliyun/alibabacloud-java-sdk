// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelListResponseBody extends TeaModel {
    // 频道列表
    @NameInMap("Channels")
    public java.util.List<DescribeRtcChannelListResponseBodyChannels> channels;

    // 页号
    @NameInMap("PageNo")
    public Integer pageNo;

    // 显示数量
    @NameInMap("PageSize")
    public Integer pageSize;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 总条数
    @NameInMap("TotalCnt")
    public Integer totalCnt;

    public static DescribeRtcChannelListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelListResponseBody self = new DescribeRtcChannelListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelListResponseBody setChannels(java.util.List<DescribeRtcChannelListResponseBodyChannels> channels) {
        this.channels = channels;
        return this;
    }
    public java.util.List<DescribeRtcChannelListResponseBodyChannels> getChannels() {
        return this.channels;
    }

    public DescribeRtcChannelListResponseBody setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Integer getPageNo() {
        return this.pageNo;
    }

    public DescribeRtcChannelListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeRtcChannelListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcChannelListResponseBody setTotalCnt(Integer totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public Integer getTotalCnt() {
        return this.totalCnt;
    }

    public static class DescribeRtcChannelListResponseBodyChannels extends TeaModel {
        // 频道ID
        @NameInMap("ChannelId")
        public String channelId;

        // 频道结束时间，UTC时间
        @NameInMap("EndTime")
        public String endTime;

        // 是否已经结束
        @NameInMap("Finished")
        public Boolean finished;

        // 频道开始时间，UTC格式
        @NameInMap("StartTime")
        public String startTime;

        public static DescribeRtcChannelListResponseBodyChannels build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelListResponseBodyChannels self = new DescribeRtcChannelListResponseBodyChannels();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelListResponseBodyChannels setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeRtcChannelListResponseBodyChannels setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeRtcChannelListResponseBodyChannels setFinished(Boolean finished) {
            this.finished = finished;
            return this;
        }
        public Boolean getFinished() {
            return this.finished;
        }

        public DescribeRtcChannelListResponseBodyChannels setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

}
