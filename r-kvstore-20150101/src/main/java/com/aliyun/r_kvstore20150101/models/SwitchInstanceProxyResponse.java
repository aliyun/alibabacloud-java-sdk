// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class SwitchInstanceProxyResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public SwitchInstanceProxyResponse setBody(SwitchInstanceProxyResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchInstanceProxyResponseBody getBody() {
        return this.body;
    }

}
