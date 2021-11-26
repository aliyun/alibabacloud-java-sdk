// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetTaskRuleListRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetTaskRuleListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetTaskRuleListRequest self = new GetTaskRuleListRequest();
        return TeaModel.build(map, self);
    }

    public GetTaskRuleListRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
