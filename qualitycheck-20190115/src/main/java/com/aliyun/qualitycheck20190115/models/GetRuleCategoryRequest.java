// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetRuleCategoryRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetRuleCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRuleCategoryRequest self = new GetRuleCategoryRequest();
        return TeaModel.build(map, self);
    }

    public GetRuleCategoryRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
