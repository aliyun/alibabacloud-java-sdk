// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeRiskTagsLineChartResponseBody extends TeaModel {
    /**
     * <p>Status code. Note: 200 indicates success.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>A32FE941-35F2-5378-B37C-4B8FDB16F094</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result information</p>
     */
    @NameInMap("ResultObject")
    public DescribeRiskTagsLineChartResponseBodyResultObject resultObject;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static DescribeRiskTagsLineChartResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeRiskTagsLineChartResponseBody self = new DescribeRiskTagsLineChartResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeRiskTagsLineChartResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeRiskTagsLineChartResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeRiskTagsLineChartResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeRiskTagsLineChartResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeRiskTagsLineChartResponseBody setResultObject(DescribeRiskTagsLineChartResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeRiskTagsLineChartResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeRiskTagsLineChartResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeRiskTagsLineChartResponseBodyResultObjectSeries extends TeaModel {
        /**
         * <p>Data</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Data")
        public Float data;

        /**
         * <p>Name</p>
         * 
         * <strong>example:</strong>
         * <p>rm0102</p>
         */
        @NameInMap("Name")
        public String name;

        public static DescribeRiskTagsLineChartResponseBodyResultObjectSeries build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskTagsLineChartResponseBodyResultObjectSeries self = new DescribeRiskTagsLineChartResponseBodyResultObjectSeries();
            return TeaModel.build(map, self);
        }

        public DescribeRiskTagsLineChartResponseBodyResultObjectSeries setData(Float data) {
            this.data = data;
            return this;
        }
        public Float getData() {
            return this.data;
        }

        public DescribeRiskTagsLineChartResponseBodyResultObjectSeries setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class DescribeRiskTagsLineChartResponseBodyResultObjectXaxis extends TeaModel {
        /**
         * <p>Data returned by the chart</p>
         */
        @NameInMap("Data")
        public java.util.List<String> data;

        public static DescribeRiskTagsLineChartResponseBodyResultObjectXaxis build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskTagsLineChartResponseBodyResultObjectXaxis self = new DescribeRiskTagsLineChartResponseBodyResultObjectXaxis();
            return TeaModel.build(map, self);
        }

        public DescribeRiskTagsLineChartResponseBodyResultObjectXaxis setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

    public static class DescribeRiskTagsLineChartResponseBodyResultObject extends TeaModel {
        /**
         * <p>Call percentage, represented as a decimal</p>
         */
        @NameInMap("Percent")
        public java.util.List<Float> percent;

        /**
         * <p>Chart data</p>
         */
        @NameInMap("Series")
        public java.util.List<DescribeRiskTagsLineChartResponseBodyResultObjectSeries> series;

        /**
         * <p>Total number of records.</p>
         */
        @NameInMap("Total")
        public java.util.List<Long> total;

        /**
         * <p>X-axis data of the chart</p>
         */
        @NameInMap("Xaxis")
        public DescribeRiskTagsLineChartResponseBodyResultObjectXaxis xaxis;

        public static DescribeRiskTagsLineChartResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeRiskTagsLineChartResponseBodyResultObject self = new DescribeRiskTagsLineChartResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeRiskTagsLineChartResponseBodyResultObject setPercent(java.util.List<Float> percent) {
            this.percent = percent;
            return this;
        }
        public java.util.List<Float> getPercent() {
            return this.percent;
        }

        public DescribeRiskTagsLineChartResponseBodyResultObject setSeries(java.util.List<DescribeRiskTagsLineChartResponseBodyResultObjectSeries> series) {
            this.series = series;
            return this;
        }
        public java.util.List<DescribeRiskTagsLineChartResponseBodyResultObjectSeries> getSeries() {
            return this.series;
        }

        public DescribeRiskTagsLineChartResponseBodyResultObject setTotal(java.util.List<Long> total) {
            this.total = total;
            return this;
        }
        public java.util.List<Long> getTotal() {
            return this.total;
        }

        public DescribeRiskTagsLineChartResponseBodyResultObject setXaxis(DescribeRiskTagsLineChartResponseBodyResultObjectXaxis xaxis) {
            this.xaxis = xaxis;
            return this;
        }
        public DescribeRiskTagsLineChartResponseBodyResultObjectXaxis getXaxis() {
            return this.xaxis;
        }

    }

}
