// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.pairecservice20221213.models;

import com.aliyun.tea.*;

public class GetResourceRuleRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static GetResourceRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetResourceRuleRequest self = new GetResourceRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetResourceRuleRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
