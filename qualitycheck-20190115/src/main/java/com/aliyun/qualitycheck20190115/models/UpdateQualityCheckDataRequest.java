// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateQualityCheckDataRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UpdateQualityCheckDataRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateQualityCheckDataRequest self = new UpdateQualityCheckDataRequest();
        return TeaModel.build(map, self);
    }

    public UpdateQualityCheckDataRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
