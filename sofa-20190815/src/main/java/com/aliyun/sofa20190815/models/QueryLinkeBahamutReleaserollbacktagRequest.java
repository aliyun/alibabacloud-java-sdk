// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class QueryLinkeBahamutReleaserollbacktagRequest extends TeaModel {
    @NameInMap("AppName")
    public String appName;

    @NameInMap("DeleteTag")
    public Boolean deleteTag;

    @NameInMap("ReleaseExternalId")
    public String releaseExternalId;

    @NameInMap("TenantId")
    public String tenantId;

    public static QueryLinkeBahamutReleaserollbacktagRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryLinkeBahamutReleaserollbacktagRequest self = new QueryLinkeBahamutReleaserollbacktagRequest();
        return TeaModel.build(map, self);
    }

    public QueryLinkeBahamutReleaserollbacktagRequest setAppName(String appName) {
        this.appName = appName;
        return this;
    }
    public String getAppName() {
        return this.appName;
    }

    public QueryLinkeBahamutReleaserollbacktagRequest setDeleteTag(Boolean deleteTag) {
        this.deleteTag = deleteTag;
        return this;
    }
    public Boolean getDeleteTag() {
        return this.deleteTag;
    }

    public QueryLinkeBahamutReleaserollbacktagRequest setReleaseExternalId(String releaseExternalId) {
        this.releaseExternalId = releaseExternalId;
        return this;
    }
    public String getReleaseExternalId() {
        return this.releaseExternalId;
    }

    public QueryLinkeBahamutReleaserollbacktagRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
