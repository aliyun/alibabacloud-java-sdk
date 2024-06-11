// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ram20150501.models;

import com.aliyun.tea.*;

public class UnbindMFADeviceRequest extends TeaModel {
    /**
     * <p>The name of the RAM user.</p>
     */
    @NameInMap("UserName")
    public String userName;

    public static UnbindMFADeviceRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindMFADeviceRequest self = new UnbindMFADeviceRequest();
        return TeaModel.build(map, self);
    }

    public UnbindMFADeviceRequest setUserName(String userName) {
        this.userName = userName;
        return this;
    }
    public String getUserName() {
        return this.userName;
    }

}
