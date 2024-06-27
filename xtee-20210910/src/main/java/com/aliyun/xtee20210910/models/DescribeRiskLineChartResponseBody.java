// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRiskLineChartResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeRiskLineChartResponseBodyResultObject resultObject;

    @NameInMap("success")
    public Boolean success;

    public static DescribeRiskLineChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskLineChartResponseBody self = new DescribeRiskLineChartResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskLineChartResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRiskLineChartResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeRiskLineChartResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRiskLineChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRiskLineChartResponseBody setResultObject(DescribeRiskLineChartResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeRiskLineChartResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeRiskLineChartResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRiskLineChartResponseBodyResultObjectSeries extends TeaModel {
        @NameInMap("data")
        public java.util.List<String> data;

        @NameInMap("name")
        public String name;

        public static DescribeRiskLineChartResponseBodyResultObjectSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskLineChartResponseBodyResultObjectSeries self = new DescribeRiskLineChartResponseBodyResultObjectSeries();
            return TeaModel.build(map, self);
        }

        public DescribeRiskLineChartResponseBodyResultObjectSeries setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

        public DescribeRiskLineChartResponseBodyResultObjectSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeRiskLineChartResponseBodyResultObjectXaxis extends TeaModel {
        @NameInMap("data")
        public java.util.List<String> data;

        public static DescribeRiskLineChartResponseBodyResultObjectXaxis build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskLineChartResponseBodyResultObjectXaxis self = new DescribeRiskLineChartResponseBodyResultObjectXaxis();
            return TeaModel.build(map, self);
        }

        public DescribeRiskLineChartResponseBodyResultObjectXaxis setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

    public static class DescribeRiskLineChartResponseBodyResultObject extends TeaModel {
        @NameInMap("series")
        public java.util.List<DescribeRiskLineChartResponseBodyResultObjectSeries> series;

        @NameInMap("xaxis")
        public DescribeRiskLineChartResponseBodyResultObjectXaxis xaxis;

        public static DescribeRiskLineChartResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskLineChartResponseBodyResultObject self = new DescribeRiskLineChartResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeRiskLineChartResponseBodyResultObject setSeries(java.util.List<DescribeRiskLineChartResponseBodyResultObjectSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeRiskLineChartResponseBodyResultObjectSeries> getSeries() {
            return this.series;
        }

        public DescribeRiskLineChartResponseBodyResultObject setXaxis(DescribeRiskLineChartResponseBodyResultObjectXaxis xaxis) {
            this.xaxis = xaxis;
            return this;
        }
        public DescribeRiskLineChartResponseBodyResultObjectXaxis getXaxis() {
            return this.xaxis;
        }

    }

}
