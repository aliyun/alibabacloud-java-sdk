// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutBatchnextstageResponseBody extends TeaModel {
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
    public QueryLinkeBahamutBatchnextstageResponseBodyResult result;

    public static QueryLinkeBahamutBatchnextstageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutBatchnextstageResponseBody self = new QueryLinkeBahamutBatchnextstageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutBatchnextstageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutBatchnextstageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutBatchnextstageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutBatchnextstageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutBatchnextstageResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutBatchnextstageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutBatchnextstageResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutBatchnextstageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutBatchnextstageResponseBody setResult(QueryLinkeBahamutBatchnextstageResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeBahamutBatchnextstageResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutBatchnextstageResponseBodyResult extends TeaModel {
        @NameInMap("IsAllSuccess")
        public Boolean isAllSuccess;

        @NameInMap("IsSuccess")
        public String isSuccess;

        @NameInMap("ShowInfo")
        public String showInfo;

        public static QueryLinkeBahamutBatchnextstageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutBatchnextstageResponseBodyResult self = new QueryLinkeBahamutBatchnextstageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutBatchnextstageResponseBodyResult setIsAllSuccess(Boolean isAllSuccess) {
            this.isAllSuccess = isAllSuccess;
            return this;
        }
        public Boolean getIsAllSuccess() {
            return this.isAllSuccess;
        }

        public QueryLinkeBahamutBatchnextstageResponseBodyResult setIsSuccess(String isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public String getIsSuccess() {
            return this.isSuccess;
        }

        public QueryLinkeBahamutBatchnextstageResponseBodyResult setShowInfo(String showInfo) {
            this.showInfo = showInfo;
            return this;
        }
        public String getShowInfo() {
            return this.showInfo;
        }

    }

}
