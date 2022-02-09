// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class UpdateOmsSyncDatabaseInfosResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public UpdateOmsSyncDatabaseInfosResponseBody body;

    public static UpdateOmsSyncDatabaseInfosResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateOmsSyncDatabaseInfosResponse self = new UpdateOmsSyncDatabaseInfosResponse();
        return TeaModel.build(map, self);
    }

    public UpdateOmsSyncDatabaseInfosResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateOmsSyncDatabaseInfosResponse setBody(UpdateOmsSyncDatabaseInfosResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateOmsSyncDatabaseInfosResponseBody getBody() {
        return this.body;
    }

}
