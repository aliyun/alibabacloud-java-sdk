// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoFaceRecogJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAIVideoFaceRecogJobResponseBody body;

    public static ListAIVideoFaceRecogJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoFaceRecogJobResponse self = new ListAIVideoFaceRecogJobResponse();
        return TeaModel.build(map, self);
    }

    public ListAIVideoFaceRecogJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAIVideoFaceRecogJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAIVideoFaceRecogJobResponse setBody(ListAIVideoFaceRecogJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAIVideoFaceRecogJobResponseBody getBody() {
        return this.body;
    }

}
