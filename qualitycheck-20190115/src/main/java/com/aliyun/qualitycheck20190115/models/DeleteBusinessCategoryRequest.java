// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteBusinessCategoryRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeleteBusinessCategoryRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteBusinessCategoryRequest self = new DeleteBusinessCategoryRequest();
        return TeaModel.build(map, self);
    }

    public DeleteBusinessCategoryRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
