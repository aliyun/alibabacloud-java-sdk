// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgAuditLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListMsSgAuditLogsResponseBody body;

    public static ListMsSgAuditLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgAuditLogsResponse self = new ListMsSgAuditLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListMsSgAuditLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMsSgAuditLogsResponse setBody(ListMsSgAuditLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMsSgAuditLogsResponseBody getBody() {
        return this.body;
    }

}
