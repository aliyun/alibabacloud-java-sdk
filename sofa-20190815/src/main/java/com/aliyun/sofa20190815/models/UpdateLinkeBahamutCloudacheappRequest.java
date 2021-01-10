// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class UpdateLinkeBahamutCloudacheappRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static UpdateLinkeBahamutCloudacheappRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateLinkeBahamutCloudacheappRequest self = new UpdateLinkeBahamutCloudacheappRequest();
        return TeaModel.build(map, self);
    }

    public UpdateLinkeBahamutCloudacheappRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
