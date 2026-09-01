// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpcCidrBlockResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVpcCidrBlockResponseBody body;

    public static ModifyVpcCidrBlockResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcCidrBlockResponse self = new ModifyVpcCidrBlockResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpcCidrBlockResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpcCidrBlockResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVpcCidrBlockResponse setBody(ModifyVpcCidrBlockResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpcCidrBlockResponseBody getBody() {
        return this.body;
    }

}
