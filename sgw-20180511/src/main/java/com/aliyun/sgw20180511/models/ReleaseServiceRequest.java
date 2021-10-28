// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class ReleaseServiceRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    public static ReleaseServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleaseServiceRequest self = new ReleaseServiceRequest();
        return TeaModel.build(map, self);
    }

    public ReleaseServiceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
