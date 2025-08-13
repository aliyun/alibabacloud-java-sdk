// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeTagsTrendResponseBody extends TeaModel {
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
     * <p>Returned object</p>
     */
    @NameInMap("resultObject")
    public DescribeTagsTrendResponseBodyResultObject resultObject;

    /**
     * <p>Whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The number of items in this category.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("num")
        public Long num;

        /**
         * <p>Proportion</p>
         * 
         * <strong>example:</strong>
         * <p>10%</p>
         */
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
        /**
         * <p>Chart data list</p>
         */
        @NameInMap("data")
        public java.util.List<DescribeTagsTrendResponseBodyResultObjectSeriesData> data;

        /**
         * <p>Category name.</p>
         * 
         * <strong>example:</strong>
         * <p>rm0102</p>
         */
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
        /**
         * <p>X-axis data</p>
         */
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
        /**
         * <p>Data list</p>
         */
        @NameInMap("series")
        public java.util.List<DescribeTagsTrendResponseBodyResultObjectSeries> series;

        /**
         * <p>xaxis returned data</p>
         */
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
