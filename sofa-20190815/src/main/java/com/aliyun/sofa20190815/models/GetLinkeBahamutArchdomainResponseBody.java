// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutArchdomainResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorMsgParamsMap")
    public String errorMsgParamsMap;

    @NameInMap("Message")
    public String message;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Result")
    public java.util.List<GetLinkeBahamutArchdomainResponseBodyResult> result;

    @NameInMap("Paginator")
    public GetLinkeBahamutArchdomainResponseBodyPaginator paginator;

    public static GetLinkeBahamutArchdomainResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutArchdomainResponseBody self = new GetLinkeBahamutArchdomainResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutArchdomainResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutArchdomainResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutArchdomainResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutArchdomainResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutArchdomainResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutArchdomainResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutArchdomainResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutArchdomainResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutArchdomainResponseBody setResult(java.util.List<GetLinkeBahamutArchdomainResponseBodyResult> result) {
        this.result = result;
        return this;
    }
    public java.util.List<GetLinkeBahamutArchdomainResponseBodyResult> getResult() {
        return this.result;
    }

    public GetLinkeBahamutArchdomainResponseBody setPaginator(GetLinkeBahamutArchdomainResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public GetLinkeBahamutArchdomainResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public static class GetLinkeBahamutArchdomainResponseBodyResult extends TeaModel {
        @NameInMap("AppNum")
        public String appNum;

        @NameInMap("Description")
        public String description;

        @NameInMap("ExternalId")
        public String externalId;

        @NameInMap("IterationNum")
        public String iterationNum;

        @NameInMap("Name")
        public String name;

        public static GetLinkeBahamutArchdomainResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutArchdomainResponseBodyResult self = new GetLinkeBahamutArchdomainResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutArchdomainResponseBodyResult setAppNum(String appNum) {
            this.appNum = appNum;
            return this;
        }
        public String getAppNum() {
            return this.appNum;
        }

        public GetLinkeBahamutArchdomainResponseBodyResult setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetLinkeBahamutArchdomainResponseBodyResult setExternalId(String externalId) {
            this.externalId = externalId;
            return this;
        }
        public String getExternalId() {
            return this.externalId;
        }

        public GetLinkeBahamutArchdomainResponseBodyResult setIterationNum(String iterationNum) {
            this.iterationNum = iterationNum;
            return this;
        }
        public String getIterationNum() {
            return this.iterationNum;
        }

        public GetLinkeBahamutArchdomainResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetLinkeBahamutArchdomainResponseBodyPaginator extends TeaModel {
        @NameInMap("ItemCount")
        public Long itemCount;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Long pageSize;

        public static GetLinkeBahamutArchdomainResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutArchdomainResponseBodyPaginator self = new GetLinkeBahamutArchdomainResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutArchdomainResponseBodyPaginator setItemCount(Long itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Long getItemCount() {
            return this.itemCount;
        }

        public GetLinkeBahamutArchdomainResponseBodyPaginator setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public GetLinkeBahamutArchdomainResponseBodyPaginator setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public GetLinkeBahamutArchdomainResponseBodyPaginator setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
