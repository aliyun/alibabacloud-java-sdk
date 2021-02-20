// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeRtcChannelCntDataResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ChannelCntDataPerInterval")
    public DescribeRtcChannelCntDataResponseBodyChannelCntDataPerInterval channelCntDataPerInterval;

    public static DescribeRtcChannelCntDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRtcChannelCntDataResponseBody self = new DescribeRtcChannelCntDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRtcChannelCntDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRtcChannelCntDataResponseBody setChannelCntDataPerInterval(DescribeRtcChannelCntDataResponseBodyChannelCntDataPerInterval channelCntDataPerInterval) {
        this.channelCntDataPerInterval = channelCntDataPerInterval;
        return this;
    }
    public DescribeRtcChannelCntDataResponseBodyChannelCntDataPerInterval getChannelCntDataPerInterval() {
        return this.channelCntDataPerInterval;
    }

    public static class DescribeRtcChannelCntDataResponseBodyChannelCntDataPerIntervalChannelCntModule extends TeaModel {
        @NameInMap("ActiveChannelCnt")
        public Long activeChannelCnt;

        @NameInMap("TimeStamp")
        public String timeStamp;

        public static DescribeRtcChannelCntDataResponseBodyChannelCntDataPerIntervalChannelCntModule build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelCntDataResponseBodyChannelCntDataPerIntervalChannelCntModule self = new DescribeRtcChannelCntDataResponseBodyChannelCntDataPerIntervalChannelCntModule();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelCntDataResponseBodyChannelCntDataPerIntervalChannelCntModule setActiveChannelCnt(Long activeChannelCnt) {
            this.activeChannelCnt = activeChannelCnt;
            return this;
        }
        public Long getActiveChannelCnt() {
            return this.activeChannelCnt;
        }

        public DescribeRtcChannelCntDataResponseBodyChannelCntDataPerIntervalChannelCntModule setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

    }

    public static class DescribeRtcChannelCntDataResponseBodyChannelCntDataPerInterval extends TeaModel {
        @NameInMap("ChannelCntModule")
        public java.util.List<DescribeRtcChannelCntDataResponseBodyChannelCntDataPerIntervalChannelCntModule> channelCntModule;

        public static DescribeRtcChannelCntDataResponseBodyChannelCntDataPerInterval build(java.util.Map<String, ?> map) throws Exception {
            DescribeRtcChannelCntDataResponseBodyChannelCntDataPerInterval self = new DescribeRtcChannelCntDataResponseBodyChannelCntDataPerInterval();
            return TeaModel.build(map, self);
        }

        public DescribeRtcChannelCntDataResponseBodyChannelCntDataPerInterval setChannelCntModule(java.util.List<DescribeRtcChannelCntDataResponseBodyChannelCntDataPerIntervalChannelCntModule> channelCntModule) {
            this.channelCntModule = channelCntModule;
            return this;
        }
        public java.util.List<DescribeRtcChannelCntDataResponseBodyChannelCntDataPerIntervalChannelCntModule> getChannelCntModule() {
            return this.channelCntModule;
        }

    }

}
