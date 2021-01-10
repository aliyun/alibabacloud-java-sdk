// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutIterationtemplateiterationtemplateRequest extends TeaModel {
    @NameInMap("FabricBizType")
    public String fabricBizType;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("Type")
    public String type;

    public static GetLinkeBahamutIterationtemplateiterationtemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutIterationtemplateiterationtemplateRequest self = new GetLinkeBahamutIterationtemplateiterationtemplateRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutIterationtemplateiterationtemplateRequest setFabricBizType(String fabricBizType) {
        this.fabricBizType = fabricBizType;
        return this;
    }
    public String getFabricBizType() {
        return this.fabricBizType;
    }

    public GetLinkeBahamutIterationtemplateiterationtemplateRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetLinkeBahamutIterationtemplateiterationtemplateRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
