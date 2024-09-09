// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateInstanceAccountRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>ENABLE</p>
     */
    @NameInMap("accountStatus")
    public String accountStatus;

    /**
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("password")
    public String password;

    public static UpdateInstanceAccountRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateInstanceAccountRequest self = new UpdateInstanceAccountRequest();
        return TeaModel.build(map, self);
    }

    public UpdateInstanceAccountRequest setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
        return this;
    }
    public String getAccountStatus() {
        return this.accountStatus;
    }

    public UpdateInstanceAccountRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
