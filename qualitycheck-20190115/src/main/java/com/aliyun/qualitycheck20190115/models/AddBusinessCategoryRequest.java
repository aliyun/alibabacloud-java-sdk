// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class AddBusinessCategoryRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static AddBusinessCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        AddBusinessCategoryRequest self = new AddBusinessCategoryRequest();
        return TeaModel.build(map, self);
    }

    public AddBusinessCategoryRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
