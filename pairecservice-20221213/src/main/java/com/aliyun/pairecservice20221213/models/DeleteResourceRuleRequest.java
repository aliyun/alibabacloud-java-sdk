// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteResourceRuleRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteResourceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceRuleRequest self = new DeleteResourceRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
