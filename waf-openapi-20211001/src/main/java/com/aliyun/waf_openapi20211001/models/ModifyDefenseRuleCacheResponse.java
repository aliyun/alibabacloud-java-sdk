// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseRuleCacheResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDefenseRuleCacheResponseBody body;

    public static ModifyDefenseRuleCacheResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseRuleCacheResponse self = new ModifyDefenseRuleCacheResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseRuleCacheResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDefenseRuleCacheResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDefenseRuleCacheResponse setBody(ModifyDefenseRuleCacheResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDefenseRuleCacheResponseBody getBody() {
        return this.body;
    }

}
