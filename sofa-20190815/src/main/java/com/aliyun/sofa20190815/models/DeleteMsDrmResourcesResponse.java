// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsDrmResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMsDrmResourcesResponseBody body;

    public static DeleteMsDrmResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsDrmResourcesResponse self = new DeleteMsDrmResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMsDrmResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMsDrmResourcesResponse setBody(DeleteMsDrmResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMsDrmResourcesResponseBody getBody() {
        return this.body;
    }

}
