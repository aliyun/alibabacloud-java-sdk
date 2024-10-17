// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sae20190506.models;

import com.aliyun.tea.*;

public class RegistryAuthConfig extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>abc***</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <strong>example:</strong>
     * <p>acs:ram::142xxxx:role/xxxxxx</p>
     */
    @NameInMap("role")
    public String role;

    /**
     * <strong>example:</strong>
     * <p>admin</p>
     */
    @NameInMap("userName")
    public String userName;

    public static RegistryAuthConfig build(java.util.Map<String, ?> map) throws Exception {
        RegistryAuthConfig self = new RegistryAuthConfig();
        return TeaModel.build(map, self);
    }

    public RegistryAuthConfig setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public RegistryAuthConfig setRole(String role) {
        this.role = role;
        return this;
    }
    public String getRole() {
        return this.role;
    }

    public RegistryAuthConfig setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
