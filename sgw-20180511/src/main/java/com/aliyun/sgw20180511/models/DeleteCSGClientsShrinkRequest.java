// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sgw20180511.models;

import com.aliyun.tea.*;

public class DeleteCSGClientsShrinkRequest extends TeaModel {
    @NameInMap("ClientIds")
    public String clientIdsShrink;

    @NameInMap("ClientRegionId")
    public String clientRegionId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteCSGClientsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteCSGClientsShrinkRequest self = new DeleteCSGClientsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public DeleteCSGClientsShrinkRequest setClientIdsShrink(String clientIdsShrink) {
        this.clientIdsShrink = clientIdsShrink;
        return this;
    }
    public String getClientIdsShrink() {
        return this.clientIdsShrink;
    }

    public DeleteCSGClientsShrinkRequest setClientRegionId(String clientRegionId) {
        this.clientRegionId = clientRegionId;
        return this;
    }
    public String getClientRegionId() {
        return this.clientRegionId;
    }

    public DeleteCSGClientsShrinkRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
