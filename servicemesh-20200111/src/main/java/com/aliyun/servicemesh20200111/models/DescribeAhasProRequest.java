// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.servicemesh20200111.models;

import com.aliyun.tea.*;

public class DescribeAhasProRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeAhasProRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAhasProRequest self = new DescribeAhasProRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAhasProRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
