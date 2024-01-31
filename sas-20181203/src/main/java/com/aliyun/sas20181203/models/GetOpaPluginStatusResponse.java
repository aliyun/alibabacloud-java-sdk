// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetOpaPluginStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetOpaPluginStatusResponseBody body;

    public static GetOpaPluginStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOpaPluginStatusResponse self = new GetOpaPluginStatusResponse();
        return TeaModel.build(map, self);
    }

    public GetOpaPluginStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOpaPluginStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetOpaPluginStatusResponse setBody(GetOpaPluginStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOpaPluginStatusResponseBody getBody() {
        return this.body;
    }

}
