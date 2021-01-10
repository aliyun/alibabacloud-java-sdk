// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListDSTDependenciesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListDSTDependenciesResponseBody body;

    public static ListDSTDependenciesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDSTDependenciesResponse self = new ListDSTDependenciesResponse();
        return TeaModel.build(map, self);
    }

    public ListDSTDependenciesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListDSTDependenciesResponse setBody(ListDSTDependenciesResponseBody body) {
        this.body = body;
        return this;
    }
    public ListDSTDependenciesResponseBody getBody() {
        return this.body;
    }

}
