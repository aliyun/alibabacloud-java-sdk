// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTagsBarChartResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeTagsBarChartResponseBodyResultObject resultObject;

    @NameInMap("success")
    public Boolean success;

    public static DescribeTagsBarChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsBarChartResponseBody self = new DescribeTagsBarChartResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagsBarChartResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTagsBarChartResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeTagsBarChartResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTagsBarChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagsBarChartResponseBody setResultObject(DescribeTagsBarChartResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeTagsBarChartResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeTagsBarChartResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeTagsBarChartResponseBodyResultObjectSeriesData extends TeaModel {
        @NameInMap("num")
        public Long num;

        @NameInMap("scale")
        public String scale;

        public static DescribeTagsBarChartResponseBodyResultObjectSeriesData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsBarChartResponseBodyResultObjectSeriesData self = new DescribeTagsBarChartResponseBodyResultObjectSeriesData();
            return TeaModel.build(map, self);
        }

        public DescribeTagsBarChartResponseBodyResultObjectSeriesData setNum(Long num) {
            this.num = num;
            return this;
        }
        public Long getNum() {
            return this.num;
        }

        public DescribeTagsBarChartResponseBodyResultObjectSeriesData setScale(String scale) {
            this.scale = scale;
            return this;
        }
        public String getScale() {
            return this.scale;
        }

    }

    public static class DescribeTagsBarChartResponseBodyResultObjectSeries extends TeaModel {
        @NameInMap("data")
        public java.util.List<DescribeTagsBarChartResponseBodyResultObjectSeriesData> data;

        @NameInMap("name")
        public String name;

        @NameInMap("stack")
        public String stack;

        public static DescribeTagsBarChartResponseBodyResultObjectSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsBarChartResponseBodyResultObjectSeries self = new DescribeTagsBarChartResponseBodyResultObjectSeries();
            return TeaModel.build(map, self);
        }

        public DescribeTagsBarChartResponseBodyResultObjectSeries setData(java.util.List<DescribeTagsBarChartResponseBodyResultObjectSeriesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeTagsBarChartResponseBodyResultObjectSeriesData> getData() {
            return this.data;
        }

        public DescribeTagsBarChartResponseBodyResultObjectSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeTagsBarChartResponseBodyResultObjectSeries setStack(String stack) {
            this.stack = stack;
            return this;
        }
        public String getStack() {
            return this.stack;
        }

    }

    public static class DescribeTagsBarChartResponseBodyResultObjectXaxis extends TeaModel {
        @NameInMap("data")
        public java.util.List<String> data;

        public static DescribeTagsBarChartResponseBodyResultObjectXaxis build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsBarChartResponseBodyResultObjectXaxis self = new DescribeTagsBarChartResponseBodyResultObjectXaxis();
            return TeaModel.build(map, self);
        }

        public DescribeTagsBarChartResponseBodyResultObjectXaxis setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

    public static class DescribeTagsBarChartResponseBodyResultObject extends TeaModel {
        @NameInMap("series")
        public java.util.List<DescribeTagsBarChartResponseBodyResultObjectSeries> series;

        @NameInMap("xaxis")
        public DescribeTagsBarChartResponseBodyResultObjectXaxis xaxis;

        public static DescribeTagsBarChartResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsBarChartResponseBodyResultObject self = new DescribeTagsBarChartResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeTagsBarChartResponseBodyResultObject setSeries(java.util.List<DescribeTagsBarChartResponseBodyResultObjectSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeTagsBarChartResponseBodyResultObjectSeries> getSeries() {
            return this.series;
        }

        public DescribeTagsBarChartResponseBodyResultObject setXaxis(DescribeTagsBarChartResponseBodyResultObjectXaxis xaxis) {
            this.xaxis = xaxis;
            return this;
        }
        public DescribeTagsBarChartResponseBodyResultObjectXaxis getXaxis() {
            return this.xaxis;
        }

    }

}
