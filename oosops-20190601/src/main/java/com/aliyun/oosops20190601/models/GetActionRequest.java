// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oosops20190601.models;

import com.aliyun.tea.*;

public class GetActionRequest extends TeaModel {
    @NameInMap("ActionName")
    public String actionName;

    @NameInMap("RegionId")
    public String regionId;

    public static GetActionRequest build(java.util.Map<String, ?> map) throws Exception {
        GetActionRequest self = new GetActionRequest();
        return TeaModel.build(map, self);
    }

    public GetActionRequest setActionName(String actionName) {
        this.actionName = actionName;
        return this;
    }
    public String getActionName() {
        return this.actionName;
    }

    public GetActionRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
