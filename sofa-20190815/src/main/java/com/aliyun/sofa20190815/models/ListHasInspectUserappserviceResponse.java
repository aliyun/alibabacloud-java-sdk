// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectUserappserviceResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasInspectUserappserviceResponseBody body;

    public static ListHasInspectUserappserviceResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectUserappserviceResponse self = new ListHasInspectUserappserviceResponse();
        return TeaModel.build(map, self);
    }

    public ListHasInspectUserappserviceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasInspectUserappserviceResponse setBody(ListHasInspectUserappserviceResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasInspectUserappserviceResponseBody getBody() {
        return this.body;
    }

}
