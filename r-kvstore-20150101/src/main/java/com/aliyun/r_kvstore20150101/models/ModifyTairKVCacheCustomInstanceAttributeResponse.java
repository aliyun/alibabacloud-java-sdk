// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class ModifyTairKVCacheCustomInstanceAttributeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyTairKVCacheCustomInstanceAttributeResponseBody body;

    public static ModifyTairKVCacheCustomInstanceAttributeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyTairKVCacheCustomInstanceAttributeResponse self = new ModifyTairKVCacheCustomInstanceAttributeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyTairKVCacheCustomInstanceAttributeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyTairKVCacheCustomInstanceAttributeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyTairKVCacheCustomInstanceAttributeResponse setBody(ModifyTairKVCacheCustomInstanceAttributeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyTairKVCacheCustomInstanceAttributeResponseBody getBody() {
        return this.body;
    }

}
