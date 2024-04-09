// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetSymUploadParamResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetSymUploadParamResponseBody body;

    public static GetSymUploadParamResponse build(java.util.Map<String, ?> map) throws Exception {
        GetSymUploadParamResponse self = new GetSymUploadParamResponse();
        return TeaModel.build(map, self);
    }

    public GetSymUploadParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetSymUploadParamResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetSymUploadParamResponse setBody(GetSymUploadParamResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSymUploadParamResponseBody getBody() {
        return this.body;
    }

}
