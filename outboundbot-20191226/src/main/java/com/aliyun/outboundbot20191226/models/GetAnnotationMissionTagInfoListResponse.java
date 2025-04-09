// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class GetAnnotationMissionTagInfoListResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetAnnotationMissionTagInfoListResponseBody body;

    public static GetAnnotationMissionTagInfoListResponse build(java.util.Map<String, ?> map) throws Exception {
        GetAnnotationMissionTagInfoListResponse self = new GetAnnotationMissionTagInfoListResponse();
        return TeaModel.build(map, self);
    }

    public GetAnnotationMissionTagInfoListResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetAnnotationMissionTagInfoListResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetAnnotationMissionTagInfoListResponse setBody(GetAnnotationMissionTagInfoListResponseBody body) {
        this.body = body;
        return this;
    }
    public GetAnnotationMissionTagInfoListResponseBody getBody() {
        return this.body;
    }

}
