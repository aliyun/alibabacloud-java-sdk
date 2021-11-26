// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class InsertSubScoreForApiRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static InsertSubScoreForApiRequest build(java.util.Map<String, ?> map) throws Exception {
        InsertSubScoreForApiRequest self = new InsertSubScoreForApiRequest();
        return TeaModel.build(map, self);
    }

    public InsertSubScoreForApiRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
