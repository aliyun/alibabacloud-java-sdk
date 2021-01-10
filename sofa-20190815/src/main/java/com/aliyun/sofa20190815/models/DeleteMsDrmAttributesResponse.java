// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsDrmAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMsDrmAttributesResponseBody body;

    public static DeleteMsDrmAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsDrmAttributesResponse self = new DeleteMsDrmAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMsDrmAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMsDrmAttributesResponse setBody(DeleteMsDrmAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMsDrmAttributesResponseBody getBody() {
        return this.body;
    }

}
