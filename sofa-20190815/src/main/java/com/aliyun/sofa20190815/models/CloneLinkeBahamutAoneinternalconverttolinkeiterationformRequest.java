// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CloneLinkeBahamutAoneinternalconverttolinkeiterationformRequest extends TeaModel {
    @NameInMap("Id")
    public String id;

    @NameInMap("TenantId")
    public String tenantId;

    public static CloneLinkeBahamutAoneinternalconverttolinkeiterationformRequest build(java.util.Map<String, ?> map) throws Exception {
        CloneLinkeBahamutAoneinternalconverttolinkeiterationformRequest self = new CloneLinkeBahamutAoneinternalconverttolinkeiterationformRequest();
        return TeaModel.build(map, self);
    }

    public CloneLinkeBahamutAoneinternalconverttolinkeiterationformRequest setId(String id) {
        this.id = id;
        return this;
    }
    public String getId() {
        return this.id;
    }

    public CloneLinkeBahamutAoneinternalconverttolinkeiterationformRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
