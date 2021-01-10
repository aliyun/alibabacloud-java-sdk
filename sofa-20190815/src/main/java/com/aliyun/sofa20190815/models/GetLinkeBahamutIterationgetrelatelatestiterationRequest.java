// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationgetrelatelatestiterationRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Type")
    public String type;

    public static GetLinkeBahamutIterationgetrelatelatestiterationRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationgetrelatelatestiterationRequest self = new GetLinkeBahamutIterationgetrelatelatestiterationRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationgetrelatelatestiterationRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetLinkeBahamutIterationgetrelatelatestiterationRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
