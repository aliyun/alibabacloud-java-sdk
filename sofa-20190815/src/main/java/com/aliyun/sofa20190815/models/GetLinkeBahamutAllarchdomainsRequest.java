// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class GetLinkeBahamutAllarchdomainsRequest extends TeaModel {
    @NameInMap("Level")
    public String level;

    @NameInMap("ParentId")
    public String parentId;

    @NameInMap("TenantId")
    public String tenantId;

    public static GetLinkeBahamutAllarchdomainsRequest build(java.util.Map<String, ?> map) throws Exception {
        GetLinkeBahamutAllarchdomainsRequest self = new GetLinkeBahamutAllarchdomainsRequest();
        return TeaModel.build(map, self);
    }

    public GetLinkeBahamutAllarchdomainsRequest setLevel(String level) {
        this.level = level;
        return this;
    }
    public String getLevel() {
        return this.level;
    }

    public GetLinkeBahamutAllarchdomainsRequest setParentId(String parentId) {
        this.parentId = parentId;
        return this;
    }
    public String getParentId() {
        return this.parentId;
    }

    public GetLinkeBahamutAllarchdomainsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
