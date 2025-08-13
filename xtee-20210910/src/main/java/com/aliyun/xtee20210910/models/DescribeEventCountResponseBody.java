// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventCountResponseBody extends TeaModel {
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
    public DescribeEventCountResponseBodyResultObject resultObject;

    /**
     * <p>Whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static DescribeEventCountResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventCountResponseBody self = new DescribeEventCountResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventCountResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEventCountResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeEventCountResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEventCountResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventCountResponseBody setResultObject(DescribeEventCountResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public DescribeEventCountResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public DescribeEventCountResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DescribeEventCountResponseBodyResultObject extends TeaModel {
        /**
         * <p>Whether it exceeds the maximum number</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("limit")
        public Boolean limit;

        /**
         * <p>Maximum creation count</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("maxTotalItem")
        public Integer maxTotalItem;

        /**
         * <p>Total count</p>
         * 
         * <strong>example:</strong>
         * <p>101</p>
         */
        @NameInMap("totalItem")
        public Integer totalItem;

        public static DescribeEventCountResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventCountResponseBodyResultObject self = new DescribeEventCountResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeEventCountResponseBodyResultObject setLimit(Boolean limit) {
            this.limit = limit;
            return this;
        }
        public Boolean getLimit() {
            return this.limit;
        }

        public DescribeEventCountResponseBodyResultObject setMaxTotalItem(Integer maxTotalItem) {
            this.maxTotalItem = maxTotalItem;
            return this;
        }
        public Integer getMaxTotalItem() {
            return this.maxTotalItem;
        }

        public DescribeEventCountResponseBodyResultObject setTotalItem(Integer totalItem) {
            this.totalItem = totalItem;
            return this;
        }
        public Integer getTotalItem() {
            return this.totalItem;
        }

    }

}
