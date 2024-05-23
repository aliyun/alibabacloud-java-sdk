// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class CreateTagValueResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateTagValueResponseBody body;

    public static CreateTagValueResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateTagValueResponse self = new CreateTagValueResponse();
        return TeaModel.build(map, self);
    }

    public CreateTagValueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateTagValueResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateTagValueResponse setBody(CreateTagValueResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateTagValueResponseBody getBody() {
        return this.body;
    }

}
