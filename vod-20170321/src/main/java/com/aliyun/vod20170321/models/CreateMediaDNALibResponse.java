// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class CreateMediaDNALibResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateMediaDNALibResponseBody body;

    public static CreateMediaDNALibResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateMediaDNALibResponse self = new CreateMediaDNALibResponse();
        return TeaModel.build(map, self);
    }

    public CreateMediaDNALibResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateMediaDNALibResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateMediaDNALibResponse setBody(CreateMediaDNALibResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateMediaDNALibResponseBody getBody() {
        return this.body;
    }

}
