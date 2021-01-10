// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskIssuesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClriskIssuesResponseBody body;

    public static ListClriskIssuesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClriskIssuesResponse self = new ListClriskIssuesResponse();
        return TeaModel.build(map, self);
    }

    public ListClriskIssuesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClriskIssuesResponse setBody(ListClriskIssuesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClriskIssuesResponseBody getBody() {
        return this.body;
    }

}
