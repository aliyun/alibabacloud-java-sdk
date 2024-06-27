// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SaveByPassOrShuntEventResponseBody extends TeaModel {
    @NameInMap("code")
    public String code;

    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    @NameInMap("message")
    public String message;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("resultObject")
    public Boolean resultObject;

    @NameInMap("success")
    public Boolean success;

    public static SaveByPassOrShuntEventResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SaveByPassOrShuntEventResponseBody self = new SaveByPassOrShuntEventResponseBody();
        return TeaModel.build(map, self);
    }

    public SaveByPassOrShuntEventResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public SaveByPassOrShuntEventResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SaveByPassOrShuntEventResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SaveByPassOrShuntEventResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SaveByPassOrShuntEventResponseBody setResultObject(Boolean resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public Boolean getResultObject() {
        return this.resultObject;
    }

    public SaveByPassOrShuntEventResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
