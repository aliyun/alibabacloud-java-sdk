// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricNewappinfoRequest extends TeaModel {
    @NameInMap("ConfigType")
    public String configType;

    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static QueryLinkefabricFabricNewappinfoRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricNewappinfoRequest self = new QueryLinkefabricFabricNewappinfoRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricNewappinfoRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public QueryLinkefabricFabricNewappinfoRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public QueryLinkefabricFabricNewappinfoRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
