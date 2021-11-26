// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class UpdateAsrVocabRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static UpdateAsrVocabRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAsrVocabRequest self = new UpdateAsrVocabRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAsrVocabRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
