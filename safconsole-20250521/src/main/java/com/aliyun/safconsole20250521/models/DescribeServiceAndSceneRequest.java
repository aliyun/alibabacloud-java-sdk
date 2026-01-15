// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DescribeServiceAndSceneRequest extends TeaModel {
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

    public static DescribeServiceAndSceneRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeServiceAndSceneRequest self = new DescribeServiceAndSceneRequest();
        return TeaModel.build(map, self);
    }

    public DescribeServiceAndSceneRequest setAuthType(String authType) {
        this.authType = authType;
        return this;
    }
    public String getAuthType() {
        return this.authType;
    }

    public DescribeServiceAndSceneRequest setCustomerModuleId(Integer customerModuleId) {
        this.customerModuleId = customerModuleId;
        return this;
    }
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
    }

}
