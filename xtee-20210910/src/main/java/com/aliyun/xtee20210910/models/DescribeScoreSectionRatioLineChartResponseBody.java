// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeScoreSectionRatioLineChartResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeScoreSectionRatioLineChartResponseBodyResultObject resultObject;

    public static DescribeScoreSectionRatioLineChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeScoreSectionRatioLineChartResponseBody self = new DescribeScoreSectionRatioLineChartResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeScoreSectionRatioLineChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeScoreSectionRatioLineChartResponseBody setResultObject(DescribeScoreSectionRatioLineChartResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeScoreSectionRatioLineChartResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeScoreSectionRatioLineChartResponseBodyResultObjectSeries extends TeaModel {
        @NameInMap("data")
        public java.util.List<String> data;

        @NameInMap("name")
        public String name;

        public static DescribeScoreSectionRatioLineChartResponseBodyResultObjectSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeScoreSectionRatioLineChartResponseBodyResultObjectSeries self = new DescribeScoreSectionRatioLineChartResponseBodyResultObjectSeries();
            return TeaModel.build(map, self);
        }

        public DescribeScoreSectionRatioLineChartResponseBodyResultObjectSeries setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

        public DescribeScoreSectionRatioLineChartResponseBodyResultObjectSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeScoreSectionRatioLineChartResponseBodyResultObjectXaxis extends TeaModel {
        @NameInMap("data")
        public java.util.List<String> data;

        public static DescribeScoreSectionRatioLineChartResponseBodyResultObjectXaxis build(java.util.Map<String, ?> map) throws Exception {
            DescribeScoreSectionRatioLineChartResponseBodyResultObjectXaxis self = new DescribeScoreSectionRatioLineChartResponseBodyResultObjectXaxis();
            return TeaModel.build(map, self);
        }

        public DescribeScoreSectionRatioLineChartResponseBodyResultObjectXaxis setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

    public static class DescribeScoreSectionRatioLineChartResponseBodyResultObject extends TeaModel {
        @NameInMap("series")
        public java.util.List<DescribeScoreSectionRatioLineChartResponseBodyResultObjectSeries> series;

        @NameInMap("xaxis")
        public DescribeScoreSectionRatioLineChartResponseBodyResultObjectXaxis xaxis;

        public static DescribeScoreSectionRatioLineChartResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeScoreSectionRatioLineChartResponseBodyResultObject self = new DescribeScoreSectionRatioLineChartResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeScoreSectionRatioLineChartResponseBodyResultObject setSeries(java.util.List<DescribeScoreSectionRatioLineChartResponseBodyResultObjectSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeScoreSectionRatioLineChartResponseBodyResultObjectSeries> getSeries() {
            return this.series;
        }

        public DescribeScoreSectionRatioLineChartResponseBodyResultObject setXaxis(DescribeScoreSectionRatioLineChartResponseBodyResultObjectXaxis xaxis) {
            this.xaxis = xaxis;
            return this;
        }
        public DescribeScoreSectionRatioLineChartResponseBodyResultObjectXaxis getXaxis() {
            return this.xaxis;
        }

    }

}
