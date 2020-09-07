// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.rds20140815.models;

import com.aliyun.tea.*;

public class DescribeCharacterSetNameRequest extends TeaModel {
    @NameInMap("Engine")
    @Validation(required = true)
    public String engine;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DescribeCharacterSetNameRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCharacterSetNameRequest self = new DescribeCharacterSetNameRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCharacterSetNameRequest setEngine(String engine) {
        this.engine = engine;
        return this;
    }
    public String getEngine() {
        return this.engine;
    }

    public DescribeCharacterSetNameRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
