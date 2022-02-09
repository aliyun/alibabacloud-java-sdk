// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLDetailsRequest extends TeaModel {
    // SQLID
    @NameInMap("SQLId")
    public String SQLId;

    // 租户ID
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeSQLDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLDetailsRequest self = new DescribeSQLDetailsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSQLDetailsRequest setSQLId(String SQLId) {
        this.SQLId = SQLId;
        return this;
    }
    public String getSQLId() {
        return this.SQLId;
    }

    public DescribeSQLDetailsRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
