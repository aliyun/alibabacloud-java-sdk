// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.tdsr20200101.models;

import com.aliyun.tea.*;

public class AddHotspotFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddHotspotFileResponseBody body;

    public static AddHotspotFileResponse build(java.util.Map<String, ?> map) throws Exception {
        AddHotspotFileResponse self = new AddHotspotFileResponse();
        return TeaModel.build(map, self);
    }

    public AddHotspotFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddHotspotFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddHotspotFileResponse setBody(AddHotspotFileResponseBody body) {
        this.body = body;
        return this;
    }
    public AddHotspotFileResponseBody getBody() {
        return this.body;
    }

}
