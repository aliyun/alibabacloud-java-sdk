// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdmeter20210425.models;

import com.aliyun.tea.*;

public class DescribeMeterRtcChannelCntDataResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<DescribeMeterRtcChannelCntDataResponseBodyData> data;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeMeterRtcChannelCntDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeMeterRtcChannelCntDataResponseBody self = new DescribeMeterRtcChannelCntDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeMeterRtcChannelCntDataResponseBody setData(java.util.List<DescribeMeterRtcChannelCntDataResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<DescribeMeterRtcChannelCntDataResponseBodyData> getData() {
        return this.data;
    }

    public DescribeMeterRtcChannelCntDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeMeterRtcChannelCntDataResponseBodyData extends TeaModel {
        @NameInMap("ChannelCnt")
        public Long channelCnt;

        @NameInMap("Timestamp")
        public String timestamp;

        public static DescribeMeterRtcChannelCntDataResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DescribeMeterRtcChannelCntDataResponseBodyData self = new DescribeMeterRtcChannelCntDataResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DescribeMeterRtcChannelCntDataResponseBodyData setChannelCnt(Long channelCnt) {
            this.channelCnt = channelCnt;
            return this;
        }
        public Long getChannelCnt() {
            return this.channelCnt;
        }

        public DescribeMeterRtcChannelCntDataResponseBodyData setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

}
