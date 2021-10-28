// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class UploadCSGClientLogRequest extends TeaModel {
    @NameInMap("ClientId")
    public String clientId;

    @NameInMap("ClientRegionId")
    public String clientRegionId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static UploadCSGClientLogRequest build(java.util.Map<String, ?> map) throws Exception {
        UploadCSGClientLogRequest self = new UploadCSGClientLogRequest();
        return TeaModel.build(map, self);
    }

    public UploadCSGClientLogRequest setClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }
    public String getClientId() {
        return this.clientId;
    }

    public UploadCSGClientLogRequest setClientRegionId(String clientRegionId) {
        this.clientRegionId = clientRegionId;
        return this;
    }
    public String getClientRegionId() {
        return this.clientRegionId;
    }

    public UploadCSGClientLogRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
