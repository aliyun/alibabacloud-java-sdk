// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class GetLogStoreConfigResponseBody extends TeaModel {
    /**
     * <p>An array of header keys used to extract the client IP address when data is written to the Logstore. The keys are case-insensitive, but their order in the array is significant. For this feature to work, you must enable the <code>appendMeta</code> option on the Logstore. Log Service searches the request headers for these keys in the specified order, and then adds the first valid IP address it finds as a log tag.</p>
     */
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
