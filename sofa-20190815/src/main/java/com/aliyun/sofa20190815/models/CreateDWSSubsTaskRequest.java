// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class CreateDWSSubsTaskRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("SubscriptionTaskModelJsonStr")
    public String subscriptionTaskModelJsonStr;

    public static CreateDWSSubsTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateDWSSubsTaskRequest self = new CreateDWSSubsTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateDWSSubsTaskRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateDWSSubsTaskRequest setSubscriptionTaskModelJsonStr(String subscriptionTaskModelJsonStr) {
        this.subscriptionTaskModelJsonStr = subscriptionTaskModelJsonStr;
        return this;
    }
    public String getSubscriptionTaskModelJsonStr() {
        return this.subscriptionTaskModelJsonStr;
    }

}
