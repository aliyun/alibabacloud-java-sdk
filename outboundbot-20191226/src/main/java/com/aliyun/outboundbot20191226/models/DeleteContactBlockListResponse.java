// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteContactBlockListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteContactBlockListResponseBody body;

    public static DeleteContactBlockListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactBlockListResponse self = new DeleteContactBlockListResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContactBlockListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContactBlockListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContactBlockListResponse setBody(DeleteContactBlockListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContactBlockListResponseBody getBody() {
        return this.body;
    }

}
