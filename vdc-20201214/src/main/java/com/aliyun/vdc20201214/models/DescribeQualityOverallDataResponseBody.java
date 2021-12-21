// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeQualityOverallDataResponseBody extends TeaModel {
    // 概览数据列表
    @NameInMap("QualityOverallData")
    public java.util.List<DescribeQualityOverallDataResponseBodyQualityOverallData> qualityOverallData;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeQualityOverallDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeQualityOverallDataResponseBody self = new DescribeQualityOverallDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeQualityOverallDataResponseBody setQualityOverallData(java.util.List<DescribeQualityOverallDataResponseBodyQualityOverallData> qualityOverallData) {
        this.qualityOverallData = qualityOverallData;
        return this;
    }
    public java.util.List<DescribeQualityOverallDataResponseBodyQualityOverallData> getQualityOverallData() {
        return this.qualityOverallData;
    }

    public DescribeQualityOverallDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeQualityOverallDataResponseBodyQualityOverallDataNodes extends TeaModel {
        // x轴横坐标
        @NameInMap("X")
        public String x;

        // y轴纵坐标
        @NameInMap("Y")
        public String y;

        public static DescribeQualityOverallDataResponseBodyQualityOverallDataNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeQualityOverallDataResponseBodyQualityOverallDataNodes self = new DescribeQualityOverallDataResponseBodyQualityOverallDataNodes();
            return TeaModel.build(map, self);
        }

        public DescribeQualityOverallDataResponseBodyQualityOverallDataNodes setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public DescribeQualityOverallDataResponseBodyQualityOverallDataNodes setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

    }

    public static class DescribeQualityOverallDataResponseBodyQualityOverallData extends TeaModel {
        // 平均值
        @NameInMap("Average")
        public String average;

        // 坐标点列表
        @NameInMap("Nodes")
        public java.util.List<DescribeQualityOverallDataResponseBodyQualityOverallDataNodes> nodes;

        // 概览数据类型，加入频道成功率： JOIN_CHANNEL_SUC_RATE 五秒加入频道成功率： JOIN_CHANNEL_SUC_FIVE_SEC_RATE  首次出声时间： AUDIO_SPEAK_OUT_DUR 首次出图时间： VIDEO_FIRST_PIC_DUR 音频卡顿率： AUDIO_STUCK_RATE 视频卡顿率： VIDEO_STUCK_RATE 音频延时： AUDIO_DELAY 视频延时： AUDIO_DELAY 音频优质传输率： AUDIO_HIGH_QUALITY_TRANSMISSION_RATE 视频优质传输率： VIDEO_HIGH_QUALITY_TRANSMISSION_RATE
        @NameInMap("Type")
        public String type;

        public static DescribeQualityOverallDataResponseBodyQualityOverallData build(java.util.Map<String, ?> map) throws Exception {
            DescribeQualityOverallDataResponseBodyQualityOverallData self = new DescribeQualityOverallDataResponseBodyQualityOverallData();
            return TeaModel.build(map, self);
        }

        public DescribeQualityOverallDataResponseBodyQualityOverallData setAverage(String average) {
            this.average = average;
            return this;
        }
        public String getAverage() {
            return this.average;
        }

        public DescribeQualityOverallDataResponseBodyQualityOverallData setNodes(java.util.List<DescribeQualityOverallDataResponseBodyQualityOverallDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeQualityOverallDataResponseBodyQualityOverallDataNodes> getNodes() {
            return this.nodes;
        }

        public DescribeQualityOverallDataResponseBodyQualityOverallData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
