// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyUserClusterHostResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyUserClusterHostResponseBody body;

    public static ModifyUserClusterHostResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserClusterHostResponse self = new ModifyUserClusterHostResponse();
        return TeaModel.build(map, self);
    }

    public ModifyUserClusterHostResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyUserClusterHostResponse setBody(ModifyUserClusterHostResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyUserClusterHostResponseBody getBody() {
        return this.body;
    }

}
