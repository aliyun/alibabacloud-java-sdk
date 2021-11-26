// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListAsrVocabRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ListAsrVocabRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAsrVocabRequest self = new ListAsrVocabRequest();
        return TeaModel.build(map, self);
    }

    public ListAsrVocabRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
