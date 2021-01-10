// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSAcrNamespaceRepoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAKSAcrNamespaceRepoResponseBody body;

    public static ListAKSAcrNamespaceRepoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAKSAcrNamespaceRepoResponse self = new ListAKSAcrNamespaceRepoResponse();
        return TeaModel.build(map, self);
    }

    public ListAKSAcrNamespaceRepoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAKSAcrNamespaceRepoResponse setBody(ListAKSAcrNamespaceRepoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAKSAcrNamespaceRepoResponseBody getBody() {
        return this.body;
    }

}
