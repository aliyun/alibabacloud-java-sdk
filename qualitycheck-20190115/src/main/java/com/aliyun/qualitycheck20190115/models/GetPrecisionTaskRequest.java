// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetPrecisionTaskRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetPrecisionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        GetPrecisionTaskRequest self = new GetPrecisionTaskRequest();
        return TeaModel.build(map, self);
    }

    public GetPrecisionTaskRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
