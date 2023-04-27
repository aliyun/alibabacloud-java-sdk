// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UploadDataV4Response extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public UploadDataV4ResponseBody body;

    public static UploadDataV4Response build(java.util.Map<String, ?> map) throws Exception {
        UploadDataV4Response self = new UploadDataV4Response();
        return TeaModel.build(map, self);
    }

    public UploadDataV4Response setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UploadDataV4Response setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UploadDataV4Response setBody(UploadDataV4ResponseBody body) {
        this.body = body;
        return this;
    }
    public UploadDataV4ResponseBody getBody() {
        return this.body;
    }

}
