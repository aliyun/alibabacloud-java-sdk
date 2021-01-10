// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutGetiterationmrpipelinegroupsResponseBody extends TeaModel {
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

    @NameInMap("Result")
    public String result;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("Paginator")
    public GetLinkeBahamutGetiterationmrpipelinegroupsResponseBodyPaginator paginator;

    public static GetLinkeBahamutGetiterationmrpipelinegroupsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutGetiterationmrpipelinegroupsResponseBody self = new GetLinkeBahamutGetiterationmrpipelinegroupsResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutGetiterationmrpipelinegroupsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutGetiterationmrpipelinegroupsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutGetiterationmrpipelinegroupsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutGetiterationmrpipelinegroupsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutGetiterationmrpipelinegroupsResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutGetiterationmrpipelinegroupsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutGetiterationmrpipelinegroupsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutGetiterationmrpipelinegroupsResponseBody setResult(String result) {
        this.result = result;
        return this;
    }
    public String getResult() {
        return this.result;
    }

    public GetLinkeBahamutGetiterationmrpipelinegroupsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutGetiterationmrpipelinegroupsResponseBody setPaginator(GetLinkeBahamutGetiterationmrpipelinegroupsResponseBodyPaginator paginator) {
        this.paginator = paginator;
        return this;
    }
    public GetLinkeBahamutGetiterationmrpipelinegroupsResponseBodyPaginator getPaginator() {
        return this.paginator;
    }

    public static class GetLinkeBahamutGetiterationmrpipelinegroupsResponseBodyPaginator extends TeaModel {
        @NameInMap("ItemCount")
        public Long itemCount;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Long pageSize;

        public static GetLinkeBahamutGetiterationmrpipelinegroupsResponseBodyPaginator build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutGetiterationmrpipelinegroupsResponseBodyPaginator self = new GetLinkeBahamutGetiterationmrpipelinegroupsResponseBodyPaginator();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutGetiterationmrpipelinegroupsResponseBodyPaginator setItemCount(Long itemCount) {
            this.itemCount = itemCount;
            return this;
        }
        public Long getItemCount() {
            return this.itemCount;
        }

        public GetLinkeBahamutGetiterationmrpipelinegroupsResponseBodyPaginator setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public GetLinkeBahamutGetiterationmrpipelinegroupsResponseBodyPaginator setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public GetLinkeBahamutGetiterationmrpipelinegroupsResponseBodyPaginator setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
