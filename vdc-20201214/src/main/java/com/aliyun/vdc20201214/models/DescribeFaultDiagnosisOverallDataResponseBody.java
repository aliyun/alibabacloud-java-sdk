// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vdc20201214.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisOverallDataResponseBody extends TeaModel {
    // 异常指标数据
    @NameInMap("MetricData")
    public DescribeFaultDiagnosisOverallDataResponseBodyMetricData metricData;

    // 总览数据
    @NameInMap("OverallData")
    public DescribeFaultDiagnosisOverallDataResponseBodyOverallData overallData;

    // 请求ID。
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeFaultDiagnosisOverallDataResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeFaultDiagnosisOverallDataResponseBody self = new DescribeFaultDiagnosisOverallDataResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeFaultDiagnosisOverallDataResponseBody setMetricData(DescribeFaultDiagnosisOverallDataResponseBodyMetricData metricData) {
        this.metricData = metricData;
        return this;
    }
    public DescribeFaultDiagnosisOverallDataResponseBodyMetricData getMetricData() {
        return this.metricData;
    }

    public DescribeFaultDiagnosisOverallDataResponseBody setOverallData(DescribeFaultDiagnosisOverallDataResponseBodyOverallData overallData) {
        this.overallData = overallData;
        return this;
    }
    public DescribeFaultDiagnosisOverallDataResponseBodyOverallData getOverallData() {
        return this.overallData;
    }

    public DescribeFaultDiagnosisOverallDataResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeFaultDiagnosisOverallDataResponseBodyMetricDataNodes extends TeaModel {
        // 拓展属性，ratio：单位时间内异常用户占比，totalCount：单位时间内用户总数
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        // x轴横坐标，秒级时间戳
        @NameInMap("X")
        public String x;

        // y轴横坐标，单位数据异常用户数
        @NameInMap("Y")
        public String y;

        public static DescribeFaultDiagnosisOverallDataResponseBodyMetricDataNodes build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisOverallDataResponseBodyMetricDataNodes self = new DescribeFaultDiagnosisOverallDataResponseBodyMetricDataNodes();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisOverallDataResponseBodyMetricDataNodes setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

        public DescribeFaultDiagnosisOverallDataResponseBodyMetricDataNodes setX(String x) {
            this.x = x;
            return this;
        }
        public String getX() {
            return this.x;
        }

        public DescribeFaultDiagnosisOverallDataResponseBodyMetricDataNodes setY(String y) {
            this.y = y;
            return this;
        }
        public String getY() {
            return this.y;
        }

    }

    public static class DescribeFaultDiagnosisOverallDataResponseBodyMetricData extends TeaModel {
        // 指标坐标点列表，单位时间为1分钟的异常用户数据
        @NameInMap("Nodes")
        public java.util.List<DescribeFaultDiagnosisOverallDataResponseBodyMetricDataNodes> nodes;

        public static DescribeFaultDiagnosisOverallDataResponseBodyMetricData build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisOverallDataResponseBodyMetricData self = new DescribeFaultDiagnosisOverallDataResponseBodyMetricData();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisOverallDataResponseBodyMetricData setNodes(java.util.List<DescribeFaultDiagnosisOverallDataResponseBodyMetricDataNodes> nodes) {
            this.nodes = nodes;
            return this;
        }
        public java.util.List<DescribeFaultDiagnosisOverallDataResponseBodyMetricDataNodes> getNodes() {
            return this.nodes;
        }

    }

    public static class DescribeFaultDiagnosisOverallDataResponseBodyOverallData extends TeaModel {
        // 异常用户数/人次
        @NameInMap("FaultUserCount")
        public Integer faultUserCount;

        // 异常用户总占比
        @NameInMap("FaultUserRatio")
        public Float faultUserRatio;

        // 用户总数/人次
        @NameInMap("TotalUserCount")
        public Integer totalUserCount;

        public static DescribeFaultDiagnosisOverallDataResponseBodyOverallData build(java.util.Map<String, ?> map) throws Exception {
            DescribeFaultDiagnosisOverallDataResponseBodyOverallData self = new DescribeFaultDiagnosisOverallDataResponseBodyOverallData();
            return TeaModel.build(map, self);
        }

        public DescribeFaultDiagnosisOverallDataResponseBodyOverallData setFaultUserCount(Integer faultUserCount) {
            this.faultUserCount = faultUserCount;
            return this;
        }
        public Integer getFaultUserCount() {
            return this.faultUserCount;
        }

        public DescribeFaultDiagnosisOverallDataResponseBodyOverallData setFaultUserRatio(Float faultUserRatio) {
            this.faultUserRatio = faultUserRatio;
            return this;
        }
        public Float getFaultUserRatio() {
            return this.faultUserRatio;
        }

        public DescribeFaultDiagnosisOverallDataResponseBodyOverallData setTotalUserCount(Integer totalUserCount) {
            this.totalUserCount = totalUserCount;
            return this;
        }
        public Integer getTotalUserCount() {
            return this.totalUserCount;
        }

    }

}
