// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutArchdomainRequest extends TeaModel {
    @NameInMap("ArchDomainMetaJsonStr")
    public String archDomainMetaJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    public static UpdateLinkeBahamutArchdomainRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutArchdomainRequest self = new UpdateLinkeBahamutArchdomainRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutArchdomainRequest setArchDomainMetaJsonStr(String archDomainMetaJsonStr) {
        this.archDomainMetaJsonStr = archDomainMetaJsonStr;
        return this;
    }
    public String getArchDomainMetaJsonStr() {
        return this.archDomainMetaJsonStr;
    }

    public UpdateLinkeBahamutArchdomainRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
