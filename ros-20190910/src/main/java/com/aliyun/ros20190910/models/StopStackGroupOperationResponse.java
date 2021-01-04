// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class StopStackGroupOperationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public StopStackGroupOperationResponseBody body;

    public static StopStackGroupOperationResponse build(java.util.Map<String, ?> map) throws Exception {
        StopStackGroupOperationResponse self = new StopStackGroupOperationResponse();
        return TeaModel.build(map, self);
    }

    public StopStackGroupOperationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public StopStackGroupOperationResponse setBody(StopStackGroupOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public StopStackGroupOperationResponseBody getBody() {
        return this.body;
    }

}
