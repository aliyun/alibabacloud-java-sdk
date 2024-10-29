// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RegistryAuthenticationConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>abc***</p>
     */
    @NameInMap("Password")
    public String password;

    /**
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static RegistryAuthenticationConfig build(java.util.Map<String, ?> map) throws Exception {
        RegistryAuthenticationConfig self = new RegistryAuthenticationConfig();
        return TeaModel.build(map, self);
    }

    public RegistryAuthenticationConfig setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public RegistryAuthenticationConfig setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
