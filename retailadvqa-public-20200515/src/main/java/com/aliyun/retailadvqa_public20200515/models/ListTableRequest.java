// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.retailadvqa_public20200515.models;

import com.aliyun.tea.*;

public class ListTableRequest extends TeaModel {
    @NameInMap("AccessId")
    public String accessId;

    @NameInMap("TenantId")
    public String tenantId;

    public static ListTableRequest build(java.util.Map<String, ?> map) throws Exception {
        ListTableRequest self = new ListTableRequest();
        return TeaModel.build(map, self);
    }

    public ListTableRequest setAccessId(String accessId) {
        this.accessId = accessId;
        return this;
    }
    public String getAccessId() {
        return this.accessId;
    }

    public ListTableRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
