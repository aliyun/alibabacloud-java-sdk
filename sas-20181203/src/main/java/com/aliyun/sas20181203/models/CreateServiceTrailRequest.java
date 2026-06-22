// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class CreateServiceTrailRequest extends TeaModel {
    /**
     * <p>The region ID of the instance to query. Valid values:</p>
     * <ul>
     * <li><strong>cn-hangzhou</strong> (default): Chinese mainland.</li>
     * <li><strong>ap-southeast-1</strong>: outside the Chinese mainland.</li>
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
