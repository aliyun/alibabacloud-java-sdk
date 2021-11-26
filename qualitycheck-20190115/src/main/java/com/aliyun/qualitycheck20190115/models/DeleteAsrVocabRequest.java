// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class DeleteAsrVocabRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static DeleteAsrVocabRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAsrVocabRequest self = new DeleteAsrVocabRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAsrVocabRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
