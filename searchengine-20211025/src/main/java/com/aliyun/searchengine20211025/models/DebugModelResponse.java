// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class DebugModelResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DebugModelResponseBody body;

    public static DebugModelResponse build(java.util.Map<String, ?> map) throws Exception {
        DebugModelResponse self = new DebugModelResponse();
        return TeaModel.build(map, self);
    }

    public DebugModelResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DebugModelResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DebugModelResponse setBody(DebugModelResponseBody body) {
        this.body = body;
        return this;
    }
    public DebugModelResponseBody getBody() {
        return this.body;
    }

}
