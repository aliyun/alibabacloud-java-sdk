// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class ListEnvironmentRevisionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.List<EnvironmentRevision> body;

    public static ListEnvironmentRevisionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListEnvironmentRevisionsResponse self = new ListEnvironmentRevisionsResponse();
        return TeaModel.build(map, self);
    }

    public ListEnvironmentRevisionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListEnvironmentRevisionsResponse setBody(java.util.List<EnvironmentRevision> body) {
        this.body = body;
        return this;
    }
    public java.util.List<EnvironmentRevision> getBody() {
        return this.body;
    }

}
