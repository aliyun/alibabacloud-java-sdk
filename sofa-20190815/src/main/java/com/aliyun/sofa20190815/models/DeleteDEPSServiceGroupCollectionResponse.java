// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteDEPSServiceGroupCollectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteDEPSServiceGroupCollectionResponseBody body;

    public static DeleteDEPSServiceGroupCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDEPSServiceGroupCollectionResponse self = new DeleteDEPSServiceGroupCollectionResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDEPSServiceGroupCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDEPSServiceGroupCollectionResponse setBody(DeleteDEPSServiceGroupCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDEPSServiceGroupCollectionResponseBody getBody() {
        return this.body;
    }

}
