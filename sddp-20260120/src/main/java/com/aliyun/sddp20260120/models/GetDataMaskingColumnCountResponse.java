// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class GetDataMaskingColumnCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataMaskingColumnCountResponseBody body;

    public static GetDataMaskingColumnCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataMaskingColumnCountResponse self = new GetDataMaskingColumnCountResponse();
        return TeaModel.build(map, self);
    }

    public GetDataMaskingColumnCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataMaskingColumnCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataMaskingColumnCountResponse setBody(GetDataMaskingColumnCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataMaskingColumnCountResponseBody getBody() {
        return this.body;
    }

}
