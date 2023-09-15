// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogtailPipelineConfigResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public LogtailPipelineConfig body;

    public static GetLogtailPipelineConfigResponse build(java.util.Map<String, ?> map) throws Exception {
        GetLogtailPipelineConfigResponse self = new GetLogtailPipelineConfigResponse();
        return TeaModel.build(map, self);
    }

    public GetLogtailPipelineConfigResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetLogtailPipelineConfigResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetLogtailPipelineConfigResponse setBody(LogtailPipelineConfig body) {
        this.body = body;
        return this;
    }
    public LogtailPipelineConfig getBody() {
        return this.body;
    }

}
