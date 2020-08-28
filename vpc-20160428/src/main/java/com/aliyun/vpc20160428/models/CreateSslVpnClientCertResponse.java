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

}
