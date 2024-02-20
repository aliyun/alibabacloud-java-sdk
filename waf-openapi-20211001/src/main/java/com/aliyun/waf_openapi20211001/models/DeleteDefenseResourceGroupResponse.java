// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.waf_openapi20211001.models;

import com.aliyun.tea.*;

public class DeleteDefenseResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DeleteDefenseResourceGroupResponseBody body;

    public static DeleteDefenseResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteDefenseResourceGroupResponse self = new DeleteDefenseResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public DeleteDefenseResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteDefenseResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DeleteDefenseResourceGroupResponse setBody(DeleteDefenseResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteDefenseResourceGroupResponseBody getBody() {
        return this.body;
    }

}
