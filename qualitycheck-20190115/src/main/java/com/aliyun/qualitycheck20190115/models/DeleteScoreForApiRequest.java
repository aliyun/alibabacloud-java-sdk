// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteScoreForApiRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeleteScoreForApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteScoreForApiRequest self = new DeleteScoreForApiRequest();
        return TeaModel.build(map, self);
    }

    public DeleteScoreForApiRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
