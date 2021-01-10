// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutArchdomainsRequest extends TeaModel {
    @NameInMap("Level")
    public String level;

    @NameInMap("NeedParentLinkcGroups")
    public Boolean needParentLinkcGroups;

    @NameInMap("TenantExternalId")
    public String tenantExternalId;

    public static QueryLinkeBahamutArchdomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutArchdomainsRequest self = new QueryLinkeBahamutArchdomainsRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutArchdomainsRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public QueryLinkeBahamutArchdomainsRequest setNeedParentLinkcGroups(Boolean needParentLinkcGroups) {
        this.needParentLinkcGroups = needParentLinkcGroups;
        return this;
    }
    public Boolean getNeedParentLinkcGroups() {
        return this.needParentLinkcGroups;
    }

    public QueryLinkeBahamutArchdomainsRequest setTenantExternalId(String tenantExternalId) {
        this.tenantExternalId = tenantExternalId;
        return this;
    }
    public String getTenantExternalId() {
        return this.tenantExternalId;
    }

}
