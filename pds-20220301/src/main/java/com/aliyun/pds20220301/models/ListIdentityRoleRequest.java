// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pds20220301.models;

import com.aliyun.tea.*;

public class ListIdentityRoleRequest extends TeaModel {
    @NameInMap("identity")
    public Identity identity;

    public static ListIdentityRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        ListIdentityRoleRequest self = new ListIdentityRoleRequest();
        return TeaModel.build(map, self);
    }

    public ListIdentityRoleRequest setIdentity(Identity identity) {
        this.identity = identity;
        return this;
    }
    public Identity getIdentity() {
        return this.identity;
    }

}
