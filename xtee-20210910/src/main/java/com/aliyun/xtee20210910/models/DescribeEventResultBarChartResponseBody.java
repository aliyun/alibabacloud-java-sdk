// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventResultBarChartResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The input parameter data is not valid. order_storage_company_num component not found</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The response object.</p>
     */
    @NameInMap("resultObject")
    public DescribeEventResultBarChartResponseBodyResultObject resultObject;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("num")
        public Long num;

        /**
         * <p>The proportion.</p>
         * 
         * <strong>example:</strong>
         * <p>50.00%</p>
         */
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
        /**
         * <p>The response data.</p>
         */
        @NameInMap("data")
        public java.util.List<DescribeEventResultBarChartResponseBodyResultObjectSeriesData> data;

        /**
         * <p>The name of the series.</p>
         * 
         * <strong>example:</strong>
         * <p>通过</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>The tag key.</p>
         * 
         * <strong>example:</strong>
         * <p>通过</p>
         */
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
        /**
         * <p>The response data.</p>
         */
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
        /**
         * <p>The chart data.</p>
         */
        @NameInMap("series")
        public java.util.List<DescribeEventResultBarChartResponseBodyResultObjectSeries> series;

        /**
         * <p>The xaxis configuration.</p>
         */
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
