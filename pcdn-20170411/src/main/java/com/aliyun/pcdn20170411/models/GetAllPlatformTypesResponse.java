// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pcdn20170411.models;

import com.aliyun.tea.*;

public class GetAllPlatformTypesResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetAllPlatformTypesResponseBody body;

    public static GetAllPlatformTypesResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAllPlatformTypesResponse self = new GetAllPlatformTypesResponse();
        return TeaModel.build(map, self);
    }

    public GetAllPlatformTypesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAllPlatformTypesResponse setBody(GetAllPlatformTypesResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAllPlatformTypesResponseBody getBody() {
        return this.body;
    }

}
