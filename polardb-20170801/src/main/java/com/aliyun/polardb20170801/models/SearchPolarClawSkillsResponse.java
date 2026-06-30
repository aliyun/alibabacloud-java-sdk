// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardb20170801.models;

import com.aliyun.tea.*;

public class SearchPolarClawSkillsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public SearchPolarClawSkillsResponseBody body;

    public static SearchPolarClawSkillsResponse build(java.util.Map<String, ?> map) throws Exception {
        SearchPolarClawSkillsResponse self = new SearchPolarClawSkillsResponse();
        return TeaModel.build(map, self);
    }

    public SearchPolarClawSkillsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public SearchPolarClawSkillsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public SearchPolarClawSkillsResponse setBody(SearchPolarClawSkillsResponseBody body) {
        this.body = body;
        return this;
    }
    public SearchPolarClawSkillsResponseBody getBody() {
        return this.body;
    }

}
