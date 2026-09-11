// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.winnexo20260512.models;

import com.aliyun.tea.*;

public class GetAliDingMinutesContentResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAliDingMinutesContentResponseBody body;

    public static GetAliDingMinutesContentResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAliDingMinutesContentResponse self = new GetAliDingMinutesContentResponse();
        return TeaModel.build(map, self);
    }

    public GetAliDingMinutesContentResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAliDingMinutesContentResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAliDingMinutesContentResponse setBody(GetAliDingMinutesContentResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAliDingMinutesContentResponseBody getBody() {
        return this.body;
    }

}
