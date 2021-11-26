// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListDataSetTaskRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ListDataSetTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListDataSetTaskRequest self = new ListDataSetTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListDataSetTaskRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
