// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class DeleteResourceRuleItemRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static DeleteResourceRuleItemRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteResourceRuleItemRequest self = new DeleteResourceRuleItemRequest();
        return TeaModel.build(map, self);
    }

    public DeleteResourceRuleItemRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
