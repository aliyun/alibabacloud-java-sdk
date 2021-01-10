// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLDCClusterInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListLDCClusterInfoResponseBody body;

    public static ListLDCClusterInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLDCClusterInfoResponse self = new ListLDCClusterInfoResponse();
        return TeaModel.build(map, self);
    }

    public ListLDCClusterInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLDCClusterInfoResponse setBody(ListLDCClusterInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLDCClusterInfoResponseBody getBody() {
        return this.body;
    }

}
