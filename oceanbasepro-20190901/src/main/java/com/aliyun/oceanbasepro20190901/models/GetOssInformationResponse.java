// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class GetOssInformationResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOssInformationResponseBody body;

    public static GetOssInformationResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssInformationResponse self = new GetOssInformationResponse();
        return TeaModel.build(map, self);
    }

    public GetOssInformationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssInformationResponse setBody(GetOssInformationResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssInformationResponseBody getBody() {
        return this.body;
    }

}
