// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class EditModelRequest extends TeaModel {
    /**
     * <p>Customer model ID</p>
     * 
     * <strong>example:</strong>
     * <p>456</p>
     */
    @NameInMap("CustomerModuleId")
    public Integer customerModuleId;

    public static EditModelRequest build(java.util.Map<String, ?> map) throws Exception {
        EditModelRequest self = new EditModelRequest();
        return TeaModel.build(map, self);
    }

    public EditModelRequest setCustomerModuleId(Integer customerModuleId) {
        this.customerModuleId = customerModuleId;
        return this;
    }
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
    }

}
