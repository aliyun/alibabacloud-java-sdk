// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateTemplateRegistryAuthConfig extends TeaModel {
    /**
     * <p>The logon password or access token for the image repository. The value is encrypted on the server side and is not returned in plaintext when queried.</p>
     * 
     * <strong>example:</strong>
     * <p>Passw0rd****</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>The username for logging on to the image repository.</p>
     * 
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
