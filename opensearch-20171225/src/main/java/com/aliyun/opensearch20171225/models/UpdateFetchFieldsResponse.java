// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class UpdateFetchFieldsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateFetchFieldsResponseBody body;

    public static UpdateFetchFieldsResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateFetchFieldsResponse self = new UpdateFetchFieldsResponse();
        return TeaModel.build(map, self);
    }

    public UpdateFetchFieldsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateFetchFieldsResponse setBody(UpdateFetchFieldsResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateFetchFieldsResponseBody getBody() {
        return this.body;
    }

}
