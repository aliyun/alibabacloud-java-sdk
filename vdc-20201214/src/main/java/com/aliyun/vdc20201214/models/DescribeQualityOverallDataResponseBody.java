// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeQualityOverallDataResponseBody extends TeaModel {
    @NameInMap("QualityOverallData")
    public java.util.List<DescribeQualityOverallDataResponseBodyQualityOverallData> qualityOverallData;

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
        @NameInMap("X")
        public String x;

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
        @NameInMap("Average")
        public String average;

        @NameInMap("Nodes")
        public java.util.List<DescribeQualityOverallDataResponseBodyQualityOverallDataNodes> nodes;

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
