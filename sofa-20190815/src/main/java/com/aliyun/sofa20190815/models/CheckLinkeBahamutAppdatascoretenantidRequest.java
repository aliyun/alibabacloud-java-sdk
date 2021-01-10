// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CheckLinkeBahamutAppdatascoretenantidRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static CheckLinkeBahamutAppdatascoretenantidRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckLinkeBahamutAppdatascoretenantidRequest self = new CheckLinkeBahamutAppdatascoretenantidRequest();
        return TeaModel.build(map, self);
    }

    public CheckLinkeBahamutAppdatascoretenantidRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
