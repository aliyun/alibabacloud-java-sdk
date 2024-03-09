// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.paiautoml20220828.models;

import com.aliyun.tea.*;

public class ListHpoExperimentLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListHpoExperimentLogsResponseBody body;

    public static ListHpoExperimentLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListHpoExperimentLogsResponse self = new ListHpoExperimentLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListHpoExperimentLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListHpoExperimentLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListHpoExperimentLogsResponse setBody(ListHpoExperimentLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListHpoExperimentLogsResponseBody getBody() {
        return this.body;
    }

}
