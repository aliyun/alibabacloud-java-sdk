// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.um_test20211027.models;

import com.aliyun.tea.*;

public class GetOssUploadParamResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOssUploadParamResponseBody body;

    public static GetOssUploadParamResponse build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadParamResponse self = new GetOssUploadParamResponse();
        return TeaModel.build(map, self);
    }

    public GetOssUploadParamResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssUploadParamResponse setBody(GetOssUploadParamResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssUploadParamResponseBody getBody() {
        return this.body;
    }

}
