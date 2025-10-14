// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class DeleteGdnInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGdnInstanceResponseBody body;

    public static DeleteGdnInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGdnInstanceResponse self = new DeleteGdnInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGdnInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGdnInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGdnInstanceResponse setBody(DeleteGdnInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGdnInstanceResponseBody getBody() {
        return this.body;
    }

}
