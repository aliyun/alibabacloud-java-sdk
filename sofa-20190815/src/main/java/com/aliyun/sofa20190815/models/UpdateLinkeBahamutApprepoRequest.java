// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutApprepoRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("RepoRightFormJsonStr")
    public String repoRightFormJsonStr;

    @NameInMap("TenantId")
    public String tenantId;

    public static UpdateLinkeBahamutApprepoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutApprepoRequest self = new UpdateLinkeBahamutApprepoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutApprepoRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public UpdateLinkeBahamutApprepoRequest setRepoRightFormJsonStr(String repoRightFormJsonStr) {
        this.repoRightFormJsonStr = repoRightFormJsonStr;
        return this;
    }
    public String getRepoRightFormJsonStr() {
        return this.repoRightFormJsonStr;
    }

    public UpdateLinkeBahamutApprepoRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
