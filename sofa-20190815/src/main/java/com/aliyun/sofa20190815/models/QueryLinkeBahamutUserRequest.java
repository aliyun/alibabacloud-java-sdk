// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutUserRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("TenantExternalId")
    public String tenantExternalId;

    public static QueryLinkeBahamutUserRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutUserRequest self = new QueryLinkeBahamutUserRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutUserRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryLinkeBahamutUserRequest setTenantExternalId(String tenantExternalId) {
        this.tenantExternalId = tenantExternalId;
        return this;
    }
    public String getTenantExternalId() {
        return this.tenantExternalId;
    }

}
