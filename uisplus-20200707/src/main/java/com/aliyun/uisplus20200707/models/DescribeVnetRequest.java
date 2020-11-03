// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.uisplus20200707.models;

import com.aliyun.tea.*;

public class DescribeVnetRequest extends TeaModel {
    @NameInMap("UisId")
    @Validation(required = true)
    public String uisId;

    @NameInMap("VnetId")
    @Validation(required = true)
    public String vnetId;

    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    public static DescribeVnetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeVnetRequest self = new DescribeVnetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeVnetRequest setUisId(String uisId) {
        this.uisId = uisId;
        return this;
    }
    public String getUisId() {
        return this.uisId;
    }

    public DescribeVnetRequest setVnetId(String vnetId) {
        this.vnetId = vnetId;
        return this;
    }
    public String getVnetId() {
        return this.vnetId;
    }

    public DescribeVnetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
