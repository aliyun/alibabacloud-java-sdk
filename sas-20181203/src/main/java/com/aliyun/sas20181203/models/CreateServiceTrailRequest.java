// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateServiceTrailRequest extends TeaModel {
    /**
     * <p>The region ID of the instance. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong>: International</li>
     * <li><strong>ap-southeast-1</strong>: Singapore</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static CreateServiceTrailRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceTrailRequest self = new CreateServiceTrailRequest();
        return TeaModel.build(map, self);
    }

    public CreateServiceTrailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
