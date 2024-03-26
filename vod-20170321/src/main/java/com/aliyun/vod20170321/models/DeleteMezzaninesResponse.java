// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class DeleteMezzaninesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteMezzaninesResponseBody body;

    public static DeleteMezzaninesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMezzaninesResponse self = new DeleteMezzaninesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMezzaninesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMezzaninesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteMezzaninesResponse setBody(DeleteMezzaninesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMezzaninesResponseBody getBody() {
        return this.body;
    }

}
