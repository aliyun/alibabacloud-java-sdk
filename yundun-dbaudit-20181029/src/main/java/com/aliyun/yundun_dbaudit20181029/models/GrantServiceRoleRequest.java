// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.yundun_dbaudit20181029.models;

import com.aliyun.tea.*;

public class GrantServiceRoleRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    public static GrantServiceRoleRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantServiceRoleRequest self = new GrantServiceRoleRequest();
        return TeaModel.build(map, self);
    }

    public GrantServiceRoleRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
