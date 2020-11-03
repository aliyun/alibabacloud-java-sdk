// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class DescribeGreConnectionRequest extends TeaModel {
    @NameInMap("UisId")
    @Validation(required = true)
    public String uisId;

    @NameInMap("GreConnectionId")
    @Validation(required = true)
    public String greConnectionId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DescribeGreConnectionRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeGreConnectionRequest self = new DescribeGreConnectionRequest();
        return TeaModel.build(map, self);
    }

    public DescribeGreConnectionRequest setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public DescribeGreConnectionRequest setGreConnectionId(String greConnectionId) {
        this.greConnectionId = greConnectionId;
        return this;
    }
    public String getGreConnectionId() {
        return this.greConnectionId;
    }

    public DescribeGreConnectionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
