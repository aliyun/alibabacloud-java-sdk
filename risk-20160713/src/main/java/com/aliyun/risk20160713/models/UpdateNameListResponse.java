// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.risk20160713.models;

import com.aliyun.tea.*;

public class UpdateNameListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateNameListResponseBody body;

    public static UpdateNameListResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateNameListResponse self = new UpdateNameListResponse();
        return TeaModel.build(map, self);
    }

    public UpdateNameListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateNameListResponse setBody(UpdateNameListResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateNameListResponseBody getBody() {
        return this.body;
    }

}
