// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class CreateExpressSyncResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("ExpressSyncId")
    public String expressSyncId;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateExpressSyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateExpressSyncResponseBody self = new CreateExpressSyncResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateExpressSyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateExpressSyncResponseBody setExpressSyncId(String expressSyncId) {
        this.expressSyncId = expressSyncId;
        return this;
    }
    public String getExpressSyncId() {
        return this.expressSyncId;
    }

    public CreateExpressSyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateExpressSyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateExpressSyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
