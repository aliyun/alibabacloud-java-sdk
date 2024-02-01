// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListPublicIpAddressPoolCidrBlocksResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListPublicIpAddressPoolCidrBlocksResponseBody body;

    public static ListPublicIpAddressPoolCidrBlocksResponse build(java.util.Map<String, ?> map) throws Exception {
        ListPublicIpAddressPoolCidrBlocksResponse self = new ListPublicIpAddressPoolCidrBlocksResponse();
        return TeaModel.build(map, self);
    }

    public ListPublicIpAddressPoolCidrBlocksResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListPublicIpAddressPoolCidrBlocksResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListPublicIpAddressPoolCidrBlocksResponse setBody(ListPublicIpAddressPoolCidrBlocksResponseBody body) {
        this.body = body;
        return this;
    }
    public ListPublicIpAddressPoolCidrBlocksResponseBody getBody() {
        return this.body;
    }

}
