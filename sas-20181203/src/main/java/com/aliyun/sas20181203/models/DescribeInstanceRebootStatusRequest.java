// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeInstanceRebootStatusRequest extends TeaModel {
    /**
     * <p>The UUIDs of the servers that you restart. Separate multiple UUIDs with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static DescribeInstanceRebootStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeInstanceRebootStatusRequest self = new DescribeInstanceRebootStatusRequest();
        return TeaModel.build(map, self);
    }

    public DescribeInstanceRebootStatusRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
