// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeHitRuleTrendResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeHitRuleTrendResponseBodyResultObject resultObject;

    @NameInMap("success")
    public Boolean success;

    public static DescribeHitRuleTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHitRuleTrendResponseBody self = new DescribeHitRuleTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHitRuleTrendResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeHitRuleTrendResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeHitRuleTrendResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeHitRuleTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeHitRuleTrendResponseBody setResultObject(DescribeHitRuleTrendResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeHitRuleTrendResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeHitRuleTrendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeHitRuleTrendResponseBodyResultObjectSeriesData extends TeaModel {
        @NameInMap("num")
        public Long num;

        @NameInMap("scale")
        public String scale;

        public static DescribeHitRuleTrendResponseBodyResultObjectSeriesData build(java.util.Map<String, ?> map) throws Exception {
            DescribeHitRuleTrendResponseBodyResultObjectSeriesData self = new DescribeHitRuleTrendResponseBodyResultObjectSeriesData();
            return TeaModel.build(map, self);
        }

        public DescribeHitRuleTrendResponseBodyResultObjectSeriesData setNum(Long num) {
            this.num = num;
            return this;
        }
        public Long getNum() {
            return this.num;
        }

        public DescribeHitRuleTrendResponseBodyResultObjectSeriesData setScale(String scale) {
            this.scale = scale;
            return this;
        }
        public String getScale() {
            return this.scale;
        }

    }

    public static class DescribeHitRuleTrendResponseBodyResultObjectSeries extends TeaModel {
        @NameInMap("data")
        public java.util.List<DescribeHitRuleTrendResponseBodyResultObjectSeriesData> data;

        @NameInMap("name")
        public String name;

        public static DescribeHitRuleTrendResponseBodyResultObjectSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeHitRuleTrendResponseBodyResultObjectSeries self = new DescribeHitRuleTrendResponseBodyResultObjectSeries();
            return TeaModel.build(map, self);
        }

        public DescribeHitRuleTrendResponseBodyResultObjectSeries setData(java.util.List<DescribeHitRuleTrendResponseBodyResultObjectSeriesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeHitRuleTrendResponseBodyResultObjectSeriesData> getData() {
            return this.data;
        }

        public DescribeHitRuleTrendResponseBodyResultObjectSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeHitRuleTrendResponseBodyResultObjectXaxis extends TeaModel {
        @NameInMap("data")
        public java.util.List<String> data;

        public static DescribeHitRuleTrendResponseBodyResultObjectXaxis build(java.util.Map<String, ?> map) throws Exception {
            DescribeHitRuleTrendResponseBodyResultObjectXaxis self = new DescribeHitRuleTrendResponseBodyResultObjectXaxis();
            return TeaModel.build(map, self);
        }

        public DescribeHitRuleTrendResponseBodyResultObjectXaxis setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

    public static class DescribeHitRuleTrendResponseBodyResultObject extends TeaModel {
        @NameInMap("series")
        public java.util.List<DescribeHitRuleTrendResponseBodyResultObjectSeries> series;

        @NameInMap("xaxis")
        public DescribeHitRuleTrendResponseBodyResultObjectXaxis xaxis;

        public static DescribeHitRuleTrendResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeHitRuleTrendResponseBodyResultObject self = new DescribeHitRuleTrendResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeHitRuleTrendResponseBodyResultObject setSeries(java.util.List<DescribeHitRuleTrendResponseBodyResultObjectSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeHitRuleTrendResponseBodyResultObjectSeries> getSeries() {
            return this.series;
        }

        public DescribeHitRuleTrendResponseBodyResultObject setXaxis(DescribeHitRuleTrendResponseBodyResultObjectXaxis xaxis) {
            this.xaxis = xaxis;
            return this;
        }
        public DescribeHitRuleTrendResponseBodyResultObjectXaxis getXaxis() {
            return this.xaxis;
        }

    }

}
