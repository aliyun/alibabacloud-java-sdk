// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventCountResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public DescribeEventCountResponseBodyResultObject resultObject;

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
        @NameInMap("limit")
        public Boolean limit;

        @NameInMap("maxTotalItem")
        public Integer maxTotalItem;

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
