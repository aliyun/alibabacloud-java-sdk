// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTagsBarChartResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
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
     * <p>Error message.</p>
     * 
     * <strong>example:</strong>
     * <p>The input parameter data is not valid. order_storage_company_num component not found</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>Request ID</p>
     * 
     * <strong>example:</strong>
     * <p>AE7E6105-7DEB-5125-9B24-DCBC139F6CD2</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Return object</p>
     */
    @NameInMap("resultObject")
    public DescribeTagsBarChartResponseBodyResultObject resultObject;

    /**
     * <p>Whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>Number.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("num")
        public Long num;

        /**
         * <p>Scale</p>
         * 
         * <strong>example:</strong>
         * <p>10%</p>
         */
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
        /**
         * <p>Chart data list</p>
         */
        @NameInMap("data")
        public java.util.List<DescribeTagsBarChartResponseBodyResultObjectSeriesData> data;

        /**
         * <p>Series name.</p>
         * 
         * <strong>example:</strong>
         * <p>tag</p>
         */
        @NameInMap("name")
        public String name;

        /**
         * <p>Chart field, same as name</p>
         * 
         * <strong>example:</strong>
         * <p>tag</p>
         */
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
        /**
         * <p>xaxis data items</p>
         */
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
        /**
         * <p>Data list</p>
         */
        @NameInMap("series")
        public java.util.List<DescribeTagsBarChartResponseBodyResultObjectSeries> series;

        /**
         * <p>xaxis interface configuration.</p>
         */
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
