// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class PrepublishModelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>456</p>
     */
    @NameInMap("CustomerModuleId")
    public Integer customerModuleId;

    public static PrepublishModelRequest build(java.util.Map<String, ?> map) throws Exception {
        PrepublishModelRequest self = new PrepublishModelRequest();
        return TeaModel.build(map, self);
    }

    public PrepublishModelRequest setCustomerModuleId(Integer customerModuleId) {
        this.customerModuleId = customerModuleId;
        return this;
    }
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
    }

}
