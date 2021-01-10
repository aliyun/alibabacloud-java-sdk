// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutArchdomainRequest extends TeaModel {
    @NameInMap("ArchDomainMetaJsonStr")
    public String archDomainMetaJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    public static AddLinkeBahamutArchdomainRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutArchdomainRequest self = new AddLinkeBahamutArchdomainRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutArchdomainRequest setArchDomainMetaJsonStr(String archDomainMetaJsonStr) {
        this.archDomainMetaJsonStr = archDomainMetaJsonStr;
        return this;
    }
    public String getArchDomainMetaJsonStr() {
        return this.archDomainMetaJsonStr;
    }

    public AddLinkeBahamutArchdomainRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
