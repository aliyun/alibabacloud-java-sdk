// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListCASSlsLogstoreResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListCASSlsLogstoreResponseBody body;

    public static ListCASSlsLogstoreResponse build(java.util.Map<String, ?> map) throws Exception {
        ListCASSlsLogstoreResponse self = new ListCASSlsLogstoreResponse();
        return TeaModel.build(map, self);
    }

    public ListCASSlsLogstoreResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListCASSlsLogstoreResponse setBody(ListCASSlsLogstoreResponseBody body) {
        this.body = body;
        return this;
    }
    public ListCASSlsLogstoreResponseBody getBody() {
        return this.body;
    }

}
