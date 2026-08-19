// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DescribeVodPlayerMetricDataResponseBody extends TeaModel {
    /**
     * <p>The list of returned data.</p>
     */
    @NameInMap("DataList")
    public java.util.List<DescribeVodPlayerMetricDataResponseBodyDataList> dataList;

    /**
     * <p>The extended information.</p>
     */
    @NameInMap("Extend")
    public DescribeVodPlayerMetricDataResponseBodyExtend extend;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The page size.</p>
     * 
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
     * <p>The total number of data points.</p>
     * 
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
         * <p>The average completion plays per user.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AvgPerCompletionVv")
        public Double avgPerCompletionVv;

        /**
         * <p>The average play duration per user, in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("AvgPerPlayDuration")
        public Double avgPerPlayDuration;

        /**
         * <p>The average plays per user.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("AvgPerVv")
        public Double avgPerVv;

        /**
         * <p>The average playback bitrate, in bps.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AvgPlayBitrate")
        public Double avgPlayBitrate;

        /**
         * <p>The average play duration, in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("AvgPlayDuration")
        public Double avgPlayDuration;

        /**
         * <p>The average start bitrate, in bps.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AvgStartBitrate")
        public Double avgStartBitrate;

        /**
         * <p>The average video duration, in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("AvgVideoDuration")
        public Double avgVideoDuration;

        /**
         * <p>The completion rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("CompletionRate")
        public Double completionRate;

        /**
         * <p>The completion count.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("CompletionVv")
        public Double completionVv;

        /**
         * <p>The dimension.</p>
         * 
         * <strong>example:</strong>
         * <p>H265_MP4_WIFI</p>
         */
        @NameInMap("Dimension")
        public String dimension;

        /**
         * <p>The error count per 100 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ErrorCount100s")
        public Double errorCount100s;

        /**
         * <p>The first frame time, in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("FirstFrame")
        public Double firstFrame;

        /**
         * <p>The 5-second bounce rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("JumpRate5s")
        public Double jumpRate5s;

        /**
         * <p>The play failure rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("PlayFailRate")
        public Double playFailRate;

        /**
         * <p>The actual play count.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("RealVv")
        public Double realVv;

        /**
         * <p>The instant play rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0.8</p>
         */
        @NameInMap("SecondPlayRate")
        public Double secondPlayRate;

        /**
         * <p>The non-play rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("SeedFailRate")
        public Double seedFailRate;

        /**
         * <p>The seek duration, in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("SeekDuration")
        public Double seekDuration;

        /**
         * <p>The slow play rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("SlowPlayRate")
        public Double slowPlayRate;

        /**
         * <p>The stuttering count per 100 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("StuckCount100s")
        public String stuckCount100s;

        /**
         * <p>The stuttering rate by count.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("StuckCountRate")
        public Double stuckCountRate;

        /**
         * <p>The stuttering duration per 100 seconds, in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("StuckDuration100s")
        public Double stuckDuration100s;

        /**
         * <p>The timestamp of the data. Format: yyyy-mm-ddthh:mm:ssz (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-24T00:55:06Z</p>
         */
        @NameInMap("TimeStamp")
        public String timeStamp;

        /**
         * <p>The total play duration, in milliseconds (ms).</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("TotalPlayDuration")
        public Double totalPlayDuration;

        /**
         * <p>The number of playback users.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Uv")
        public Double uv;

        /**
         * <p>The play count.</p>
         * 
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
         * <p>The latest time with data points within the specified time range. Format: yyyy-mm-ddthh:mm:ssz (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-05T15:59:59Z</p>
         */
        @NameInMap("ActualEndTime")
        public String actualEndTime;

        /**
         * <p>The earliest time with data points within the specified time range. Format: yyyy-mm-ddthh:mm:ssz (UTC).</p>
         * 
         * <strong>example:</strong>
         * <p>2025-06-24T00:55:06Z</p>
         */
        @NameInMap("ActualStartTime")
        public String actualStartTime;

        /**
         * <p>The time granularity of the queried data, in seconds (s).</p>
         * 
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
