// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveLinkeLinktCustomfieldorderResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultCode")
    public String resultCode;

    @NameInMap("ResultMessage")
    public String resultMessage;

    @NameInMap("Data")
    public Boolean data;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ResponseStatusCode")
    public Long responseStatusCode;

    @NameInMap("Success")
    public Boolean success;

    public static SaveLinkeLinktCustomfieldorderResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveLinkeLinktCustomfieldorderResponseBody self = new SaveLinkeLinktCustomfieldorderResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveLinkeLinktCustomfieldorderResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveLinkeLinktCustomfieldorderResponseBody setResultCode(String resultCode) {
        this.resultCode = resultCode;
        return this;
    }
    public String getResultCode() {
        return this.resultCode;
    }

    public SaveLinkeLinktCustomfieldorderResponseBody setResultMessage(String resultMessage) {
        this.resultMessage = resultMessage;
        return this;
    }
    public String getResultMessage() {
        return this.resultMessage;
    }

    public SaveLinkeLinktCustomfieldorderResponseBody setData(Boolean data) {
        this.data = data;
        return this;
    }
    public Boolean getData() {
        return this.data;
    }

    public SaveLinkeLinktCustomfieldorderResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public SaveLinkeLinktCustomfieldorderResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SaveLinkeLinktCustomfieldorderResponseBody setResponseStatusCode(Long responseStatusCode) {
        this.responseStatusCode = responseStatusCode;
        return this;
    }
    public Long getResponseStatusCode() {
        return this.responseStatusCode;
    }

    public SaveLinkeLinktCustomfieldorderResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
