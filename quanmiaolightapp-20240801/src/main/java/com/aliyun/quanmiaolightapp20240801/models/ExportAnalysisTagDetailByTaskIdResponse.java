// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.quanmiaolightapp20240801.models;

import com.aliyun.tea.*;

public class ExportAnalysisTagDetailByTaskIdResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ExportAnalysisTagDetailByTaskIdResponseBody body;

    public static ExportAnalysisTagDetailByTaskIdResponse build(java.util.Map<String, ?> map) throws Exception {
        ExportAnalysisTagDetailByTaskIdResponse self = new ExportAnalysisTagDetailByTaskIdResponse();
        return TeaModel.build(map, self);
    }

    public ExportAnalysisTagDetailByTaskIdResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ExportAnalysisTagDetailByTaskIdResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ExportAnalysisTagDetailByTaskIdResponse setBody(ExportAnalysisTagDetailByTaskIdResponseBody body) {
        this.body = body;
        return this;
    }
    public ExportAnalysisTagDetailByTaskIdResponseBody getBody() {
        return this.body;
    }

}
