// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageInfoListRequest extends TeaModel {
    /**
     * <p>The UUID of the server. Separate multiple UUIDs with commas (,).</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/141932.html">DescribeCloudCenterInstances</a> operation to query the UUIDs of servers.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>391abd09184cbd3743d7f5ec125d****,
     * e6aeb2a5b6004479398b0bcd1160****</p>
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
