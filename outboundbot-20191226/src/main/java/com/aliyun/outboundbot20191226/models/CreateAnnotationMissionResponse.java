// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class CreateAnnotationMissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public CreateAnnotationMissionResponseBody body;

    public static CreateAnnotationMissionResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateAnnotationMissionResponse self = new CreateAnnotationMissionResponse();
        return TeaModel.build(map, self);
    }

    public CreateAnnotationMissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CreateAnnotationMissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CreateAnnotationMissionResponse setBody(CreateAnnotationMissionResponseBody body) {
        this.body = body;
        return this;
    }
    public CreateAnnotationMissionResponseBody getBody() {
        return this.body;
    }

}
