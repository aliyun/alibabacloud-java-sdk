// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListMqGroupMsgsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public MqMsgPageResult body;

    public static ListMqGroupMsgsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMqGroupMsgsResponse self = new ListMqGroupMsgsResponse();
        return TeaModel.build(map, self);
    }

    public ListMqGroupMsgsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMqGroupMsgsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMqGroupMsgsResponse setBody(MqMsgPageResult body) {
        this.body = body;
        return this;
    }
    public MqMsgPageResult getBody() {
        return this.body;
    }

}
