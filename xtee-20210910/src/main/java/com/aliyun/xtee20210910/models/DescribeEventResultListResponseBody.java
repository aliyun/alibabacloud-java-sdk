// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class DescribeEventResultListResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("currentPage")
    public Long currentPage;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("pageSize")
    public Long pageSize;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public java.util.List<DescribeEventResultListResponseBodyResultObject> resultObject;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("totalItem")
    public Long totalItem;

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
        @NameInMap("eventCode")
        public String eventCode;

        @NameInMap("eventName")
        public String eventName;

        @NameInMap("passNum")
        public Long passNum;

        @NameInMap("pendingNum")
        public Long pendingNum;

        @NameInMap("rejectNum")
        public Long rejectNum;

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
