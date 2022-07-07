// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.opensearch20171225.models;

import com.aliyun.tea.*;

public class SaveSortScriptFileResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public SaveSortScriptFileResponseBody body;

    public static SaveSortScriptFileResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveSortScriptFileResponse self = new SaveSortScriptFileResponse();
        return TeaModel.build(map, self);
    }

    public SaveSortScriptFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveSortScriptFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveSortScriptFileResponse setBody(SaveSortScriptFileResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveSortScriptFileResponseBody getBody() {
        return this.body;
    }

}
