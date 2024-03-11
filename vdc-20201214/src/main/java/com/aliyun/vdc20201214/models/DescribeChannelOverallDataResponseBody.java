// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeChannelOverallDataResponseBody extends TeaModel {
    @NameInMap("CallInfo")
    public DescribeChannelOverallDataResponseBodyCallInfo callInfo;

    @NameInMap("MetricDatas")
    public java.util.List<DescribeChannelOverallDataResponseBodyMetricDatas> metricDatas;

    @NameInMap("OverallData")
    public DescribeChannelOverallDataResponseBodyOverallData overallData;

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
        @NameInMap("AppId")
        public String appId;

        @NameInMap("CallStatus")
        public String callStatus;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("CreatedTs")
        public Long createdTs;

        @NameInMap("DestroyedTs")
        public Long destroyedTs;

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
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        @NameInMap("X")
        public String x;

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
        @NameInMap("Nodes")
        public java.util.List<DescribeChannelOverallDataResponseBodyMetricDatasNodes> nodes;

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
        @NameInMap("ConnAvgTime")
        public Float connAvgTime;

        @NameInMap("FiveSecJoinRate")
        public Float fiveSecJoinRate;

        @NameInMap("TotalAudioStuckRate")
        public Float totalAudioStuckRate;

        @NameInMap("TotalVideoStuckRate")
        public Float totalVideoStuckRate;

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
