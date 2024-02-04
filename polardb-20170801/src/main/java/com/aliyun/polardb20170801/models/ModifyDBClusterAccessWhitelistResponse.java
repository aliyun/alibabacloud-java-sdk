// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAccessWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDBClusterAccessWhitelistResponseBody body;

    public static ModifyDBClusterAccessWhitelistResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDBClusterAccessWhitelistResponse self = new ModifyDBClusterAccessWhitelistResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDBClusterAccessWhitelistResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDBClusterAccessWhitelistResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDBClusterAccessWhitelistResponse setBody(ModifyDBClusterAccessWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterAccessWhitelistResponseBody getBody() {
        return this.body;
    }

}
