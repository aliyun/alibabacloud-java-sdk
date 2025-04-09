// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class SaveAnnotationMissionTagInfoListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveAnnotationMissionTagInfoListResponseBody body;

    public static SaveAnnotationMissionTagInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveAnnotationMissionTagInfoListResponse self = new SaveAnnotationMissionTagInfoListResponse();
        return TeaModel.build(map, self);
    }

    public SaveAnnotationMissionTagInfoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveAnnotationMissionTagInfoListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveAnnotationMissionTagInfoListResponse setBody(SaveAnnotationMissionTagInfoListResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveAnnotationMissionTagInfoListResponseBody getBody() {
        return this.body;
    }

}
