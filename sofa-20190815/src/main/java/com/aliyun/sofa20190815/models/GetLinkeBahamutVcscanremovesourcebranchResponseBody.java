// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcscanremovesourcebranchResponseBody extends TeaModel {
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
    public GetLinkeBahamutVcscanremovesourcebranchResponseBodyResult result;

    public static GetLinkeBahamutVcscanremovesourcebranchResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcscanremovesourcebranchResponseBody self = new GetLinkeBahamutVcscanremovesourcebranchResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcscanremovesourcebranchResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLinkeBahamutVcscanremovesourcebranchResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public GetLinkeBahamutVcscanremovesourcebranchResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public GetLinkeBahamutVcscanremovesourcebranchResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLinkeBahamutVcscanremovesourcebranchResponseBody setErrorMsgParamsMap(String errorMsgParamsMap) {
        this.errorMsgParamsMap = errorMsgParamsMap;
        return this;
    }
    public String getErrorMsgParamsMap() {
        return this.errorMsgParamsMap;
    }

    public GetLinkeBahamutVcscanremovesourcebranchResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLinkeBahamutVcscanremovesourcebranchResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public GetLinkeBahamutVcscanremovesourcebranchResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetLinkeBahamutVcscanremovesourcebranchResponseBody setResult(GetLinkeBahamutVcscanremovesourcebranchResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetLinkeBahamutVcscanremovesourcebranchResponseBodyResult getResult() {
        return this.result;
    }

    public static class GetLinkeBahamutVcscanremovesourcebranchResponseBodyResult extends TeaModel {
        @NameInMap("CanRemoveSourceBranch")
        public Boolean canRemoveSourceBranch;

        @NameInMap("Reason")
        public String reason;

        @NameInMap("SourceBranchExist")
        public Boolean sourceBranchExist;

        public static GetLinkeBahamutVcscanremovesourcebranchResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetLinkeBahamutVcscanremovesourcebranchResponseBodyResult self = new GetLinkeBahamutVcscanremovesourcebranchResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetLinkeBahamutVcscanremovesourcebranchResponseBodyResult setCanRemoveSourceBranch(Boolean canRemoveSourceBranch) {
            this.canRemoveSourceBranch = canRemoveSourceBranch;
            return this;
        }
        public Boolean getCanRemoveSourceBranch() {
            return this.canRemoveSourceBranch;
        }

        public GetLinkeBahamutVcscanremovesourcebranchResponseBodyResult setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetLinkeBahamutVcscanremovesourcebranchResponseBodyResult setSourceBranchExist(Boolean sourceBranchExist) {
            this.sourceBranchExist = sourceBranchExist;
            return this;
        }
        public Boolean getSourceBranchExist() {
            return this.sourceBranchExist;
        }

    }

}
