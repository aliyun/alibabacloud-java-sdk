// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.swas_open20200601.models;

import com.aliyun.tea.*;

public class ListPlansRequest extends TeaModel {
    /**
     * <p>The region ID of the plans. You can call the [ListRegions](~~189315~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ListPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPlansRequest self = new ListPlansRequest();
        return TeaModel.build(map, self);
    }

    public ListPlansRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
