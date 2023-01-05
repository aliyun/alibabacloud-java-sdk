// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListOutboundCallNumbersResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("OutboundCallNumbers")
    public ListOutboundCallNumbersResponseBodyOutboundCallNumbers outboundCallNumbers;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListOutboundCallNumbersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListOutboundCallNumbersResponseBody self = new ListOutboundCallNumbersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListOutboundCallNumbersResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListOutboundCallNumbersResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListOutboundCallNumbersResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListOutboundCallNumbersResponseBody setOutboundCallNumbers(ListOutboundCallNumbersResponseBodyOutboundCallNumbers outboundCallNumbers) {
        this.outboundCallNumbers = outboundCallNumbers;
        return this;
    }
    public ListOutboundCallNumbersResponseBodyOutboundCallNumbers getOutboundCallNumbers() {
        return this.outboundCallNumbers;
    }

    public ListOutboundCallNumbersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListOutboundCallNumbersResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListOutboundCallNumbersResponseBodyOutboundCallNumbersList extends TeaModel {
        @NameInMap("Number")
        public String number;

        @NameInMap("OutboundCallNumberId")
        public String outboundCallNumberId;

        @NameInMap("RateLimitCount")
        public String rateLimitCount;

        @NameInMap("RateLimitPeriod")
        public String rateLimitPeriod;

        public static ListOutboundCallNumbersResponseBodyOutboundCallNumbersList build(java.util.Map<String, ?> map) throws Exception {
            ListOutboundCallNumbersResponseBodyOutboundCallNumbersList self = new ListOutboundCallNumbersResponseBodyOutboundCallNumbersList();
            return TeaModel.build(map, self);
        }

        public ListOutboundCallNumbersResponseBodyOutboundCallNumbersList setNumber(String number) {
            this.number = number;
            return this;
        }
        public String getNumber() {
            return this.number;
        }

        public ListOutboundCallNumbersResponseBodyOutboundCallNumbersList setOutboundCallNumberId(String outboundCallNumberId) {
            this.outboundCallNumberId = outboundCallNumberId;
            return this;
        }
        public String getOutboundCallNumberId() {
            return this.outboundCallNumberId;
        }

        public ListOutboundCallNumbersResponseBodyOutboundCallNumbersList setRateLimitCount(String rateLimitCount) {
            this.rateLimitCount = rateLimitCount;
            return this;
        }
        public String getRateLimitCount() {
            return this.rateLimitCount;
        }

        public ListOutboundCallNumbersResponseBodyOutboundCallNumbersList setRateLimitPeriod(String rateLimitPeriod) {
            this.rateLimitPeriod = rateLimitPeriod;
            return this;
        }
        public String getRateLimitPeriod() {
            return this.rateLimitPeriod;
        }

    }

    public static class ListOutboundCallNumbersResponseBodyOutboundCallNumbers extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListOutboundCallNumbersResponseBodyOutboundCallNumbersList> list;

        @NameInMap("PageNumber")
        public Integer pageNumber;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListOutboundCallNumbersResponseBodyOutboundCallNumbers build(java.util.Map<String, ?> map) throws Exception {
            ListOutboundCallNumbersResponseBodyOutboundCallNumbers self = new ListOutboundCallNumbersResponseBodyOutboundCallNumbers();
            return TeaModel.build(map, self);
        }

        public ListOutboundCallNumbersResponseBodyOutboundCallNumbers setList(java.util.List<ListOutboundCallNumbersResponseBodyOutboundCallNumbersList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListOutboundCallNumbersResponseBodyOutboundCallNumbersList> getList() {
            return this.list;
        }

        public ListOutboundCallNumbersResponseBodyOutboundCallNumbers setPageNumber(Integer pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Integer getPageNumber() {
            return this.pageNumber;
        }

        public ListOutboundCallNumbersResponseBodyOutboundCallNumbers setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListOutboundCallNumbersResponseBodyOutboundCallNumbers setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
