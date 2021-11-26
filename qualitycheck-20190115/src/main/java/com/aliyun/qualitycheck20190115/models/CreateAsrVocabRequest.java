// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class CreateAsrVocabRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static CreateAsrVocabRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAsrVocabRequest self = new CreateAsrVocabRequest();
        return TeaModel.build(map, self);
    }

    public CreateAsrVocabRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
