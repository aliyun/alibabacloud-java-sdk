// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rocketmq20220801.models;

import com.aliyun.tea.*;

public class UpdateInstanceAccountRequest extends TeaModel {
    /**
     * <p>The status of the account.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>DISABLE</li>
     * <li>ENABLE</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ENABLE</p>
     */
    @NameInMap("accountStatus")
    public String accountStatus;

    /**
     * <p>The password of the account.</p>
     * 
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
