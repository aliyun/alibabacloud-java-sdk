// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.sofa20190815.models;

import com.aliyun.tea.*;

public class ImportMsSgAuthRuleGroupsRequest extends TeaModel {
    @NameInMap("AuthRuleJson")
    public String authRuleJson;

    @NameInMap("InstanceId")
    public String instanceId;

    public static ImportMsSgAuthRuleGroupsRequest build(java.util.Map<String, ?> map) throws Exception {
        ImportMsSgAuthRuleGroupsRequest self = new ImportMsSgAuthRuleGroupsRequest();
        return TeaModel.build(map, self);
    }

    public ImportMsSgAuthRuleGroupsRequest setAuthRuleJson(String authRuleJson) {
        this.authRuleJson = authRuleJson;
        return this;
    }
    public String getAuthRuleJson() {
        return this.authRuleJson;
    }

    public ImportMsSgAuthRuleGroupsRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

}
