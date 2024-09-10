// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class AddIdcProbeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AddIdcProbeResponseBody body;

    public static AddIdcProbeResponse build(java.util.Map<String, ?> map) throws Exception {
        AddIdcProbeResponse self = new AddIdcProbeResponse();
        return TeaModel.build(map, self);
    }

    public AddIdcProbeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AddIdcProbeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AddIdcProbeResponse setBody(AddIdcProbeResponseBody body) {
        this.body = body;
        return this;
    }
    public AddIdcProbeResponseBody getBody() {
        return this.body;
    }

}
