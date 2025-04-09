// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.outboundbot20191226.models;

import com.aliyun.tea.*;

public class ListAnnotationMissionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAnnotationMissionResponseBody body;

    public static ListAnnotationMissionResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAnnotationMissionResponse self = new ListAnnotationMissionResponse();
        return TeaModel.build(map, self);
    }

    public ListAnnotationMissionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAnnotationMissionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAnnotationMissionResponse setBody(ListAnnotationMissionResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAnnotationMissionResponseBody getBody() {
        return this.body;
    }

}
