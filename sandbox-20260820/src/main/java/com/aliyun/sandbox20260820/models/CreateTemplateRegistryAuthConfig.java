// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateRegistryAuthConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Passw0rd****</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <strong>example:</strong>
     * <p>sandbox-puller</p>
     */
    @NameInMap("userName")
    public String userName;

    public static CreateTemplateRegistryAuthConfig build(java.util.Map<String, ?> map) throws Exception {
        CreateTemplateRegistryAuthConfig self = new CreateTemplateRegistryAuthConfig();
        return TeaModel.build(map, self);
    }

    public CreateTemplateRegistryAuthConfig setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateTemplateRegistryAuthConfig setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
