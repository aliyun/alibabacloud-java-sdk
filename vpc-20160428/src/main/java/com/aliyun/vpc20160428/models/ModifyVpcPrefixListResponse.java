// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifyVpcPrefixListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyVpcPrefixListResponseBody body;

    public static ModifyVpcPrefixListResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyVpcPrefixListResponse self = new ModifyVpcPrefixListResponse();
        return TeaModel.build(map, self);
    }

    public ModifyVpcPrefixListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyVpcPrefixListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyVpcPrefixListResponse setBody(ModifyVpcPrefixListResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyVpcPrefixListResponseBody getBody() {
        return this.body;
    }

}
