// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ValidateExpressSyncConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("IsValid")
    public Boolean isValid;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ValidateMessage")
    public String validateMessage;

    public static ValidateExpressSyncConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ValidateExpressSyncConfigResponseBody self = new ValidateExpressSyncConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public ValidateExpressSyncConfigResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ValidateExpressSyncConfigResponseBody setIsValid(Boolean isValid) {
        this.isValid = isValid;
        return this;
    }
    public Boolean getIsValid() {
        return this.isValid;
    }

    public ValidateExpressSyncConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ValidateExpressSyncConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ValidateExpressSyncConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ValidateExpressSyncConfigResponseBody setValidateMessage(String validateMessage) {
        this.validateMessage = validateMessage;
        return this;
    }
    public String getValidateMessage() {
        return this.validateMessage;
    }

}
