// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.qualitycheck20190115.models;

import com.aliyun.tea.*;

public class ListQualityCheckSchemeRequest extends TeaModel {
    @NameInMap("JsonStr")
    public String jsonStr;

    public static ListQualityCheckSchemeRequest build(java.util.Map<String, ?> map) throws Exception {
        ListQualityCheckSchemeRequest self = new ListQualityCheckSchemeRequest();
        return TeaModel.build(map, self);
    }

    public ListQualityCheckSchemeRequest setJsonStr(String jsonStr) {
        this.jsonStr = jsonStr;
        return this;
    }
    public String getJsonStr() {
        return this.jsonStr;
    }

}
