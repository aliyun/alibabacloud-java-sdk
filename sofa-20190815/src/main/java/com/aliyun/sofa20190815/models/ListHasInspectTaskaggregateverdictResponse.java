// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectTaskaggregateverdictResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasInspectTaskaggregateverdictResponseBody body;

    public static ListHasInspectTaskaggregateverdictResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectTaskaggregateverdictResponse self = new ListHasInspectTaskaggregateverdictResponse();
        return TeaModel.build(map, self);
    }

    public ListHasInspectTaskaggregateverdictResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasInspectTaskaggregateverdictResponse setBody(ListHasInspectTaskaggregateverdictResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasInspectTaskaggregateverdictResponseBody getBody() {
        return this.body;
    }

}
