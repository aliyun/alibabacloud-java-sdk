// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.serverless20210924.models;

import com.aliyun.tea.*;

public class ListServiceRevisionsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.List<ServiceRevision> body;

    public static ListServiceRevisionsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListServiceRevisionsResponse self = new ListServiceRevisionsResponse();
        return TeaModel.build(map, self);
    }

    public ListServiceRevisionsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListServiceRevisionsResponse setBody(java.util.List<ServiceRevision> body) {
        this.body = body;
        return this;
    }
    public java.util.List<ServiceRevision> getBody() {
        return this.body;
    }

}
