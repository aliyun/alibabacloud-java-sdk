// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListAKSAcrRepoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ListAKSAcrRepoResponseBody body;

    public static ListAKSAcrRepoResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAKSAcrRepoResponse self = new ListAKSAcrRepoResponse();
        return TeaModel.build(map, self);
    }

    public ListAKSAcrRepoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAKSAcrRepoResponse setBody(ListAKSAcrRepoResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAKSAcrRepoResponseBody getBody() {
        return this.body;
    }

}
