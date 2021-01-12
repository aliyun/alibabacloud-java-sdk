// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyHASwitchConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyHASwitchConfigResponseBody body;

    public static ModifyHASwitchConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHASwitchConfigResponse self = new ModifyHASwitchConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHASwitchConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHASwitchConfigResponse setBody(ModifyHASwitchConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHASwitchConfigResponseBody getBody() {
        return this.body;
    }

}
