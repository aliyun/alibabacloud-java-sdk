// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAuthurlResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public String data;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("NotSuccess")
    public Boolean notSuccess;

    @NameInMap("NotValid")
    public Boolean notValid;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Total")
    public Long total;

    @NameInMap("Valid")
    public Boolean valid;

    @NameInMap("ErrorMessages")
    public java.util.List<String> errorMessages;

    @NameInMap("Pager")
    public GetLinkeBahamutAuthurlResponseBodyPager pager;

    public static GetLinkeBahamutAuthurlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAuthurlResponseBody self = new GetLinkeBahamutAuthurlResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAuthurlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutAuthurlResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutAuthurlResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutAuthurlResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetLinkeBahamutAuthurlResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetLinkeBahamutAuthurlResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutAuthurlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutAuthurlResponseBody setNotSuccess(Boolean notSuccess) {
        this.notSuccess = notSuccess;
        return this;
    }
    public Boolean getNotSuccess() {
        return this.notSuccess;
    }

    public GetLinkeBahamutAuthurlResponseBody setNotValid(Boolean notValid) {
        this.notValid = notValid;
        return this;
    }
    public Boolean getNotValid() {
        return this.notValid;
    }

    public GetLinkeBahamutAuthurlResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutAuthurlResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutAuthurlResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetLinkeBahamutAuthurlResponseBody setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }
    public Boolean getValid() {
        return this.valid;
    }

    public GetLinkeBahamutAuthurlResponseBody setErrorMessages(java.util.List<String> errorMessages) {
        this.errorMessages = errorMessages;
        return this;
    }
    public java.util.List<String> getErrorMessages() {
        return this.errorMessages;
    }

    public GetLinkeBahamutAuthurlResponseBody setPager(GetLinkeBahamutAuthurlResponseBodyPager pager) {
        this.pager = pager;
        return this;
    }
    public GetLinkeBahamutAuthurlResponseBodyPager getPager() {
        return this.pager;
    }

    public static class GetLinkeBahamutAuthurlResponseBodyPager extends TeaModel {
        @NameInMap("Begin")
        public Long begin;

        @NameInMap("Length")
        public Long length;

        @NameInMap("NotValid")
        public Boolean notValid;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("TotalCount")
        public Long totalCount;

        @NameInMap("Valid")
        public Boolean valid;

        public static GetLinkeBahamutAuthurlResponseBodyPager build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutAuthurlResponseBodyPager self = new GetLinkeBahamutAuthurlResponseBodyPager();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutAuthurlResponseBodyPager setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetLinkeBahamutAuthurlResponseBodyPager setLength(Long length) {
            this.length = length;
            return this;
        }
        public Long getLength() {
            return this.length;
        }

        public GetLinkeBahamutAuthurlResponseBodyPager setNotValid(Boolean notValid) {
            this.notValid = notValid;
            return this;
        }
        public Boolean getNotValid() {
            return this.notValid;
        }

        public GetLinkeBahamutAuthurlResponseBodyPager setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public GetLinkeBahamutAuthurlResponseBodyPager setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public GetLinkeBahamutAuthurlResponseBodyPager setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetLinkeBahamutAuthurlResponseBodyPager setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

    }

}
