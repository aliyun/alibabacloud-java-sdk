// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DelRuleCategoryRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DelRuleCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DelRuleCategoryRequest self = new DelRuleCategoryRequest();
        return TeaModel.build(map, self);
    }

    public DelRuleCategoryRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
