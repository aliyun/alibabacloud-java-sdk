// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class FindContainerNetworkConnectResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public FindContainerNetworkConnectResponseBody body;

    public static FindContainerNetworkConnectResponse build(java.util.Map<String, ?> map) throws Exception {
        FindContainerNetworkConnectResponse self = new FindContainerNetworkConnectResponse();
        return TeaModel.build(map, self);
    }

    public FindContainerNetworkConnectResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public FindContainerNetworkConnectResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public FindContainerNetworkConnectResponse setBody(FindContainerNetworkConnectResponseBody body) {
        this.body = body;
        return this;
    }
    public FindContainerNetworkConnectResponseBody getBody() {
        return this.body;
    }

}
