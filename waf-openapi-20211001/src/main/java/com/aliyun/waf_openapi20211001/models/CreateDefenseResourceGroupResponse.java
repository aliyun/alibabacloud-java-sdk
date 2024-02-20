// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class CreateDefenseResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateDefenseResourceGroupResponseBody body;

    public static CreateDefenseResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateDefenseResourceGroupResponse self = new CreateDefenseResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public CreateDefenseResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateDefenseResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateDefenseResourceGroupResponse setBody(CreateDefenseResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateDefenseResourceGroupResponseBody getBody() {
        return this.body;
    }

}
