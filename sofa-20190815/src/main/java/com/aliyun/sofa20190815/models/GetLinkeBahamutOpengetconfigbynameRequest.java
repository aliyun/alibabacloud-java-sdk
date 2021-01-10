// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutOpengetconfigbynameRequest extends TeaModel {
    @NameInMap("Name")
    public String name;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutOpengetconfigbynameRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutOpengetconfigbynameRequest self = new GetLinkeBahamutOpengetconfigbynameRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutOpengetconfigbynameRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public GetLinkeBahamutOpengetconfigbynameRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
