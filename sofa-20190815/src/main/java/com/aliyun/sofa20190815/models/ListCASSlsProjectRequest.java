// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListCASSlsProjectRequest extends TeaModel {
    @NameInMap("SlsRegionId")
    public String slsRegionId;

    @NameInMap("TenantId")
    public String tenantId;

    public static ListCASSlsProjectRequest build(java.util.Map<String, ?> map) throws Exception {
        ListCASSlsProjectRequest self = new ListCASSlsProjectRequest();
        return TeaModel.build(map, self);
    }

    public ListCASSlsProjectRequest setSlsRegionId(String slsRegionId) {
        this.slsRegionId = slsRegionId;
        return this;
    }
    public String getSlsRegionId() {
        return this.slsRegionId;
    }

    public ListCASSlsProjectRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
