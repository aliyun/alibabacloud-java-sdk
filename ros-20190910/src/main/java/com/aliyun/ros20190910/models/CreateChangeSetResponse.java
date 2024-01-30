// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class CreateChangeSetResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateChangeSetResponseBody body;

    public static CreateChangeSetResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateChangeSetResponse self = new CreateChangeSetResponse();
        return TeaModel.build(map, self);
    }

    public CreateChangeSetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateChangeSetResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateChangeSetResponse setBody(CreateChangeSetResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateChangeSetResponseBody getBody() {
        return this.body;
    }

}
