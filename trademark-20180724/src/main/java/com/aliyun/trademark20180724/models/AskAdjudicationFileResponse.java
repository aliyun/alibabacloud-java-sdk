// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.trademark20180724.models;

import com.aliyun.tea.*;

public class AskAdjudicationFileResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public AskAdjudicationFileResponseBody body;

    public static AskAdjudicationFileResponse build(java.util.Map<String, ?> map) throws Exception {
        AskAdjudicationFileResponse self = new AskAdjudicationFileResponse();
        return TeaModel.build(map, self);
    }

    public AskAdjudicationFileResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public AskAdjudicationFileResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public AskAdjudicationFileResponse setBody(AskAdjudicationFileResponseBody body) {
        this.body = body;
        return this;
    }
    public AskAdjudicationFileResponseBody getBody() {
        return this.body;
    }

}
