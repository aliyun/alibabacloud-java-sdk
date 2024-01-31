// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyHASwitchConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHASwitchConfigResponseBody body;

    public static ModifyHASwitchConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHASwitchConfigResponse self = new ModifyHASwitchConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHASwitchConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHASwitchConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHASwitchConfigResponse setBody(ModifyHASwitchConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHASwitchConfigResponseBody getBody() {
        return this.body;
    }

}
