// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class GetPolarClawSkillRegionResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public GetPolarClawSkillRegionResponseBody body;

    public static GetPolarClawSkillRegionResponse build(java.util.Map<String, ?> map) throws Exception {
        GetPolarClawSkillRegionResponse self = new GetPolarClawSkillRegionResponse();
        return TeaModel.build(map, self);
    }

    public GetPolarClawSkillRegionResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public GetPolarClawSkillRegionResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public GetPolarClawSkillRegionResponse setBody(GetPolarClawSkillRegionResponseBody body) {
        this.body = body;
        return this;
    }
    public GetPolarClawSkillRegionResponseBody getBody() {
        return this.body;
    }

}
