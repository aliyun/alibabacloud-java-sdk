// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodPlayerMetricDataResponseBody extends TeaModel {
    @NameInMap("DataList")
    public java.util.List<DescribeVodPlayerMetricDataResponseBodyDataList> dataList;

    @NameInMap("Extend")
    public DescribeVodPlayerMetricDataResponseBodyExtend extend;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <strong>example:</strong>
     * <p>5000</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A*****F6-D7393642CA58</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("TotalCnt")
    public Long totalCnt;

    public static DescribeVodPlayerMetricDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeVodPlayerMetricDataResponseBody self = new DescribeVodPlayerMetricDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeVodPlayerMetricDataResponseBody setDataList(java.util.List<DescribeVodPlayerMetricDataResponseBodyDataList> dataList) {
        this.dataList = dataList;
        return this;
    }
    public java.util.List<DescribeVodPlayerMetricDataResponseBodyDataList> getDataList() {
        return this.dataList;
    }

    public DescribeVodPlayerMetricDataResponseBody setExtend(DescribeVodPlayerMetricDataResponseBodyExtend extend) {
        this.extend = extend;
        return this;
    }
    public DescribeVodPlayerMetricDataResponseBodyExtend getExtend() {
        return this.extend;
    }

    public DescribeVodPlayerMetricDataResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeVodPlayerMetricDataResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeVodPlayerMetricDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeVodPlayerMetricDataResponseBody setTotalCnt(Long totalCnt) {
        this.totalCnt = totalCnt;
        return this;
    }
    public Long getTotalCnt() {
        return this.totalCnt;
    }

    public static class DescribeVodPlayerMetricDataResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AvgPerCompletionVv")
        public Double avgPerCompletionVv;

        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("AvgPerPlayDuration")
        public Double avgPerPlayDuration;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AvgPerVv")
        public Double avgPerVv;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AvgPlayBitrate")
        public Double avgPlayBitrate;

        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("AvgPlayDuration")
        public Double avgPlayDuration;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AvgStartBitrate")
        public Double avgStartBitrate;

        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("AvgVideoDuration")
        public Double avgVideoDuration;

        /**
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("CompletionRate")
        public Double completionRate;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("CompletionVv")
        public Double completionVv;

        /**
         * <strong>example:</strong>
         * <p>H265_MP4_WIFI</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ErrorCount100s")
        public Double errorCount100s;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FirstFrame")
        public Double firstFrame;

        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("JumpRate5s")
        public Double jumpRate5s;

        /**
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("PlayFailRate")
        public Double playFailRate;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("RealVv")
        public Double realVv;

        /**
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("SecondPlayRate")
        public Double secondPlayRate;

        /**
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("SeedFailRate")
        public Double seedFailRate;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SeekDuration")
        public Double seekDuration;

        /**
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("SlowPlayRate")
        public Double slowPlayRate;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StuckCount100s")
        public String stuckCount100s;

        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("StuckCountRate")
        public Double stuckCountRate;

        /**
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("StuckDuration100s")
        public Double stuckDuration100s;

        /**
         * <strong>example:</strong>
         * <p>2025-06-24T00:55:06Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("TotalPlayDuration")
        public Double totalPlayDuration;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Uv")
        public Double uv;

        /**
         * <strong>example:</strong>
         * <p>800</p>
         */
        @NameInMap("Vv")
        public Double vv;

        public static DescribeVodPlayerMetricDataResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodPlayerMetricDataResponseBodyDataList self = new DescribeVodPlayerMetricDataResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setAvgPerCompletionVv(Double avgPerCompletionVv) {
            this.avgPerCompletionVv = avgPerCompletionVv;
            return this;
        }
        public Double getAvgPerCompletionVv() {
            return this.avgPerCompletionVv;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setAvgPerPlayDuration(Double avgPerPlayDuration) {
            this.avgPerPlayDuration = avgPerPlayDuration;
            return this;
        }
        public Double getAvgPerPlayDuration() {
            return this.avgPerPlayDuration;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setAvgPerVv(Double avgPerVv) {
            this.avgPerVv = avgPerVv;
            return this;
        }
        public Double getAvgPerVv() {
            return this.avgPerVv;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setAvgPlayBitrate(Double avgPlayBitrate) {
            this.avgPlayBitrate = avgPlayBitrate;
            return this;
        }
        public Double getAvgPlayBitrate() {
            return this.avgPlayBitrate;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setAvgPlayDuration(Double avgPlayDuration) {
            this.avgPlayDuration = avgPlayDuration;
            return this;
        }
        public Double getAvgPlayDuration() {
            return this.avgPlayDuration;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setAvgStartBitrate(Double avgStartBitrate) {
            this.avgStartBitrate = avgStartBitrate;
            return this;
        }
        public Double getAvgStartBitrate() {
            return this.avgStartBitrate;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setAvgVideoDuration(Double avgVideoDuration) {
            this.avgVideoDuration = avgVideoDuration;
            return this;
        }
        public Double getAvgVideoDuration() {
            return this.avgVideoDuration;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setCompletionRate(Double completionRate) {
            this.completionRate = completionRate;
            return this;
        }
        public Double getCompletionRate() {
            return this.completionRate;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setCompletionVv(Double completionVv) {
            this.completionVv = completionVv;
            return this;
        }
        public Double getCompletionVv() {
            return this.completionVv;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setDimension(String dimension) {
            this.dimension = dimension;
            return this;
        }
        public String getDimension() {
            return this.dimension;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setErrorCount100s(Double errorCount100s) {
            this.errorCount100s = errorCount100s;
            return this;
        }
        public Double getErrorCount100s() {
            return this.errorCount100s;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setFirstFrame(Double firstFrame) {
            this.firstFrame = firstFrame;
            return this;
        }
        public Double getFirstFrame() {
            return this.firstFrame;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setJumpRate5s(Double jumpRate5s) {
            this.jumpRate5s = jumpRate5s;
            return this;
        }
        public Double getJumpRate5s() {
            return this.jumpRate5s;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setPlayFailRate(Double playFailRate) {
            this.playFailRate = playFailRate;
            return this;
        }
        public Double getPlayFailRate() {
            return this.playFailRate;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setRealVv(Double realVv) {
            this.realVv = realVv;
            return this;
        }
        public Double getRealVv() {
            return this.realVv;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setSecondPlayRate(Double secondPlayRate) {
            this.secondPlayRate = secondPlayRate;
            return this;
        }
        public Double getSecondPlayRate() {
            return this.secondPlayRate;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setSeedFailRate(Double seedFailRate) {
            this.seedFailRate = seedFailRate;
            return this;
        }
        public Double getSeedFailRate() {
            return this.seedFailRate;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setSeekDuration(Double seekDuration) {
            this.seekDuration = seekDuration;
            return this;
        }
        public Double getSeekDuration() {
            return this.seekDuration;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setSlowPlayRate(Double slowPlayRate) {
            this.slowPlayRate = slowPlayRate;
            return this;
        }
        public Double getSlowPlayRate() {
            return this.slowPlayRate;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setStuckCount100s(String stuckCount100s) {
            this.stuckCount100s = stuckCount100s;
            return this;
        }
        public String getStuckCount100s() {
            return this.stuckCount100s;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setStuckCountRate(Double stuckCountRate) {
            this.stuckCountRate = stuckCountRate;
            return this;
        }
        public Double getStuckCountRate() {
            return this.stuckCountRate;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setStuckDuration100s(Double stuckDuration100s) {
            this.stuckDuration100s = stuckDuration100s;
            return this;
        }
        public Double getStuckDuration100s() {
            return this.stuckDuration100s;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setTimeStamp(String timeStamp) {
            this.timeStamp = timeStamp;
            return this;
        }
        public String getTimeStamp() {
            return this.timeStamp;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setTotalPlayDuration(Double totalPlayDuration) {
            this.totalPlayDuration = totalPlayDuration;
            return this;
        }
        public Double getTotalPlayDuration() {
            return this.totalPlayDuration;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setUv(Double uv) {
            this.uv = uv;
            return this;
        }
        public Double getUv() {
            return this.uv;
        }

        public DescribeVodPlayerMetricDataResponseBodyDataList setVv(Double vv) {
            this.vv = vv;
            return this;
        }
        public Double getVv() {
            return this.vv;
        }

    }

    public static class DescribeVodPlayerMetricDataResponseBodyExtend extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-06-05T15:59:59Z</p>
         */
        @NameInMap("ActualEndTime")
        public String actualEndTime;

        /**
         * <strong>example:</strong>
         * <p>2025-06-24T00:55:06Z</p>
         */
        @NameInMap("ActualStartTime")
        public String actualStartTime;

        /**
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("IntervalSeconds")
        public Long intervalSeconds;

        public static DescribeVodPlayerMetricDataResponseBodyExtend build(java.util.Map<String, ?> map) throws Exception {
            DescribeVodPlayerMetricDataResponseBodyExtend self = new DescribeVodPlayerMetricDataResponseBodyExtend();
            return TeaModel.build(map, self);
        }

        public DescribeVodPlayerMetricDataResponseBodyExtend setActualEndTime(String actualEndTime) {
            this.actualEndTime = actualEndTime;
            return this;
        }
        public String getActualEndTime() {
            return this.actualEndTime;
        }

        public DescribeVodPlayerMetricDataResponseBodyExtend setActualStartTime(String actualStartTime) {
            this.actualStartTime = actualStartTime;
            return this;
        }
        public String getActualStartTime() {
            return this.actualStartTime;
        }

        public DescribeVodPlayerMetricDataResponseBodyExtend setIntervalSeconds(Long intervalSeconds) {
            this.intervalSeconds = intervalSeconds;
            return this;
        }
        public Long getIntervalSeconds() {
            return this.intervalSeconds;
        }

    }

}
