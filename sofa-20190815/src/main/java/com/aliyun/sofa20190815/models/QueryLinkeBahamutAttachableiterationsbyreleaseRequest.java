// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutAttachableiterationsbyreleaseRequest extends TeaModel {
    @NameInMap("ReleaseId")
    public String releaseId;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutAttachableiterationsbyreleaseRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutAttachableiterationsbyreleaseRequest self = new QueryLinkeBahamutAttachableiterationsbyreleaseRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutAttachableiterationsbyreleaseRequest setReleaseId(String releaseId) {
        this.releaseId = releaseId;
        return this;
    }
    public String getReleaseId() {
        return this.releaseId;
    }

    public QueryLinkeBahamutAttachableiterationsbyreleaseRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
