// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.scsp20200702.models;

import com.aliyun.tea.*;

public class QueryDeploymentArchiveResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryDeploymentArchiveResponseBody body;

    public static QueryDeploymentArchiveResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryDeploymentArchiveResponse self = new QueryDeploymentArchiveResponse();
        return TeaModel.build(map, self);
    }

    public QueryDeploymentArchiveResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryDeploymentArchiveResponse setBody(QueryDeploymentArchiveResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryDeploymentArchiveResponseBody getBody() {
        return this.body;
    }

}
