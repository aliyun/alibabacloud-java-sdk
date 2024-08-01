// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pvtz20180101.models;

import com.aliyun.tea.*;

public class ChangeZoneDnsGroupResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ChangeZoneDnsGroupResponseBody body;

    public static ChangeZoneDnsGroupResponse build(java.util.Map<String, ?> map) throws Exception {
        ChangeZoneDnsGroupResponse self = new ChangeZoneDnsGroupResponse();
        return TeaModel.build(map, self);
    }

    public ChangeZoneDnsGroupResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ChangeZoneDnsGroupResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ChangeZoneDnsGroupResponse setBody(ChangeZoneDnsGroupResponseBody body) {
        this.body = body;
        return this;
    }
    public ChangeZoneDnsGroupResponseBody getBody() {
        return this.body;
    }

}
