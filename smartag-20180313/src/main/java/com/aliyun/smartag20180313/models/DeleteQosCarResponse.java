// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.smartag20180313.models;

import com.aliyun.tea.*;

public class DeleteQosCarResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public DeleteQosCarResponseBody body;

    public static DeleteQosCarResponse build(java.util.Map<String, ?> map) throws Exception {
        DeleteQosCarResponse self = new DeleteQosCarResponse();
        return TeaModel.build(map, self);
    }

    public DeleteQosCarResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DeleteQosCarResponse setBody(DeleteQosCarResponseBody body) {
        this.body = body;
        return this;
    }
    public DeleteQosCarResponseBody getBody() {
        return this.body;
    }

}
