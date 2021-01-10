// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAdminpipelineResponseBody extends TeaModel {
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
    public ListLinkeBahamutAdminpipelineResponseBodyResult result;

    public static ListLinkeBahamutAdminpipelineResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAdminpipelineResponseBody self = new ListLinkeBahamutAdminpipelineResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAdminpipelineResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLinkeBahamutAdminpipelineResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public ListLinkeBahamutAdminpipelineResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public ListLinkeBahamutAdminpipelineResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLinkeBahamutAdminpipelineResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public ListLinkeBahamutAdminpipelineResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListLinkeBahamutAdminpipelineResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public ListLinkeBahamutAdminpipelineResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLinkeBahamutAdminpipelineResponseBody setResult(ListLinkeBahamutAdminpipelineResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public ListLinkeBahamutAdminpipelineResponseBodyResult getResult() {
        return this.result;
    }

    public static class ListLinkeBahamutAdminpipelineResponseBodyResult extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Page")
        public Long page;

        @NameInMap("PageCount")
        public Long pageCount;

        @NameInMap("PageSize")
        public Long pageSize;

        @NameInMap("Data")
        public java.util.List<String> data;

        public static ListLinkeBahamutAdminpipelineResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            ListLinkeBahamutAdminpipelineResponseBodyResult self = new ListLinkeBahamutAdminpipelineResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public ListLinkeBahamutAdminpipelineResponseBodyResult setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public ListLinkeBahamutAdminpipelineResponseBodyResult setPage(Long page) {
            this.page = page;
            return this;
        }
        public Long getPage() {
            return this.page;
        }

        public ListLinkeBahamutAdminpipelineResponseBodyResult setPageCount(Long pageCount) {
            this.pageCount = pageCount;
            return this;
        }
        public Long getPageCount() {
            return this.pageCount;
        }

        public ListLinkeBahamutAdminpipelineResponseBodyResult setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListLinkeBahamutAdminpipelineResponseBodyResult setData(java.util.List<String> data) {
            this.data = data;
            return this;
        }
        public java.util.List<String> getData() {
            return this.data;
        }

    }

}
