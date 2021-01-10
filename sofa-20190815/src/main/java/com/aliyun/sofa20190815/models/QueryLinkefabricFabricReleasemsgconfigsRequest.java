// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricReleasemsgconfigsRequest extends TeaModel {
    @NameInMap("ConfigType")
    public String configType;

    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static QueryLinkefabricFabricReleasemsgconfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricReleasemsgconfigsRequest self = new QueryLinkefabricFabricReleasemsgconfigsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricReleasemsgconfigsRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public QueryLinkefabricFabricReleasemsgconfigsRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public QueryLinkefabricFabricReleasemsgconfigsRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
