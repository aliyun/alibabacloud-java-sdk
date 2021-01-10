// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class AddLinkeBahamutArchdomainsRequest extends TeaModel {
    @NameInMap("ArchDomainMetaJsonStr")
    public String archDomainMetaJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    public static AddLinkeBahamutArchdomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddLinkeBahamutArchdomainsRequest self = new AddLinkeBahamutArchdomainsRequest();
        return TeaModel.build(map, self);
    }

    public AddLinkeBahamutArchdomainsRequest setArchDomainMetaJsonStr(String archDomainMetaJsonStr) {
        this.archDomainMetaJsonStr = archDomainMetaJsonStr;
        return this;
    }
    public String getArchDomainMetaJsonStr() {
        return this.archDomainMetaJsonStr;
    }

    public AddLinkeBahamutArchdomainsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
