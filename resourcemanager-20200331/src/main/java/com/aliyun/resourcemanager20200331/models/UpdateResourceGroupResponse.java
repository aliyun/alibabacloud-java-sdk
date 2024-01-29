// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class UpdateResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateResourceGroupResponseBody body;

    public static UpdateResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateResourceGroupResponse self = new UpdateResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public UpdateResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateResourceGroupResponse setBody(UpdateResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateResourceGroupResponseBody getBody() {
        return this.body;
    }

}
