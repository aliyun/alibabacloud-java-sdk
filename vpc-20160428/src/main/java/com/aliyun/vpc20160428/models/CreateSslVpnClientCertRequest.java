// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class CreateSslVpnClientCertRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SslVpnServerId")
    @Validation(required = true)
    public String sslVpnServerId;

    @NameInMap("Name")
    public String name;

    public static CreateSslVpnClientCertRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSslVpnClientCertRequest self = new CreateSslVpnClientCertRequest();
        return TeaModel.build(map, self);
    }

}
