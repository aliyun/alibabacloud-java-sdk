// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutIterationunitbatchnextstageResponseBody extends TeaModel {
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
    public QueryLinkeBahamutIterationunitbatchnextstageResponseBodyResult result;

    public static QueryLinkeBahamutIterationunitbatchnextstageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutIterationunitbatchnextstageResponseBody self = new QueryLinkeBahamutIterationunitbatchnextstageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutIterationunitbatchnextstageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutIterationunitbatchnextstageResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutIterationunitbatchnextstageResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutIterationunitbatchnextstageResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutIterationunitbatchnextstageResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutIterationunitbatchnextstageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutIterationunitbatchnextstageResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutIterationunitbatchnextstageResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutIterationunitbatchnextstageResponseBody setResult(QueryLinkeBahamutIterationunitbatchnextstageResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeBahamutIterationunitbatchnextstageResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutIterationunitbatchnextstageResponseBodyResult extends TeaModel {
        @NameInMap("IsAllSuccess")
        public Boolean isAllSuccess;

        @NameInMap("IsSuccess")
        public String isSuccess;

        @NameInMap("ShowInfo")
        public String showInfo;

        public static QueryLinkeBahamutIterationunitbatchnextstageResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutIterationunitbatchnextstageResponseBodyResult self = new QueryLinkeBahamutIterationunitbatchnextstageResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutIterationunitbatchnextstageResponseBodyResult setIsAllSuccess(Boolean isAllSuccess) {
            this.isAllSuccess = isAllSuccess;
            return this;
        }
        public Boolean getIsAllSuccess() {
            return this.isAllSuccess;
        }

        public QueryLinkeBahamutIterationunitbatchnextstageResponseBodyResult setIsSuccess(String isSuccess) {
            this.isSuccess = isSuccess;
            return this;
        }
        public String getIsSuccess() {
            return this.isSuccess;
        }

        public QueryLinkeBahamutIterationunitbatchnextstageResponseBodyResult setShowInfo(String showInfo) {
            this.showInfo = showInfo;
            return this;
        }
        public String getShowInfo() {
            return this.showInfo;
        }

    }

}
