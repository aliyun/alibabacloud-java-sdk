// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectRuletargetResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasInspectRuletargetResponseBody body;

    public static ListHasInspectRuletargetResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectRuletargetResponse self = new ListHasInspectRuletargetResponse();
        return TeaModel.build(map, self);
    }

    public ListHasInspectRuletargetResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasInspectRuletargetResponse setBody(ListHasInspectRuletargetResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasInspectRuletargetResponseBody getBody() {
        return this.body;
    }

}
