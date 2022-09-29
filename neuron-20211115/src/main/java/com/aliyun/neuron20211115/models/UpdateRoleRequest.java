// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class UpdateRoleRequest extends TeaModel {
    @NameInMap("body")
    public RoleInfoUpdateCmd body;

    public static UpdateRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRoleRequest self = new UpdateRoleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRoleRequest setBody(RoleInfoUpdateCmd body) {
        this.body = body;
        return this;
    }
    public RoleInfoUpdateCmd getBody() {
        return this.body;
    }

}
