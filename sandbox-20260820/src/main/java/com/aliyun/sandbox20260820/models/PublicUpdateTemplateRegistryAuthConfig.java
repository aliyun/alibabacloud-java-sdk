// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class PublicUpdateTemplateRegistryAuthConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("password")
    public String password;

    /**
     * <strong>example:</strong>
     * <p>my-user</p>
     */
    @NameInMap("userName")
    public String userName;

    public static PublicUpdateTemplateRegistryAuthConfig build(java.util.Map<String, ?> map) throws Exception {
        PublicUpdateTemplateRegistryAuthConfig self = new PublicUpdateTemplateRegistryAuthConfig();
        return TeaModel.build(map, self);
    }

    public PublicUpdateTemplateRegistryAuthConfig setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public PublicUpdateTemplateRegistryAuthConfig setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
