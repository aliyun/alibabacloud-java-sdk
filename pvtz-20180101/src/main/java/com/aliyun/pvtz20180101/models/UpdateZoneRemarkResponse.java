// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class UpdateZoneRemarkResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public UpdateZoneRemarkResponseBody body;

    public static UpdateZoneRemarkResponse build(java.util.Map<String, ?> map) throws Exception {
        UpdateZoneRemarkResponse self = new UpdateZoneRemarkResponse();
        return TeaModel.build(map, self);
    }

    public UpdateZoneRemarkResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public UpdateZoneRemarkResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public UpdateZoneRemarkResponse setBody(UpdateZoneRemarkResponseBody body) {
        this.body = body;
        return this;
    }
    public UpdateZoneRemarkResponseBody getBody() {
        return this.body;
    }

}
