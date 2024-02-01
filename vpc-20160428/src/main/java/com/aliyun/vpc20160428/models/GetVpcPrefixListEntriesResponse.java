// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class GetVpcPrefixListEntriesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetVpcPrefixListEntriesResponseBody body;

    public static GetVpcPrefixListEntriesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetVpcPrefixListEntriesResponse self = new GetVpcPrefixListEntriesResponse();
        return TeaModel.build(map, self);
    }

    public GetVpcPrefixListEntriesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetVpcPrefixListEntriesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetVpcPrefixListEntriesResponse setBody(GetVpcPrefixListEntriesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetVpcPrefixListEntriesResponseBody getBody() {
        return this.body;
    }

}
