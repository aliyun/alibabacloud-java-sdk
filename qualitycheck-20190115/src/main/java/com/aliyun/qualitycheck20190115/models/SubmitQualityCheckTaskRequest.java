// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class SubmitQualityCheckTaskRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static SubmitQualityCheckTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitQualityCheckTaskRequest self = new SubmitQualityCheckTaskRequest();
        return TeaModel.build(map, self);
    }

    public SubmitQualityCheckTaskRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
