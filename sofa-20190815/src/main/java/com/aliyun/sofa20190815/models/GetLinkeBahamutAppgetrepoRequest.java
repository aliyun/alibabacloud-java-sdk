// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAppgetrepoRequest extends TeaModel {
    @NameInMap("FullRepoUrl")
    public String fullRepoUrl;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutAppgetrepoRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAppgetrepoRequest self = new GetLinkeBahamutAppgetrepoRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAppgetrepoRequest setFullRepoUrl(String fullRepoUrl) {
        this.fullRepoUrl = fullRepoUrl;
        return this;
    }
    public String getFullRepoUrl() {
        return this.fullRepoUrl;
    }

    public GetLinkeBahamutAppgetrepoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
