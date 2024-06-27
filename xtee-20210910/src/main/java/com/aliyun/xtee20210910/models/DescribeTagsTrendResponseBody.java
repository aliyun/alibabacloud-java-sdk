// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTagsTrendResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeTagsTrendResponseBodyResultObject resultObject;

    @NameInMap("success")
    public Boolean success;

    public static DescribeTagsTrendResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTagsTrendResponseBody self = new DescribeTagsTrendResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTagsTrendResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeTagsTrendResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeTagsTrendResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeTagsTrendResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeTagsTrendResponseBody setResultObject(DescribeTagsTrendResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeTagsTrendResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeTagsTrendResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeTagsTrendResponseBodyResultObjectSeriesData extends TeaModel {
        @NameInMap("num")
        public Long num;

        @NameInMap("scale")
        public String scale;

        public static DescribeTagsTrendResponseBodyResultObjectSeriesData build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsTrendResponseBodyResultObjectSeriesData self = new DescribeTagsTrendResponseBodyResultObjectSeriesData();
            return TeaModel.build(map, self);
        }

        public DescribeTagsTrendResponseBodyResultObjectSeriesData setNum(Long num) {
            this.num = num;
            return this;
        }
        public Long getNum() {
            return this.num;
        }

        public DescribeTagsTrendResponseBodyResultObjectSeriesData setScale(String scale) {
            this.scale = scale;
            return this;
        }
        public String getScale() {
            return this.scale;
        }

    }

    public static class DescribeTagsTrendResponseBodyResultObjectSeries extends TeaModel {
        @NameInMap("data")
        public java.util.List<DescribeTagsTrendResponseBodyResultObjectSeriesData> data;

        @NameInMap("name")
        public String name;

        public static DescribeTagsTrendResponseBodyResultObjectSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsTrendResponseBodyResultObjectSeries self = new DescribeTagsTrendResponseBodyResultObjectSeries();
            return TeaModel.build(map, self);
        }

        public DescribeTagsTrendResponseBodyResultObjectSeries setData(java.util.List<DescribeTagsTrendResponseBodyResultObjectSeriesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeTagsTrendResponseBodyResultObjectSeriesData> getData() {
            return this.data;
        }

        public DescribeTagsTrendResponseBodyResultObjectSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeTagsTrendResponseBodyResultObjectXaxis extends TeaModel {
        @NameInMap("data")
        public java.util.List<String> data;

        public static DescribeTagsTrendResponseBodyResultObjectXaxis build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsTrendResponseBodyResultObjectXaxis self = new DescribeTagsTrendResponseBodyResultObjectXaxis();
            return TeaModel.build(map, self);
        }

        public DescribeTagsTrendResponseBodyResultObjectXaxis setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

    public static class DescribeTagsTrendResponseBodyResultObject extends TeaModel {
        @NameInMap("series")
        public java.util.List<DescribeTagsTrendResponseBodyResultObjectSeries> series;

        @NameInMap("xaxis")
        public DescribeTagsTrendResponseBodyResultObjectXaxis xaxis;

        public static DescribeTagsTrendResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeTagsTrendResponseBodyResultObject self = new DescribeTagsTrendResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeTagsTrendResponseBodyResultObject setSeries(java.util.List<DescribeTagsTrendResponseBodyResultObjectSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeTagsTrendResponseBodyResultObjectSeries> getSeries() {
            return this.series;
        }

        public DescribeTagsTrendResponseBodyResultObject setXaxis(DescribeTagsTrendResponseBodyResultObjectXaxis xaxis) {
            this.xaxis = xaxis;
            return this;
        }
        public DescribeTagsTrendResponseBodyResultObjectXaxis getXaxis() {
            return this.xaxis;
        }

    }

}
