// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.searchengine20211025.models;

import com.aliyun.tea.*;

public class ModifyPasswordRequest extends TeaModel {
    /**
     * <p>The password</p>
     * 
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>The username</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;username&quot;</p>
     */
    @NameInMap("username")
    public String username;

    public static ModifyPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyPasswordRequest self = new ModifyPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ModifyPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public ModifyPasswordRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
