// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifySslVpnClientCertResponseBody extends TeaModel {
    /**
     * <p>The name of the SSL client certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>cert2</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>606998F0-B94D-48FE-8316-ACA81BB230DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the SSL client certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>vsc-bp1n8wcf134yl0osr****</p>
     */
    @NameInMap("SslVpnClientCertId")
    public String sslVpnClientCertId;

    public static ModifySslVpnClientCertResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ModifySslVpnClientCertResponseBody self = new ModifySslVpnClientCertResponseBody();
        return TeaModel.build(map, self);
    }

    public ModifySslVpnClientCertResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ModifySslVpnClientCertResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ModifySslVpnClientCertResponseBody setSslVpnClientCertId(String sslVpnClientCertId) {
        this.sslVpnClientCertId = sslVpnClientCertId;
        return this;
    }
    public String getSslVpnClientCertId() {
        return this.sslVpnClientCertId;
    }

}
