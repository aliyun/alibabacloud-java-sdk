// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteSslVpnClientCertRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("SslVpnClientCertId")
    @Validation(required = true)
    public String sslVpnClientCertId;

    public static DeleteSslVpnClientCertRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSslVpnClientCertRequest self = new DeleteSslVpnClientCertRequest();
        return TeaModel.build(map, self);
    }

}
