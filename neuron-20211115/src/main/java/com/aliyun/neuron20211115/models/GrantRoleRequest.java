// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.neuron20211115.models;

import com.aliyun.tea.*;

public class GrantRoleRequest extends TeaModel {
    @NameInMap("body")
    public RoleGrantCmd body;

    public static GrantRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantRoleRequest self = new GrantRoleRequest();
        return TeaModel.build(map, self);
    }

    public GrantRoleRequest setBody(RoleGrantCmd body) {
        this.body = body;
        return this;
    }
    public RoleGrantCmd getBody() {
        return this.body;
    }

}
