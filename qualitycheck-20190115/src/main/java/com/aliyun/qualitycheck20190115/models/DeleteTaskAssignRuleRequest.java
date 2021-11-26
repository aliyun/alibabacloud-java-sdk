// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteTaskAssignRuleRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeleteTaskAssignRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteTaskAssignRuleRequest self = new DeleteTaskAssignRuleRequest();
        return TeaModel.build(map, self);
    }

    public DeleteTaskAssignRuleRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
