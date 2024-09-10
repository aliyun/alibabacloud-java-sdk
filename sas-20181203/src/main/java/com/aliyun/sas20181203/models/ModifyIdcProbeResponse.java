// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyIdcProbeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyIdcProbeResponseBody body;

    public static ModifyIdcProbeResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyIdcProbeResponse self = new ModifyIdcProbeResponse();
        return TeaModel.build(map, self);
    }

    public ModifyIdcProbeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyIdcProbeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyIdcProbeResponse setBody(ModifyIdcProbeResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyIdcProbeResponseBody getBody() {
        return this.body;
    }

}
