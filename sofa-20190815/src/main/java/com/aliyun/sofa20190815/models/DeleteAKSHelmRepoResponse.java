// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteAKSHelmRepoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAKSHelmRepoResponseBody body;

    public static DeleteAKSHelmRepoResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAKSHelmRepoResponse self = new DeleteAKSHelmRepoResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAKSHelmRepoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAKSHelmRepoResponse setBody(DeleteAKSHelmRepoResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAKSHelmRepoResponseBody getBody() {
        return this.body;
    }

}
