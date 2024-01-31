// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyAssetGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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

    public ModifyAssetGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAssetGroupResponse setBody(ModifyAssetGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAssetGroupResponseBody getBody() {
        return this.body;
    }

}
