// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcesharing20200110.models;

import com.aliyun.tea.*;

public class EnableSharingWithResourceDirectoryResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public EnableSharingWithResourceDirectoryResponseBody body;

    public static EnableSharingWithResourceDirectoryResponse build(java.util.Map<String, ?> map) throws Exception {
        EnableSharingWithResourceDirectoryResponse self = new EnableSharingWithResourceDirectoryResponse();
        return TeaModel.build(map, self);
    }

    public EnableSharingWithResourceDirectoryResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public EnableSharingWithResourceDirectoryResponse setBody(EnableSharingWithResourceDirectoryResponseBody body) {
        this.body = body;
        return this;
    }
    public EnableSharingWithResourceDirectoryResponseBody getBody() {
        return this.body;
    }

}
