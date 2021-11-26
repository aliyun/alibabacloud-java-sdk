// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetBusinessCategoryListRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetBusinessCategoryListRequest build(java.util.Map<String, ?> map) throws Exception {
        GetBusinessCategoryListRequest self = new GetBusinessCategoryListRequest();
        return TeaModel.build(map, self);
    }

    public GetBusinessCategoryListRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
