// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitPrecisionTaskRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static SubmitPrecisionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitPrecisionTaskRequest self = new SubmitPrecisionTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitPrecisionTaskRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
