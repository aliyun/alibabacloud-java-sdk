// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutUnitbranchRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WithRepoPrefix")
    public Boolean withRepoPrefix;

    public static GetLinkeBahamutUnitbranchRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutUnitbranchRequest self = new GetLinkeBahamutUnitbranchRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutUnitbranchRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public GetLinkeBahamutUnitbranchRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public GetLinkeBahamutUnitbranchRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public GetLinkeBahamutUnitbranchRequest setWithRepoPrefix(Boolean withRepoPrefix) {
        this.withRepoPrefix = withRepoPrefix;
        return this;
    }
    public Boolean getWithRepoPrefix() {
        return this.withRepoPrefix;
    }

}
