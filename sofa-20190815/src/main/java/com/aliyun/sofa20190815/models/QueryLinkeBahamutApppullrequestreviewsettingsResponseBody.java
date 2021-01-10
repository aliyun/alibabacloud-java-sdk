// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutApppullrequestreviewsettingsResponseBody extends TeaModel {
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
    public QueryLinkeBahamutApppullrequestreviewsettingsResponseBodyResult result;

    public static QueryLinkeBahamutApppullrequestreviewsettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutApppullrequestreviewsettingsResponseBody self = new QueryLinkeBahamutApppullrequestreviewsettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutApppullrequestreviewsettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryLinkeBahamutApppullrequestreviewsettingsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public QueryLinkeBahamutApppullrequestreviewsettingsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public QueryLinkeBahamutApppullrequestreviewsettingsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public QueryLinkeBahamutApppullrequestreviewsettingsResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public QueryLinkeBahamutApppullrequestreviewsettingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryLinkeBahamutApppullrequestreviewsettingsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public QueryLinkeBahamutApppullrequestreviewsettingsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public QueryLinkeBahamutApppullrequestreviewsettingsResponseBody setResult(QueryLinkeBahamutApppullrequestreviewsettingsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public QueryLinkeBahamutApppullrequestreviewsettingsResponseBodyResult getResult() {
        return this.result;
    }

    public static class QueryLinkeBahamutApppullrequestreviewsettingsResponseBodyResult extends TeaModel {
        @NameInMap("ReviewRequired")
        public Boolean reviewRequired;

        @NameInMap("RulesType")
        public String rulesType;

        @NameInMap("ShouldRemoveSourceBranch")
        public Boolean shouldRemoveSourceBranch;

        @NameInMap("SubmitterCanReview")
        public Boolean submitterCanReview;

        @NameInMap("Threshold")
        public Long threshold;

        @NameInMap("ThresholdClear")
        public Boolean thresholdClear;

        public static QueryLinkeBahamutApppullrequestreviewsettingsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            QueryLinkeBahamutApppullrequestreviewsettingsResponseBodyResult self = new QueryLinkeBahamutApppullrequestreviewsettingsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public QueryLinkeBahamutApppullrequestreviewsettingsResponseBodyResult setReviewRequired(Boolean reviewRequired) {
            this.reviewRequired = reviewRequired;
            return this;
        }
        public Boolean getReviewRequired() {
            return this.reviewRequired;
        }

        public QueryLinkeBahamutApppullrequestreviewsettingsResponseBodyResult setRulesType(String rulesType) {
            this.rulesType = rulesType;
            return this;
        }
        public String getRulesType() {
            return this.rulesType;
        }

        public QueryLinkeBahamutApppullrequestreviewsettingsResponseBodyResult setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
            this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
            return this;
        }
        public Boolean getShouldRemoveSourceBranch() {
            return this.shouldRemoveSourceBranch;
        }

        public QueryLinkeBahamutApppullrequestreviewsettingsResponseBodyResult setSubmitterCanReview(Boolean submitterCanReview) {
            this.submitterCanReview = submitterCanReview;
            return this;
        }
        public Boolean getSubmitterCanReview() {
            return this.submitterCanReview;
        }

        public QueryLinkeBahamutApppullrequestreviewsettingsResponseBodyResult setThreshold(Long threshold) {
            this.threshold = threshold;
            return this;
        }
        public Long getThreshold() {
            return this.threshold;
        }

        public QueryLinkeBahamutApppullrequestreviewsettingsResponseBodyResult setThresholdClear(Boolean thresholdClear) {
            this.thresholdClear = thresholdClear;
            return this;
        }
        public Boolean getThresholdClear() {
            return this.thresholdClear;
        }

    }

}
