// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListHotWordsTasksRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ListHotWordsTasksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListHotWordsTasksRequest self = new ListHotWordsTasksRequest();
        return TeaModel.build(map, self);
    }

    public ListHotWordsTasksRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
