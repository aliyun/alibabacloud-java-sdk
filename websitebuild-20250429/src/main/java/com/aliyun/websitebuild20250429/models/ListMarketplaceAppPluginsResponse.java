// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.websitebuild20250429.models;

import com.aliyun.tea.*;

public class ListMarketplaceAppPluginsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
    public ListMarketplaceAppPluginsResponseBody body;

    public static ListMarketplaceAppPluginsResponse build(java.util.Map<String, ?> map) throws Exception {
        ListMarketplaceAppPluginsResponse self = new ListMarketplaceAppPluginsResponse();
        return TeaModel.build(map, self);
    }

    public ListMarketplaceAppPluginsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public ListMarketplaceAppPluginsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public ListMarketplaceAppPluginsResponse setBody(ListMarketplaceAppPluginsResponseBody body) {
        this.body = body;
        return this;
    }
    public ListMarketplaceAppPluginsResponseBody getBody() {
        return this.body;
    }

}
