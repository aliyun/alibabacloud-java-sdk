// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pai_dsw20210226.models;

import com.aliyun.tea.*;

public class GetUserSpecialVersionGpuResourceInfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetUserSpecialVersionGpuResourceInfoResponseBody body;

    public static GetUserSpecialVersionGpuResourceInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetUserSpecialVersionGpuResourceInfoResponse self = new GetUserSpecialVersionGpuResourceInfoResponse();
        return TeaModel.build(map, self);
    }

    public GetUserSpecialVersionGpuResourceInfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetUserSpecialVersionGpuResourceInfoResponse setBody(GetUserSpecialVersionGpuResourceInfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetUserSpecialVersionGpuResourceInfoResponseBody getBody() {
        return this.body;
    }

}
