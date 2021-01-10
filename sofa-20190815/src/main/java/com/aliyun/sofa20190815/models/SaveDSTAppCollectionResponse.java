// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveDSTAppCollectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveDSTAppCollectionResponseBody body;

    public static SaveDSTAppCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveDSTAppCollectionResponse self = new SaveDSTAppCollectionResponse();
        return TeaModel.build(map, self);
    }

    public SaveDSTAppCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveDSTAppCollectionResponse setBody(SaveDSTAppCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveDSTAppCollectionResponseBody getBody() {
        return this.body;
    }

}
