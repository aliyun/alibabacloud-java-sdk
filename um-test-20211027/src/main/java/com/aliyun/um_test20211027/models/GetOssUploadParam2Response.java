// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.um_test20211027.models;

import com.aliyun.tea.*;

public class GetOssUploadParam2Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetOssUploadParam2ResponseBody body;

    public static GetOssUploadParam2Response build(java.util.Map<String, ?> map) throws Exception {
        GetOssUploadParam2Response self = new GetOssUploadParam2Response();
        return TeaModel.build(map, self);
    }

    public GetOssUploadParam2Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetOssUploadParam2Response setBody(GetOssUploadParam2ResponseBody body) {
        this.body = body;
        return this;
    }
    public GetOssUploadParam2ResponseBody getBody() {
        return this.body;
    }

}
