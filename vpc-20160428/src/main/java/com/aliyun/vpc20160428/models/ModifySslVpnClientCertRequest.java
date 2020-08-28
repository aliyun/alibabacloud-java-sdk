// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ModifySslVpnClientCertRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("SslVpnClientCertId")
    @Validation(required = true)
    public String sslVpnClientCertId;

    @NameInMap("Name")
    public String name;

    public static ModifySslVpnClientCertRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySslVpnClientCertRequest self = new ModifySslVpnClientCertRequest();
        return TeaModel.build(map, self);
    }

}
