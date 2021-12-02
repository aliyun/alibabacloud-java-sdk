// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSslVpnServerResponseBody extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("RequestId")
    public String requestId;

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
