// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vod20170321.models;

import com.aliyun.tea.*;

public class ListAIStatisTypeResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListAIStatisTypeResponseBody body;

    public static ListAIStatisTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        ListAIStatisTypeResponse self = new ListAIStatisTypeResponse();
        return TeaModel.build(map, self);
    }

    public ListAIStatisTypeResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListAIStatisTypeResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListAIStatisTypeResponse setBody(ListAIStatisTypeResponseBody body) {
        this.body = body;
        return this;
    }
    public ListAIStatisTypeResponseBody getBody() {
        return this.body;
    }

}
