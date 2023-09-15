// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ListLogtailPipelineConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListLogtailPipelineConfigResponseBody body;

    public static ListLogtailPipelineConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        ListLogtailPipelineConfigResponse self = new ListLogtailPipelineConfigResponse();
        return TeaModel.build(map, self);
    }

    public ListLogtailPipelineConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListLogtailPipelineConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListLogtailPipelineConfigResponse setBody(ListLogtailPipelineConfigResponseBody body) {
        this.body = body;
        return this;
    }
    public ListLogtailPipelineConfigResponseBody getBody() {
        return this.body;
    }

}
