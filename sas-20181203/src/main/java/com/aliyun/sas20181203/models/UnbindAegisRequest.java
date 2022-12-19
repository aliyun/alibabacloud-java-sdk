// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UnbindAegisRequest extends TeaModel {
    // The UUID of the server that you want to unbind. Separate multiple UUIDs with commas (,). 
    // You can call the [DescribeCloudCenterInstances](~~DescribeCloudCenterInstances~~) operation to query the UUIDs of servers.
    @NameInMap("Uuids")
    public String uuids;

    public static UnbindAegisRequest build(java.util.Map<String, ?> map) throws Exception {
        UnbindAegisRequest self = new UnbindAegisRequest();
        return TeaModel.build(map, self);
    }

    public UnbindAegisRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
