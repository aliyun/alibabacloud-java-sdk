// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class GetAsrVocabRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static GetAsrVocabRequest build(java.util.Map<String, ?> map) throws Exception {
        GetAsrVocabRequest self = new GetAsrVocabRequest();
        return TeaModel.build(map, self);
    }

    public GetAsrVocabRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
