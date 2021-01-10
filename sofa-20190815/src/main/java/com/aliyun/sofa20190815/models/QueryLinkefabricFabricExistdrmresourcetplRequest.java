// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkefabricFabricExistdrmresourcetplRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DevStage")
    public String devStage;

    @NameInMap("Env")
    public String env;

    @NameInMap("IsStandard")
    public String isStandard;

    @NameInMap("Keyword")
    public String keyword;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkefabricFabricExistdrmresourcetplRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkefabricFabricExistdrmresourcetplRequest self = new QueryLinkefabricFabricExistdrmresourcetplRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkefabricFabricExistdrmresourcetplRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkefabricFabricExistdrmresourcetplRequest setDevStage(String devStage) {
        this.devStage = devStage;
        return this;
    }
    public String getDevStage() {
        return this.devStage;
    }

    public QueryLinkefabricFabricExistdrmresourcetplRequest setEnv(String env) {
        this.env = env;
        return this;
    }
    public String getEnv() {
        return this.env;
    }

    public QueryLinkefabricFabricExistdrmresourcetplRequest setIsStandard(String isStandard) {
        this.isStandard = isStandard;
        return this;
    }
    public String getIsStandard() {
        return this.isStandard;
    }

    public QueryLinkefabricFabricExistdrmresourcetplRequest setKeyword(String keyword) {
        this.keyword = keyword;
        return this;
    }
    public String getKeyword() {
        return this.keyword;
    }

    public QueryLinkefabricFabricExistdrmresourcetplRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
