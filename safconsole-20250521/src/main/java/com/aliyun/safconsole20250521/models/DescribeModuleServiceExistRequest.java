// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeModuleServiceExistRequest extends TeaModel {
    /**
     * <p>Customer model ID</p>
     * 
     * <strong>example:</strong>
     * <p>456</p>
     */
    @NameInMap("CustomerModuleId")
    public Integer customerModuleId;

    public static DescribeModuleServiceExistRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeModuleServiceExistRequest self = new DescribeModuleServiceExistRequest();
        return TeaModel.build(map, self);
    }

    public DescribeModuleServiceExistRequest setCustomerModuleId(Integer customerModuleId) {
        this.customerModuleId = customerModuleId;
        return this;
    }
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
    }

}
