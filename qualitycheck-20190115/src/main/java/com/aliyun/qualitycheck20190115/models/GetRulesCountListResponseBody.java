// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRulesCountListResponseBody extends TeaModel {
    @NameInMap("BusinessType")
    public Integer businessType;

    @NameInMap("Code")
    public String code;

    @NameInMap("Count")
    public Integer count;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("Data")
    public GetRulesCountListResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Messages")
    public GetRulesCountListResponseBodyMessages messages;

    @NameInMap("PageNumber")
    public Integer pageNumber;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Integer totalCount;

    public static GetRulesCountListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetRulesCountListResponseBody self = new GetRulesCountListResponseBody();
        return TeaModel.build(map, self);
    }

    public GetRulesCountListResponseBody setBusinessType(Integer businessType) {
        this.businessType = businessType;
        return this;
    }
    public Integer getBusinessType() {
        return this.businessType;
    }

    public GetRulesCountListResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetRulesCountListResponseBody setCount(Integer count) {
        this.count = count;
        return this;
    }
    public Integer getCount() {
        return this.count;
    }

    public GetRulesCountListResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public GetRulesCountListResponseBody setData(GetRulesCountListResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetRulesCountListResponseBodyData getData() {
        return this.data;
    }

    public GetRulesCountListResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetRulesCountListResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetRulesCountListResponseBody setMessages(GetRulesCountListResponseBodyMessages messages) {
        this.messages = messages;
        return this;
    }
    public GetRulesCountListResponseBodyMessages getMessages() {
        return this.messages;
    }

    public GetRulesCountListResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public GetRulesCountListResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public GetRulesCountListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetRulesCountListResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetRulesCountListResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class GetRulesCountListResponseBodyData extends TeaModel {
        @NameInMap("Data")
        public java.util.List<String> data;

        public static GetRulesCountListResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetRulesCountListResponseBodyData self = new GetRulesCountListResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetRulesCountListResponseBodyData setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

    public static class GetRulesCountListResponseBodyMessages extends TeaModel {
        @NameInMap("Message")
        public java.util.List<String> message;

        public static GetRulesCountListResponseBodyMessages build(java.util.Map<String, ?> map) throws Exception {
            GetRulesCountListResponseBodyMessages self = new GetRulesCountListResponseBodyMessages();
            return TeaModel.build(map, self);
        }

        public GetRulesCountListResponseBodyMessages setMessage(java.util.List<String> message) {
            this.message = message;
            return this;
        }
        public java.util.List<String> getMessage() {
            return this.message;
        }

    }

}
