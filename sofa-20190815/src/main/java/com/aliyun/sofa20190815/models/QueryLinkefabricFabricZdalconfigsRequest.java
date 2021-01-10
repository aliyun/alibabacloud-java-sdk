// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricZdalconfigsRequest extends TeaModel {
    @NameInMap("ConfigType")
    public String configType;

    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("TenantId")
    public Long tenantId;

    public static QueryLinkefabricFabricZdalconfigsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricZdalconfigsRequest self = new QueryLinkefabricFabricZdalconfigsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricZdalconfigsRequest setConfigType(String configType) {
        this.configType = configType;
        return this;
    }
    public String getConfigType() {
        return this.configType;
    }

    public QueryLinkefabricFabricZdalconfigsRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public QueryLinkefabricFabricZdalconfigsRequest setTenantId(Long tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public Long getTenantId() {
        return this.tenantId;
    }

}
