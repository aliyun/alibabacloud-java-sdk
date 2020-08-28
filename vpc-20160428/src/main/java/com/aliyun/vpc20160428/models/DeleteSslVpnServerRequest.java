// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class DeleteSslVpnServerRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("SslVpnServerId")
    @Validation(required = true)
    public String sslVpnServerId;

    public static DeleteSslVpnServerRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSslVpnServerRequest self = new DeleteSslVpnServerRequest();
        return TeaModel.build(map, self);
    }

}
