// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class SwitchGuardToMasterInstanceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SwitchGuardToMasterInstanceResponseBody body;

    public static SwitchGuardToMasterInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        SwitchGuardToMasterInstanceResponse self = new SwitchGuardToMasterInstanceResponse();
        return TeaModel.build(map, self);
    }

    public SwitchGuardToMasterInstanceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SwitchGuardToMasterInstanceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SwitchGuardToMasterInstanceResponse setBody(SwitchGuardToMasterInstanceResponseBody body) {
        this.body = body;
        return this;
    }
    public SwitchGuardToMasterInstanceResponseBody getBody() {
        return this.body;
    }

}
