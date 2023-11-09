// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageInfoListRequest extends TeaModel {
    /**
     * <p>The UUID of the server. Separate multiple UUIDs with commas (,).</p>
     * <br>
     * <p>> You can call the [DescribeCloudCenterInstances](~~141932~~) operation to query the UUIDs of servers.</p>
     */
    @NameInMap("Uuids")
    public String uuids;

    public static DescribeImageInfoListRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeImageInfoListRequest self = new DescribeImageInfoListRequest();
        return TeaModel.build(map, self);
    }

    public DescribeImageInfoListRequest setUuids(String uuids) {
        this.uuids = uuids;
        return this;
    }
    public String getUuids() {
        return this.uuids;
    }

}
