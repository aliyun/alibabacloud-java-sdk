// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class SaveDSTTraceCollectionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public SaveDSTTraceCollectionResponseBody body;

    public static SaveDSTTraceCollectionResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveDSTTraceCollectionResponse self = new SaveDSTTraceCollectionResponse();
        return TeaModel.build(map, self);
    }

    public SaveDSTTraceCollectionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveDSTTraceCollectionResponse setBody(SaveDSTTraceCollectionResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveDSTTraceCollectionResponseBody getBody() {
        return this.body;
    }

}
