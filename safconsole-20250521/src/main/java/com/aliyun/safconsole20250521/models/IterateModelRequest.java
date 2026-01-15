// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class IterateModelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>456</p>
     */
    @NameInMap("CustomerModuleId")
    public Integer customerModuleId;

    public static IterateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        IterateModelRequest self = new IterateModelRequest();
        return TeaModel.build(map, self);
    }

    public IterateModelRequest setCustomerModuleId(Integer customerModuleId) {
        this.customerModuleId = customerModuleId;
        return this;
    }
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
    }

}
