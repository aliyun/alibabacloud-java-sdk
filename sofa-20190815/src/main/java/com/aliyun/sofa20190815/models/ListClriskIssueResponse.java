// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskIssueResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClriskIssueResponseBody body;

    public static ListClriskIssueResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClriskIssueResponse self = new ListClriskIssueResponse();
        return TeaModel.build(map, self);
    }

    public ListClriskIssueResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClriskIssueResponse setBody(ListClriskIssueResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClriskIssueResponseBody getBody() {
        return this.body;
    }

}
