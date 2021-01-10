// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutArchdomainsRequest extends TeaModel {
    @NameInMap("ArchDomainId")
    public String archDomainId;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutArchdomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutArchdomainsRequest self = new GetLinkeBahamutArchdomainsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutArchdomainsRequest setArchDomainId(String archDomainId) {
        this.archDomainId = archDomainId;
        return this;
    }
    public String getArchDomainId() {
        return this.archDomainId;
    }

    public GetLinkeBahamutArchdomainsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
