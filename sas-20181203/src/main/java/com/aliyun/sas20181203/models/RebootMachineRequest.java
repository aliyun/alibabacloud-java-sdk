// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class RebootMachineRequest extends TeaModel {
    /**
     * <p>The UUID of the server that you want to restart.</p>
     * <blockquote>
     * <p> You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>7151f27e-1d51-4e98-a540-8936a****</p>
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
