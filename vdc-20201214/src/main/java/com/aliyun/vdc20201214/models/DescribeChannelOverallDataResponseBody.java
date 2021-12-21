// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeChannelOverallDataResponseBody extends TeaModel {
    // 通信基本信息。
    @NameInMap("CallInfo")
    public DescribeChannelOverallDataResponseBodyCallInfo callInfo;

    // 指标数据列表。
    @NameInMap("MetricDatas")
    public java.util.List<DescribeChannelOverallDataResponseBodyMetricDatas> metricDatas;

    // 概览数据。
    @NameInMap("OverallData")
    public DescribeChannelOverallDataResponseBodyOverallData overallData;

    // 请求ID。
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
        // 应用ID。
        @NameInMap("AppId")
        public String appId;

        // 通信状态，取值：IN：进行中。OUT：已结束
        @NameInMap("CallStatus")
        public String callStatus;

        // 频道ID。
        @NameInMap("ChannelId")
        public String channelId;

        // 创建通信的时间戳，使用UNIX时间戳表示，单位：秒。
        @NameInMap("CreatedTs")
        public Long createdTs;

        // 释放通信的时间戳，使用UNIX时间戳表示，单位：秒。
        @NameInMap("DestroyedTs")
        public Long destroyedTs;

        // 通信时长，单位：秒。
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
        // 扩展数据
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        // 指标趋势图中x轴横坐标。
        @NameInMap("X")
        public String x;

        // 指标趋势图中y轴纵坐标。
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
        // 指标趋势图坐标点列表。
        @NameInMap("Nodes")
        public java.util.List<DescribeChannelOverallDataResponseBodyMetricDatasNodes> nodes;

        // 指标类型，取值：CALL_QUALITY：通信质量。CONN_NUM：通信次数。
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
        // 平均通信连接的用时，单位：秒。
        @NameInMap("ConnAvgTime")
        public Float connAvgTime;

        // 5秒内连通成功率，用小数表示，例如1.0表示连通成功率为100%。
        @NameInMap("FiveSecJoinRate")
        public Float fiveSecJoinRate;

        // 整体音频卡顿率，用小数表示，例如0.02表示音频卡顿率为2%。
        @NameInMap("TotalAudioStuckRate")
        public Float totalAudioStuckRate;

        // 整体视频卡顿率，用小数表示，例如0.02表示视频卡顿率为2%。
        @NameInMap("TotalVideoStuckRate")
        public Float totalVideoStuckRate;

        // 整体视频模糊率，用小数表示，例如0.02表示视频模糊率为2%。
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
