// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogStoreConfigResponseBody extends TeaModel {
    @NameInMap("clientIpHeaders")
    public java.util.List<String> clientIpHeaders;

    public static GetLogStoreConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogStoreConfigResponseBody self = new GetLogStoreConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogStoreConfigResponseBody setClientIpHeaders(java.util.List<String> clientIpHeaders) {
        this.clientIpHeaders = clientIpHeaders;
        return this;
    }
    public java.util.List<String> getClientIpHeaders() {
        return this.clientIpHeaders;
    }

}
