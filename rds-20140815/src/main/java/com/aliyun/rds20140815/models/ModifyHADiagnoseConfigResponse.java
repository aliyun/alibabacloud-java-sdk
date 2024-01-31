// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class ModifyHADiagnoseConfigResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyHADiagnoseConfigResponseBody body;

    public static ModifyHADiagnoseConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyHADiagnoseConfigResponse self = new ModifyHADiagnoseConfigResponse();
        return TeaModel.build(map, self);
    }

    public ModifyHADiagnoseConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyHADiagnoseConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyHADiagnoseConfigResponse setBody(ModifyHADiagnoseConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyHADiagnoseConfigResponseBody getBody() {
        return this.body;
    }

}
