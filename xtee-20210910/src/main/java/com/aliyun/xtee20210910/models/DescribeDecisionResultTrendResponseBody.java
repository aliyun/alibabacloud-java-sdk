// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDecisionResultTrendResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeDecisionResultTrendResponseBodyResultObject resultObject;

    @NameInMap("success")
    public Boolean success;

    public static DescribeDecisionResultTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDecisionResultTrendResponseBody self = new DescribeDecisionResultTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDecisionResultTrendResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeDecisionResultTrendResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeDecisionResultTrendResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeDecisionResultTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDecisionResultTrendResponseBody setResultObject(DescribeDecisionResultTrendResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeDecisionResultTrendResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeDecisionResultTrendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeDecisionResultTrendResponseBodyResultObjectSeriesData extends TeaModel {
        @NameInMap("num")
        public Long num;

        @NameInMap("scale")
        public String scale;

        public static DescribeDecisionResultTrendResponseBodyResultObjectSeriesData build(java.util.Map<String, ?> map) throws Exception {
            DescribeDecisionResultTrendResponseBodyResultObjectSeriesData self = new DescribeDecisionResultTrendResponseBodyResultObjectSeriesData();
            return TeaModel.build(map, self);
        }

        public DescribeDecisionResultTrendResponseBodyResultObjectSeriesData setNum(Long num) {
            this.num = num;
            return this;
        }
        public Long getNum() {
            return this.num;
        }

        public DescribeDecisionResultTrendResponseBodyResultObjectSeriesData setScale(String scale) {
            this.scale = scale;
            return this;
        }
        public String getScale() {
            return this.scale;
        }

    }

    public static class DescribeDecisionResultTrendResponseBodyResultObjectSeries extends TeaModel {
        @NameInMap("data")
        public java.util.List<DescribeDecisionResultTrendResponseBodyResultObjectSeriesData> data;

        @NameInMap("name")
        public String name;

        public static DescribeDecisionResultTrendResponseBodyResultObjectSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeDecisionResultTrendResponseBodyResultObjectSeries self = new DescribeDecisionResultTrendResponseBodyResultObjectSeries();
            return TeaModel.build(map, self);
        }

        public DescribeDecisionResultTrendResponseBodyResultObjectSeries setData(java.util.List<DescribeDecisionResultTrendResponseBodyResultObjectSeriesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeDecisionResultTrendResponseBodyResultObjectSeriesData> getData() {
            return this.data;
        }

        public DescribeDecisionResultTrendResponseBodyResultObjectSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeDecisionResultTrendResponseBodyResultObjectXaxis extends TeaModel {
        @NameInMap("data")
        public java.util.List<String> data;

        public static DescribeDecisionResultTrendResponseBodyResultObjectXaxis build(java.util.Map<String, ?> map) throws Exception {
            DescribeDecisionResultTrendResponseBodyResultObjectXaxis self = new DescribeDecisionResultTrendResponseBodyResultObjectXaxis();
            return TeaModel.build(map, self);
        }

        public DescribeDecisionResultTrendResponseBodyResultObjectXaxis setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

    public static class DescribeDecisionResultTrendResponseBodyResultObject extends TeaModel {
        @NameInMap("series")
        public java.util.List<DescribeDecisionResultTrendResponseBodyResultObjectSeries> series;

        @NameInMap("xaxis")
        public DescribeDecisionResultTrendResponseBodyResultObjectXaxis xaxis;

        public static DescribeDecisionResultTrendResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeDecisionResultTrendResponseBodyResultObject self = new DescribeDecisionResultTrendResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeDecisionResultTrendResponseBodyResultObject setSeries(java.util.List<DescribeDecisionResultTrendResponseBodyResultObjectSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeDecisionResultTrendResponseBodyResultObjectSeries> getSeries() {
            return this.series;
        }

        public DescribeDecisionResultTrendResponseBodyResultObject setXaxis(DescribeDecisionResultTrendResponseBodyResultObjectXaxis xaxis) {
            this.xaxis = xaxis;
            return this;
        }
        public DescribeDecisionResultTrendResponseBodyResultObjectXaxis getXaxis() {
            return this.xaxis;
        }

    }

}
