// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeScoreSectionNumLineChartResponseBody extends TeaModel {
    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public DescribeScoreSectionNumLineChartResponseBodyResultObject resultObject;

    public static DescribeScoreSectionNumLineChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScoreSectionNumLineChartResponseBody self = new DescribeScoreSectionNumLineChartResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScoreSectionNumLineChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScoreSectionNumLineChartResponseBody setResultObject(DescribeScoreSectionNumLineChartResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeScoreSectionNumLineChartResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeScoreSectionNumLineChartResponseBodyResultObjectSeries extends TeaModel {
        /**
         * <p>List of current category results.</p>
         */
        @NameInMap("data")
        public java.util.List<String> data;

        /**
         * <p>Category name.</p>
         * 
         * <strong>example:</strong>
         * <p>旁路事件</p>
         */
        @NameInMap("name")
        public String name;

        public static DescribeScoreSectionNumLineChartResponseBodyResultObjectSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeScoreSectionNumLineChartResponseBodyResultObjectSeries self = new DescribeScoreSectionNumLineChartResponseBodyResultObjectSeries();
            return TeaModel.build(map, self);
        }

        public DescribeScoreSectionNumLineChartResponseBodyResultObjectSeries setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

        public DescribeScoreSectionNumLineChartResponseBodyResultObjectSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeScoreSectionNumLineChartResponseBodyResultObjectXaxis extends TeaModel {
        /**
         * <p>Data structure.</p>
         */
        @NameInMap("data")
        public java.util.List<String> data;

        public static DescribeScoreSectionNumLineChartResponseBodyResultObjectXaxis build(java.util.Map<String, ?> map) throws Exception {
            DescribeScoreSectionNumLineChartResponseBodyResultObjectXaxis self = new DescribeScoreSectionNumLineChartResponseBodyResultObjectXaxis();
            return TeaModel.build(map, self);
        }

        public DescribeScoreSectionNumLineChartResponseBodyResultObjectXaxis setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

    public static class DescribeScoreSectionNumLineChartResponseBodyResultObject extends TeaModel {
        /**
         * <p>Data list</p>
         */
        @NameInMap("series")
        public java.util.List<DescribeScoreSectionNumLineChartResponseBodyResultObjectSeries> series;

        /**
         * <p>Details of xaxis node.</p>
         */
        @NameInMap("xaxis")
        public DescribeScoreSectionNumLineChartResponseBodyResultObjectXaxis xaxis;

        public static DescribeScoreSectionNumLineChartResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeScoreSectionNumLineChartResponseBodyResultObject self = new DescribeScoreSectionNumLineChartResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeScoreSectionNumLineChartResponseBodyResultObject setSeries(java.util.List<DescribeScoreSectionNumLineChartResponseBodyResultObjectSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeScoreSectionNumLineChartResponseBodyResultObjectSeries> getSeries() {
            return this.series;
        }

        public DescribeScoreSectionNumLineChartResponseBodyResultObject setXaxis(DescribeScoreSectionNumLineChartResponseBodyResultObjectXaxis xaxis) {
            this.xaxis = xaxis;
            return this;
        }
        public DescribeScoreSectionNumLineChartResponseBodyResultObjectXaxis getXaxis() {
            return this.xaxis;
        }

    }

}
