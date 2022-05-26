// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class GrantUserPermissionsRequest extends TeaModel {
    @NameInMap("Permissions")
    public String permissions;

    @NameInMap("SubAccountUserId")
    public String subAccountUserId;

    public static GrantUserPermissionsRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantUserPermissionsRequest self = new GrantUserPermissionsRequest();
        return TeaModel.build(map, self);
    }

    public GrantUserPermissionsRequest setPermissions(String permissions) {
        this.permissions = permissions;
        return this;
    }
    public String getPermissions() {
        return this.permissions;
    }

    public GrantUserPermissionsRequest setSubAccountUserId(String subAccountUserId) {
        this.subAccountUserId = subAccountUserId;
        return this;
    }
    public String getSubAccountUserId() {
        return this.subAccountUserId;
    }

}
