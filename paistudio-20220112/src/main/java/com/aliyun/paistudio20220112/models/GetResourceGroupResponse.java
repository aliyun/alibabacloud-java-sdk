// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetResourceGroupResponseBody body;

    public static GetResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        GetResourceGroupResponse self = new GetResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public GetResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetResourceGroupResponse setBody(GetResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public GetResourceGroupResponseBody getBody() {
        return this.body;
    }

}
