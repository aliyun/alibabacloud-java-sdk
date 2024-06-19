// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class AlignStoragePrimaryAzoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AlignStoragePrimaryAzoneResponseBody body;

    public static AlignStoragePrimaryAzoneResponse build(java.util.Map<String, ?> map) throws Exception {
        AlignStoragePrimaryAzoneResponse self = new AlignStoragePrimaryAzoneResponse();
        return TeaModel.build(map, self);
    }

    public AlignStoragePrimaryAzoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AlignStoragePrimaryAzoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AlignStoragePrimaryAzoneResponse setBody(AlignStoragePrimaryAzoneResponseBody body) {
        this.body = body;
        return this;
    }
    public AlignStoragePrimaryAzoneResponseBody getBody() {
        return this.body;
    }

}
