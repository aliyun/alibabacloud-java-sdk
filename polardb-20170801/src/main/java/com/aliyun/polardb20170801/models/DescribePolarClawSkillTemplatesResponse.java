// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawSkillTemplatesResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarClawSkillTemplatesResponseBody body;

    public static DescribePolarClawSkillTemplatesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawSkillTemplatesResponse self = new DescribePolarClawSkillTemplatesResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawSkillTemplatesResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarClawSkillTemplatesResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarClawSkillTemplatesResponse setBody(DescribePolarClawSkillTemplatesResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarClawSkillTemplatesResponseBody getBody() {
        return this.body;
    }

}
