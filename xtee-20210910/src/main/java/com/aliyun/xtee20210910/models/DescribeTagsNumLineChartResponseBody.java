// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTagsNumLineChartResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeTagsNumLineChartResponseBodyResultObject resultObject;

    public static DescribeTagsNumLineChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsNumLineChartResponseBody self = new DescribeTagsNumLineChartResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagsNumLineChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagsNumLineChartResponseBody setResultObject(DescribeTagsNumLineChartResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeTagsNumLineChartResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class DescribeTagsNumLineChartResponseBodyResultObjectSeries extends TeaModel {
        @NameInMap("data")
        public java.util.List<String> data;

        @NameInMap("name")
        public String name;

        public static DescribeTagsNumLineChartResponseBodyResultObjectSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsNumLineChartResponseBodyResultObjectSeries self = new DescribeTagsNumLineChartResponseBodyResultObjectSeries();
            return TeaModel.build(map, self);
        }

        public DescribeTagsNumLineChartResponseBodyResultObjectSeries setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

        public DescribeTagsNumLineChartResponseBodyResultObjectSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeTagsNumLineChartResponseBodyResultObjectXaxis extends TeaModel {
        @NameInMap("data")
        public java.util.List<String> data;

        public static DescribeTagsNumLineChartResponseBodyResultObjectXaxis build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsNumLineChartResponseBodyResultObjectXaxis self = new DescribeTagsNumLineChartResponseBodyResultObjectXaxis();
            return TeaModel.build(map, self);
        }

        public DescribeTagsNumLineChartResponseBodyResultObjectXaxis setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

    public static class DescribeTagsNumLineChartResponseBodyResultObject extends TeaModel {
        @NameInMap("series")
        public java.util.List<DescribeTagsNumLineChartResponseBodyResultObjectSeries> series;

        @NameInMap("xaxis")
        public DescribeTagsNumLineChartResponseBodyResultObjectXaxis xaxis;

        public static DescribeTagsNumLineChartResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsNumLineChartResponseBodyResultObject self = new DescribeTagsNumLineChartResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeTagsNumLineChartResponseBodyResultObject setSeries(java.util.List<DescribeTagsNumLineChartResponseBodyResultObjectSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeTagsNumLineChartResponseBodyResultObjectSeries> getSeries() {
            return this.series;
        }

        public DescribeTagsNumLineChartResponseBodyResultObject setXaxis(DescribeTagsNumLineChartResponseBodyResultObjectXaxis xaxis) {
            this.xaxis = xaxis;
            return this;
        }
        public DescribeTagsNumLineChartResponseBodyResultObjectXaxis getXaxis() {
            return this.xaxis;
        }

    }

}
