// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quickbi_public20220101.models;

import com.aliyun.tea.*;

public class DataInterpretationResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DataInterpretationResponseBody body;

    public static DataInterpretationResponse build(java.util.Map<String, ?> map) throws Exception {
        DataInterpretationResponse self = new DataInterpretationResponse();
        return TeaModel.build(map, self);
    }

    public DataInterpretationResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DataInterpretationResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DataInterpretationResponse setBody(DataInterpretationResponseBody body) {
        this.body = body;
        return this;
    }
    public DataInterpretationResponseBody getBody() {
        return this.body;
    }

}
