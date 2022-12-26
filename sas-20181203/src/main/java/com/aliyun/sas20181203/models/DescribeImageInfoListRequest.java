// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DescribeImageInfoListRequest extends TeaModel {
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
