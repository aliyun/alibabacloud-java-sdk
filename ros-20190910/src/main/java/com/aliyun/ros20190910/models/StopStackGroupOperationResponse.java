// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class StopStackGroupOperationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public StopStackGroupOperationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public StopStackGroupOperationResponse setBody(StopStackGroupOperationResponseBody body) {
        this.body = body;
        return this;
    }
    public StopStackGroupOperationResponseBody getBody() {
        return this.body;
    }

}
