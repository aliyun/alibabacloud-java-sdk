// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class GetCheckSaleRequest extends TeaModel {
    /**
     * <p>The region in which the Security Center instance is deployed. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou:</strong> inside China</li>
     * <li>Global <strong>ap-southeast-1:</strong> outside China</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
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
