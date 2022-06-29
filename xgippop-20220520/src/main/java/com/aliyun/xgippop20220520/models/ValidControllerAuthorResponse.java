// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xgippop20220520.models;

import com.aliyun.tea.*;

public class ValidControllerAuthorResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ValidControllerAuthorResponseBody body;

    public static ValidControllerAuthorResponse build(java.util.Map<String, ?> map) throws Exception {
        ValidControllerAuthorResponse self = new ValidControllerAuthorResponse();
        return TeaModel.build(map, self);
    }

    public ValidControllerAuthorResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ValidControllerAuthorResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ValidControllerAuthorResponse setBody(ValidControllerAuthorResponseBody body) {
        this.body = body;
        return this;
    }
    public ValidControllerAuthorResponseBody getBody() {
        return this.body;
    }

}
