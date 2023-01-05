// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class DeleteContactWhiteListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteContactWhiteListResponseBody body;

    public static DeleteContactWhiteListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteContactWhiteListResponse self = new DeleteContactWhiteListResponse();
        return TeaModel.build(map, self);
    }

    public DeleteContactWhiteListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteContactWhiteListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteContactWhiteListResponse setBody(DeleteContactWhiteListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteContactWhiteListResponseBody getBody() {
        return this.body;
    }

}
