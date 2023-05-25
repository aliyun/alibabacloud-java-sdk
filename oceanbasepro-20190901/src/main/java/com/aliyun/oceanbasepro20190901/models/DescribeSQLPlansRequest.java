// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeSQLPlansRequest extends TeaModel {
    /**
     * <p>The time when the plan was loaded for the first time, .</p>
     */
    @NameInMap("SQLId")
    public String SQLId;

    /**
     * <p>The time when the plan was loaded for the first time, .</p>
     */
    @NameInMap("TenantId")
    public String tenantId;

    public static DescribeSQLPlansRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeSQLPlansRequest self = new DescribeSQLPlansRequest();
        return TeaModel.build(map, self);
    }

    public DescribeSQLPlansRequest setSQLId(String SQLId) {
        this.SQLId = SQLId;
        return this;
    }
    public String getSQLId() {
        return this.SQLId;
    }

    public DescribeSQLPlansRequest setTenantId(String tenantId) {
        this.tenantId = tenantId;
        return this;
    }
    public String getTenantId() {
        return this.tenantId;
    }

}
