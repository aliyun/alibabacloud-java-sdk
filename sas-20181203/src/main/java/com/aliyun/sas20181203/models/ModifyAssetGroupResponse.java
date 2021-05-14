// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAssetGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public ModifyAssetGroupResponseBody body;

    public static ModifyAssetGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAssetGroupResponse self = new ModifyAssetGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAssetGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAssetGroupResponse setBody(ModifyAssetGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAssetGroupResponseBody getBody() {
        return this.body;
    }

}
