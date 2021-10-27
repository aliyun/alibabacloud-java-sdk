// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetRoleRequest extends TeaModel {
    @NameInMap("Language")
    public String language;

    @NameInMap("RoleName")
    public String roleName;

    public static GetRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRoleRequest self = new GetRoleRequest();
        return TeaModel.build(map, self);
    }

    public GetRoleRequest setLanguage(String language) {
        this.language = language;
        return this;
    }
    public String getLanguage() {
        return this.language;
    }

    public GetRoleRequest setRoleName(String roleName) {
        this.roleName = roleName;
        return this;
    }
    public String getRoleName() {
        return this.roleName;
    }

}
