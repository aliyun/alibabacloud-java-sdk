// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawSkillsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarClawSkillsResponseBody body;

    public static DescribePolarClawSkillsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawSkillsResponse self = new DescribePolarClawSkillsResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawSkillsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarClawSkillsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarClawSkillsResponse setBody(DescribePolarClawSkillsResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarClawSkillsResponseBody getBody() {
        return this.body;
    }

}
