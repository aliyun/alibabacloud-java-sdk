// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class SwitchInstanceProxyResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchInstanceProxyResponseBody body;

    public static SwitchInstanceProxyResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchInstanceProxyResponse self = new SwitchInstanceProxyResponse();
        return TeaModel.build(map, self);
    }

    public SwitchInstanceProxyResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchInstanceProxyResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchInstanceProxyResponse setBody(SwitchInstanceProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchInstanceProxyResponseBody getBody() {
        return this.body;
    }

}
