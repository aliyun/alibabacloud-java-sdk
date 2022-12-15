// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.vpc20160428.models;

import com.aliyun.tea.*;

public class ListBusinessAccessPointsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static ListBusinessAccessPointsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListBusinessAccessPointsRequest self = new ListBusinessAccessPointsRequest();
        return TeaModel.build(map, self);
    }

    public ListBusinessAccessPointsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
