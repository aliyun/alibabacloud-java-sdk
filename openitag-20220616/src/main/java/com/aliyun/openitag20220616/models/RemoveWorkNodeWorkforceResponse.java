// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.openitag20220616.models;

import com.aliyun.tea.*;

public class RemoveWorkNodeWorkforceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveWorkNodeWorkforceResponseBody body;

    public static RemoveWorkNodeWorkforceResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveWorkNodeWorkforceResponse self = new RemoveWorkNodeWorkforceResponse();
        return TeaModel.build(map, self);
    }

    public RemoveWorkNodeWorkforceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveWorkNodeWorkforceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveWorkNodeWorkforceResponse setBody(RemoveWorkNodeWorkforceResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveWorkNodeWorkforceResponseBody getBody() {
        return this.body;
    }

}
