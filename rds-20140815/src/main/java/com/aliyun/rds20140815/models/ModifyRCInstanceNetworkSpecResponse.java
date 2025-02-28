// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyRCInstanceNetworkSpecResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyRCInstanceNetworkSpecResponseBody body;

    public static ModifyRCInstanceNetworkSpecResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyRCInstanceNetworkSpecResponse self = new ModifyRCInstanceNetworkSpecResponse();
        return TeaModel.build(map, self);
    }

    public ModifyRCInstanceNetworkSpecResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyRCInstanceNetworkSpecResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyRCInstanceNetworkSpecResponse setBody(ModifyRCInstanceNetworkSpecResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyRCInstanceNetworkSpecResponseBody getBody() {
        return this.body;
    }

}
