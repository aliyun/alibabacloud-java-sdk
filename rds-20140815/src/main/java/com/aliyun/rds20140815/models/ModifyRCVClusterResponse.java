// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCVClusterResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRCVClusterResponseBody body;

    public static ModifyRCVClusterResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCVClusterResponse self = new ModifyRCVClusterResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRCVClusterResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRCVClusterResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRCVClusterResponse setBody(ModifyRCVClusterResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRCVClusterResponseBody getBody() {
        return this.body;
    }

}
