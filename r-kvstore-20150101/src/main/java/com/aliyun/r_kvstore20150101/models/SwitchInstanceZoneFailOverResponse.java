// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.r_kvstore20150101.models;

import com.aliyun.tea.*;

public class SwitchInstanceZoneFailOverResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchInstanceZoneFailOverResponseBody body;

    public static SwitchInstanceZoneFailOverResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchInstanceZoneFailOverResponse self = new SwitchInstanceZoneFailOverResponse();
        return TeaModel.build(map, self);
    }

    public SwitchInstanceZoneFailOverResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchInstanceZoneFailOverResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchInstanceZoneFailOverResponse setBody(SwitchInstanceZoneFailOverResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchInstanceZoneFailOverResponseBody getBody() {
        return this.body;
    }

}
