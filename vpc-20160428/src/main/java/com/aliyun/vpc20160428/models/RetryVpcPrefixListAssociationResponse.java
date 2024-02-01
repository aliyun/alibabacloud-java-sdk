// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class RetryVpcPrefixListAssociationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public RetryVpcPrefixListAssociationResponseBody body;

    public static RetryVpcPrefixListAssociationResponse build(java.util.Map<String, ?> map) throws Exception {
        RetryVpcPrefixListAssociationResponse self = new RetryVpcPrefixListAssociationResponse();
        return TeaModel.build(map, self);
    }

    public RetryVpcPrefixListAssociationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public RetryVpcPrefixListAssociationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public RetryVpcPrefixListAssociationResponse setBody(RetryVpcPrefixListAssociationResponseBody body) {
        this.body = body;
        return this;
    }
    public RetryVpcPrefixListAssociationResponseBody getBody() {
        return this.body;
    }

}
