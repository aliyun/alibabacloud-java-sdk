// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class ModifyDefaultLevelResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyDefaultLevelResponseBody body;

    public static ModifyDefaultLevelResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefaultLevelResponse self = new ModifyDefaultLevelResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDefaultLevelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDefaultLevelResponse setBody(ModifyDefaultLevelResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDefaultLevelResponseBody getBody() {
        return this.body;
    }

}
