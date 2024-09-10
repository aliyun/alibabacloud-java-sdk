// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class UnbindAegisRequest extends TeaModel {
    /**
     * <p>The UUID of the server that you want to unbind. Separate multiple UUIDs with commas (,).</p>
     * <blockquote>
     * <p>You can call the <a href="~~DescribeCloudCenterInstances~~">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4fe8e1cd-3c37-4851-b9de-124da32c****</p>
     */
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
