// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockUnbindRequest extends TeaModel {
    /**
     * <p>The UUID of the server for which you want to disable web tamper proofing.</p>
     * <br>
     * <p>> You can call the [DescribeWebLockBindList](~~DescribeWebLockBindList~~) operation to query the UUIDs of servers.</p>
     */
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
