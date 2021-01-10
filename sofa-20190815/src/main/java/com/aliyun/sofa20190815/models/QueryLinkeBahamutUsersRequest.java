// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutUsersRequest extends TeaModel {
    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("TenantExternalId")
    public String tenantExternalId;

    public static QueryLinkeBahamutUsersRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutUsersRequest self = new QueryLinkeBahamutUsersRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutUsersRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryLinkeBahamutUsersRequest setTenantExternalId(String tenantExternalId) {
        this.tenantExternalId = tenantExternalId;
        return this;
    }
    public String getTenantExternalId() {
        return this.tenantExternalId;
    }

}
