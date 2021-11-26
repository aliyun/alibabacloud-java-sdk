// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListPrecisionTaskRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ListPrecisionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPrecisionTaskRequest self = new ListPrecisionTaskRequest();
        return TeaModel.build(map, self);
    }

    public ListPrecisionTaskRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
