// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateTaskAssignRuleRequest extends TeaModel {
    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("JsonStr")
    public String jsonStr;

    public static UpdateTaskAssignRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTaskAssignRuleRequest self = new UpdateTaskAssignRuleRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTaskAssignRuleRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateTaskAssignRuleRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
