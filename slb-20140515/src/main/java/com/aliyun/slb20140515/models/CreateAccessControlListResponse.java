// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.slb20140515.models;

import com.aliyun.tea.*;

public class CreateAccessControlListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAccessControlListResponseBody body;

    public static CreateAccessControlListResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAccessControlListResponse self = new CreateAccessControlListResponse();
        return TeaModel.build(map, self);
    }

    public CreateAccessControlListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAccessControlListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAccessControlListResponse setBody(CreateAccessControlListResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAccessControlListResponseBody getBody() {
        return this.body;
    }

}
