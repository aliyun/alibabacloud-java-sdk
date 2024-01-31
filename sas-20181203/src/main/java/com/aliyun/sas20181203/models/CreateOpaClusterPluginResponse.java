// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateOpaClusterPluginResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateOpaClusterPluginResponseBody body;

    public static CreateOpaClusterPluginResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateOpaClusterPluginResponse self = new CreateOpaClusterPluginResponse();
        return TeaModel.build(map, self);
    }

    public CreateOpaClusterPluginResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateOpaClusterPluginResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateOpaClusterPluginResponse setBody(CreateOpaClusterPluginResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateOpaClusterPluginResponseBody getBody() {
        return this.body;
    }

}
