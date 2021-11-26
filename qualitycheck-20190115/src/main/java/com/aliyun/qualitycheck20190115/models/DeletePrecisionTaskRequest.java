// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeletePrecisionTaskRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeletePrecisionTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        DeletePrecisionTaskRequest self = new DeletePrecisionTaskRequest();
        return TeaModel.build(map, self);
    }

    public DeletePrecisionTaskRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
