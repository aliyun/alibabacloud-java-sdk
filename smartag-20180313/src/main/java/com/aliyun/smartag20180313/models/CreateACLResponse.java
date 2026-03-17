// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class CreateACLResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateACLResponseBody body;

    public static CreateACLResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateACLResponse self = new CreateACLResponse();
        return TeaModel.build(map, self);
    }

    public CreateACLResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateACLResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateACLResponse setBody(CreateACLResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateACLResponseBody getBody() {
        return this.body;
    }

}
