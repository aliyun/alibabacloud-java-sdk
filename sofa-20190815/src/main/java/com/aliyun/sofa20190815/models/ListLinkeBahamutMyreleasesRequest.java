// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutMyreleasesRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static ListLinkeBahamutMyreleasesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutMyreleasesRequest self = new ListLinkeBahamutMyreleasesRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutMyreleasesRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
