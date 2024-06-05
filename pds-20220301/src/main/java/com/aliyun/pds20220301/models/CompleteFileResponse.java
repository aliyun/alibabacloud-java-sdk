// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class CompleteFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public File body;

    public static CompleteFileResponse build(java.util.Map<String, ?> map) throws Exception {
        CompleteFileResponse self = new CompleteFileResponse();
        return TeaModel.build(map, self);
    }

    public CompleteFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public CompleteFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public CompleteFileResponse setBody(File body) {
        this.body = body;
        return this;
    }
    public File getBody() {
        return this.body;
    }

}
