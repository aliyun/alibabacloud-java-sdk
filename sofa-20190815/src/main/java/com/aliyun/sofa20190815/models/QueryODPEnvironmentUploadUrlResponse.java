// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryODPEnvironmentUploadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryODPEnvironmentUploadUrlResponseBody body;

    public static QueryODPEnvironmentUploadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryODPEnvironmentUploadUrlResponse self = new QueryODPEnvironmentUploadUrlResponse();
        return TeaModel.build(map, self);
    }

    public QueryODPEnvironmentUploadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryODPEnvironmentUploadUrlResponse setBody(QueryODPEnvironmentUploadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryODPEnvironmentUploadUrlResponseBody getBody() {
        return this.body;
    }

}
