// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeDecisionResultTrendResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <p>Error details</p>
     * 
     * <strong>example:</strong>
     * <p>The input parameter data is not valid. order_storage_company_num component not found</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public DescribeDecisionResultTrendResponseBodyResultObject resultObject;

    /**
     * <p>Whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Number</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("num")
        public Long num;

        /**
         * <p>ratio</p>
         * 
         * <strong>example:</strong>
         * <p>5.56%</p>
         */
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
        /**
         * <p>Returned data object</p>
         */
        @NameInMap("data")
        public java.util.List<DescribeDecisionResultTrendResponseBodyResultObjectSeriesData> data;

        /**
         * <p>Name.</p>
         * 
         * <strong>example:</strong>
         * <p>IpTag_FFF</p>
         */
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
        /**
         * <p>X-axis data structure.</p>
         */
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
        /**
         * <p>Chart data</p>
         */
        @NameInMap("series")
        public java.util.List<DescribeDecisionResultTrendResponseBodyResultObjectSeries> series;

        /**
         * <p>X-axis data</p>
         */
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
