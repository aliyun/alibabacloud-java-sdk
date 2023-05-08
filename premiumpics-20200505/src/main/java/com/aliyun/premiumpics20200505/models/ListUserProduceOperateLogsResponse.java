// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.premiumpics20200505.models;

import com.aliyun.tea.*;

public class ListUserProduceOperateLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public ListUserProduceOperateLogsResponseBody body;

    public static ListUserProduceOperateLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListUserProduceOperateLogsResponse self = new ListUserProduceOperateLogsResponse();
        return TeaModel.build(map, self);
    }

    public ListUserProduceOperateLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListUserProduceOperateLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListUserProduceOperateLogsResponse setBody(ListUserProduceOperateLogsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListUserProduceOperateLogsResponseBody getBody() {
        return this.body;
    }

}
