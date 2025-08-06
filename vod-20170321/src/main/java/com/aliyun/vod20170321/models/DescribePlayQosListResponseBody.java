// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribePlayQosListResponseBody extends TeaModel {
    @NameInMap("PageNo")
    public Long pageNo;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("QosInfoList")
    public java.util.List<DescribePlayQosListResponseBodyQosInfoList> qosInfoList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribePlayQosListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribePlayQosListResponseBody self = new DescribePlayQosListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribePlayQosListResponseBody setPageNo(Long pageNo) {
        this.pageNo = pageNo;
        return this;
    }
    public Long getPageNo() {
        return this.pageNo;
    }

    public DescribePlayQosListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribePlayQosListResponseBody setQosInfoList(java.util.List<DescribePlayQosListResponseBodyQosInfoList> qosInfoList) {
        this.qosInfoList = qosInfoList;
        return this;
    }
    public java.util.List<DescribePlayQosListResponseBodyQosInfoList> getQosInfoList() {
        return this.qosInfoList;
    }

    public DescribePlayQosListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePlayQosListResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribePlayQosListResponseBodyQosInfoList extends TeaModel {
        @NameInMap("QosFirstFrame")
        public Float qosFirstFrame;

        @NameInMap("QosKbps")
        public Float qosKbps;

        @NameInMap("QosPlay")
        public Float qosPlay;

        @NameInMap("QosPlayFail")
        public Float qosPlayFail;

        @NameInMap("QosRealPlay")
        public Float qosRealPlay;

        @NameInMap("QosSecondPlayRate")
        public Float qosSecondPlayRate;

        @NameInMap("QosSeedFailRate")
        public Float qosSeedFailRate;

        @NameInMap("QosSeekDuration")
        public Double qosSeekDuration;

        @NameInMap("QosSlowPlayRate")
        public Float qosSlowPlayRate;

        @NameInMap("QosStuckDuration100s")
        public Double qosStuckDuration100s;

        @NameInMap("QosStuckRate")
        public Float qosStuckRate;

        @NameInMap("TraceId")
        public String traceId;

        public static DescribePlayQosListResponseBodyQosInfoList build(java.util.Map<String, ?> map) throws Exception {
            DescribePlayQosListResponseBodyQosInfoList self = new DescribePlayQosListResponseBodyQosInfoList();
            return TeaModel.build(map, self);
        }

        public DescribePlayQosListResponseBodyQosInfoList setQosFirstFrame(Float qosFirstFrame) {
            this.qosFirstFrame = qosFirstFrame;
            return this;
        }
        public Float getQosFirstFrame() {
            return this.qosFirstFrame;
        }

        public DescribePlayQosListResponseBodyQosInfoList setQosKbps(Float qosKbps) {
            this.qosKbps = qosKbps;
            return this;
        }
        public Float getQosKbps() {
            return this.qosKbps;
        }

        public DescribePlayQosListResponseBodyQosInfoList setQosPlay(Float qosPlay) {
            this.qosPlay = qosPlay;
            return this;
        }
        public Float getQosPlay() {
            return this.qosPlay;
        }

        public DescribePlayQosListResponseBodyQosInfoList setQosPlayFail(Float qosPlayFail) {
            this.qosPlayFail = qosPlayFail;
            return this;
        }
        public Float getQosPlayFail() {
            return this.qosPlayFail;
        }

        public DescribePlayQosListResponseBodyQosInfoList setQosRealPlay(Float qosRealPlay) {
            this.qosRealPlay = qosRealPlay;
            return this;
        }
        public Float getQosRealPlay() {
            return this.qosRealPlay;
        }

        public DescribePlayQosListResponseBodyQosInfoList setQosSecondPlayRate(Float qosSecondPlayRate) {
            this.qosSecondPlayRate = qosSecondPlayRate;
            return this;
        }
        public Float getQosSecondPlayRate() {
            return this.qosSecondPlayRate;
        }

        public DescribePlayQosListResponseBodyQosInfoList setQosSeedFailRate(Float qosSeedFailRate) {
            this.qosSeedFailRate = qosSeedFailRate;
            return this;
        }
        public Float getQosSeedFailRate() {
            return this.qosSeedFailRate;
        }

        public DescribePlayQosListResponseBodyQosInfoList setQosSeekDuration(Double qosSeekDuration) {
            this.qosSeekDuration = qosSeekDuration;
            return this;
        }
        public Double getQosSeekDuration() {
            return this.qosSeekDuration;
        }

        public DescribePlayQosListResponseBodyQosInfoList setQosSlowPlayRate(Float qosSlowPlayRate) {
            this.qosSlowPlayRate = qosSlowPlayRate;
            return this;
        }
        public Float getQosSlowPlayRate() {
            return this.qosSlowPlayRate;
        }

        public DescribePlayQosListResponseBodyQosInfoList setQosStuckDuration100s(Double qosStuckDuration100s) {
            this.qosStuckDuration100s = qosStuckDuration100s;
            return this;
        }
        public Double getQosStuckDuration100s() {
            return this.qosStuckDuration100s;
        }

        public DescribePlayQosListResponseBodyQosInfoList setQosStuckRate(Float qosStuckRate) {
            this.qosStuckRate = qosStuckRate;
            return this;
        }
        public Float getQosStuckRate() {
            return this.qosStuckRate;
        }

        public DescribePlayQosListResponseBodyQosInfoList setTraceId(String traceId) {
            this.traceId = traceId;
            return this;
        }
        public String getTraceId() {
            return this.traceId;
        }

    }

}
