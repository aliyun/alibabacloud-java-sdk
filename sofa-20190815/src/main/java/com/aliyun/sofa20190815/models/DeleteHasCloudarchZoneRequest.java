// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class DeleteHasCloudarchZoneRequest extends TeaModel {
    @NameInMap("ZoneId")
    public String zoneId;

    public static DeleteHasCloudarchZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteHasCloudarchZoneRequest self = new DeleteHasCloudarchZoneRequest();
        return TeaModel.build(map, self);
    }

    public DeleteHasCloudarchZoneRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
