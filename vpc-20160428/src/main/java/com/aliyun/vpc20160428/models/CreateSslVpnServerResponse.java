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

}
