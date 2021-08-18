// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeUsageOverallDataResponseBody extends TeaModel {
    // 用量概览数据列表
    @NameInMap("UsageOverallData")
    public java.util.List<DescribeUsageOverallDataResponseBodyUsageOverallData> usageOverallData;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeUsageOverallDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeUsageOverallDataResponseBody self = new DescribeUsageOverallDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeUsageOverallDataResponseBody setUsageOverallData(java.util.List<DescribeUsageOverallDataResponseBodyUsageOverallData> usageOverallData) {
        this.usageOverallData = usageOverallData;
        return this;
    }
    public java.util.List<DescribeUsageOverallDataResponseBodyUsageOverallData> getUsageOverallData() {
        return this.usageOverallData;
    }

    public DescribeUsageOverallDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeUsageOverallDataResponseBodyUsageOverallDataNodes extends TeaModel {
        // x轴横坐标
        @NameInMap("X")
        public String x;

        // y轴横坐标
        @NameInMap("Y")
        public String y;

        public static DescribeUsageOverallDataResponseBodyUsageOverallDataNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsageOverallDataResponseBodyUsageOverallDataNodes self = new DescribeUsageOverallDataResponseBodyUsageOverallDataNodes();
            return TeaModel.build(map, self);
        }

        public DescribeUsageOverallDataResponseBodyUsageOverallDataNodes setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public DescribeUsageOverallDataResponseBodyUsageOverallDataNodes setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

    }

    public static class DescribeUsageOverallDataResponseBodyUsageOverallData extends TeaModel {
        // 类型，半角逗号分隔    总时长：TOTAL_CALL_DURATION  视频通信时长：VIDEO_CALL_DURATION  音频通信时长：AUDIO_CALL_DURATION    通信频道数：CALL_CHANNEL_COUNT  高并发通信频道数：  HIGHLY_CONCURRENT_CHANNEL_COUNT  并发频道数峰值：  CHANNEL_CONCURRENT_PEAK    在线人数峰值：ONLINE_USER_PEAK  累计通话人数：  TOTAL_CALL_USER  累计进出人次：  TOTAL_INOUT_NUM
        @NameInMap("Type")
        public String type;

        // 坐标点列表
        @NameInMap("Nodes")
        public java.util.List<DescribeUsageOverallDataResponseBodyUsageOverallDataNodes> nodes;

        public static DescribeUsageOverallDataResponseBodyUsageOverallData build(java.util.Map<String, ?> map) throws Exception {
            DescribeUsageOverallDataResponseBodyUsageOverallData self = new DescribeUsageOverallDataResponseBodyUsageOverallData();
            return TeaModel.build(map, self);
        }

        public DescribeUsageOverallDataResponseBodyUsageOverallData setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeUsageOverallDataResponseBodyUsageOverallData setNodes(java.util.List<DescribeUsageOverallDataResponseBodyUsageOverallDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeUsageOverallDataResponseBodyUsageOverallDataNodes> getNodes() {
            return this.nodes;
        }

    }

}
