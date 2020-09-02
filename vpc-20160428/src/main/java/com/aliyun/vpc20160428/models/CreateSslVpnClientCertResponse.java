// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSslVpnClientCertResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("SslVpnClientCertId")
    @Validation(required = true)
    public String sslVpnClientCertId;

    public static CreateSslVpnClientCertResponse build(java.util.Map<String, ?> map) throws Exception {
        CreateSslVpnClientCertResponse self = new CreateSslVpnClientCertResponse();
        return TeaModel.build(map, self);
    }

    public CreateSslVpnClientCertResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSslVpnClientCertResponse setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSslVpnClientCertResponse setSslVpnClientCertId(String sslVpnClientCertId) {
        this.sslVpnClientCertId = sslVpnClientCertId;
        return this;
    }
    public String getSslVpnClientCertId() {
        return this.sslVpnClientCertId;
    }

}
