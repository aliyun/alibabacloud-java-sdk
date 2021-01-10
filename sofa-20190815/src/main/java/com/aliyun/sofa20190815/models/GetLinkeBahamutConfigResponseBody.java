// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutConfigResponseBody extends TeaModel {
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
    public GetLinkeBahamutConfigResponseBodyPager pager;

    public static GetLinkeBahamutConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutConfigResponseBody self = new GetLinkeBahamutConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutConfigResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutConfigResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutConfigResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetLinkeBahamutConfigResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetLinkeBahamutConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutConfigResponseBody setNotSuccess(Boolean notSuccess) {
        this.notSuccess = notSuccess;
        return this;
    }
    public Boolean getNotSuccess() {
        return this.notSuccess;
    }

    public GetLinkeBahamutConfigResponseBody setNotValid(Boolean notValid) {
        this.notValid = notValid;
        return this;
    }
    public Boolean getNotValid() {
        return this.notValid;
    }

    public GetLinkeBahamutConfigResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutConfigResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetLinkeBahamutConfigResponseBody setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }
    public Boolean getValid() {
        return this.valid;
    }

    public GetLinkeBahamutConfigResponseBody setErrorMessages(java.util.List<String> errorMessages) {
        this.errorMessages = errorMessages;
        return this;
    }
    public java.util.List<String> getErrorMessages() {
        return this.errorMessages;
    }

    public GetLinkeBahamutConfigResponseBody setPager(GetLinkeBahamutConfigResponseBodyPager pager) {
        this.pager = pager;
        return this;
    }
    public GetLinkeBahamutConfigResponseBodyPager getPager() {
        return this.pager;
    }

    public static class GetLinkeBahamutConfigResponseBodyPager extends TeaModel {
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

        public static GetLinkeBahamutConfigResponseBodyPager build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutConfigResponseBodyPager self = new GetLinkeBahamutConfigResponseBodyPager();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutConfigResponseBodyPager setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetLinkeBahamutConfigResponseBodyPager setLength(Long length) {
            this.length = length;
            return this;
        }
        public Long getLength() {
            return this.length;
        }

        public GetLinkeBahamutConfigResponseBodyPager setNotValid(Boolean notValid) {
            this.notValid = notValid;
            return this;
        }
        public Boolean getNotValid() {
            return this.notValid;
        }

        public GetLinkeBahamutConfigResponseBodyPager setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public GetLinkeBahamutConfigResponseBodyPager setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public GetLinkeBahamutConfigResponseBodyPager setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetLinkeBahamutConfigResponseBodyPager setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

    }

}
