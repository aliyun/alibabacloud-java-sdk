// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class SwitchActiveStandbyZonesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchActiveStandbyZonesResponseBody body;

    public static SwitchActiveStandbyZonesResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchActiveStandbyZonesResponse self = new SwitchActiveStandbyZonesResponse();
        return TeaModel.build(map, self);
    }

    public SwitchActiveStandbyZonesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchActiveStandbyZonesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchActiveStandbyZonesResponse setBody(SwitchActiveStandbyZonesResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchActiveStandbyZonesResponseBody getBody() {
        return this.body;
    }

}
