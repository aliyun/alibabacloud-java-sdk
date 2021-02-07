// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.webplus20190320.models;

import com.aliyun.tea.*;

public class DescribeCategoriesRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DescribeCategoriesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCategoriesRequest self = new DescribeCategoriesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCategoriesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
