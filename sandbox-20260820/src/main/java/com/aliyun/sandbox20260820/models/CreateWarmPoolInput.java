// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sandbox20260820.models;

import com.aliyun.tea.*;

public class CreateWarmPoolInput extends TeaModel {
    /**
     * <p>The warm pool capacity policy, which includes the base target capacity and optional scheduled rules.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("capacityPolicy")
    public WarmPoolCapacityPolicyInput capacityPolicy;

    /**
     * <p>The template ID, which specifies the template associated with the warm pool.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>tpl-example1234567890</p>
     */
    @NameInMap("templateID")
    public String templateID;

    public static CreateWarmPoolInput build(java.util.Map<String, ?> map) throws Exception {
        CreateWarmPoolInput self = new CreateWarmPoolInput();
        return TeaModel.build(map, self);
    }

    public CreateWarmPoolInput setCapacityPolicy(WarmPoolCapacityPolicyInput capacityPolicy) {
        this.capacityPolicy = capacityPolicy;
        return this;
    }
    public WarmPoolCapacityPolicyInput getCapacityPolicy() {
        return this.capacityPolicy;
    }

    public CreateWarmPoolInput setTemplateID(String templateID) {
        this.templateID = templateID;
        return this;
    }
    public String getTemplateID() {
        return this.templateID;
    }

}
