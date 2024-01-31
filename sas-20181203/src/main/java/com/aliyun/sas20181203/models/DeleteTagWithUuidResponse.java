// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteTagWithUuidResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteTagWithUuidResponseBody body;

    public static DeleteTagWithUuidResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteTagWithUuidResponse self = new DeleteTagWithUuidResponse();
        return TeaModel.build(map, self);
    }

    public DeleteTagWithUuidResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteTagWithUuidResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteTagWithUuidResponse setBody(DeleteTagWithUuidResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteTagWithUuidResponseBody getBody() {
        return this.body;
    }

}
