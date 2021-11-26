// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AddRuleCategoryRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static AddRuleCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRuleCategoryRequest self = new AddRuleCategoryRequest();
        return TeaModel.build(map, self);
    }

    public AddRuleCategoryRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
