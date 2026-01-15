// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.safconsole20250521.models;

import com.aliyun.tea.*;

public class TestModelRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>456</p>
     */
    @NameInMap("CustomerModuleId")
    public Integer customerModuleId;

    public static TestModelRequest build(java.util.Map<String, ?> map) throws Exception {
        TestModelRequest self = new TestModelRequest();
        return TeaModel.build(map, self);
    }

    public TestModelRequest setCustomerModuleId(Integer customerModuleId) {
        this.customerModuleId = customerModuleId;
        return this;
    }
    public Integer getCustomerModuleId() {
        return this.customerModuleId;
    }

}
