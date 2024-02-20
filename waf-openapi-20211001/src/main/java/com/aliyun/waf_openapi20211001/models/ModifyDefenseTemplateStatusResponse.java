// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseTemplateStatusResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDefenseTemplateStatusResponseBody body;

    public static ModifyDefenseTemplateStatusResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseTemplateStatusResponse self = new ModifyDefenseTemplateStatusResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseTemplateStatusResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDefenseTemplateStatusResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDefenseTemplateStatusResponse setBody(ModifyDefenseTemplateStatusResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDefenseTemplateStatusResponseBody getBody() {
        return this.body;
    }

}
