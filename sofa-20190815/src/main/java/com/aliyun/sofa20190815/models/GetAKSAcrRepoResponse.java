// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetAKSAcrRepoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAKSAcrRepoResponseBody body;

    public static GetAKSAcrRepoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAKSAcrRepoResponse self = new GetAKSAcrRepoResponse();
        return TeaModel.build(map, self);
    }

    public GetAKSAcrRepoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAKSAcrRepoResponse setBody(GetAKSAcrRepoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAKSAcrRepoResponseBody getBody() {
        return this.body;
    }

}
