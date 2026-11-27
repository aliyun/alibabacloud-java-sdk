// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeChannelOverallDataResponseBody extends TeaModel {
    /**
     * <p>Basic communication information.</p>
     */
    @NameInMap("CallInfo")
    public DescribeChannelOverallDataResponseBodyCallInfo callInfo;

    /**
     * <p>List of metric data.</p>
     */
    @NameInMap("MetricDatas")
    public java.util.List<DescribeChannelOverallDataResponseBodyMetricDatas> metricDatas;

    /**
     * <p>Overview data.</p>
     */
    @NameInMap("OverallData")
    public DescribeChannelOverallDataResponseBodyOverallData overallData;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeChannelOverallDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeChannelOverallDataResponseBody self = new DescribeChannelOverallDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeChannelOverallDataResponseBody setCallInfo(DescribeChannelOverallDataResponseBodyCallInfo callInfo) {
        this.callInfo = callInfo;
        return this;
    }
    public DescribeChannelOverallDataResponseBodyCallInfo getCallInfo() {
        return this.callInfo;
    }

    public DescribeChannelOverallDataResponseBody setMetricDatas(java.util.List<DescribeChannelOverallDataResponseBodyMetricDatas> metricDatas) {
        this.metricDatas = metricDatas;
        return this;
    }
    public java.util.List<DescribeChannelOverallDataResponseBodyMetricDatas> getMetricDatas() {
        return this.metricDatas;
    }

    public DescribeChannelOverallDataResponseBody setOverallData(DescribeChannelOverallDataResponseBodyOverallData overallData) {
        this.overallData = overallData;
        return this;
    }
    public DescribeChannelOverallDataResponseBodyOverallData getOverallData() {
        return this.overallData;
    }

    public DescribeChannelOverallDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeChannelOverallDataResponseBodyCallInfo extends TeaModel {
        /**
         * <p>Application ID.</p>
         * 
         * <strong>example:</strong>
         * <p>rjdhtnqy</p>
         */
        @NameInMap("AppId")
        public String appId;

        /**
         * <p>Communication status. Valid values:  </p>
         * <ul>
         * <li><p><strong>IN</strong>: In progress.  </p>
         * </li>
         * <li><p><strong>OUT</strong>: Ended.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>IN</p>
         */
        @NameInMap("CallStatus")
        public String callStatus;

        /**
         * <p>Channel ID.</p>
         * 
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The UNIX timestamp when the channel was created, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1615860711</p>
         */
        @NameInMap("CreatedTs")
        public Long createdTs;

        /**
         * <p>The UNIX timestamp when the channel was released, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1615860811</p>
         */
        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        /**
         * <p>Channel duration, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Duration")
        public Long duration;

        public static DescribeChannelOverallDataResponseBodyCallInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelOverallDataResponseBodyCallInfo self = new DescribeChannelOverallDataResponseBodyCallInfo();
            return TeaModel.build(map, self);
        }

        public DescribeChannelOverallDataResponseBodyCallInfo setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

        public DescribeChannelOverallDataResponseBodyCallInfo setCallStatus(String callStatus) {
            this.callStatus = callStatus;
            return this;
        }
        public String getCallStatus() {
            return this.callStatus;
        }

        public DescribeChannelOverallDataResponseBodyCallInfo setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeChannelOverallDataResponseBodyCallInfo setCreatedTs(Long createdTs) {
            this.createdTs = createdTs;
            return this;
        }
        public Long getCreatedTs() {
            return this.createdTs;
        }

        public DescribeChannelOverallDataResponseBodyCallInfo setDestroyedTs(Long destroyedTs) {
            this.destroyedTs = destroyedTs;
            return this;
        }
        public Long getDestroyedTs() {
            return this.destroyedTs;
        }

        public DescribeChannelOverallDataResponseBodyCallInfo setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

    }

    public static class DescribeChannelOverallDataResponseBodyMetricDatasNodes extends TeaModel {
        /**
         * <p>Extension data.</p>
         */
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        /**
         * <p>X-axis coordinate in the Trend Indicator.</p>
         * 
         * <strong>example:</strong>
         * <p>1612418625</p>
         */
        @NameInMap("X")
        public String x;

        /**
         * <p>Y-axis coordinate in the Trend Indicator.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Y")
        public String y;

        public static DescribeChannelOverallDataResponseBodyMetricDatasNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelOverallDataResponseBodyMetricDatasNodes self = new DescribeChannelOverallDataResponseBodyMetricDatasNodes();
            return TeaModel.build(map, self);
        }

        public DescribeChannelOverallDataResponseBodyMetricDatasNodes setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

        public DescribeChannelOverallDataResponseBodyMetricDatasNodes setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public DescribeChannelOverallDataResponseBodyMetricDatasNodes setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

    }

    public static class DescribeChannelOverallDataResponseBodyMetricDatas extends TeaModel {
        /**
         * <p>List of coordinate points for the Trend Indicator.</p>
         */
        @NameInMap("Nodes")
        public java.util.List<DescribeChannelOverallDataResponseBodyMetricDatasNodes> nodes;

        /**
         * <p>Metric Type. Valid values:</p>
         * <ul>
         * <li><strong>CALL_QUALITY</strong>: Call quality.</li>
         * <li><strong>CONN_NUM</strong>: Distribution of time intervals for successful channel joins.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>CALL_QUALITY</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeChannelOverallDataResponseBodyMetricDatas build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelOverallDataResponseBodyMetricDatas self = new DescribeChannelOverallDataResponseBodyMetricDatas();
            return TeaModel.build(map, self);
        }

        public DescribeChannelOverallDataResponseBodyMetricDatas setNodes(java.util.List<DescribeChannelOverallDataResponseBodyMetricDatasNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeChannelOverallDataResponseBodyMetricDatasNodes> getNodes() {
            return this.nodes;
        }

        public DescribeChannelOverallDataResponseBodyMetricDatas setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeChannelOverallDataResponseBodyOverallData extends TeaModel {
        /**
         * <p>Average communication connection time, in seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("ConnAvgTime")
        public Float connAvgTime;

        /**
         * <p>Connection success rate within 5 seconds, represented as a decimal. For example, 1.0 indicates a 100% connection success rate.</p>
         * 
         * <strong>example:</strong>
         * <p>0.91</p>
         */
        @NameInMap("FiveSecJoinRate")
        public Float fiveSecJoinRate;

        /**
         * <p>Overall audio stuttering rate, represented as a decimal. For example, 0.02 indicates an audio stuttering rate of 2%.</p>
         * 
         * <strong>example:</strong>
         * <p>0.02</p>
         */
        @NameInMap("TotalAudioStuckRate")
        public Float totalAudioStuckRate;

        /**
         * <p>Overall video stuttering rate, represented as a decimal. For example, 0.02 indicates a video stuttering rate of 2%.</p>
         * 
         * <strong>example:</strong>
         * <p>0.02</p>
         */
        @NameInMap("TotalVideoStuckRate")
        public Float totalVideoStuckRate;

        /**
         * <p>Overall video blur rate, represented as a decimal. For example, 0.02 indicates a video blur rate of 2%.</p>
         * 
         * <strong>example:</strong>
         * <p>0.02</p>
         */
        @NameInMap("TotalVideoVagueRate")
        public Float totalVideoVagueRate;

        public static DescribeChannelOverallDataResponseBodyOverallData build(java.util.Map<String, ?> map) throws Exception {
            DescribeChannelOverallDataResponseBodyOverallData self = new DescribeChannelOverallDataResponseBodyOverallData();
            return TeaModel.build(map, self);
        }

        public DescribeChannelOverallDataResponseBodyOverallData setConnAvgTime(Float connAvgTime) {
            this.connAvgTime = connAvgTime;
            return this;
        }
        public Float getConnAvgTime() {
            return this.connAvgTime;
        }

        public DescribeChannelOverallDataResponseBodyOverallData setFiveSecJoinRate(Float fiveSecJoinRate) {
            this.fiveSecJoinRate = fiveSecJoinRate;
            return this;
        }
        public Float getFiveSecJoinRate() {
            return this.fiveSecJoinRate;
        }

        public DescribeChannelOverallDataResponseBodyOverallData setTotalAudioStuckRate(Float totalAudioStuckRate) {
            this.totalAudioStuckRate = totalAudioStuckRate;
            return this;
        }
        public Float getTotalAudioStuckRate() {
            return this.totalAudioStuckRate;
        }

        public DescribeChannelOverallDataResponseBodyOverallData setTotalVideoStuckRate(Float totalVideoStuckRate) {
            this.totalVideoStuckRate = totalVideoStuckRate;
            return this;
        }
        public Float getTotalVideoStuckRate() {
            return this.totalVideoStuckRate;
        }

        public DescribeChannelOverallDataResponseBodyOverallData setTotalVideoVagueRate(Float totalVideoVagueRate) {
            this.totalVideoVagueRate = totalVideoVagueRate;
            return this;
        }
        public Float getTotalVideoVagueRate() {
            return this.totalVideoVagueRate;
        }

    }

}
