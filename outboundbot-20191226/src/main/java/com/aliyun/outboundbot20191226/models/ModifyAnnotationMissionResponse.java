// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ModifyAnnotationMissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ModifyAnnotationMissionResponseBody body;

    public static ModifyAnnotationMissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifyAnnotationMissionResponse self = new ModifyAnnotationMissionResponse();
        return TeaModel.build(map, self);
    }

    public ModifyAnnotationMissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ModifyAnnotationMissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ModifyAnnotationMissionResponse setBody(ModifyAnnotationMissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ModifyAnnotationMissionResponseBody getBody() {
        return this.body;
    }

}
