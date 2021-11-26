// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetRuleRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRuleRequest self = new GetRuleRequest();
        return TeaModel.build(map, self);
    }

    public GetRuleRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
