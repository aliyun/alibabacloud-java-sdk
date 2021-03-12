// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailbot20210224.models;

import com.aliyun.tea.*;

public class GetPackageVersionResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetPackageVersionResponseBody body;

    public static GetPackageVersionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPackageVersionResponse self = new GetPackageVersionResponse();
        return TeaModel.build(map, self);
    }

    public GetPackageVersionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPackageVersionResponse setBody(GetPackageVersionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPackageVersionResponseBody getBody() {
        return this.body;
    }

}
