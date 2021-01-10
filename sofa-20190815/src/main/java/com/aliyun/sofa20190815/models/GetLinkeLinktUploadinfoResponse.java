// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeLinktUploadinfoResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public GetLinkeLinktUploadinfoResponseBody body;

    public static GetLinkeLinktUploadinfoResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeLinktUploadinfoResponse self = new GetLinkeLinktUploadinfoResponse();
        return TeaModel.build(map, self);
    }

    public GetLinkeLinktUploadinfoResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLinkeLinktUploadinfoResponse setBody(GetLinkeLinktUploadinfoResponseBody body) {
        this.body = body;
        return this;
    }
    public GetLinkeLinktUploadinfoResponseBody getBody() {
        return this.body;
    }

}
