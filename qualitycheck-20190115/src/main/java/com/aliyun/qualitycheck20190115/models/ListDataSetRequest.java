// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListDataSetRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ListDataSetRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSetRequest self = new ListDataSetRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSetRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
