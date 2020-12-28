// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class DeleteAccessControlListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteAccessControlListResponseBody body;

    public static DeleteAccessControlListResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessControlListResponse self = new DeleteAccessControlListResponse();
        return TeaModel.build(map, self);
    }

    public DeleteAccessControlListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteAccessControlListResponse setBody(DeleteAccessControlListResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteAccessControlListResponseBody getBody() {
        return this.body;
    }

}
