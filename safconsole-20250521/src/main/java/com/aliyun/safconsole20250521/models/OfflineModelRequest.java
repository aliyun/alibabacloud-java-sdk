// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class OfflineModelRequest extends TeaModel {
    /**
     * <p>Customer model ID</p>
     * 
     * <strong>example:</strong>
     * <p>456</p>
     */
    @NameInMap("CustomerModuleId")
    public Integer customerModuleId;

    public static OfflineModelRequest build(java.util.Map<String, ?> map) throws Exception {
        OfflineModelRequest self = new OfflineModelRequest();
        return TeaModel.build(map, self);
    }

    public OfflineModelRequest setCustomerModuleId(Integer customerModuleId) {
        this.customerModuleId = customerModuleId;
        return this;
    }
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
    }

}
