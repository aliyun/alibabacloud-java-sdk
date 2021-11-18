// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.polardbx20200202.models;

import com.aliyun.tea.*;

public class CancelActiveOperationTasksRequest extends TeaModel {
    @NameInMap("Ids")
    public String ids;

    @NameInMap("RegionId")
    public String regionId;

    public static CancelActiveOperationTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        CancelActiveOperationTasksRequest self = new CancelActiveOperationTasksRequest();
        return TeaModel.build(map, self);
    }

    public CancelActiveOperationTasksRequest setIds(String ids) {
        this.ids = ids;
        return this;
    }
    public String getIds() {
        return this.ids;
    }

    public CancelActiveOperationTasksRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
