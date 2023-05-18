// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.resourcemanager20200331.models;

import com.aliyun.tea.*;

public class GetRoleRequest extends TeaModel {
    /**
     * <p>The language that is used to return the description of the RAM role. Valid values:</p>
     * <br>
     * <p>*   en: English</p>
     * <p>*   zh-CN: Chinese</p>
     * <p>*   ja: Japanese</p>
     */
    @NameInMap("Language")
    public String language;

    /**
     * <p>The name of the RAM role.</p>
     * <br>
     * <p>The name must be 1 to 64 characters in length and can contain letters, digits, periods (.), and hyphens (-).</p>
     */
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
