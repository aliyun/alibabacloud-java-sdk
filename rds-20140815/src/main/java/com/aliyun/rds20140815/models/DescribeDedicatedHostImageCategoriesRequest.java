// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeDedicatedHostImageCategoriesRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("HostGroup")
    @Validation(required = true)
    public String hostGroup;

    public static DescribeDedicatedHostImageCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDedicatedHostImageCategoriesRequest self = new DescribeDedicatedHostImageCategoriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDedicatedHostImageCategoriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeDedicatedHostImageCategoriesRequest setHostGroup(String hostGroup) {
        this.hostGroup = hostGroup;
        return this;
    }
    public String getHostGroup() {
        return this.hostGroup;
    }

}
