// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class RevokeRoleRequest extends TeaModel {
    @NameInMap("body")
    public RoleRevokeCmd body;

    public static RevokeRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeRoleRequest self = new RevokeRoleRequest();
        return TeaModel.build(map, self);
    }

    public RevokeRoleRequest setBody(RoleRevokeCmd body) {
        this.body = body;
        return this;
    }
    public RoleRevokeCmd getBody() {
        return this.body;
    }

}
