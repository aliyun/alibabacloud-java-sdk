// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIVideoTerrorismRecogJobResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAIVideoTerrorismRecogJobResponseBody body;

    public static ListAIVideoTerrorismRecogJobResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIVideoTerrorismRecogJobResponse self = new ListAIVideoTerrorismRecogJobResponse();
        return TeaModel.build(map, self);
    }

    public ListAIVideoTerrorismRecogJobResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAIVideoTerrorismRecogJobResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAIVideoTerrorismRecogJobResponse setBody(ListAIVideoTerrorismRecogJobResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAIVideoTerrorismRecogJobResponseBody getBody() {
        return this.body;
    }

}
