// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class OfflineClriskModelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public OfflineClriskModelResponseBody body;

    public static OfflineClriskModelResponse build(java.util.Map<String, ?> map) throws Exception {
        OfflineClriskModelResponse self = new OfflineClriskModelResponse();
        return TeaModel.build(map, self);
    }

    public OfflineClriskModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public OfflineClriskModelResponse setBody(OfflineClriskModelResponseBody body) {
        this.body = body;
        return this;
    }
    public OfflineClriskModelResponseBody getBody() {
        return this.body;
    }

}
