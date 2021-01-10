// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricReleaseantxconfigsRequest extends TeaModel {
    @NameInMap("ConfigType")
    public String configType;

    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static QueryLinkefabricFabricReleaseantxconfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricReleaseantxconfigsRequest self = new QueryLinkefabricFabricReleaseantxconfigsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricReleaseantxconfigsRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public QueryLinkefabricFabricReleaseantxconfigsRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public QueryLinkefabricFabricReleaseantxconfigsRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
