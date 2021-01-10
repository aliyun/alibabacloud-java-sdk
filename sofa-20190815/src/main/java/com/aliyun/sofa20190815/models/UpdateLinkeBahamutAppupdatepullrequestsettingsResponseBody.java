// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBody extends TeaModel {
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
    public UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBodyResult result;

    public static UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBody self = new UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBody setResult(UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBodyResult getResult() {
        return this.result;
    }

    public static class UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBodyResult extends TeaModel {
        @NameInMap("ReviewRequired")
        public Boolean reviewRequired;

        @NameInMap("ShouldRemoveSourceBranch")
        public Boolean shouldRemoveSourceBranch;

        public static UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBodyResult self = new UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBodyResult setReviewRequired(Boolean reviewRequired) {
            this.reviewRequired = reviewRequired;
            return this;
        }
        public Boolean getReviewRequired() {
            return this.reviewRequired;
        }

        public UpdateLinkeBahamutAppupdatepullrequestsettingsResponseBodyResult setShouldRemoveSourceBranch(Boolean shouldRemoveSourceBranch) {
            this.shouldRemoveSourceBranch = shouldRemoveSourceBranch;
            return this;
        }
        public Boolean getShouldRemoveSourceBranch() {
            return this.shouldRemoveSourceBranch;
        }

    }

}
