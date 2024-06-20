// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rtc20180111.models;

import com.aliyun.tea.*;

public class DescribeFaultDiagnosisOverallDataResponseBody extends TeaModel {
    @NameInMap("MetricData")
    public DescribeFaultDiagnosisOverallDataResponseBodyMetricData metricData;

    @NameInMap("OverallData")
    public DescribeFaultDiagnosisOverallDataResponseBodyOverallData overallData;

    /**
     * <strong>example:</strong>
     * <p>231470C1-ACFB-4C9F-844F-4CFE1E3804C5</p>
     */
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
        @NameInMap("Ext")
        public java.util.Map<String, ?> ext;

        /**
         * <strong>example:</strong>
         * <p>1615824000</p>
         */
        @NameInMap("X")
        public String x;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("FaultUserCount")
        public Integer faultUserCount;

        /**
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("FaultUserRatio")
        public Float faultUserRatio;

        /**
         * <strong>example:</strong>
         * <p>40</p>
         */
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
