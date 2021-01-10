// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutArchdomainiterationcountRequest extends TeaModel {
    @NameInMap("ArchDomainId")
    public String archDomainId;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutArchdomainiterationcountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutArchdomainiterationcountRequest self = new GetLinkeBahamutArchdomainiterationcountRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutArchdomainiterationcountRequest setArchDomainId(String archDomainId) {
        this.archDomainId = archDomainId;
        return this;
    }
    public String getArchDomainId() {
        return this.archDomainId;
    }

    public GetLinkeBahamutArchdomainiterationcountRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
