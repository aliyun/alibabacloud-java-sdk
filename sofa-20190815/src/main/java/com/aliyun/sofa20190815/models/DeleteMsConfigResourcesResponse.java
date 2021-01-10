// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMsConfigResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMsConfigResourcesResponseBody body;

    public static DeleteMsConfigResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMsConfigResourcesResponse self = new DeleteMsConfigResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMsConfigResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMsConfigResourcesResponse setBody(DeleteMsConfigResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMsConfigResourcesResponseBody getBody() {
        return this.body;
    }

}
