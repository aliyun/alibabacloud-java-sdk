// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetBizTypeConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBizTypeConfigResponseBody body;

    public static GetBizTypeConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBizTypeConfigResponse self = new GetBizTypeConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetBizTypeConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBizTypeConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBizTypeConfigResponse setBody(GetBizTypeConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBizTypeConfigResponseBody getBody() {
        return this.body;
    }

}
