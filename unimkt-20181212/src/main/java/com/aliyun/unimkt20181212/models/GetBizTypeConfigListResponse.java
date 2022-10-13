// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.unimkt20181212.models;

import com.aliyun.tea.*;

public class GetBizTypeConfigListResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public GetBizTypeConfigListResponseBody body;

    public static GetBizTypeConfigListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetBizTypeConfigListResponse self = new GetBizTypeConfigListResponse();
        return TeaModel.build(map, self);
    }

    public GetBizTypeConfigListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetBizTypeConfigListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetBizTypeConfigListResponse setBody(GetBizTypeConfigListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetBizTypeConfigListResponseBody getBody() {
        return this.body;
    }

}
