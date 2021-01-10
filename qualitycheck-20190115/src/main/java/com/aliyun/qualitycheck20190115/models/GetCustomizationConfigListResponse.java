// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetCustomizationConfigListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetCustomizationConfigListResponseBody body;

    public static GetCustomizationConfigListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetCustomizationConfigListResponse self = new GetCustomizationConfigListResponse();
        return TeaModel.build(map, self);
    }

    public GetCustomizationConfigListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetCustomizationConfigListResponse setBody(GetCustomizationConfigListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetCustomizationConfigListResponseBody getBody() {
        return this.body;
    }

}
