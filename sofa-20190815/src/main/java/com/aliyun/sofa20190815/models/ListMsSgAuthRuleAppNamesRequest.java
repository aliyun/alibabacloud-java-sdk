// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ListMsSgAuthRuleAppNamesRequest extends TeaModel {
    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Scope")
    public String scope;

    public static ListMsSgAuthRuleAppNamesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMsSgAuthRuleAppNamesRequest self = new ListMsSgAuthRuleAppNamesRequest();
        return TeaModel.build(map, self);
    }

    public ListMsSgAuthRuleAppNamesRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ListMsSgAuthRuleAppNamesRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

}
