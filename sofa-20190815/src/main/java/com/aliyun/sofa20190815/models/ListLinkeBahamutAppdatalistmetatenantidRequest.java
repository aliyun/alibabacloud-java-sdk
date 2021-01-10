// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListLinkeBahamutAppdatalistmetatenantidRequest extends TeaModel {
    @NameInMap("TenantId")
    public String tenantId;

    public static ListLinkeBahamutAppdatalistmetatenantidRequest build(java.util.Map<String, ?> map) throws Exception {
        ListLinkeBahamutAppdatalistmetatenantidRequest self = new ListLinkeBahamutAppdatalistmetatenantidRequest();
        return TeaModel.build(map, self);
    }

    public ListLinkeBahamutAppdatalistmetatenantidRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
