// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutConfiglinkchostResponseBody extends TeaModel {
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
    public GetLinkeBahamutConfiglinkchostResponseBodyPager pager;

    public static GetLinkeBahamutConfiglinkchostResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutConfiglinkchostResponseBody self = new GetLinkeBahamutConfiglinkchostResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutConfiglinkchostResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutConfiglinkchostResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutConfiglinkchostResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutConfiglinkchostResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetLinkeBahamutConfiglinkchostResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public GetLinkeBahamutConfiglinkchostResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutConfiglinkchostResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutConfiglinkchostResponseBody setNotSuccess(Boolean notSuccess) {
        this.notSuccess = notSuccess;
        return this;
    }
    public Boolean getNotSuccess() {
        return this.notSuccess;
    }

    public GetLinkeBahamutConfiglinkchostResponseBody setNotValid(Boolean notValid) {
        this.notValid = notValid;
        return this;
    }
    public Boolean getNotValid() {
        return this.notValid;
    }

    public GetLinkeBahamutConfiglinkchostResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutConfiglinkchostResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutConfiglinkchostResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

    public GetLinkeBahamutConfiglinkchostResponseBody setValid(Boolean valid) {
        this.valid = valid;
        return this;
    }
    public Boolean getValid() {
        return this.valid;
    }

    public GetLinkeBahamutConfiglinkchostResponseBody setErrorMessages(java.util.List<String> errorMessages) {
        this.errorMessages = errorMessages;
        return this;
    }
    public java.util.List<String> getErrorMessages() {
        return this.errorMessages;
    }

    public GetLinkeBahamutConfiglinkchostResponseBody setPager(GetLinkeBahamutConfiglinkchostResponseBodyPager pager) {
        this.pager = pager;
        return this;
    }
    public GetLinkeBahamutConfiglinkchostResponseBodyPager getPager() {
        return this.pager;
    }

    public static class GetLinkeBahamutConfiglinkchostResponseBodyPager extends TeaModel {
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

        public static GetLinkeBahamutConfiglinkchostResponseBodyPager build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutConfiglinkchostResponseBodyPager self = new GetLinkeBahamutConfiglinkchostResponseBodyPager();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutConfiglinkchostResponseBodyPager setBegin(Long begin) {
            this.begin = begin;
            return this;
        }
        public Long getBegin() {
            return this.begin;
        }

        public GetLinkeBahamutConfiglinkchostResponseBodyPager setLength(Long length) {
            this.length = length;
            return this;
        }
        public Long getLength() {
            return this.length;
        }

        public GetLinkeBahamutConfiglinkchostResponseBodyPager setNotValid(Boolean notValid) {
            this.notValid = notValid;
            return this;
        }
        public Boolean getNotValid() {
            return this.notValid;
        }

        public GetLinkeBahamutConfiglinkchostResponseBodyPager setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public GetLinkeBahamutConfiglinkchostResponseBodyPager setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public GetLinkeBahamutConfiglinkchostResponseBodyPager setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

        public GetLinkeBahamutConfiglinkchostResponseBodyPager setValid(Boolean valid) {
            this.valid = valid;
            return this;
        }
        public Boolean getValid() {
            return this.valid;
        }

    }

}
