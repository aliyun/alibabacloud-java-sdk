// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListClriskIssueTaskResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListClriskIssueTaskResponseBody body;

    public static ListClriskIssueTaskResponse build(java.util.Map<String, ?> map) throws Exception {
        ListClriskIssueTaskResponse self = new ListClriskIssueTaskResponse();
        return TeaModel.build(map, self);
    }

    public ListClriskIssueTaskResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListClriskIssueTaskResponse setBody(ListClriskIssueTaskResponseBody body) {
        this.body = body;
        return this;
    }
    public ListClriskIssueTaskResponseBody getBody() {
        return this.body;
    }

}
