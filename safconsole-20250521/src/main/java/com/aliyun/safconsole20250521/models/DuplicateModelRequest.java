// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class DuplicateModelRequest extends TeaModel {
    /**
     * <p>Customer model ID</p>
     * 
     * <strong>example:</strong>
     * <p>456</p>
     */
    @NameInMap("CustomerModuleId")
    public Integer customerModuleId;

    public static DuplicateModelRequest build(java.util.Map<String, ?> map) throws Exception {
        DuplicateModelRequest self = new DuplicateModelRequest();
        return TeaModel.build(map, self);
    }

    public DuplicateModelRequest setCustomerModuleId(Integer customerModuleId) {
        this.customerModuleId = customerModuleId;
        return this;
    }
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
    }

}
