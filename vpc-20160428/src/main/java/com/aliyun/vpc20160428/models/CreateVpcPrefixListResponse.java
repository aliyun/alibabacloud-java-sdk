// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateVpcPrefixListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateVpcPrefixListResponseBody body;

    public static CreateVpcPrefixListResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateVpcPrefixListResponse self = new CreateVpcPrefixListResponse();
        return TeaModel.build(map, self);
    }

    public CreateVpcPrefixListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateVpcPrefixListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateVpcPrefixListResponse setBody(CreateVpcPrefixListResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateVpcPrefixListResponseBody getBody() {
        return this.body;
    }

}
