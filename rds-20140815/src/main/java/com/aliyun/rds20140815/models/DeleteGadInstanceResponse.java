// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DeleteGadInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteGadInstanceResponseBody body;

    public static DeleteGadInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteGadInstanceResponse self = new DeleteGadInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DeleteGadInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteGadInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteGadInstanceResponse setBody(DeleteGadInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteGadInstanceResponseBody getBody() {
        return this.body;
    }

}
