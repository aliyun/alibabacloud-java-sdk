// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeLinktRemovetemplatefromprojectResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public CheckLinkeLinktRemovetemplatefromprojectResponseBodyData data;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ResultCode")
    public String resultCode;

    public static CheckLinkeLinktRemovetemplatefromprojectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeLinktRemovetemplatefromprojectResponseBody self = new CheckLinkeLinktRemovetemplatefromprojectResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLinkeLinktRemovetemplatefromprojectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckLinkeLinktRemovetemplatefromprojectResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CheckLinkeLinktRemovetemplatefromprojectResponseBody setData(CheckLinkeLinktRemovetemplatefromprojectResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckLinkeLinktRemovetemplatefromprojectResponseBodyData getData() {
        return this.data;
    }

    public CheckLinkeLinktRemovetemplatefromprojectResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public CheckLinkeLinktRemovetemplatefromprojectResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CheckLinkeLinktRemovetemplatefromprojectResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CheckLinkeLinktRemovetemplatefromprojectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckLinkeLinktRemovetemplatefromprojectResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CheckLinkeLinktRemovetemplatefromprojectResponseBodyData extends TeaModel {
        @NameInMap("WorkItemCount")
        public Long workItemCount;

        @NameInMap("CheckSuccess")
        public Boolean checkSuccess;

        @NameInMap("ErrorCode")
        public Long errorCode;

        @NameInMap("TemplateId")
        public Long templateId;

        public static CheckLinkeLinktRemovetemplatefromprojectResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckLinkeLinktRemovetemplatefromprojectResponseBodyData self = new CheckLinkeLinktRemovetemplatefromprojectResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckLinkeLinktRemovetemplatefromprojectResponseBodyData setWorkItemCount(Long workItemCount) {
            this.workItemCount = workItemCount;
            return this;
        }
        public Long getWorkItemCount() {
            return this.workItemCount;
        }

        public CheckLinkeLinktRemovetemplatefromprojectResponseBodyData setCheckSuccess(Boolean checkSuccess) {
            this.checkSuccess = checkSuccess;
            return this;
        }
        public Boolean getCheckSuccess() {
            return this.checkSuccess;
        }

        public CheckLinkeLinktRemovetemplatefromprojectResponseBodyData setErrorCode(Long errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public Long getErrorCode() {
            return this.errorCode;
        }

        public CheckLinkeLinktRemovetemplatefromprojectResponseBodyData setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

    }

}
