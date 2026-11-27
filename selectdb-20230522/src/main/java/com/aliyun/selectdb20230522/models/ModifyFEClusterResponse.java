// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.selectdb20230522.models;

import com.aliyun.tea.*;

public class ModifyFEClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyFEClusterResponseBody body;

    public static ModifyFEClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyFEClusterResponse self = new ModifyFEClusterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyFEClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyFEClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyFEClusterResponse setBody(ModifyFEClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyFEClusterResponseBody getBody() {
        return this.body;
    }

}
