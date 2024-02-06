// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class ConsumerGroupHeartBeatResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public java.util.List<Integer> body;

    public static ConsumerGroupHeartBeatResponse build(java.util.Map<String, ?> map) throws Exception {
        ConsumerGroupHeartBeatResponse self = new ConsumerGroupHeartBeatResponse();
        return TeaModel.build(map, self);
    }

    public ConsumerGroupHeartBeatResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ConsumerGroupHeartBeatResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ConsumerGroupHeartBeatResponse setBody(java.util.List<Integer> body) {
        this.body = body;
        return this;
    }
    public java.util.List<Integer> getBody() {
        return this.body;
    }

}
