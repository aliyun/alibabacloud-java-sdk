// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeLinktRemovestatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public CheckLinkeLinktRemovestatusResponseBodyData data;

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

    public static CheckLinkeLinktRemovestatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeLinktRemovestatusResponseBody self = new CheckLinkeLinktRemovestatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLinkeLinktRemovestatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckLinkeLinktRemovestatusResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CheckLinkeLinktRemovestatusResponseBody setData(CheckLinkeLinktRemovestatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckLinkeLinktRemovestatusResponseBodyData getData() {
        return this.data;
    }

    public CheckLinkeLinktRemovestatusResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public CheckLinkeLinktRemovestatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CheckLinkeLinktRemovestatusResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CheckLinkeLinktRemovestatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckLinkeLinktRemovestatusResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CheckLinkeLinktRemovestatusResponseBodyData extends TeaModel {
        @NameInMap("WorkItemCount")
        public Long workItemCount;

        @NameInMap("CheckSuccess")
        public Boolean checkSuccess;

        @NameInMap("ErrorCode")
        public Long errorCode;

        @NameInMap("AsDefaultStatusWorkflows")
        public java.util.List<String> asDefaultStatusWorkflows;

        @NameInMap("ToConvertStatusWorkflows")
        public java.util.List<String> toConvertStatusWorkflows;

        public static CheckLinkeLinktRemovestatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckLinkeLinktRemovestatusResponseBodyData self = new CheckLinkeLinktRemovestatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckLinkeLinktRemovestatusResponseBodyData setWorkItemCount(Long workItemCount) {
            this.workItemCount = workItemCount;
            return this;
        }
        public Long getWorkItemCount() {
            return this.workItemCount;
        }

        public CheckLinkeLinktRemovestatusResponseBodyData setCheckSuccess(Boolean checkSuccess) {
            this.checkSuccess = checkSuccess;
            return this;
        }
        public Boolean getCheckSuccess() {
            return this.checkSuccess;
        }

        public CheckLinkeLinktRemovestatusResponseBodyData setErrorCode(Long errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public Long getErrorCode() {
            return this.errorCode;
        }

        public CheckLinkeLinktRemovestatusResponseBodyData setAsDefaultStatusWorkflows(java.util.List<String> asDefaultStatusWorkflows) {
            this.asDefaultStatusWorkflows = asDefaultStatusWorkflows;
            return this;
        }
        public java.util.List<String> getAsDefaultStatusWorkflows() {
            return this.asDefaultStatusWorkflows;
        }

        public CheckLinkeLinktRemovestatusResponseBodyData setToConvertStatusWorkflows(java.util.List<String> toConvertStatusWorkflows) {
            this.toConvertStatusWorkflows = toConvertStatusWorkflows;
            return this;
        }
        public java.util.List<String> getToConvertStatusWorkflows() {
            return this.toConvertStatusWorkflows;
        }

    }

}
