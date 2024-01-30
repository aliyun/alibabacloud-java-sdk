// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ros20190910.models;

import com.aliyun.tea.*;

public class ContinueCreateStackResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ContinueCreateStackResponseBody body;

    public static ContinueCreateStackResponse build(java.util.Map<String, ?> map) throws Exception {
        ContinueCreateStackResponse self = new ContinueCreateStackResponse();
        return TeaModel.build(map, self);
    }

    public ContinueCreateStackResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ContinueCreateStackResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ContinueCreateStackResponse setBody(ContinueCreateStackResponseBody body) {
        this.body = body;
        return this;
    }
    public ContinueCreateStackResponseBody getBody() {
        return this.body;
    }

}
