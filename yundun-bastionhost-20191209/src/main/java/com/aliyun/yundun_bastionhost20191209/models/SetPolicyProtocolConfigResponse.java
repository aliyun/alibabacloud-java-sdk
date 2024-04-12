// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_bastionhost20191209.models;

import com.aliyun.tea.*;

public class SetPolicyProtocolConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetPolicyProtocolConfigResponseBody body;

    public static SetPolicyProtocolConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetPolicyProtocolConfigResponse self = new SetPolicyProtocolConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetPolicyProtocolConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetPolicyProtocolConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetPolicyProtocolConfigResponse setBody(SetPolicyProtocolConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetPolicyProtocolConfigResponseBody getBody() {
        return this.body;
    }

}
