// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckSaleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static GetCheckSaleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetCheckSaleRequest self = new GetCheckSaleRequest();
        return TeaModel.build(map, self);
    }

    public GetCheckSaleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
