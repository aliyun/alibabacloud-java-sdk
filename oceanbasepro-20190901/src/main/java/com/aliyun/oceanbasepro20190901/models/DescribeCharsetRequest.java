// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeCharsetRequest extends TeaModel {
    /**
     * <p>The tenant mode.    </p>
     * <p>Valid values: Oracle and MySQL.   </p>
     * <p>For more information, see [DescribeInstanceTenantModes](~~410354~~).</p>
     */
    @NameInMap("TenantMode")
    public String tenantMode;

    public static DescribeCharsetRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCharsetRequest self = new DescribeCharsetRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCharsetRequest setTenantMode(String tenantMode) {
        this.tenantMode = tenantMode;
        return this;
    }
    public String getTenantMode() {
        return this.tenantMode;
    }

}
