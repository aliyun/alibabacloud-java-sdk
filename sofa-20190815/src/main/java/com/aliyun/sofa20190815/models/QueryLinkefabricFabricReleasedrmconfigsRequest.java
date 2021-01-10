// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricReleasedrmconfigsRequest extends TeaModel {
    @NameInMap("ConfigType")
    public String configType;

    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static QueryLinkefabricFabricReleasedrmconfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricReleasedrmconfigsRequest self = new QueryLinkefabricFabricReleasedrmconfigsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricReleasedrmconfigsRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public QueryLinkefabricFabricReleasedrmconfigsRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public QueryLinkefabricFabricReleasedrmconfigsRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
