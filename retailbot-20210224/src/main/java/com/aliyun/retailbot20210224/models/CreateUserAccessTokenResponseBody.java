// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class CreateUserAccessTokenResponseBody extends TeaModel {
    // msg code
    @NameInMap("Code")
    public String code;

    // token
    @NameInMap("Data")
    public String data;

    // msg info
    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static CreateUserAccessTokenResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateUserAccessTokenResponseBody self = new CreateUserAccessTokenResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateUserAccessTokenResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CreateUserAccessTokenResponseBody setData(String data) {
        this.data = data;
        return this;
    }
    public String getData() {
        return this.data;
    }

    public CreateUserAccessTokenResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateUserAccessTokenResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateUserAccessTokenResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
