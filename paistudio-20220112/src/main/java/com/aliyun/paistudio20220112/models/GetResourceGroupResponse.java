// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paistudio20220112.models;

import com.aliyun.tea.*;

public class GetResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
