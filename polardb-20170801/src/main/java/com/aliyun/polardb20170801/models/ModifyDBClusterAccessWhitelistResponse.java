// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class ModifyDBClusterAccessWhitelistResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public ModifyDBClusterAccessWhitelistResponse setBody(ModifyDBClusterAccessWhitelistResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDBClusterAccessWhitelistResponseBody getBody() {
        return this.body;
    }

}
