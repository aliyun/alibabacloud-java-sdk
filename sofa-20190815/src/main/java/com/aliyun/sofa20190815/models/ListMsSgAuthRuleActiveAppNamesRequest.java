// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgAuthRuleActiveAppNamesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    public static ListMsSgAuthRuleActiveAppNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgAuthRuleActiveAppNamesRequest self = new ListMsSgAuthRuleActiveAppNamesRequest();
        return TeaModel.build(map, self);
    }

    public ListMsSgAuthRuleActiveAppNamesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
