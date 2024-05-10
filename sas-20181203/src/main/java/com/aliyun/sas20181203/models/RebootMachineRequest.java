// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RebootMachineRequest extends TeaModel {
    /**
     * <p>The UUID of the server that you want to restart.</p>
     * <br>
     * <p>>  You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Uuid")
    public String uuid;

    public static RebootMachineRequest build(java.util.Map<String, ?> map) throws Exception {
        RebootMachineRequest self = new RebootMachineRequest();
        return TeaModel.build(map, self);
    }

    public RebootMachineRequest setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
    public String getUuid() {
        return this.uuid;
    }

}
