// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rmcore20220121.models;

import com.aliyun.tea.*;

public class DeleteApiResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteApiResponseBody body;

    public static DeleteApiResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteApiResponse self = new DeleteApiResponse();
        return TeaModel.build(map, self);
    }

    public DeleteApiResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteApiResponse setBody(DeleteApiResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteApiResponseBody getBody() {
        return this.body;
    }

}
