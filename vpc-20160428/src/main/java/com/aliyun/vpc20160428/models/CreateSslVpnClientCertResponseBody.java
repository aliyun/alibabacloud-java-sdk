// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSslVpnClientCertResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SslVpnClientCertId")
    public String sslVpnClientCertId;

    @NameInMap("Name")
    public String name;

    public static CreateSslVpnClientCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSslVpnClientCertResponseBody self = new CreateSslVpnClientCertResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSslVpnClientCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateSslVpnClientCertResponseBody setSslVpnClientCertId(String sslVpnClientCertId) {
        this.sslVpnClientCertId = sslVpnClientCertId;
        return this;
    }
    public String getSslVpnClientCertId() {
        return this.sslVpnClientCertId;
    }

    public CreateSslVpnClientCertResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
