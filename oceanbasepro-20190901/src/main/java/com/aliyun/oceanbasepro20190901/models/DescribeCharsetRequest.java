// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.oceanbasepro20190901.models;

import com.aliyun.tea.*;

public class DescribeCharsetRequest extends TeaModel {
    // 租户模式。 当前支持Oracle模式（Oracle）、MySQL模式（MySQL） 详细参见：DescribeInstanceTenantModes。
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
