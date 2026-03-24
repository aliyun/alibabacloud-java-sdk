// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sls20201230.models;

import com.aliyun.tea.*;

public class PutLogStoreConfigRequest extends TeaModel {
    /**
     * <p>Specifies a list of header keys from which to extract the client IP address during log ingestion. Simple Log Service (SLS) searches these headers in the specified order and uses the first valid IP address that it finds. The key names are case-insensitive, but their order is significant. To use this feature, you must also enable the <code>appendMeta</code> setting for the Logstore. This setting adds the extracted IP address as a log tag.</p>
     */
    @NameInMap("clientIpHeaders")
    public java.util.List<String> clientIpHeaders;

    public static PutLogStoreConfigRequest build(java.util.Map<String, ?> map) throws Exception {
        PutLogStoreConfigRequest self = new PutLogStoreConfigRequest();
        return TeaModel.build(map, self);
    }

    public PutLogStoreConfigRequest setClientIpHeaders(java.util.List<String> clientIpHeaders) {
        this.clientIpHeaders = clientIpHeaders;
        return this;
    }
    public java.util.List<String> getClientIpHeaders() {
        return this.clientIpHeaders;
    }

}
