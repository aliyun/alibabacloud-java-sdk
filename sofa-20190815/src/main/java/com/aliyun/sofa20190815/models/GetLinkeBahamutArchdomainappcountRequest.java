// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutArchdomainappcountRequest extends TeaModel {
    @NameInMap("ArchDomainId")
    public String archDomainId;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutArchdomainappcountRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutArchdomainappcountRequest self = new GetLinkeBahamutArchdomainappcountRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutArchdomainappcountRequest setArchDomainId(String archDomainId) {
        this.archDomainId = archDomainId;
        return this;
    }
    public String getArchDomainId() {
        return this.archDomainId;
    }

    public GetLinkeBahamutArchdomainappcountRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
