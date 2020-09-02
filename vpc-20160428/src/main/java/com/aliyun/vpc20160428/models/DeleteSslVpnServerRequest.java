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

    public DeleteSslVpnServerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteSslVpnServerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteSslVpnServerRequest setSslVpnServerId(String sslVpnServerId) {
        this.sslVpnServerId = sslVpnServerId;
        return this;
    }
    public String getSslVpnServerId() {
        return this.sslVpnServerId;
    }

}
