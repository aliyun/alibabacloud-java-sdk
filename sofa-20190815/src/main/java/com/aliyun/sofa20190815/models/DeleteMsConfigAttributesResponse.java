// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsConfigAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMsConfigAttributesResponseBody body;

    public static DeleteMsConfigAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsConfigAttributesResponse self = new DeleteMsConfigAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMsConfigAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMsConfigAttributesResponse setBody(DeleteMsConfigAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMsConfigAttributesResponseBody getBody() {
        return this.body;
    }

}
