// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetResourceDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceDirectoryResponseBody body;

    public static GetResourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceDirectoryResponse self = new GetResourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceDirectoryResponse setBody(GetResourceDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceDirectoryResponseBody getBody() {
        return this.body;
    }

}
