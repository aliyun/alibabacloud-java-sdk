// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetLabelGeneratedResultResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetLabelGeneratedResultResponseBody body;

    public static GetLabelGeneratedResultResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLabelGeneratedResultResponse self = new GetLabelGeneratedResultResponse();
        return TeaModel.build(map, self);
    }

    public GetLabelGeneratedResultResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLabelGeneratedResultResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLabelGeneratedResultResponse setBody(GetLabelGeneratedResultResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLabelGeneratedResultResponseBody getBody() {
        return this.body;
    }

}
