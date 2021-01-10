// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutNaminggetbranchnameRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("IterationId")
    public String iterationId;

    @NameInMap("TenantId")
    public String tenantId;

    @NameInMap("WithRepoPrefix")
    public String withRepoPrefix;

    public static QueryLinkeBahamutNaminggetbranchnameRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutNaminggetbranchnameRequest self = new QueryLinkeBahamutNaminggetbranchnameRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutNaminggetbranchnameRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkeBahamutNaminggetbranchnameRequest setIterationId(String iterationId) {
        this.iterationId = iterationId;
        return this;
    }
    public String getIterationId() {
        return this.iterationId;
    }

    public QueryLinkeBahamutNaminggetbranchnameRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

    public QueryLinkeBahamutNaminggetbranchnameRequest setWithRepoPrefix(String withRepoPrefix) {
        this.withRepoPrefix = withRepoPrefix;
        return this;
    }
    public String getWithRepoPrefix() {
        return this.withRepoPrefix;
    }

}
