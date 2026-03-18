// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.starrocks20221019.models;

import com.aliyun.tea.*;

public class ModifyUserPasswordRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>c-b25e21e24388****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <hr>
     */
    @NameInMap("Password")
    public String password;

    public static ModifyUserPasswordRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyUserPasswordRequest self = new ModifyUserPasswordRequest();
        return TeaModel.build(map, self);
    }

    public ModifyUserPasswordRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ModifyUserPasswordRequest setPassword(String password) {
        this.password = password;
        return this;
    }
    public String getPassword() {
        return this.password;
    }

}
