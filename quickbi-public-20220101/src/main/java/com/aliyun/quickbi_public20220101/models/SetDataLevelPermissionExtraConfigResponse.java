// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class SetDataLevelPermissionExtraConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SetDataLevelPermissionExtraConfigResponseBody body;

    public static SetDataLevelPermissionExtraConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        SetDataLevelPermissionExtraConfigResponse self = new SetDataLevelPermissionExtraConfigResponse();
        return TeaModel.build(map, self);
    }

    public SetDataLevelPermissionExtraConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SetDataLevelPermissionExtraConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SetDataLevelPermissionExtraConfigResponse setBody(SetDataLevelPermissionExtraConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public SetDataLevelPermissionExtraConfigResponseBody getBody() {
        return this.body;
    }

}
