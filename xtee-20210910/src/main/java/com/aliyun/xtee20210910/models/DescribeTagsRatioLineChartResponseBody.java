// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTagsRatioLineChartResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeTagsRatioLineChartResponseBodyResultObject resultObject;

    public static DescribeTagsRatioLineChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsRatioLineChartResponseBody self = new DescribeTagsRatioLineChartResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagsRatioLineChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagsRatioLineChartResponseBody setResultObject(DescribeTagsRatioLineChartResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeTagsRatioLineChartResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeTagsRatioLineChartResponseBodyResultObjectSeries extends TeaModel {
        @NameInMap("data")
        public java.util.List<String> data;

        @NameInMap("name")
        public String name;

        public static DescribeTagsRatioLineChartResponseBodyResultObjectSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsRatioLineChartResponseBodyResultObjectSeries self = new DescribeTagsRatioLineChartResponseBodyResultObjectSeries();
            return TeaModel.build(map, self);
        }

        public DescribeTagsRatioLineChartResponseBodyResultObjectSeries setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

        public DescribeTagsRatioLineChartResponseBodyResultObjectSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeTagsRatioLineChartResponseBodyResultObjectXaxis extends TeaModel {
        @NameInMap("data")
        public java.util.List<String> data;

        public static DescribeTagsRatioLineChartResponseBodyResultObjectXaxis build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsRatioLineChartResponseBodyResultObjectXaxis self = new DescribeTagsRatioLineChartResponseBodyResultObjectXaxis();
            return TeaModel.build(map, self);
        }

        public DescribeTagsRatioLineChartResponseBodyResultObjectXaxis setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

    public static class DescribeTagsRatioLineChartResponseBodyResultObject extends TeaModel {
        @NameInMap("series")
        public java.util.List<DescribeTagsRatioLineChartResponseBodyResultObjectSeries> series;

        @NameInMap("xaxis")
        public DescribeTagsRatioLineChartResponseBodyResultObjectXaxis xaxis;

        public static DescribeTagsRatioLineChartResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsRatioLineChartResponseBodyResultObject self = new DescribeTagsRatioLineChartResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeTagsRatioLineChartResponseBodyResultObject setSeries(java.util.List<DescribeTagsRatioLineChartResponseBodyResultObjectSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeTagsRatioLineChartResponseBodyResultObjectSeries> getSeries() {
            return this.series;
        }

        public DescribeTagsRatioLineChartResponseBodyResultObject setXaxis(DescribeTagsRatioLineChartResponseBodyResultObjectXaxis xaxis) {
            this.xaxis = xaxis;
            return this;
        }
        public DescribeTagsRatioLineChartResponseBodyResultObjectXaxis getXaxis() {
            return this.xaxis;
        }

    }

}
