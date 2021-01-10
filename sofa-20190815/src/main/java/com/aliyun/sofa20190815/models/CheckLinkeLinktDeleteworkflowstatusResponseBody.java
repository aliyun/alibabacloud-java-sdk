// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeLinktDeleteworkflowstatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Data")
    public CheckLinkeLinktDeleteworkflowstatusResponseBodyData data;

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

    public static CheckLinkeLinktDeleteworkflowstatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeLinktDeleteworkflowstatusResponseBody self = new CheckLinkeLinktDeleteworkflowstatusResponseBody();
        return TeaModel.build(map, self);
    }

    public CheckLinkeLinktDeleteworkflowstatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CheckLinkeLinktDeleteworkflowstatusResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public CheckLinkeLinktDeleteworkflowstatusResponseBody setData(CheckLinkeLinktDeleteworkflowstatusResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CheckLinkeLinktDeleteworkflowstatusResponseBodyData getData() {
        return this.data;
    }

    public CheckLinkeLinktDeleteworkflowstatusResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public CheckLinkeLinktDeleteworkflowstatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CheckLinkeLinktDeleteworkflowstatusResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public CheckLinkeLinktDeleteworkflowstatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CheckLinkeLinktDeleteworkflowstatusResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public static class CheckLinkeLinktDeleteworkflowstatusResponseBodyData extends TeaModel {
        @NameInMap("WorkItemCount")
        public Long workItemCount;

        @NameInMap("CheckSuccess")
        public Boolean checkSuccess;

        @NameInMap("ErrorCode")
        public Long errorCode;

        public static CheckLinkeLinktDeleteworkflowstatusResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CheckLinkeLinktDeleteworkflowstatusResponseBodyData self = new CheckLinkeLinktDeleteworkflowstatusResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CheckLinkeLinktDeleteworkflowstatusResponseBodyData setWorkItemCount(Long workItemCount) {
            this.workItemCount = workItemCount;
            return this;
        }
        public Long getWorkItemCount() {
            return this.workItemCount;
        }

        public CheckLinkeLinktDeleteworkflowstatusResponseBodyData setCheckSuccess(Boolean checkSuccess) {
            this.checkSuccess = checkSuccess;
            return this;
        }
        public Boolean getCheckSuccess() {
            return this.checkSuccess;
        }

        public CheckLinkeLinktDeleteworkflowstatusResponseBodyData setErrorCode(Long errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public Long getErrorCode() {
            return this.errorCode;
        }

    }

}
