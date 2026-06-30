// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class DescribePolarClawSkillDetailResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public DescribePolarClawSkillDetailResponseBody body;

    public static DescribePolarClawSkillDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePolarClawSkillDetailResponse self = new DescribePolarClawSkillDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribePolarClawSkillDetailResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribePolarClawSkillDetailResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribePolarClawSkillDetailResponse setBody(DescribePolarClawSkillDetailResponseBody body) {
        this.body = body;
        return this;
    }
    public DescribePolarClawSkillDetailResponseBody getBody() {
        return this.body;
    }

}
