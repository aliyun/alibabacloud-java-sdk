// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSslVpnClientCertResponseBody extends TeaModel {
    /**
     * <p>The name of the SSL client certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>SslVpnClientCert</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>079874CD-AEC1-43E6-AC03-ADD96B6E4907</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the SSL client certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>vsc-m5euof6s5jy8vs5kd****</p>
     */
    @NameInMap("SslVpnClientCertId")
    public String sslVpnClientCertId;

    public static CreateSslVpnClientCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateSslVpnClientCertResponseBody self = new CreateSslVpnClientCertResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateSslVpnClientCertResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
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

}
