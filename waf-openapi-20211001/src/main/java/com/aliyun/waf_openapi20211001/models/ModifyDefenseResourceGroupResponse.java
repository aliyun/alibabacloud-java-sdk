// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class ModifyDefenseResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyDefenseResourceGroupResponseBody body;

    public static ModifyDefenseResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyDefenseResourceGroupResponse self = new ModifyDefenseResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public ModifyDefenseResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyDefenseResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyDefenseResourceGroupResponse setBody(ModifyDefenseResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyDefenseResourceGroupResponseBody getBody() {
        return this.body;
    }

}
