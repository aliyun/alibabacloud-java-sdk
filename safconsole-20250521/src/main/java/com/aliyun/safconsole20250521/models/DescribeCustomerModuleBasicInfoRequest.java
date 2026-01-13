// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeCustomerModuleBasicInfoRequest extends TeaModel {
    /**
     * <p>Authorization type.</p>
     * 
     * <strong>example:</strong>
     * <p>READ</p>
     */
    @NameInMap("AuthType")
    public String authType;

    /**
     * <p>Customer model ID</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CustomerModuleId")
    public Integer customerModuleId;

    public static DescribeCustomerModuleBasicInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeCustomerModuleBasicInfoRequest self = new DescribeCustomerModuleBasicInfoRequest();
        return TeaModel.build(map, self);
    }

    public DescribeCustomerModuleBasicInfoRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public DescribeCustomerModuleBasicInfoRequest setCustomerModuleId(Integer customerModuleId) {
        this.customerModuleId = customerModuleId;
        return this;
    }
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
    }

}
