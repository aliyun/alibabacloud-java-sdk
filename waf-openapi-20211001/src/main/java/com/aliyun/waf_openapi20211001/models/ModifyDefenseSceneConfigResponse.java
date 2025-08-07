// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseSceneConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDefenseSceneConfigResponseBody body;

    public static ModifyDefenseSceneConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseSceneConfigResponse self = new ModifyDefenseSceneConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseSceneConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDefenseSceneConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDefenseSceneConfigResponse setBody(ModifyDefenseSceneConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDefenseSceneConfigResponseBody getBody() {
        return this.body;
    }

}
