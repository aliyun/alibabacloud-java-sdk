// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockUnbindRequest extends TeaModel {
    @NameInMap("Uuid")
    public String uuid;

    public static ModifyWebLockUnbindRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyWebLockUnbindRequest self = new ModifyWebLockUnbindRequest();
        return TeaModel.build(map, self);
    }

    public ModifyWebLockUnbindRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
