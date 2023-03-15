// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class ListWatchAssetsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.List<DTO> body;

    public static ListWatchAssetsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListWatchAssetsResponse self = new ListWatchAssetsResponse();
        return TeaModel.build(map, self);
    }

    public ListWatchAssetsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListWatchAssetsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListWatchAssetsResponse setBody(java.util.List<DTO> body) {
        this.body = body;
        return this;
    }
    public java.util.List<DTO> getBody() {
        return this.body;
    }

}
