// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSslVpnServerResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("SslVpnServerId")
    @Validation(required = true)
    public String sslVpnServerId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    public static CreateSslVpnServerResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSslVpnServerResponse self = new CreateSslVpnServerResponse();
        return TeaModel.build(map, self);
    }

    public CreateSslVpnServerResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSslVpnServerResponse setSslVpnServerId(String sslVpnServerId) {
        this.sslVpnServerId = sslVpnServerId;
        return this;
    }
    public String getSslVpnServerId() {
        return this.sslVpnServerId;
    }

    public CreateSslVpnServerResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
