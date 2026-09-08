// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20260120.models;

import com.aliyun.tea.*;

public class GetDataMaskingAccountCountResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetDataMaskingAccountCountResponseBody body;

    public static GetDataMaskingAccountCountResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDataMaskingAccountCountResponse self = new GetDataMaskingAccountCountResponse();
        return TeaModel.build(map, self);
    }

    public GetDataMaskingAccountCountResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetDataMaskingAccountCountResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetDataMaskingAccountCountResponse setBody(GetDataMaskingAccountCountResponseBody body) {
        this.body = body;
        return this;
    }
    public GetDataMaskingAccountCountResponseBody getBody() {
        return this.body;
    }

}
