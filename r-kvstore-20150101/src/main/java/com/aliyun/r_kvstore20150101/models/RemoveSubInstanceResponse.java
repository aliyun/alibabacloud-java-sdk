// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class RemoveSubInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RemoveSubInstanceResponseBody body;

    public static RemoveSubInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        RemoveSubInstanceResponse self = new RemoveSubInstanceResponse();
        return TeaModel.build(map, self);
    }

    public RemoveSubInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RemoveSubInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RemoveSubInstanceResponse setBody(RemoveSubInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public RemoveSubInstanceResponseBody getBody() {
        return this.body;
    }

}
