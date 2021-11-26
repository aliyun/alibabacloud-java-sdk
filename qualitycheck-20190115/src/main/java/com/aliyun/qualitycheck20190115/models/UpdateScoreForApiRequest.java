// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateScoreForApiRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UpdateScoreForApiRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateScoreForApiRequest self = new UpdateScoreForApiRequest();
        return TeaModel.build(map, self);
    }

    public UpdateScoreForApiRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
