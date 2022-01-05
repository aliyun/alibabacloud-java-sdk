// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paidms20210106.models;

import com.aliyun.tea.*;

public class ListUsedProjectsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListUsedProjectsResponseBody body;

    public static ListUsedProjectsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUsedProjectsResponse self = new ListUsedProjectsResponse();
        return TeaModel.build(map, self);
    }

    public ListUsedProjectsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUsedProjectsResponse setBody(ListUsedProjectsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUsedProjectsResponseBody getBody() {
        return this.body;
    }

}
