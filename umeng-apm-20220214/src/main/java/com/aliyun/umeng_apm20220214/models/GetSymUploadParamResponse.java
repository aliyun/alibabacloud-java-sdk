// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.umeng_apm20220214.models;

import com.aliyun.tea.*;

public class GetSymUploadParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
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

    public GetSymUploadParamResponse setBody(GetSymUploadParamResponseBody body) {
        this.body = body;
        return this;
    }
    public GetSymUploadParamResponseBody getBody() {
        return this.body;
    }

}
