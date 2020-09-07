// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeNextEventForSignRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DescribeNextEventForSignRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeNextEventForSignRequest self = new DescribeNextEventForSignRequest();
        return TeaModel.build(map, self);
    }

    public DescribeNextEventForSignRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
