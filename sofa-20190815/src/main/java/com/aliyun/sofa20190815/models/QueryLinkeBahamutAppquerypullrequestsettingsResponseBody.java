// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAppquerypullrequestsettingsResponseBody extends TeaModel {
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
    public QueryLinkeBahamutAppquerypullrequestsettingsResponseBodyResult result;

    public static QueryLinkeBahamutAppquerypullrequestsettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAppquerypullrequestsettingsResponseBody self = new QueryLinkeBahamutAppquerypullrequestsettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAppquerypullrequestsettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutAppquerypullrequestsettingsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutAppquerypullrequestsettingsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutAppquerypullrequestsettingsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutAppquerypullrequestsettingsResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutAppquerypullrequestsettingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutAppquerypullrequestsettingsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutAppquerypullrequestsettingsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutAppquerypullrequestsettingsResponseBody setResult(QueryLinkeBahamutAppquerypullrequestsettingsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeBahamutAppquerypullrequestsettingsResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutAppquerypullrequestsettingsResponseBodyResult extends TeaModel {
        @NameInMap("ReviewRequired")
        public Boolean reviewRequired;

        @NameInMap("ShouldRemoveSourceBranch")
        public Boolean shouldRemoveSourceBranch;

        public static QueryLinkeBahamutAppquerypullrequestsettingsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutAppquerypullrequestsettingsResponseBodyResult self = new QueryLinkeBahamutAppquerypullrequestsettingsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutAppquerypullrequestsettingsResponseBodyResult setReviewRequired(Boolean reviewRequired) {
            this.reviewRequired = reviewRequired;
            return this;
        }
        public Boolean getReviewRequired() {
            return this.reviewRequired;
        }

        public QueryLinkeBahamutAppquerypullrequestsettingsResponseBodyResult setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
            this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
            return this;
        }
        public Boolean getShouldRemoveSourceBranch() {
            return this.shouldRemoveSourceBranch;
        }

    }

}
