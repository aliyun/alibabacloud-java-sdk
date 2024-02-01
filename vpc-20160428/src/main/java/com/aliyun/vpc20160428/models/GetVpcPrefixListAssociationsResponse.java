// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpcPrefixListAssociationsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVpcPrefixListAssociationsResponseBody body;

    public static GetVpcPrefixListAssociationsResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVpcPrefixListAssociationsResponse self = new GetVpcPrefixListAssociationsResponse();
        return TeaModel.build(map, self);
    }

    public GetVpcPrefixListAssociationsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVpcPrefixListAssociationsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVpcPrefixListAssociationsResponse setBody(GetVpcPrefixListAssociationsResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVpcPrefixListAssociationsResponseBody getBody() {
        return this.body;
    }

}
