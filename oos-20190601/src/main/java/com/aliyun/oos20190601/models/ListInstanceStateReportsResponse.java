// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oos20190601.models;

import com.aliyun.tea.*;

public class ListInstanceStateReportsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListInstanceStateReportsResponseBody body;

    public static ListInstanceStateReportsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListInstanceStateReportsResponse self = new ListInstanceStateReportsResponse();
        return TeaModel.build(map, self);
    }

    public ListInstanceStateReportsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListInstanceStateReportsResponse setBody(ListInstanceStateReportsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListInstanceStateReportsResponseBody getBody() {
        return this.body;
    }

}
