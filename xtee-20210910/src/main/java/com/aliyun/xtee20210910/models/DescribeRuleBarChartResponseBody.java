// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRuleBarChartResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeRuleBarChartResponseBodyResultObject resultObject;

    @NameInMap("success")
    public Boolean success;

    public static DescribeRuleBarChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRuleBarChartResponseBody self = new DescribeRuleBarChartResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRuleBarChartResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRuleBarChartResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeRuleBarChartResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRuleBarChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRuleBarChartResponseBody setResultObject(DescribeRuleBarChartResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeRuleBarChartResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeRuleBarChartResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRuleBarChartResponseBodyResultObjectSeriesData extends TeaModel {
        @NameInMap("eventName")
        public String eventName;

        @NameInMap("num")
        public Long num;

        @NameInMap("ruleName")
        public String ruleName;

        @NameInMap("status")
        public String status;

        public static DescribeRuleBarChartResponseBodyResultObjectSeriesData build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleBarChartResponseBodyResultObjectSeriesData self = new DescribeRuleBarChartResponseBodyResultObjectSeriesData();
            return TeaModel.build(map, self);
        }

        public DescribeRuleBarChartResponseBodyResultObjectSeriesData setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeRuleBarChartResponseBodyResultObjectSeriesData setNum(Long num) {
            this.num = num;
            return this;
        }
        public Long getNum() {
            return this.num;
        }

        public DescribeRuleBarChartResponseBodyResultObjectSeriesData setRuleName(String ruleName) {
            this.ruleName = ruleName;
            return this;
        }
        public String getRuleName() {
            return this.ruleName;
        }

        public DescribeRuleBarChartResponseBodyResultObjectSeriesData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeRuleBarChartResponseBodyResultObjectSeries extends TeaModel {
        @NameInMap("data")
        public java.util.List<DescribeRuleBarChartResponseBodyResultObjectSeriesData> data;

        @NameInMap("type")
        public String type;

        public static DescribeRuleBarChartResponseBodyResultObjectSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleBarChartResponseBodyResultObjectSeries self = new DescribeRuleBarChartResponseBodyResultObjectSeries();
            return TeaModel.build(map, self);
        }

        public DescribeRuleBarChartResponseBodyResultObjectSeries setData(java.util.List<DescribeRuleBarChartResponseBodyResultObjectSeriesData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<DescribeRuleBarChartResponseBodyResultObjectSeriesData> getData() {
            return this.data;
        }

        public DescribeRuleBarChartResponseBodyResultObjectSeries setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeRuleBarChartResponseBodyResultObjectYaxis extends TeaModel {
        @NameInMap("data")
        public java.util.List<String> data;

        public static DescribeRuleBarChartResponseBodyResultObjectYaxis build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleBarChartResponseBodyResultObjectYaxis self = new DescribeRuleBarChartResponseBodyResultObjectYaxis();
            return TeaModel.build(map, self);
        }

        public DescribeRuleBarChartResponseBodyResultObjectYaxis setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

    public static class DescribeRuleBarChartResponseBodyResultObject extends TeaModel {
        @NameInMap("series")
        public java.util.List<DescribeRuleBarChartResponseBodyResultObjectSeries> series;

        @NameInMap("yaxis")
        public DescribeRuleBarChartResponseBodyResultObjectYaxis yaxis;

        public static DescribeRuleBarChartResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeRuleBarChartResponseBodyResultObject self = new DescribeRuleBarChartResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeRuleBarChartResponseBodyResultObject setSeries(java.util.List<DescribeRuleBarChartResponseBodyResultObjectSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeRuleBarChartResponseBodyResultObjectSeries> getSeries() {
            return this.series;
        }

        public DescribeRuleBarChartResponseBodyResultObject setYaxis(DescribeRuleBarChartResponseBodyResultObjectYaxis yaxis) {
            this.yaxis = yaxis;
            return this;
        }
        public DescribeRuleBarChartResponseBodyResultObjectYaxis getYaxis() {
            return this.yaxis;
        }

    }

}
