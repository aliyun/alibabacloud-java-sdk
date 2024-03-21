// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SaveTemporaryApplicantResponseBody extends TeaModel {
    @NameInMap("ApplicantId")
    public Long applicantId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SaveTemporaryApplicantResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveTemporaryApplicantResponseBody self = new SaveTemporaryApplicantResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveTemporaryApplicantResponseBody setApplicantId(Long applicantId) {
        this.applicantId = applicantId;
        return this;
    }
    public Long getApplicantId() {
        return this.applicantId;
    }

    public SaveTemporaryApplicantResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SaveTemporaryApplicantResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SaveTemporaryApplicantResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveTemporaryApplicantResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
