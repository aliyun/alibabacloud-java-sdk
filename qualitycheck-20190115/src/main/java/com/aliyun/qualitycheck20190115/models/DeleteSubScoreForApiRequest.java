// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteSubScoreForApiRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeleteSubScoreForApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSubScoreForApiRequest self = new DeleteSubScoreForApiRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSubScoreForApiRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
