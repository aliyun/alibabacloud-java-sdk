// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class GetMediaResourcePackageResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetMediaResourcePackageResponseBody body;

    public static GetMediaResourcePackageResponse build(java.util.Map<String, ?> map) throws Exception {
        GetMediaResourcePackageResponse self = new GetMediaResourcePackageResponse();
        return TeaModel.build(map, self);
    }

    public GetMediaResourcePackageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetMediaResourcePackageResponse setBody(GetMediaResourcePackageResponseBody body) {
        this.body = body;
        return this;
    }
    public GetMediaResourcePackageResponseBody getBody() {
        return this.body;
    }

}
