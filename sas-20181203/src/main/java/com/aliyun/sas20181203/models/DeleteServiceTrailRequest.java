// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sas20181203.models;

import com.aliyun.tea.*;

public class DeleteServiceTrailRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static DeleteServiceTrailRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteServiceTrailRequest self = new DeleteServiceTrailRequest();
        return TeaModel.build(map, self);
    }

    public DeleteServiceTrailRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
