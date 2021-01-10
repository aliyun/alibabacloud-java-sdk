// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryHasDingtalkRobotsendlevelsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("body")
    @Validation(required = true)
    public QueryHasDingtalkRobotsendlevelsResponseBody body;

    public static QueryHasDingtalkRobotsendlevelsResponse build(java.util.Map<String, ?> map) throws Exception {
        QueryHasDingtalkRobotsendlevelsResponse self = new QueryHasDingtalkRobotsendlevelsResponse();
        return TeaModel.build(map, self);
    }

    public QueryHasDingtalkRobotsendlevelsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public QueryHasDingtalkRobotsendlevelsResponse setBody(QueryHasDingtalkRobotsendlevelsResponseBody body) {
        this.body = body;
        return this;
    }
    public QueryHasDingtalkRobotsendlevelsResponseBody getBody() {
        return this.body;
    }

}
