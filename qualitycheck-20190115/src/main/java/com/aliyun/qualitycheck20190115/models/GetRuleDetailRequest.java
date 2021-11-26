// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleDetailRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetRuleDetailRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRuleDetailRequest self = new GetRuleDetailRequest();
        return TeaModel.build(map, self);
    }

    public GetRuleDetailRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
