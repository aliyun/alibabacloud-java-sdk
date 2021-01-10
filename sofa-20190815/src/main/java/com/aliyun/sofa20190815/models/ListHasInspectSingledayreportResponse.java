// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListHasInspectSingledayreportResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListHasInspectSingledayreportResponseBody body;

    public static ListHasInspectSingledayreportResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHasInspectSingledayreportResponse self = new ListHasInspectSingledayreportResponse();
        return TeaModel.build(map, self);
    }

    public ListHasInspectSingledayreportResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHasInspectSingledayreportResponse setBody(ListHasInspectSingledayreportResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHasInspectSingledayreportResponseBody getBody() {
        return this.body;
    }

}
