// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class CreateInstanceAccountRequest extends TeaModel {
    /**
     * <p>The password of the account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("password")
    public String password;

    /**
     * <p>The username of the account.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("username")
    public String username;

    public static CreateInstanceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceAccountRequest self = new CreateInstanceAccountRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

    public CreateInstanceAccountRequest setUsername(String username) {
        this.username = username;
        return this;
    }
    public String getUsername() {
        return this.username;
    }

}
