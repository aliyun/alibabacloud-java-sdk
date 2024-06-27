// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventResultBarChartResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeEventResultBarChartResponseBodyResultObject resultObject;

    @NameInMap("success")
    public Boolean success;

    public static DescribeEventResultBarChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventResultBarChartResponseBody self = new DescribeEventResultBarChartResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventResultBarChartResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEventResultBarChartResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeEventResultBarChartResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEventResultBarChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventResultBarChartResponseBody setResultObject(DescribeEventResultBarChartResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeEventResultBarChartResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeEventResultBarChartResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEventResultBarChartResponseBodyResultObjectSeriesData extends TeaModel {
        @NameInMap("num")
        public Long num;

        @NameInMap("scale")
        public String scale;

        public static DescribeEventResultBarChartResponseBodyResultObjectSeriesData build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventResultBarChartResponseBodyResultObjectSeriesData self = new DescribeEventResultBarChartResponseBodyResultObjectSeriesData();
            return TeaModel.build(map, self);
        }

        public DescribeEventResultBarChartResponseBodyResultObjectSeriesData setNum(Long num) {
            this.num = num;
            return this;
        }
        public Long getNum() {
            return this.num;
        }

        public DescribeEventResultBarChartResponseBodyResultObjectSeriesData setScale(String scale) {
            this.scale = scale;
            return this;
        }
        public String getScale() {
            return this.scale;
        }

    }

    public static class DescribeEventResultBarChartResponseBodyResultObjectSeries extends TeaModel {
        @NameInMap("data")
        public java.util.List<DescribeEventResultBarChartResponseBodyResultObjectSeriesData> data;

        @NameInMap("name")
        public String name;

        @NameInMap("stack")
        public String stack;

        public static DescribeEventResultBarChartResponseBodyResultObjectSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventResultBarChartResponseBodyResultObjectSeries self = new DescribeEventResultBarChartResponseBodyResultObjectSeries();
            return TeaModel.build(map, self);
        }

        public DescribeEventResultBarChartResponseBodyResultObjectSeries setData(java.util.List<DescribeEventResultBarChartResponseBodyResultObjectSeriesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeEventResultBarChartResponseBodyResultObjectSeriesData> getData() {
            return this.data;
        }

        public DescribeEventResultBarChartResponseBodyResultObjectSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeEventResultBarChartResponseBodyResultObjectSeries setStack(String stack) {
            this.stack = stack;
            return this;
        }
        public String getStack() {
            return this.stack;
        }

    }

    public static class DescribeEventResultBarChartResponseBodyResultObjectXaxis extends TeaModel {
        @NameInMap("data")
        public java.util.List<String> data;

        public static DescribeEventResultBarChartResponseBodyResultObjectXaxis build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventResultBarChartResponseBodyResultObjectXaxis self = new DescribeEventResultBarChartResponseBodyResultObjectXaxis();
            return TeaModel.build(map, self);
        }

        public DescribeEventResultBarChartResponseBodyResultObjectXaxis setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

    public static class DescribeEventResultBarChartResponseBodyResultObject extends TeaModel {
        @NameInMap("series")
        public java.util.List<DescribeEventResultBarChartResponseBodyResultObjectSeries> series;

        @NameInMap("xaxis")
        public DescribeEventResultBarChartResponseBodyResultObjectXaxis xaxis;

        public static DescribeEventResultBarChartResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventResultBarChartResponseBodyResultObject self = new DescribeEventResultBarChartResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeEventResultBarChartResponseBodyResultObject setSeries(java.util.List<DescribeEventResultBarChartResponseBodyResultObjectSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeEventResultBarChartResponseBodyResultObjectSeries> getSeries() {
            return this.series;
        }

        public DescribeEventResultBarChartResponseBodyResultObject setXaxis(DescribeEventResultBarChartResponseBodyResultObjectXaxis xaxis) {
            this.xaxis = xaxis;
            return this;
        }
        public DescribeEventResultBarChartResponseBodyResultObjectXaxis getXaxis() {
            return this.xaxis;
        }

    }

}
