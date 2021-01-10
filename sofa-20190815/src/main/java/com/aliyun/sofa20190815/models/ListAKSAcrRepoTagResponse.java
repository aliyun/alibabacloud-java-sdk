// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSAcrRepoTagResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAKSAcrRepoTagResponseBody body;

    public static ListAKSAcrRepoTagResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAKSAcrRepoTagResponse self = new ListAKSAcrRepoTagResponse();
        return TeaModel.build(map, self);
    }

    public ListAKSAcrRepoTagResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAKSAcrRepoTagResponse setBody(ListAKSAcrRepoTagResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAKSAcrRepoTagResponseBody getBody() {
        return this.body;
    }

}
