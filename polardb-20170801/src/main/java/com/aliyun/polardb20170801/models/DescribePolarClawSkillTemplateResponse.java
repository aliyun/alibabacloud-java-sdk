// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawSkillTemplateResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarClawSkillTemplateResponseBody body;

    public static DescribePolarClawSkillTemplateResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawSkillTemplateResponse self = new DescribePolarClawSkillTemplateResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawSkillTemplateResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarClawSkillTemplateResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarClawSkillTemplateResponse setBody(DescribePolarClawSkillTemplateResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarClawSkillTemplateResponseBody getBody() {
        return this.body;
    }

}
