// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20190902.models;

import com.aliyun.tea.*;

public class SaveSearchConditionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveSearchConditionResponseBody body;

    public static SaveSearchConditionResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSearchConditionResponse self = new SaveSearchConditionResponse();
        return TeaModel.build(map, self);
    }

    public SaveSearchConditionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSearchConditionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSearchConditionResponse setBody(SaveSearchConditionResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSearchConditionResponseBody getBody() {
        return this.body;
    }

}
