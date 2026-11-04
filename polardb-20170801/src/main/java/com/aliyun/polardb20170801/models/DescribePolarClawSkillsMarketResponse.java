// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawSkillsMarketResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarClawSkillsMarketResponseBody body;

    public static DescribePolarClawSkillsMarketResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawSkillsMarketResponse self = new DescribePolarClawSkillsMarketResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawSkillsMarketResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarClawSkillsMarketResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarClawSkillsMarketResponse setBody(DescribePolarClawSkillsMarketResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarClawSkillsMarketResponseBody getBody() {
        return this.body;
    }

}
