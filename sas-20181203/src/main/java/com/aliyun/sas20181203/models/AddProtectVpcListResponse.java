// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddProtectVpcListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddProtectVpcListResponseBody body;

    public static AddProtectVpcListResponse build(java.util.Map<String, ?> map) throws Exception {
        AddProtectVpcListResponse self = new AddProtectVpcListResponse();
        return TeaModel.build(map, self);
    }

    public AddProtectVpcListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddProtectVpcListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddProtectVpcListResponse setBody(AddProtectVpcListResponseBody body) {
        this.body = body;
        return this;
    }
    public AddProtectVpcListResponseBody getBody() {
        return this.body;
    }

}
