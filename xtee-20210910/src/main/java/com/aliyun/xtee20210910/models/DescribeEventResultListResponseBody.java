// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventResultListResponseBody extends TeaModel {
    /**
     * <p>Status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>Current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("currentPage")
    public Long currentPage;

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
     * <p>Page size, default value is 10</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

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
    public java.util.List<DescribeEventResultListResponseBodyResultObject> resultObject;

    /**
     * <p>Whether the query was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    /**
     * <p>Total number of items.</p>
     * 
     * <strong>example:</strong>
     * <p>31</p>
     */
    @NameInMap("totalItem")
    public Long totalItem;

    /**
     * <p>Total number of pages</p>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("totalPage")
    public Long totalPage;

    public static DescribeEventResultListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeEventResultListResponseBody self = new DescribeEventResultListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeEventResultListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeEventResultListResponseBody setCurrentPage(Long currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Long getCurrentPage() {
        return this.currentPage;
    }

    public DescribeEventResultListResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DescribeEventResultListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeEventResultListResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeEventResultListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeEventResultListResponseBody setResultObject(java.util.List<DescribeEventResultListResponseBodyResultObject> resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public java.util.List<DescribeEventResultListResponseBodyResultObject> getResultObject() {
        return this.resultObject;
    }

    public DescribeEventResultListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public DescribeEventResultListResponseBody setTotalItem(Long totalItem) {
        this.totalItem = totalItem;
        return this;
    }
    public Long getTotalItem() {
        return this.totalItem;
    }

    public DescribeEventResultListResponseBody setTotalPage(Long totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Long getTotalPage() {
        return this.totalPage;
    }

    public static class DescribeEventResultListResponseBodyResultObject extends TeaModel {
        /**
         * <p>Event code</p>
         * 
         * <strong>example:</strong>
         * <p>de_aszbjb7236</p>
         */
        @NameInMap("eventCode")
        public String eventCode;

        /**
         * <p>Event name.</p>
         * 
         * <strong>example:</strong>
         * <p>注册风险</p>
         */
        @NameInMap("eventName")
        public String eventName;

        /**
         * <p>Number of passed checks.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("passNum")
        public Long passNum;

        /**
         * <p>Number of pending items.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("pendingNum")
        public Long pendingNum;

        /**
         * <p>Number of rejected approvals.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("rejectNum")
        public Long rejectNum;

        /**
         * <p>Total number of items.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("totalNum")
        public Long totalNum;

        public static DescribeEventResultListResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            DescribeEventResultListResponseBodyResultObject self = new DescribeEventResultListResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public DescribeEventResultListResponseBodyResultObject setEventCode(String eventCode) {
            this.eventCode = eventCode;
            return this;
        }
        public String getEventCode() {
            return this.eventCode;
        }

        public DescribeEventResultListResponseBodyResultObject setEventName(String eventName) {
            this.eventName = eventName;
            return this;
        }
        public String getEventName() {
            return this.eventName;
        }

        public DescribeEventResultListResponseBodyResultObject setPassNum(Long passNum) {
            this.passNum = passNum;
            return this;
        }
        public Long getPassNum() {
            return this.passNum;
        }

        public DescribeEventResultListResponseBodyResultObject setPendingNum(Long pendingNum) {
            this.pendingNum = pendingNum;
            return this;
        }
        public Long getPendingNum() {
            return this.pendingNum;
        }

        public DescribeEventResultListResponseBodyResultObject setRejectNum(Long rejectNum) {
            this.rejectNum = rejectNum;
            return this;
        }
        public Long getRejectNum() {
            return this.rejectNum;
        }

        public DescribeEventResultListResponseBodyResultObject setTotalNum(Long totalNum) {
            this.totalNum = totalNum;
            return this;
        }
        public Long getTotalNum() {
            return this.totalNum;
        }

    }

}
