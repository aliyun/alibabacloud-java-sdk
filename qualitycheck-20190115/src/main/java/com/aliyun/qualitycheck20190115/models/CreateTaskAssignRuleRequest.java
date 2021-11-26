// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateTaskAssignRuleRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static CreateTaskAssignRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTaskAssignRuleRequest self = new CreateTaskAssignRuleRequest();
        return TeaModel.build(map, self);
    }

    public CreateTaskAssignRuleRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
