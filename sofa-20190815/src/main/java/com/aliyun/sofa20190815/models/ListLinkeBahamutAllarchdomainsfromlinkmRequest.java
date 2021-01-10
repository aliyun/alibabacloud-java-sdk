// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAllarchdomainsfromlinkmRequest extends TeaModel {
    @NameInMap("Level")
    public String level;

    @NameInMap("NeedParentLinkcGroups")
    public String needParentLinkcGroups;

    @NameInMap("TenantExternalId")
    public String tenantExternalId;

    public static ListLinkeBahamutAllarchdomainsfromlinkmRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAllarchdomainsfromlinkmRequest self = new ListLinkeBahamutAllarchdomainsfromlinkmRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAllarchdomainsfromlinkmRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public ListLinkeBahamutAllarchdomainsfromlinkmRequest setNeedParentLinkcGroups(String needParentLinkcGroups) {
        this.needParentLinkcGroups = needParentLinkcGroups;
        return this;
    }
    public String getNeedParentLinkcGroups() {
        return this.needParentLinkcGroups;
    }

    public ListLinkeBahamutAllarchdomainsfromlinkmRequest setTenantExternalId(String tenantExternalId) {
        this.tenantExternalId = tenantExternalId;
        return this;
    }
    public String getTenantExternalId() {
        return this.tenantExternalId;
    }

}
