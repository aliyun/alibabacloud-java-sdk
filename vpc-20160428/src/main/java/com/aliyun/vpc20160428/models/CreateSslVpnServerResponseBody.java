// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSslVpnServerResponseBody extends TeaModel {
    /**
     * <p>The name of the SSL server.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the SSL server.</p>
     */
    @NameInMap("SslVpnServerId")
    public String sslVpnServerId;

    public static CreateSslVpnServerResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSslVpnServerResponseBody self = new CreateSslVpnServerResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSslVpnServerResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSslVpnServerResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSslVpnServerResponseBody setSslVpnServerId(String sslVpnServerId) {
        this.sslVpnServerId = sslVpnServerId;
        return this;
    }
    public String getSslVpnServerId() {
        return this.sslVpnServerId;
    }

}
