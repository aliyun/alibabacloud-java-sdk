// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgAuthRuleDataIdsRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListMsSgAuthRuleDataIdsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgAuthRuleDataIdsRequest self = new ListMsSgAuthRuleDataIdsRequest();
        return TeaModel.build(map, self);
    }

    public ListMsSgAuthRuleDataIdsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
