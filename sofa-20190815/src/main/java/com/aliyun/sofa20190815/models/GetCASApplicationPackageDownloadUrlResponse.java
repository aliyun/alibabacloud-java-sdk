// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetCASApplicationPackageDownloadUrlResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCASApplicationPackageDownloadUrlResponseBody body;

    public static GetCASApplicationPackageDownloadUrlResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCASApplicationPackageDownloadUrlResponse self = new GetCASApplicationPackageDownloadUrlResponse();
        return TeaModel.build(map, self);
    }

    public GetCASApplicationPackageDownloadUrlResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCASApplicationPackageDownloadUrlResponse setBody(GetCASApplicationPackageDownloadUrlResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCASApplicationPackageDownloadUrlResponseBody getBody() {
        return this.body;
    }

}
