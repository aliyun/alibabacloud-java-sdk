// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class MoveVpnResourceGroupResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MoveVpnResourceGroupResponseBody body;

    public static MoveVpnResourceGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        MoveVpnResourceGroupResponse self = new MoveVpnResourceGroupResponse();
        return TeaModel.build(map, self);
    }

    public MoveVpnResourceGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MoveVpnResourceGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MoveVpnResourceGroupResponse setBody(MoveVpnResourceGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public MoveVpnResourceGroupResponseBody getBody() {
        return this.body;
    }

}
