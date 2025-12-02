// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sddp20190103.models;

import com.aliyun.tea.*;

public class MaskOssImageResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public MaskOssImageResponseBody body;

    public static MaskOssImageResponse build(java.util.Map<String, ?> map) throws Exception {
        MaskOssImageResponse self = new MaskOssImageResponse();
        return TeaModel.build(map, self);
    }

    public MaskOssImageResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public MaskOssImageResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public MaskOssImageResponse setBody(MaskOssImageResponseBody body) {
        this.body = body;
        return this;
    }
    public MaskOssImageResponseBody getBody() {
        return this.body;
    }

}
