// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class ModifyWebLockUnbindRequest extends TeaModel {
    /**
     * <p>The UUID of the server for which you want to disable web tamper proofing.</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeWebLockBindList~~">DescribeWebLockBindList</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>8d217d3f-6999-43a6-a435-c7a6854180e9</p>
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
