// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutVcsdiffbetweenbrancheRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("MrSourceBranch")
    public String mrSourceBranch;

    @NameInMap("MrTargetBranch")
    public String mrTargetBranch;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutVcsdiffbetweenbrancheRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutVcsdiffbetweenbrancheRequest self = new GetLinkeBahamutVcsdiffbetweenbrancheRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutVcsdiffbetweenbrancheRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutVcsdiffbetweenbrancheRequest setMrSourceBranch(String mrSourceBranch) {
        this.mrSourceBranch = mrSourceBranch;
        return this;
    }
    public String getMrSourceBranch() {
        return this.mrSourceBranch;
    }

    public GetLinkeBahamutVcsdiffbetweenbrancheRequest setMrTargetBranch(String mrTargetBranch) {
        this.mrTargetBranch = mrTargetBranch;
        return this;
    }
    public String getMrTargetBranch() {
        return this.mrTargetBranch;
    }

    public GetLinkeBahamutVcsdiffbetweenbrancheRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
