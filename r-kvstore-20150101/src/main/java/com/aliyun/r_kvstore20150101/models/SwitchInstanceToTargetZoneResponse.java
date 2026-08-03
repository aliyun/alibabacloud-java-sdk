// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class SwitchInstanceToTargetZoneResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchInstanceToTargetZoneResponseBody body;

    public static SwitchInstanceToTargetZoneResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchInstanceToTargetZoneResponse self = new SwitchInstanceToTargetZoneResponse();
        return TeaModel.build(map, self);
    }

    public SwitchInstanceToTargetZoneResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchInstanceToTargetZoneResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchInstanceToTargetZoneResponse setBody(SwitchInstanceToTargetZoneResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchInstanceToTargetZoneResponseBody getBody() {
        return this.body;
    }

}
