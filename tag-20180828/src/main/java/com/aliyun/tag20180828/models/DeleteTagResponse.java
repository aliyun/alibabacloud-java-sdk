// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tag20180828.models;

import com.aliyun.tea.*;

public class DeleteTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteTagResponseBody body;

    public static DeleteTagResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagResponse self = new DeleteTagResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTagResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTagResponse setBody(DeleteTagResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTagResponseBody getBody() {
        return this.body;
    }

}
