// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifySslVpnClientCertResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Name")
    @Validation(required = true)
    public String name;

    @NameInMap("SslVpnClientCertId")
    @Validation(required = true)
    public String sslVpnClientCertId;

    public static ModifySslVpnClientCertResponse build(java.util.Map<String, ?> map) throws Exception {
        ModifySslVpnClientCertResponse self = new ModifySslVpnClientCertResponse();
        return TeaModel.build(map, self);
    }

}
