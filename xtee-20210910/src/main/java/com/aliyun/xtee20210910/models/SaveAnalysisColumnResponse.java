// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.xtee20210910.models;

import com.aliyun.tea.*;

public class SaveAnalysisColumnResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SaveAnalysisColumnResponseBody body;

    public static SaveAnalysisColumnResponse build(java.util.Map<String, ?> map) throws Exception {
        SaveAnalysisColumnResponse self = new SaveAnalysisColumnResponse();
        return TeaModel.build(map, self);
    }

    public SaveAnalysisColumnResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SaveAnalysisColumnResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SaveAnalysisColumnResponse setBody(SaveAnalysisColumnResponseBody body) {
        this.body = body;
        return this;
    }
    public SaveAnalysisColumnResponseBody getBody() {
        return this.body;
    }

}
