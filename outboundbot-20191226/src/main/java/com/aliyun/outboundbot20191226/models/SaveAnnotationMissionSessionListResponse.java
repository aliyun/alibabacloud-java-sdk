// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveAnnotationMissionSessionListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveAnnotationMissionSessionListResponseBody body;

    public static SaveAnnotationMissionSessionListResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveAnnotationMissionSessionListResponse self = new SaveAnnotationMissionSessionListResponse();
        return TeaModel.build(map, self);
    }

    public SaveAnnotationMissionSessionListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveAnnotationMissionSessionListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveAnnotationMissionSessionListResponse setBody(SaveAnnotationMissionSessionListResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveAnnotationMissionSessionListResponseBody getBody() {
        return this.body;
    }

}
