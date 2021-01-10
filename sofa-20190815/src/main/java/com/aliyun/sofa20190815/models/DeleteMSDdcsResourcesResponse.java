// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMSDdcsResourcesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMSDdcsResourcesResponseBody body;

    public static DeleteMSDdcsResourcesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMSDdcsResourcesResponse self = new DeleteMSDdcsResourcesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMSDdcsResourcesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMSDdcsResourcesResponse setBody(DeleteMSDdcsResourcesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMSDdcsResourcesResponseBody getBody() {
        return this.body;
    }

}
