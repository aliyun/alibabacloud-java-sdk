// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class ModifyPilotEipResourceResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyPilotEipResourceResponseBody body;

    public static ModifyPilotEipResourceResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyPilotEipResourceResponse self = new ModifyPilotEipResourceResponse();
        return TeaModel.build(map, self);
    }

    public ModifyPilotEipResourceResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyPilotEipResourceResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyPilotEipResourceResponse setBody(ModifyPilotEipResourceResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyPilotEipResourceResponseBody getBody() {
        return this.body;
    }

}
