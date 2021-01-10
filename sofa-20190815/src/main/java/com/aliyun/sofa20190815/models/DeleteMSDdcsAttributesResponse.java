// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteMSDdcsAttributesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteMSDdcsAttributesResponseBody body;

    public static DeleteMSDdcsAttributesResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteMSDdcsAttributesResponse self = new DeleteMSDdcsAttributesResponse();
        return TeaModel.build(map, self);
    }

    public DeleteMSDdcsAttributesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteMSDdcsAttributesResponse setBody(DeleteMSDdcsAttributesResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteMSDdcsAttributesResponseBody getBody() {
        return this.body;
    }

}
