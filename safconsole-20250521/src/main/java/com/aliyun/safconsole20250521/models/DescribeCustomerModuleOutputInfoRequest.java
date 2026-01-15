// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeCustomerModuleOutputInfoRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>READ</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <strong>example:</strong>
     * <p>456</p>
     */
    @NameInMap("CustomerModuleId")
    public Integer customerModuleId;

    public static DescribeCustomerModuleOutputInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerModuleOutputInfoRequest self = new DescribeCustomerModuleOutputInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerModuleOutputInfoRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public DescribeCustomerModuleOutputInfoRequest setCustomerModuleId(Integer customerModuleId) {
        this.customerModuleId = customerModuleId;
        return this;
    }
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
    }

}
